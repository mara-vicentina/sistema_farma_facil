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
import java.util.ArrayList;

/**
 *
 * @author marav
 */
public class Produto {
    private Integer id;
    private String nome;
    private String descricao;
    private String fornecedor;
    private String codigoDeBarras;
    private Integer quantidade;    
    private Double precoDeCusto;    
    private Double precoDeVenda;

    public Produto(Integer id, String nome, String descricao, String fornecedor, String codigoDeBarras, Integer quantidade, Double precoDeCusto, Double precoDeVenda) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.fornecedor = fornecedor;
        this.codigoDeBarras = codigoDeBarras;
        this.quantidade = quantidade;
        this.precoDeCusto = precoDeCusto;
        this.precoDeVenda = precoDeVenda;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getCodigoDeBarras() {
        return codigoDeBarras;
    }

    public void setCodigoDeBarras(String codigoDeBarras) {
        this.codigoDeBarras = codigoDeBarras;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPrecoDeCusto() {
        return precoDeCusto;
    }

    public void setPrecoDeCusto(Double precoDeCusto) {
        this.precoDeCusto = precoDeCusto;
    }

    public Double getPrecoDeVenda() {
        return precoDeVenda;
    }

    public void setPrecoDeVenda(Double precoDeVenda) {
        this.precoDeVenda = precoDeVenda;
    }
    
    public Boolean salvar() {
        String query = String.format("INSERT INTO produtos (nome, descricao, codigo_barras, fornecedor, quantidade, preco_custo, preco_venda) VALUES ('%s', '%s', '%s', '%s', %s, %s, %s);", 
            this.getNome(), 
            this.getDescricao(),
            this.getCodigoDeBarras(),
            this.getFornecedor(),
            this.getQuantidade(),
            this.getPrecoDeCusto(),
            this.getPrecoDeVenda());
        System.out.println(query);
        Connection connection = new DataBase().abrirConexao();

        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.execute();
            connection.close();
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro ao salvar produto.");
        }
        
        return false;
    }
    
    public Boolean atualizar() {
        String query = String.format("UPDATE produtos SET nome = '%s', descricao = '%s', codigo_barras = '%s', fornecedor = '%s', quantidade = %s, preco_custo = %s, preco_venda = %s WHERE id = %s;", 
            this.getNome(), 
            this.getDescricao(),
            this.getCodigoDeBarras(),
            this.getFornecedor(),
            this.getQuantidade(),
            this.getPrecoDeCusto(),
            this.getPrecoDeVenda(),
            this.getId());
        System.out.println(query);
        Connection connection = new DataBase().abrirConexao();

        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.execute();
            connection.close();
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro ao atualizar produto.");
        }
        
        return false;
    }
    
    public Boolean deletar() {
        String query = String.format("DELETE FROM produtos WHERE id = %s;", this.getId());
        System.out.println(query);
        Connection connection = new DataBase().abrirConexao();

        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.execute();
            connection.close();
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro ao deletar produto.");
        }
        
        return false;
    }
    
    public Boolean atualizarEstoque(Integer quantidade) {
        String query = String.format("UPDATE produtos SET quantidade = quantidade - %s WHERE id = %s;", quantidade, this.getId());
        System.out.println(query);
        Connection connection = new DataBase().abrirConexao();

        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.execute();
            connection.close();
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro ao atualizar estoque do produto.");
        }
        
        return false;
    }
    
    public static ArrayList<Produto> listar() {
        ArrayList<Produto> produtos = new ArrayList<>();
        
        String query = String.format("SELECT * FROM produtos;");
        System.out.println(query);
        Connection connection = new DataBase().abrirConexao();
        
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()) {
                Produto produto = new Produto(
                    rs.getInt("id"),
                    rs.getString("nome"),
                    rs.getString("descricao"),
                    rs.getString("fornecedor"),
                    rs.getString("codigo_barras"),
                    rs.getInt("quantidade"),
                    rs.getDouble("preco_custo"),
                    rs.getDouble("preco_venda")
                );
                produtos.add(produto);
            }
          
            connection.close();
        } catch (SQLException ex) {
            System.err.println("Erro ao listar produtos.");
        }
        
        return produtos;
    }
    
    public static Produto obter(Integer id) {
        Produto produto = null;
        
        String query = String.format("SELECT * FROM produtos WHERE id = %s;", id);
        System.out.println(query);
        Connection connection = new DataBase().abrirConexao();
        
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            rs.next();
            
            produto = new Produto(
                rs.getInt("id"),
                rs.getString("nome"),
                rs.getString("descricao"),
                rs.getString("codigo_barras"),
                rs.getString("fornecedor"),
                rs.getInt("quantidade"),
                rs.getDouble("preco_custo"),
                rs.getDouble("preco_venda")
            );
          
            connection.close();
            return produto;
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            System.err.println("Erro ao obter produto.");
        }
        
        return null;
    }
}
