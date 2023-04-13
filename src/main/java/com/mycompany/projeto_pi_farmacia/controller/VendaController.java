/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto_pi_farmacia.controller;

import com.mycompany.projeto_pi_farmacia.model.Venda;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author marav
 */
public class VendaController {
    
    public Integer inserirVenda(Integer usuarioId, Integer clienteId, Double totalVenda) {
        try {
            Venda venda = new Venda(null, usuarioId, clienteId, totalVenda);
            
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date date = new Date();
            
            venda.setDataVenda(formatter.format(date));
            return venda.salvar();
        } catch (Exception ex) {
            return 0;
        }
    }
    
    public ArrayList<Venda> listarVendas() {
        try {
            return Venda.listar();
        } catch (Exception ex) {
            return new ArrayList<>();
        }
    }
    
}
