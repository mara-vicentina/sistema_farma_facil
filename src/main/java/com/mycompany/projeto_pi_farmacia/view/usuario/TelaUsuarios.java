/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.projeto_pi_farmacia.view.usuario;

import com.mycompany.projeto_pi_farmacia.controller.ClienteController;
import com.mycompany.projeto_pi_farmacia.controller.UsuarioController;
import com.mycompany.projeto_pi_farmacia.model.Usuario;
import com.mycompany.projeto_pi_farmacia.view.TelaInicial;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author marav
 */
public final class TelaUsuarios extends javax.swing.JFrame {

    static TelaCadastroUsuario telaCadastroUsuario = new TelaCadastroUsuario();
    static TelaEdicaoUsuario telaEdicaoUsuario = new TelaEdicaoUsuario();
     
    public TelaUsuarios() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelaUsuarios = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        botaoFinalizarVenda = new javax.swing.JButton();
        botaoFinalizarVenda1 = new javax.swing.JButton();
        botaoFinalizarVenda2 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(204, 204, 204));
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 153));
        jLabel5.setText("Tela de Usuários");
        jLabel5.setFocusable(false);

        tabelaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Sobrenome", "CPF", "E-mail", "Telefone", "Endereço", "Nome Login", "Senha"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaUsuarios.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        jScrollPane3.setViewportView(tabelaUsuarios);

        jLabel9.setText("(ESC) - Sair");
        jLabel9.setFocusable(false);

        botaoFinalizarVenda.setBackground(new java.awt.Color(0, 153, 153));
        botaoFinalizarVenda.setText("Cadastrar");
        botaoFinalizarVenda.setActionCommand("cadastrar");
        botaoFinalizarVenda.setFocusable(false);
        botaoFinalizarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarUsuario(evt);
            }
        });
        botaoFinalizarVenda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        botaoFinalizarVenda1.setBackground(new java.awt.Color(0, 153, 153));
        botaoFinalizarVenda1.setText("Excluir");
        botaoFinalizarVenda1.setActionCommand("excluir");
        botaoFinalizarVenda1.setFocusable(false);
        botaoFinalizarVenda1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirUsuario(evt);
            }
        });
        botaoFinalizarVenda1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        botaoFinalizarVenda2.setBackground(new java.awt.Color(0, 153, 153));
        botaoFinalizarVenda2.setText("Editar");
        botaoFinalizarVenda2.setFocusable(false);
        botaoFinalizarVenda2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarUsuario(evt);
            }
        });
        botaoFinalizarVenda2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1094, 1094, 1094)
                        .addComponent(jLabel9))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1188, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botaoFinalizarVenda)
                .addGap(65, 65, 65)
                .addComponent(botaoFinalizarVenda2)
                .addGap(71, 71, 71)
                .addComponent(botaoFinalizarVenda1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(476, 476, 476)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel9)
                .addGap(27, 27, 27)
                .addComponent(jLabel5)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoFinalizarVenda)
                    .addComponent(botaoFinalizarVenda1)
                    .addComponent(botaoFinalizarVenda2))
                .addGap(51, 51, 51)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(167, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        switch(evt.getKeyCode()) {
            case com.sun.glass.events.KeyEvent.VK_ESCAPE:
                TelaInicial.telaUsuarios.setVisible(false);
                break;
        }
    }//GEN-LAST:event_formKeyPressed

    private void editarUsuario(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarUsuario
        if (tabelaUsuarios.getSelectedRow() > -1) {
            TableModel model = tabelaUsuarios.getModel();
            
            TelaUsuarios.telaEdicaoUsuario.carregarDados(
                Integer.valueOf(model.getValueAt(tabelaUsuarios.getSelectedRow(), 0).toString()),
                model.getValueAt(tabelaUsuarios.getSelectedRow(), 1).toString(),
                model.getValueAt(tabelaUsuarios.getSelectedRow(), 2).toString(),
                model.getValueAt(tabelaUsuarios.getSelectedRow(), 3).toString(),
                model.getValueAt(tabelaUsuarios.getSelectedRow(), 4).toString(),
                model.getValueAt(tabelaUsuarios.getSelectedRow(), 5).toString(),
                model.getValueAt(tabelaUsuarios.getSelectedRow(), 6).toString(),
                model.getValueAt(tabelaUsuarios.getSelectedRow(), 7).toString(),
                model.getValueAt(tabelaUsuarios.getSelectedRow(), 8).toString()
            );
            TelaUsuarios.telaEdicaoUsuario.setVisible(true);
            TelaInicial.telaUsuarios.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma linha da tabela para editar.");
        }
        
    }//GEN-LAST:event_editarUsuario

    private void excluirUsuario(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirUsuario
        if (tabelaUsuarios.getSelectedRow() > -1) {
            Integer idSelecionado = Integer.valueOf(tabelaUsuarios.getModel().getValueAt(tabelaUsuarios.getSelectedRow(), 0).toString());
            
            Integer opcaoSelecionada = JOptionPane.showConfirmDialog(this, String.format("Você tem certeza que deseja excluir esse registro (ID: %s)?", idSelecionado));
            if (opcaoSelecionada == 0) {
                new UsuarioController().removerUsuario(idSelecionado);
                TelaInicial.telaUsuarios.atualizarListagem();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma linha da tabela para excluir.");
        }
    }//GEN-LAST:event_excluirUsuario

    private void cadastrarUsuario(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarUsuario
        TelaUsuarios.telaCadastroUsuario.setVisible(true);
        TelaInicial.telaUsuarios.setVisible(false);
    }//GEN-LAST:event_cadastrarUsuario

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        TelaInicial.telaUsuarios.atualizarListagem();
    }//GEN-LAST:event_formWindowOpened

    public void atualizarListagem() {
        ArrayList<Usuario> usuarios = new UsuarioController().listarUsuarios();
        
        DefaultTableModel model = (DefaultTableModel)tabelaUsuarios.getModel();
        model.setRowCount(0);
        for(int i = 0; i < usuarios.size(); i++) {
            model.addRow(new Object[]{
                usuarios.get(i).getId(),
                usuarios.get(i).getNome(), 
                usuarios.get(i).getSobrenome(),
                usuarios.get(i).getCpf(),
                usuarios.get(i).getEmail(),
                usuarios.get(i).getTelefone(),
                usuarios.get(i).getEndereco(),
                usuarios.get(i).getNomeLogin(),
                usuarios.get(i).getSenha(),
            });
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoFinalizarVenda;
    private javax.swing.JButton botaoFinalizarVenda1;
    private javax.swing.JButton botaoFinalizarVenda2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private static javax.swing.JTable tabelaUsuarios;
    // End of variables declaration//GEN-END:variables
}
