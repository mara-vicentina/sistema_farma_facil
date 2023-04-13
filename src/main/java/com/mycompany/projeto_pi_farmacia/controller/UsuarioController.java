/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto_pi_farmacia.controller;

import com.mycompany.projeto_pi_farmacia.model.Usuario;
import java.util.ArrayList;

/**
 *
 * @author marav
 */
public class UsuarioController {
    
    public Usuario autenticarUsuario(String nomeLogin, String senha) {
        try {
            return Usuario.autenticar(nomeLogin, senha);
        } catch (Exception ex) {
            return null;
        }
    }
    
     public Boolean inserirUsuario(String nome, String sobrenome, String cpf, String email, String telefone, String endereco, String nomeLogin, String senha) {
        try {
            Usuario usuario = new Usuario(null, nome, sobrenome, cpf, email, telefone, endereco, nomeLogin, senha);
            return usuario.salvar();
        } catch (Exception ex) {
            return false;
        }
    }
    
    public Boolean atualizarUsuario(Integer id, String nome, String sobrenome, String cpf, String email, String telefone, String endereco, String nomeLogin, String senha) {
        try {
            Usuario usuario = Usuario.obter(id);
            usuario.setNome(nome);
            usuario.setSobrenome(sobrenome);
            usuario.setCpf(cpf);
            usuario.setEmail(email);
            usuario.setTelefone(telefone);
            usuario.setEndereco(endereco);
            usuario.setNomeLogin(nomeLogin);
            usuario.setSenha(senha);
            return usuario.atualizar();
        } catch (Exception ex) {
            return false;
        }
    }
    
    public Boolean removerUsuario(Integer id) {
        try {
            Usuario usuario = Usuario.obter(id);
            return usuario.deletar();
        } catch (Exception ex) {
            return false;
        }
    }
    
    public ArrayList<Usuario> listarUsuarios() {
        try {
            return Usuario.listar();
        } catch (Exception ex) {
            return new ArrayList<>();
        }
    }
}
