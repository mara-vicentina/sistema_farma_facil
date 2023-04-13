/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.projeto_pi_farmacia.view.cliente;

import com.mycompany.projeto_pi_farmacia.controller.ClienteController;
import com.mycompany.projeto_pi_farmacia.model.Cliente;
import com.mycompany.projeto_pi_farmacia.view.TelaInicial;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author marav
 */
public final class TelaClientes extends javax.swing.JFrame {

    static TelaCadastroCliente telaCadastroCliente = new TelaCadastroCliente();
    static TelaEdicaoCliente telaEdicaoCliente = new TelaEdicaoCliente();
     
    public TelaClientes() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelaClientes = new javax.swing.JTable();
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
        jLabel5.setText("Tela de Clientes");
        jLabel5.setFocusable(false);

        tabelaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Sobrenome", "CPF", "E-mail", "Telefone", "Endereço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaClientes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        jScrollPane3.setViewportView(tabelaClientes);

        jLabel9.setText("(ESC) - Sair");
        jLabel9.setFocusable(false);

        botaoFinalizarVenda.setBackground(new java.awt.Color(0, 153, 153));
        botaoFinalizarVenda.setText("Cadastrar");
        botaoFinalizarVenda.setActionCommand("cadastrar");
        botaoFinalizarVenda.setFocusable(false);
        botaoFinalizarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarCliente(evt);
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
                excluirCliente(evt);
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
                editarCliente(evt);
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
                TelaInicial.telaClientes.setVisible(false);
                break;
        }
    }//GEN-LAST:event_formKeyPressed

    private void editarCliente(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarCliente
        if (tabelaClientes.getSelectedRow() > -1) {
            TableModel model = tabelaClientes.getModel();
            
            TelaClientes.telaEdicaoCliente.carregarDados(
                Integer.valueOf(model.getValueAt(tabelaClientes.getSelectedRow(), 0).toString()),
                model.getValueAt(tabelaClientes.getSelectedRow(), 1).toString(),
                model.getValueAt(tabelaClientes.getSelectedRow(), 2).toString(),
                model.getValueAt(tabelaClientes.getSelectedRow(), 3).toString(),
                model.getValueAt(tabelaClientes.getSelectedRow(), 4).toString(),
                model.getValueAt(tabelaClientes.getSelectedRow(), 5).toString(),
                model.getValueAt(tabelaClientes.getSelectedRow(), 6).toString()
            );
            TelaClientes.telaEdicaoCliente.setVisible(true);
            TelaInicial.telaClientes.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma linha da tabela para editar.");
        }
        
    }//GEN-LAST:event_editarCliente

    private void excluirCliente(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirCliente
        if (tabelaClientes.getSelectedRow() > -1) {
            Integer idSelecionado = Integer.valueOf(tabelaClientes.getModel().getValueAt(tabelaClientes.getSelectedRow(), 0).toString());
            
            Integer opcaoSelecionada = JOptionPane.showConfirmDialog(this, String.format("Você tem certeza que deseja excluir esse registro (ID: %s)?", idSelecionado));
            if (opcaoSelecionada == 0) {
                new ClienteController().removerCliente(idSelecionado);
                TelaInicial.telaClientes.atualizarListagem();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma linha da tabela para excluir.");
        }
    }//GEN-LAST:event_excluirCliente

    private void cadastrarCliente(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarCliente
        TelaClientes.telaCadastroCliente.setVisible(true);
        TelaInicial.telaClientes.setVisible(false);
    }//GEN-LAST:event_cadastrarCliente

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        TelaInicial.telaClientes.atualizarListagem();
    }//GEN-LAST:event_formWindowOpened

    public void atualizarListagem() {
        ArrayList<Cliente> clientes = new ClienteController().listarClientes();
        
        DefaultTableModel model = (DefaultTableModel)tabelaClientes.getModel();
        model.setRowCount(0);
        for(int i = 0; i < clientes.size(); i++) {
            model.addRow(new Object[]{
                clientes.get(i).getId(),
                clientes.get(i).getNome(), 
                clientes.get(i).getSobrenome(),
                clientes.get(i).getCpf(),
                clientes.get(i).getEmail(),
                clientes.get(i).getTelefone(),
                clientes.get(i).getEndereco(),
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
            java.util.logging.Logger.getLogger(TelaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JTable tabelaClientes;
    // End of variables declaration//GEN-END:variables
}
