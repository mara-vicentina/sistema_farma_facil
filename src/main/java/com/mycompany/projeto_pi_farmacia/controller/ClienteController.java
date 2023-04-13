/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto_pi_farmacia.controller;

import com.mycompany.projeto_pi_farmacia.model.Cliente;
import java.util.ArrayList;

/**
 *
 * @author marav
 */
public class ClienteController {
    
    public Boolean inserirCliente(String nome, String sobrenome, String cpf, String email, String telefone, String endereco) {
        try {
            Cliente cliente = new Cliente(null, nome, sobrenome, cpf, email, telefone, endereco);
            return cliente.salvar();
        } catch (Exception ex) {
            return false;
        }
    }
    
    public Boolean atualizarCliente(Integer id, String nome, String sobrenome, String cpf, String email, String telefone, String endereco) {
        try {
            Cliente cliente = Cliente.obter(id);
            cliente.setNome(nome);
            cliente.setSobrenome(sobrenome);
            cliente.setCpf(cpf);
            cliente.setEmail(email);
            cliente.setTelefone(telefone);
            cliente.setEndereco(endereco);
            return cliente.atualizar();
        } catch (Exception ex) {
            return false;
        }
    }
    
    public Boolean removerCliente(Integer id) {
        try {
            Cliente cliente = Cliente.obter(id);
            return cliente.deletar();
        } catch (Exception ex) {
            return false;
        }
    }
    
    public ArrayList<Cliente> listarClientes() {
        try {
            return Cliente.listar();
        } catch (Exception ex) {
            return new ArrayList<>();
        }
    }
    
}
