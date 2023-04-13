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

public class Usuario {
    private Integer id;
    private String nome;
    private String sobrenome;
    private String cpf;
    private String email;
    private String telefone;    
    private String endereco;    
    private String nomeLogin;
    private String senha;

    public Usuario(
            Integer id, 
            String nome, 
            String sobrenome, 
            String cpf, 
            String email, 
            String telefone, 
            String endereco, 
            String nomeLogin, 
            String senha) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
        this.nomeLogin = nomeLogin;
        this.senha = senha;
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

    public String getNomeLogin() {
        return nomeLogin;
    }

    public void setNomeLogin(String nomeLogin) {
        this.nomeLogin = nomeLogin;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public static Usuario autenticar(String nomeLogin, String senha) {
        
        String query = String.format("SELECT * FROM usuarios WHERE nome_login = '%s' AND senha = '%s';", nomeLogin, senha);
        Connection connection = new DataBase().abrirConexao();
        
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            Boolean retornoLogin = rs.next();
            Usuario usuarioAutenticado = new Usuario(
                    rs.getInt("id"),
                    rs.getString("nome"),
                    rs.getString("sobrenome"),
                    rs.getString("cpf"),
                    rs.getString("email"),
                    rs.getString("telefone"),
                    rs.getString("endereco"),
                    rs.getString("nome_login"),
                    rs.getString("senha"));
            connection.close();
            
            return usuarioAutenticado;
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            System.err.println("Erro ao fazer Login.");
        }
        return null;
    }
    
    public Boolean salvar() {
        String query = String.format("INSERT INTO usuarios (nome, sobrenome, cpf, email, telefone, endereco, nome_login, senha) VALUES ('%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s');", 
            this.getNome(), 
            this.getSobrenome(),
            this.getCpf(),
            this.getEmail(),
            this.getTelefone(),
            this.getEndereco(),
            this.getNomeLogin(),
            this.getSenha());
        System.out.println(query);
        Connection connection = new DataBase().abrirConexao();

        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.execute();
            connection.close();
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro ao salvar usuário.");
        }
        
        return false;
    }
    
    public Boolean atualizar() {
        String query = String.format("UPDATE usuarios SET nome = '%s', sobrenome = '%s', cpf = '%s', email = '%s', telefone = '%s', endereco = '%s', nome_login = '%s', senha = '%s' WHERE id = %s;", 
            this.getNome(), 
            this.getSobrenome(),
            this.getCpf(),
            this.getEmail(),
            this.getTelefone(),
            this.getEndereco(),
            this.getNomeLogin(),
            this.getSenha(),
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
        String query = String.format("DELETE FROM usuarios WHERE id = %s;", this.getId());
        System.out.println(query);
        Connection connection = new DataBase().abrirConexao();

        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.execute();
            connection.close();
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro ao deletar usuário.");
        }
        
        return false;
    }
    
    public static ArrayList<Usuario> listar() {
        ArrayList<Usuario> usuarios = new ArrayList<>();
        
        String query = String.format("SELECT * FROM usuarios;");
        System.out.println(query);
        Connection connection = new DataBase().abrirConexao();
        
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()) {
                
                Usuario usuario = new Usuario(
                    rs.getInt("id"),
                    rs.getString("nome"),
                    rs.getString("sobrenome"),
                    rs.getString("cpf"),
                    rs.getString("email"),
                    rs.getString("telefone"),
                    rs.getString("endereco"),
                    rs.getString("nome_login"),
                    rs.getString("senha")
                );
                usuarios.add(usuario);
            }
          
            connection.close();
        } catch (SQLException ex) {
            System.err.println("Erro ao listar usuarios.");
        }
        
        return usuarios;
    }
    
    public static Usuario obter(Integer id) {
        Usuario usuario = null;
        
        String query = String.format("SELECT * FROM usuarios WHERE id = %s;", id);
        System.out.println(query);
        Connection connection = new DataBase().abrirConexao();
        
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            rs.next();
            
            usuario = new Usuario(
                rs.getInt("id"),
                rs.getString("nome"),
                rs.getString("sobrenome"),
                rs.getString("cpf"),
                rs.getString("email"),
                rs.getString("telefone"),
                rs.getString("endereco"),
                rs.getString("nome_login"),
                rs.getString("senha")
            );
          
            connection.close();
            return usuario;
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            System.err.println("Erro ao obter usuário.");
        }
        
        return null;
    }
}
