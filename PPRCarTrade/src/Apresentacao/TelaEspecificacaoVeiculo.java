/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Apresentacao;

import EDA.VendaVeiculo;
import Negocio.NegocioFacade;
import javax.swing.JOptionPane;

/**
 *
 * @author weiss
 */
public class TelaEspecificacaoVeiculo extends javax.swing.JFrame {

    /**
     * Creates new form TelaEspecificacaoVeiculo
     */
    
    private TelaBuscarVeiculo tela;
    private boolean comentarioJaAberto = false;
    private VendaVeiculo veiculo;
    
    public TelaEspecificacaoVeiculo() {
        initComponents();
        
        jtf_Marca.setEditable(false);
        jtf_Modelo.setEditable(false);
        jtf_Proprietario.setEditable(false);
        jtf_Email.setEditable(false);
        jtf_Telefone.setEditable(false);
        jtf_Preco.setEditable(false);
        jtf_Ano.setEditable(false);
        jtf_Cor.setEditable(false);
        
        this.setSize(this.getWidth(), this.getHeight() - jta_Comentario.getHeight() - 50);
        this.setResizable(false);
                
        
    }
    
    public TelaEspecificacaoVeiculo(TelaBuscarVeiculo tela, VendaVeiculo veiculo){
        this();
        this.tela = tela;
        this.tela.setEnabled(false);
        this.veiculo = veiculo;
        
        jtf_Marca.setText(veiculo.getVeiculo().getMarca());
        jtf_Modelo.setText(veiculo.getVeiculo().getModelo());
        jtf_Ano.setText(Integer.toString(veiculo.getVeiculo().getAno()));
        jtf_Cor.setText(veiculo.getVeiculo().getCor());
        jtf_Preco.setText(Double.toString(veiculo.getPreco()));
        jtf_Proprietario.setText(veiculo.getProprietario().getNome());
        jtf_Telefone.setText(veiculo.getProprietario().getFone());
        jtf_Email.setText(veiculo.getProprietario().getEmail());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        btn_Confirmar = new javax.swing.JButton();
        btn_Cancelar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jta_Comentario = new javax.swing.JTextArea();
        btn_Comentar = new javax.swing.JButton();
        jtf_Marca = new javax.swing.JTextField();
        jtf_Modelo = new javax.swing.JTextField();
        jlb_Modelo = new javax.swing.JLabel();
        jtf_Cor = new javax.swing.JTextField();
        jlb_Marca = new javax.swing.JLabel();
        jtf_Ano = new javax.swing.JTextField();
        jlb_Cor = new javax.swing.JLabel();
        jtf_Preco = new javax.swing.JTextField();
        jlb_Ano = new javax.swing.JLabel();
        jtf_Proprietario = new javax.swing.JTextField();
        jlb_Preco = new javax.swing.JLabel();
        jtf_Telefone = new javax.swing.JTextField();
        jlb_Proprietario = new javax.swing.JLabel();
        jtf_Email = new javax.swing.JTextField();
        jlb_Telefone = new javax.swing.JLabel();
        jlb_Email = new javax.swing.JLabel();
        btn_InformacoesProprietario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                Fechando(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        jLabel10.setText("Informações gerais do veículo");

        btn_Confirmar.setText("Confirmar");
        btn_Confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ConfirmarActionPerformed(evt);
            }
        });

        btn_Cancelar.setText("Cancelar");
        btn_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CancelarActionPerformed(evt);
            }
        });

        jLabel11.setText("Comentário:");

        jta_Comentario.setColumns(20);
        jta_Comentario.setLineWrap(true);
        jta_Comentario.setRows(5);
        jta_Comentario.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jta_Comentario);

        btn_Comentar.setText("Comentar");
        btn_Comentar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ComentarActionPerformed(evt);
            }
        });

        jlb_Modelo.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        jlb_Modelo.setText("Modelo:");

        jlb_Marca.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        jlb_Marca.setText("Marca:");

        jlb_Cor.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        jlb_Cor.setText("Cor:");

        jlb_Ano.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        jlb_Ano.setText("Ano:");

        jlb_Preco.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        jlb_Preco.setText("Preço:");

        jlb_Proprietario.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        jlb_Proprietario.setText("Proprietário:");

        jlb_Telefone.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        jlb_Telefone.setText("Telefone:");

        jlb_Email.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        jlb_Email.setText("Email:");

        btn_InformacoesProprietario.setText("+");
        btn_InformacoesProprietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_InformacoesProprietarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlb_Telefone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlb_Proprietario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlb_Modelo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlb_Cor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlb_Ano, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlb_Preco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlb_Email, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlb_Marca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtf_Email, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtf_Marca, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtf_Telefone, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtf_Cor)
                    .addComponent(jtf_Modelo)
                    .addComponent(jtf_Ano)
                    .addComponent(jtf_Preco)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jtf_Proprietario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_InformacoesProprietario)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(btn_Comentar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel10)))
                .addGap(0, 73, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_Marca)
                    .addComponent(jtf_Marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_Modelo)
                    .addComponent(jtf_Modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_Cor)
                    .addComponent(jtf_Cor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_Ano)
                    .addComponent(jtf_Ano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_Preco)
                    .addComponent(jtf_Preco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_Proprietario)
                    .addComponent(jtf_Proprietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_InformacoesProprietario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_Telefone)
                    .addComponent(jtf_Telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_Email)
                    .addComponent(jtf_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Comentar)
                    .addComponent(btn_Confirmar)
                    .addComponent(btn_Cancelar))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel11)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelarActionPerformed
        // TODO add your handling code here:
        tela.setEnabled(true);
        this.dispose();
    }//GEN-LAST:event_btn_CancelarActionPerformed

    private void btn_ComentarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ComentarActionPerformed
        // TODO add your handling code here:
        if(!comentarioJaAberto){
            comentarioJaAberto = true;
            this.setSize(this.getWidth(), this.getHeight() + jta_Comentario.getHeight() + 10);
            //jta_Comentario.setVisible(true);
        } else {
            if(NegocioFacade.adicionarComentarioVeiculo(veiculo, jta_Comentario.getText())){
                JOptionPane.showMessageDialog(this, "Comentário adicionado com sucesso!");
            } else {
                JOptionPane.showMessageDialog(this, NegocioFacade.getStatus().getErro(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btn_ComentarActionPerformed

    private void btn_ConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ConfirmarActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Veiculo comprado com sucesso!");
        this.dispose();
    }//GEN-LAST:event_btn_ConfirmarActionPerformed

    private void Fechando(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_Fechando
        // TODO add your handling code here:
        tela.setEnabled(true);
    }//GEN-LAST:event_Fechando

    private void btn_InformacoesProprietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_InformacoesProprietarioActionPerformed
        // TODO add your handling code here:
        this.setEnabled(false);
        new TelaInformacoesProprietario(this, this.veiculo.getProprietario()).setVisible(true);
    }//GEN-LAST:event_btn_InformacoesProprietarioActionPerformed

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
            java.util.logging.Logger.getLogger(TelaEspecificacaoVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEspecificacaoVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEspecificacaoVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEspecificacaoVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEspecificacaoVeiculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Cancelar;
    private javax.swing.JButton btn_Comentar;
    private javax.swing.JButton btn_Confirmar;
    private javax.swing.JButton btn_InformacoesProprietario;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlb_Ano;
    private javax.swing.JLabel jlb_Cor;
    private javax.swing.JLabel jlb_Email;
    private javax.swing.JLabel jlb_Marca;
    private javax.swing.JLabel jlb_Modelo;
    private javax.swing.JLabel jlb_Preco;
    private javax.swing.JLabel jlb_Proprietario;
    private javax.swing.JLabel jlb_Telefone;
    private javax.swing.JTextArea jta_Comentario;
    private javax.swing.JTextField jtf_Ano;
    private javax.swing.JTextField jtf_Cor;
    private javax.swing.JTextField jtf_Email;
    private javax.swing.JTextField jtf_Marca;
    private javax.swing.JTextField jtf_Modelo;
    private javax.swing.JTextField jtf_Preco;
    private javax.swing.JTextField jtf_Proprietario;
    private javax.swing.JTextField jtf_Telefone;
    // End of variables declaration//GEN-END:variables
}
