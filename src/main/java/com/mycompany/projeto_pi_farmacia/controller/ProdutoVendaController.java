package com.mycompany.projeto_pi_farmacia.controller;

import com.mycompany.projeto_pi_farmacia.model.ProdutoVenda;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author marav
 */
public class ProdutoVendaController {
    
    public Boolean inserirProdutoVenda(ProdutoVenda produtoVenda) {
        try {           
            return produtoVenda.salvar();
        } catch (Exception ex) {
            return false;
        }
    }
    
    public ProdutoVenda obterNomeValor(String codigoDeBarras) {
        try {
            ProdutoVenda produtoVenda = ProdutoVenda.obterNomeValor(codigoDeBarras);
            return produtoVenda;
        } catch (Exception ex) {
            return null;
        }
    }
}
