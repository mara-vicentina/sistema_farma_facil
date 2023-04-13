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

/**
 *
 * @author marav
 */
public class ProdutoVenda {
    private Integer produtoId;
    private Integer vendaId;
    private String nome;
    private String codigoDeBarras;
    private Integer quantidadeVenda;    
    private Double precoDeVenda;
    private Double precoTotalVenda;
    
    public ProdutoVenda(Integer produtoId, String nome, String codigoDeBarras, Double precoDeVenda) {
        this.produtoId = produtoId;
        this.nome = nome;
        this.codigoDeBarras = codigoDeBarras;
        this.precoDeVenda = precoDeVenda;
    }

    public Integer getProdutoId() {
        return produtoId;
    }

    public void setProdutoId(Integer produtoId) {
        this.produtoId = produtoId;
    }

    public Integer getVendaId() {
        return vendaId;
    }

    public void setVendaId(Integer vendaId) {
        this.vendaId = vendaId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigoDeBarras() {
        return codigoDeBarras;
    }

    public void setCodigoDeBarras(String codigoDeBarras) {
        this.codigoDeBarras = codigoDeBarras;
    }

    public Integer getQuantidadeVenda() {
        return quantidadeVenda;
    }

    public void setQuantidadeVenda(Integer quantidadeVenda) {
        this.quantidadeVenda = quantidadeVenda;
    }

    public Double getPrecoDeVenda() {
        return precoDeVenda;
    }

    public void setPrecoDeVenda(Double precoDeVenda) {
        this.precoDeVenda = precoDeVenda;
    }

    public Double getPrecoTotalVenda() {
        return precoTotalVenda;
    }

    public void setPrecoTotalVenda(Double precoTotalVenda) {
        this.precoTotalVenda = precoTotalVenda;
    }
    
    public void calcularPrecoTotal() {
        this.precoTotalVenda = this.precoDeVenda * this.quantidadeVenda;
    }
    
    public Boolean salvar() {
        String query = String.format("INSERT INTO produtos_venda (venda_id, produto_id, preco_venda, quantidade, preco_total) VALUES (%s, %s, %s, %s, %s);", 
            this.getVendaId(), 
            this.getProdutoId(),
            this.getPrecoDeVenda(),
            this.getQuantidadeVenda(),
            this.getPrecoTotalVenda());
        System.out.println(query);
        Connection connection = new DataBase().abrirConexao();

        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.execute();
            connection.close();
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro ao salvar produto da venda.");
        }
        
        return false;
    }
    
    public static ProdutoVenda obterNomeValor(String codigoDeBarras) {
        String query = String.format("SELECT * FROM produtos WHERE codigo_barras = '%s';", codigoDeBarras);
        System.out.println(query);
        Connection connection = new DataBase().abrirConexao();
        
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            Boolean retornoProduto = rs.next();
            ProdutoVenda produtoVenda = null;
            
            if (retornoProduto) {
                produtoVenda = new ProdutoVenda(
                    rs.getInt("id"),
                    rs.getString("nome"),
                    rs.getString("codigo_barras"),
                    rs.getDouble("preco_venda")
                );
            }
          
            connection.close();
            return produtoVenda;
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            System.err.println("Erro ao obter produto da venda.");
        }
        
        return null;
    }
}
