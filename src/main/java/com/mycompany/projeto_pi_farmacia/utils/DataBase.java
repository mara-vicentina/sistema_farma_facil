/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto_pi_farmacia.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author marav
 */
public class DataBase {
    private String url = "jdbc:mysql://localhost:3306/";
    private String database = "bdfarmacia";
    private String usuario = "root";
    private String senha = "";
   
    public Connection abrirConexao() {
        Connection conn = null;
        
        try {
            conn = DriverManager.getConnection(url + database, usuario, senha);
        } catch (SQLException ex) {
            System.err.println("Erro ao conectar no banco de dados.");
        }
        
        return conn;
    }
}
