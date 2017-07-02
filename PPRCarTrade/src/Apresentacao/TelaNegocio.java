/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Apresentacao;

/**
 *
 * @author weiss
 */
public class TelaNegocio extends javax.swing.JFrame {

    /**
     * Creates new form TelaNegocio
     */
    
    TelaLogin tela;
    
    public TelaNegocio() {
        initComponents();
    }
    
    public TelaNegocio(TelaLogin tela){
        this();
        this.tela = tela;
        this.tela.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btn_VenderVeiculo = new javax.swing.JButton();
        btn_BuscarVeiculo = new javax.swing.JButton();
        btn_Cancelar = new javax.swing.JButton();
        bnt_BuscarProprietario = new javax.swing.JButton();
        btn_VenderVeiculo1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                Fechando(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        jLabel1.setText("Menu de Negócios");

        btn_VenderVeiculo.setText("Vender veículo");
        btn_VenderVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VenderVeiculoActionPerformed(evt);
            }
        });

        btn_BuscarVeiculo.setText("Buscar veículo");
        btn_BuscarVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BuscarVeiculoActionPerformed(evt);
            }
        });

        btn_Cancelar.setText("Cancelar");
        btn_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CancelarActionPerformed(evt);
            }
        });

        bnt_BuscarProprietario.setText("Buscar Proprietário");
        bnt_BuscarProprietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt_BuscarProprietarioActionPerformed(evt);
            }
        });

        btn_VenderVeiculo1.setText("Cadastrar Vendedor");
        btn_VenderVeiculo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VenderVeiculo1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_Cancelar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(bnt_BuscarProprietario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_BuscarVeiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_VenderVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_VenderVeiculo1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(38, 38, 38))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_BuscarVeiculo)
                    .addComponent(btn_VenderVeiculo))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bnt_BuscarProprietario)
                    .addComponent(btn_VenderVeiculo1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Cancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Fechando(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_Fechando
        // TODO add your handling code here:
        this.tela.setEnabled(true);
    }//GEN-LAST:event_Fechando

    private void btn_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btn_CancelarActionPerformed

    private void btn_BuscarVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BuscarVeiculoActionPerformed
        // TODO add your handling code here:
        this.setEnabled(false);
        new TelaBuscarVeiculo(this).setVisible(true);
    }//GEN-LAST:event_btn_BuscarVeiculoActionPerformed


    
    /**
     * @author Arthur
     */
    
    private void btn_VenderVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VenderVeiculoActionPerformed
        // TODO add your handling code here:
        this.setEnabled(false);
        new TelaVenda(this).setVisible(true);
    }//GEN-LAST:event_btn_VenderVeiculoActionPerformed

    private void bnt_BuscarProprietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt_BuscarProprietarioActionPerformed
        // TODO add your handling code here:
        this.setEnabled(false);
        new TelaBuscarProprietario(this).setVisible(true);
    }//GEN-LAST:event_bnt_BuscarProprietarioActionPerformed

    private void btn_VenderVeiculo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VenderVeiculo1ActionPerformed
        this.setEnabled(false);
        TelaCadastroVendedor tela = new TelaCadastroVendedor();
        tela.setVisible(true);
    }//GEN-LAST:event_btn_VenderVeiculo1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnt_BuscarProprietario;
    private javax.swing.JButton btn_BuscarVeiculo;
    private javax.swing.JButton btn_Cancelar;
    private javax.swing.JButton btn_VenderVeiculo;
    private javax.swing.JButton btn_VenderVeiculo1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
