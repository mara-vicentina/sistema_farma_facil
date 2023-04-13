/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.projeto_pi_farmacia.view.venda;

import com.mycompany.projeto_pi_farmacia.controller.ClienteController;
import com.mycompany.projeto_pi_farmacia.controller.ProdutoController;
import com.mycompany.projeto_pi_farmacia.controller.ProdutoVendaController;
import com.mycompany.projeto_pi_farmacia.controller.VendaController;
import com.mycompany.projeto_pi_farmacia.model.Cliente;
import com.mycompany.projeto_pi_farmacia.model.ProdutoVenda;
import com.mycompany.projeto_pi_farmacia.view.TelaInicial;
import com.mycompany.projeto_pi_farmacia.view.TelaLogin;
import com.mycompany.projeto_pi_farmacia.view.cliente.TelaClientes;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author marav
 */
public class TelaCadastroVendas extends javax.swing.JFrame {

    ArrayList<ProdutoVenda> produtosVenda = new ArrayList<>();
    ArrayList<Cliente> clientes;
    private Double valorTotalVenda = 0.0;
    
    public TelaCadastroVendas() {
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

        jLabel5 = new javax.swing.JLabel();
        campoCodigoBarrasVenda = new javax.swing.JTextField();
        campoQuantidadeVendas = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaVenda = new javax.swing.JTable();
        campoValorTotalVenda = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        botaoFinalizarVenda = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        inserirProduto = new javax.swing.JButton();
        clienteSelecionado = new javax.swing.JComboBox<>();
        inserirProduto1 = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();

        setAlwaysOnTop(true);
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
        jLabel5.setText("Venda de Produtos");
        jLabel5.setFocusable(false);

        campoCodigoBarrasVenda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        campoQuantidadeVendas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jLabel1.setText("Selecione o Cliente");

        jLabel2.setText("Código de Barras");

        jLabel3.setText("Quantidade");

        tabelaVenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código de Barras", "Nome do Produto", "Quantidade", "Valor Unitário", "Valor Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaVenda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaVenda);

        campoValorTotalVenda.setEnabled(false);
        campoValorTotalVenda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jLabel4.setText("Total da Venda");

        botaoFinalizarVenda.setBackground(new java.awt.Color(0, 153, 153));
        botaoFinalizarVenda.setText("Finalizar Venda");
        botaoFinalizarVenda.setActionCommand("venda");
        botaoFinalizarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoFinalizarVendaActionPerformed(evt);
            }
        });
        botaoFinalizarVenda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jLabel10.setText("(ESC) - Sair");
        jLabel10.setFocusable(false);

        inserirProduto.setBackground(new java.awt.Color(0, 153, 153));
        inserirProduto.setText("Inserir Produto");
        inserirProduto.setToolTipText("");
        inserirProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inserir(evt);
            }
        });

        clienteSelecionado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clienteSelecionadoActionPerformed(evt);
            }
        });

        inserirProduto1.setBackground(new java.awt.Color(0, 153, 153));
        inserirProduto1.setText("Remover Produto");
        inserirProduto1.setToolTipText("");
        inserirProduto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remover(evt);
            }
        });

        cancelar.setBackground(new java.awt.Color(0, 153, 153));
        cancelar.setText("Cancelar");
        cancelar.setActionCommand("venda");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(34, 34, 34))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(474, 474, 474)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoCodigoBarrasVenda)
                            .addComponent(campoQuantidadeVendas)
                            .addComponent(inserirProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(64, 64, 64)))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 778, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(clienteSelecionado, 0, 284, Short.MAX_VALUE)
                                    .addComponent(inserirProduto1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(botaoFinalizarVenda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoValorTotalVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))))))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel10)
                .addGap(95, 95, 95)
                .addComponent(jLabel5)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoCodigoBarrasVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoQuantidadeVendas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(inserirProduto))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)
                                .addGap(5, 5, 5)
                                .addComponent(campoValorTotalVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(inserirProduto1)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(5, 5, 5)
                .addComponent(clienteSelecionado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelar)
                    .addComponent(botaoFinalizarVenda))
                .addContainerGap(162, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoFinalizarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoFinalizarVendaActionPerformed
        
        if (produtosVenda.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ao menos um produto deve ser adicionado para realizar a venda.");
            return;
        }
        
        Integer clienteId = this.clientes.get(clienteSelecionado.getSelectedIndex()).getId();
        Integer usuarioId = TelaLogin.usuarioLogado.getId();
        
        Integer idVenda = new VendaController().inserirVenda(usuarioId, clienteId, this.valorTotalVenda);
        
        if (idVenda != 0) {
            
            for (ProdutoVenda produtoVenda : produtosVenda) {
                produtoVenda.setVendaId(idVenda);
                new ProdutoVendaController().inserirProdutoVenda(produtoVenda);
                new ProdutoController().atualizarEstoque(produtoVenda.getProdutoId(), produtoVenda.getQuantidadeVenda());
            }
            
            JOptionPane.showMessageDialog(this, "Venda realizada com sucesso.");
            this.limparCampos();
            TelaInicial.telaVenda.atualizarListagem();
            TelaVenda.telaCadastroVendas.setVisible(false);
            TelaInicial.telaVenda.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao realizar venda.");
        }
    }//GEN-LAST:event_botaoFinalizarVendaActionPerformed
    
    public void limparCampos(){
        produtosVenda.clear();
        this.atualizarListagem();
        campoCodigoBarrasVenda.setText("");
        campoQuantidadeVendas.setText("");
    }
    
    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        switch(evt.getKeyCode()) {
            case com.sun.glass.events.KeyEvent.VK_ESCAPE:
                TelaVenda.telaCadastroVendas.setVisible(false);
                TelaInicial.telaVenda.setVisible(true);
                break;
        }
    }//GEN-LAST:event_formKeyPressed

    private void inserir(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inserir
        String codigoDeBarras = campoCodigoBarrasVenda.getText();
        String quantidadeVenda = campoQuantidadeVendas.getText();
        
        ProdutoVenda retornoProdutoVenda = this.adicionarProduto(codigoDeBarras, Integer.valueOf(quantidadeVenda));
        
        if (retornoProdutoVenda != null) {
            produtosVenda.add(retornoProdutoVenda);
            this.atualizarListagem();
            campoCodigoBarrasVenda.setText("");
            campoQuantidadeVendas.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Código de Barras não encontrado.");
        }
    }//GEN-LAST:event_inserir

    private ProdutoVenda adicionarProduto(String codigoDeBarras, Integer quantidadeVenda){
        try {
            ProdutoVenda produtoVenda = new ProdutoVendaController().obterNomeValor(codigoDeBarras);
            
            if (produtoVenda != null) {
                produtoVenda.setQuantidadeVenda(quantidadeVenda);
                produtoVenda.calcularPrecoTotal();
            }
   
            return produtoVenda;
        } catch (Exception ex) {
            return null;
        }
    }
    
    public void atualizarListagem() {
        
        DefaultTableModel model = (DefaultTableModel)tabelaVenda.getModel();
        model.setRowCount(0);
        for(int i = 0; i < produtosVenda.size(); i++) {
            model.addRow(new Object[]{
                produtosVenda.get(i).getCodigoDeBarras(),
                produtosVenda.get(i).getNome(), 
                produtosVenda.get(i).getQuantidadeVenda(),
                produtosVenda.get(i).getPrecoDeVenda(),
                produtosVenda.get(i).getPrecoTotalVenda(),
            });
        }
        
        this.calcularValorTotalVenda();
    }
    private void remover(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remover
        if (tabelaVenda.getSelectedRow() > -1) {
            Integer opcaoSelecionada = JOptionPane.showConfirmDialog(this, "Você tem certeza que deseja remover esse item?");
            if (opcaoSelecionada == 0) {
                produtosVenda.remove(tabelaVenda.getSelectedRow());
                this.atualizarListagem();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma linha da tabela para remover.");
        }
    }//GEN-LAST:event_remover
    
    private void calcularValorTotalVenda() {
        
        this.valorTotalVenda = 0.0;
        
        for (ProdutoVenda produtoVenda : produtosVenda) {
            this.valorTotalVenda += produtoVenda.getPrecoTotalVenda();
        }
        
        campoValorTotalVenda.setText(this.valorTotalVenda.toString());
    }
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        clientes = new ClienteController().listarClientes();
        
        for(int i = 0; i < clientes.size(); i++) {
            clienteSelecionado.addItem(clientes.get(i).getNome());
        }
    }//GEN-LAST:event_formWindowOpened

    private void clienteSelecionadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clienteSelecionadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clienteSelecionadoActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        this.setVisible(false);
        TelaInicial.telaVenda.setVisible(true);
        this.limparCampos();
    }//GEN-LAST:event_cancelarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroVendas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoFinalizarVenda;
    private javax.swing.JTextField campoCodigoBarrasVenda;
    private javax.swing.JTextField campoQuantidadeVendas;
    private javax.swing.JTextField campoValorTotalVenda;
    private javax.swing.JButton cancelar;
    private javax.swing.JComboBox<String> clienteSelecionado;
    private javax.swing.JButton inserirProduto;
    private javax.swing.JButton inserirProduto1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaVenda;
    // End of variables declaration//GEN-END:variables
}
