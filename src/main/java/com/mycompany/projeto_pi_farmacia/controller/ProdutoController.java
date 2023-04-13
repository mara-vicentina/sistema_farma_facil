/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto_pi_farmacia.controller;

import com.mycompany.projeto_pi_farmacia.model.Produto;
import java.util.ArrayList;

/**
 *
 * @author marav
 */
public class ProdutoController {
    
    public Boolean inserirProduto(String nome, String descricao, String fornecedor, String codigoDeBarras, Integer quantidade, Double precoDeCusto, Double precoDeVenda) {
        try {
            Produto produto = new Produto(null, nome, descricao, fornecedor, codigoDeBarras, quantidade, precoDeCusto, precoDeVenda);
            return produto.salvar();
        } catch (Exception ex) {
            return false;
        }
    }
    
    public Boolean atualizarProduto(Integer id, String nome, String descricao, String fornecedor, String codigoDeBarras, Integer quantidade, Double precoDeCusto, Double precoDeVenda) {
        try {
            Produto produto = Produto.obter(id);
            produto.setNome(nome);
            produto.setDescricao(descricao);
            produto.setFornecedor(fornecedor);
            produto.setCodigoDeBarras(codigoDeBarras);
            produto.setQuantidade(quantidade);
            produto.setPrecoDeCusto(precoDeCusto);
            produto.setPrecoDeVenda(precoDeVenda);
            return produto.atualizar();
        } catch (Exception ex) {
            return false;
        }
    }
    
    public Boolean removerProduto(Integer id) {
        try {
            Produto produto = Produto.obter(id);
            return produto.deletar();
        } catch (Exception ex) {
            return false;
        }
    }
    
    public ArrayList<Produto> listarProdutos() {
        try {
            return Produto.listar();
        } catch (Exception ex) {
            return new ArrayList<>();
        }
    }
    
    public Boolean atualizarEstoque(Integer produtoId, Integer quantidade) {
        try {
            Produto produto = Produto.obter(produtoId);
            return produto.atualizarEstoque(quantidade);
        } catch (Exception ex) {
            return false;
        }
    }
    
}
