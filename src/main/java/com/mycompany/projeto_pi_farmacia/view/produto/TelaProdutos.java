/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.projeto_pi_farmacia.view.produto;

import com.mycompany.projeto_pi_farmacia.controller.ProdutoController;
import com.mycompany.projeto_pi_farmacia.model.Produto;
import com.mycompany.projeto_pi_farmacia.view.TelaInicial;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author marav
 */
public final class TelaProdutos extends javax.swing.JFrame {

    static TelaCadastroProduto telaCadastroProduto = new TelaCadastroProduto();
    static TelaEdicaoProduto telaEdicaoProduto = new TelaEdicaoProduto();
    
    public TelaProdutos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelaProdutos = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        excluirProduto = new javax.swing.JButton();
        cadastrarProduto = new javax.swing.JButton();
        editarProduto = new javax.swing.JButton();

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
        jLabel5.setText("Tela de Produtos");
        jLabel5.setFocusable(false);

        tabelaProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Descrição", "Código de Barras", "Quantidade", "Fornecedor", "Preço de Custo", "Preço de Venda"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaProdutos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        jScrollPane3.setViewportView(tabelaProdutos);

        jLabel9.setText("(ESC) - Sair");
        jLabel9.setFocusable(false);

        excluirProduto.setBackground(new java.awt.Color(0, 153, 153));
        excluirProduto.setText("Excluir");
        excluirProduto.setActionCommand("excluir");
        excluirProduto.setFocusable(false);
        excluirProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirProdutoActionPerformed(evt);
            }
        });

        cadastrarProduto.setBackground(new java.awt.Color(0, 153, 153));
        cadastrarProduto.setText("Cadastrar");
        cadastrarProduto.setActionCommand("cadastrar");
        cadastrarProduto.setFocusable(false);
        cadastrarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarProdutoActionPerformed(evt);
            }
        });

        editarProduto.setBackground(new java.awt.Color(0, 153, 153));
        editarProduto.setText("Editar");
        editarProduto.setActionCommand("editar");
        editarProduto.setFocusable(false);
        editarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(454, 454, 454)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(39, 39, 39))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cadastrarProduto)
                .addGap(59, 59, 59)
                .addComponent(editarProduto)
                .addGap(44, 44, 44)
                .addComponent(excluirProduto)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel9)
                .addGap(31, 31, 31)
                .addComponent(jLabel5)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(excluirProduto)
                    .addComponent(editarProduto)
                    .addComponent(cadastrarProduto))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(167, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        switch(evt.getKeyCode()) {
            case com.sun.glass.events.KeyEvent.VK_ESCAPE:
                TelaInicial.telaProdutos.setVisible(false);
                break;
        }
    }//GEN-LAST:event_formKeyPressed

    private void cadastrarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarProdutoActionPerformed
        // TODO add your handling code here:
        TelaProdutos.telaCadastroProduto.setVisible(true);
        TelaInicial.telaProdutos.setVisible(false);
        
    }//GEN-LAST:event_cadastrarProdutoActionPerformed

    private void editarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarProdutoActionPerformed
        // TODO add your handling code here:
        if (tabelaProdutos.getSelectedRow() > -1) {
            TableModel model = tabelaProdutos.getModel();
            
            TelaProdutos.telaEdicaoProduto.carregarDados(
                Integer.valueOf(model.getValueAt(tabelaProdutos.getSelectedRow(), 0).toString()),
                model.getValueAt(tabelaProdutos.getSelectedRow(), 1).toString(),
                model.getValueAt(tabelaProdutos.getSelectedRow(), 2).toString(),
                model.getValueAt(tabelaProdutos.getSelectedRow(), 3).toString(),
                model.getValueAt(tabelaProdutos.getSelectedRow(), 5).toString(),
                model.getValueAt(tabelaProdutos.getSelectedRow(), 4).toString(),
                model.getValueAt(tabelaProdutos.getSelectedRow(), 6).toString(),
                model.getValueAt(tabelaProdutos.getSelectedRow(), 7).toString()
            );
            TelaProdutos.telaEdicaoProduto.setVisible(true);
            TelaInicial.telaProdutos.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma linha da tabela para editar.");
        }
        
    }//GEN-LAST:event_editarProdutoActionPerformed

    private void excluirProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirProdutoActionPerformed
        // TODO add your handling code here:
        if (tabelaProdutos.getSelectedRow() > -1) {
            Integer idSelecionado = Integer.valueOf(tabelaProdutos.getModel().getValueAt(tabelaProdutos.getSelectedRow(), 0).toString());
            
            Integer opcaoSelecionada = JOptionPane.showConfirmDialog(this, String.format("Você tem certeza que deseja excluir esse registro (ID: %s)?", idSelecionado));
            if (opcaoSelecionada == 0) {
                new ProdutoController().removerProduto(idSelecionado);
                TelaInicial.telaProdutos.atualizarListagem();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma linha da tabela para excluir.");
        }
    }//GEN-LAST:event_excluirProdutoActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        TelaInicial.telaProdutos.atualizarListagem();
    }//GEN-LAST:event_formWindowOpened

    public void atualizarListagem() {
        ArrayList<Produto> produtos = new ProdutoController().listarProdutos();
        
        DefaultTableModel model = (DefaultTableModel)tabelaProdutos.getModel();
        model.setRowCount(0);
        for(int i = 0; i < produtos.size(); i++) {
            model.addRow(new Object[]{
                produtos.get(i).getId(),
                produtos.get(i).getNome(), 
                produtos.get(i).getDescricao(),
                produtos.get(i).getCodigoDeBarras(),
                produtos.get(i).getQuantidade(),
                produtos.get(i).getFornecedor(),
                produtos.get(i).getPrecoDeCusto(),
                produtos.get(i).getPrecoDeVenda(),
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
            java.util.logging.Logger.getLogger(TelaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
    private javax.swing.JButton cadastrarProduto;
    private javax.swing.JButton editarProduto;
    private javax.swing.JButton excluirProduto;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tabelaProdutos;
    // End of variables declaration//GEN-END:variables
}
