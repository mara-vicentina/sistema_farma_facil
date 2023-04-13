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
public class Cliente {
    private Integer id;
    private String nome;
    private String sobrenome;
    private String cpf;
    private String email;
    private String telefone;    
    private String endereco;

    public Cliente(Integer id, String nome, String sobrenome, String cpf, String email, String telefone, String endereco) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
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

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public Boolean salvar() {
        String query = String.format("INSERT INTO clientes (nome, sobrenome, cpf, email, telefone, endereco) VALUES ('%s', '%s', '%s', '%s', '%s', '%s');", 
            this.getNome(), 
            this.getSobrenome(),
            this.getCpf(),
            this.getEmail(),
            this.getTelefone(),
            this.getEndereco());
        System.out.println(query);
        Connection connection = new DataBase().abrirConexao();

        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.execute();
            connection.close();
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro ao salvar cliente.");
        }
        
        return false;
    }
    
    public Boolean atualizar() {
        String query = String.format("UPDATE clientes SET nome = '%s', sobrenome = '%s', cpf = '%s', email = '%s', telefone = '%s', endereco = '%s' WHERE id = %s;", 
            this.getNome(), 
            this.getSobrenome(),
            this.getCpf(),
            this.getEmail(),
            this.getTelefone(),
            this.getEndereco(),
            this.getId());
        System.out.println(query);
        Connection connection = new DataBase().abrirConexao();

        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.execute();
            connection.close();
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro ao atualizar cliente.");
        }
        
        return false;
    }
    
    public Boolean deletar() {
        String query = String.format("DELETE FROM clientes WHERE id = %s;", this.getId());
        System.out.println(query);
        Connection connection = new DataBase().abrirConexao();

        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.execute();
            connection.close();
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro ao deletar cliente.");
        }
        
        return false;
    }
    
    public static ArrayList<Cliente> listar() {
        ArrayList<Cliente> clientes = new ArrayList<>();
        
        String query = String.format("SELECT * FROM clientes;");
        System.out.println(query);
        Connection connection = new DataBase().abrirConexao();
        
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()) {
                
                Cliente cliente = new Cliente(
                    rs.getInt("id"),
                    rs.getString("nome"),
                    rs.getString("sobrenome"),
                    rs.getString("cpf"),
                    rs.getString("email"),
                    rs.getString("telefone"),
                    rs.getString("endereco")
                );
                clientes.add(cliente);
            }
          
            connection.close();
        } catch (SQLException ex) {
            System.err.println("Erro ao listar clientes.");
        }
        
        return clientes;
    }
    
    public static Cliente obter(Integer id) {
        Cliente cliente = null;
        
        String query = String.format("SELECT * FROM clientes WHERE id = %s;", id);
        System.out.println(query);
        Connection connection = new DataBase().abrirConexao();
        
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            rs.next();
            
            cliente = new Cliente(
                rs.getInt("id"),
                rs.getString("nome"),
                rs.getString("sobrenome"),
                rs.getString("cpf"),
                rs.getString("email"),
                rs.getString("telefone"),
                rs.getString("endereco")
            );
          
            connection.close();
            return cliente;
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            System.err.println("Erro ao obter cliente.");
        }
        
        return null;
    }
}


