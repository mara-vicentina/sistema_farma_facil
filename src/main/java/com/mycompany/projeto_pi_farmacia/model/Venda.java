/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto_pi_farmacia.model;

import com.mycompany.projeto_pi_farmacia.utils.DataBase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author marav
 */
public class Venda {
    private Integer id;
    private Integer usuarioId;
    private Integer clienteId;
    private Double totalVenda;
    private String dataVenda;
    private String dataVendaFormatada;
    private String nomeUsuario;
    private String nomeCliente;

    public Venda(Integer id, Integer usuarioId, Integer clienteId, Double totalVenda) {
        this.id = id;
        this.usuarioId = usuarioId;
        this.clienteId = clienteId;
        this.totalVenda = totalVenda;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Integer usuarioId) {
        this.usuarioId = usuarioId;
    }

    public Integer getClienteId() {
        return clienteId;
    }

    public void setClienteId(Integer clienteId) {
        this.clienteId = clienteId;
    }

    public Double getTotalVenda() {
        return totalVenda;
    }

    public void setTotalVenda(Double totalVenda) {
        this.totalVenda = totalVenda;
    }

    public String getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(String dataVenda) {
        this.dataVenda = dataVenda;
    }

    public String getDataVendaFormatada() {
        return dataVendaFormatada;
    }

    public void setDataVendaFormatada(String dataVendaFormatada) {
        this.dataVendaFormatada = dataVendaFormatada;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    
    public Integer salvar() {
        String query = String.format("INSERT INTO vendas (usuario_id, cliente_id, total, data_venda) VALUES (%s, %s, %s, '%s');", 
            this.getUsuarioId(), 
            this.getClienteId(),
            this.getTotalVenda(),
            this.getDataVenda());
        System.out.println(query);
        Connection connection = new DataBase().abrirConexao();

        try {
            PreparedStatement ps = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.execute();
            ResultSet rs = ps.getGeneratedKeys();
            
            Integer idGerado = 0;
            if (rs.next()) {
                idGerado = rs.getInt(1);
            }
            
            connection.close();
            return idGerado;
        } catch (SQLException ex) {
            System.err.println("Erro ao salvar venda.");
        }
        
        return 0;
    }
    
    public static ArrayList<Venda> listar() {
        ArrayList<Venda> vendas = new ArrayList<>();
        
        String query = "SELECT" +
            " v.id," +
            " c.id as id_cliente," +
            " CONCAT(c.nome, ' ', c.sobrenome) as nome_cliente," +
            " u.id as id_usuario," +
            " CONCAT(u.nome, ' ', u.sobrenome) as nome_usuario," +
            " v.total," +
            " v.data_venda," +
            " DATE_FORMAT(v.data_venda, '%d/%m/%Y %H:%i:%s') as data_venda_formatada" +
            " FROM vendas as v" +
            "   INNER JOIN usuarios as u ON" +
            "     v.usuario_id = u.id" +
            "   INNER JOIN clientes as c ON" +
            "     v.cliente_id = c.id" +
            " ORDER BY v.data_venda DESC;";
        System.out.println(query);
        Connection connection = new DataBase().abrirConexao();
        
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()) {
                
                Venda venda = new Venda(
                    rs.getInt("id"),
                    rs.getInt("id_usuario"),
                    rs.getInt("id_cliente"),
                    rs.getDouble("total")
                );
                venda.setNomeUsuario(rs.getString("nome_usuario"));
                venda.setNomeCliente(rs.getString("nome_cliente"));
                venda.setDataVenda(rs.getString("data_venda"));
                venda.setDataVendaFormatada(rs.getString("data_venda_formatada"));
                vendas.add(venda);
            }
          
            connection.close();
        } catch (SQLException ex) {
            System.err.println("Erro ao listar vendas.");
        }
        
        return vendas;
    }
    
}
