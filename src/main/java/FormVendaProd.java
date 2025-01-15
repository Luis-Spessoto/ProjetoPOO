
import javax.swing.JOptionPane;


//Luis Felipe Spessoto - 2648016
public class FormVendaProd extends javax.swing.JFrame {

    private GerenciamentoEstq gerEst = GerenciamentoEstq.geraEstq();
    private Produto p = new Produto();
    
    
    //MÉTODO SINGLETON
    private static FormVendaProd geraVenda;
    
    public FormVendaProd() {
        initComponents();
    }

    public static FormVendaProd geraVendaUnic(){
        if(geraVenda == null){
            geraVenda = new FormVendaProd();
        }
        return geraVenda;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rotVenda = new javax.swing.JLabel();
        rotCpfCliente = new javax.swing.JLabel();
        rotCodProd = new javax.swing.JLabel();
        rotQntProd = new javax.swing.JLabel();
        cxCpfCliente = new javax.swing.JTextField();
        cxCodProd = new javax.swing.JTextField();
        cxQntProd = new javax.swing.JTextField();
        separador = new javax.swing.JSeparator();
        btLimpar = new javax.swing.JButton();
        btVender = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        rotVenda.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rotVenda.setText("Venda");

        rotCpfCliente.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        rotCpfCliente.setText("CPF do Cliente:");

        rotCodProd.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        rotCodProd.setText("Codigo do produto:");

        rotQntProd.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        rotQntProd.setText("Quantidade a ser vendida:");

        cxQntProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxQntProdActionPerformed(evt);
            }
        });

        btLimpar.setText("Limpar campos");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btVender.setText("Realizar venda");
        btVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVenderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(rotVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(rotCodProd)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(cxCodProd))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(rotQntProd)
                            .addGap(4, 4, 4)
                            .addComponent(cxQntProd))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(rotCpfCliente)
                            .addGap(18, 18, 18)
                            .addComponent(cxCpfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btVender, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rotVenda)
                .addGap(2, 2, 2)
                .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotCpfCliente)
                    .addComponent(cxCpfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotCodProd)
                    .addComponent(cxCodProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotQntProd)
                    .addComponent(cxQntProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btVender, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void cxQntProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxQntProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxQntProdActionPerformed

    private void btVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVenderActionPerformed
        vender();
    }//GEN-LAST:event_btVenderActionPerformed

    public void limpar(){
        cxCpfCliente.setText("");
        cxCodProd.setText("");
        cxQntProd.setText("");
        cxCpfCliente.requestFocus();
        } 

    public void vender(){
        try {
            int codigo = Integer.parseInt(cxCodProd.getText()); 
            int quantidade = Integer.parseInt(cxQntProd.getText()); 

            Produto produto = gerEst.venderProd(codigo, quantidade);

            if (produto != null) {
                JOptionPane.showMessageDialog(
                    null,
                    "Venda realizada com sucesso!\nProduto: " + produto.getNome() + "\nQuantidade restante: " + produto.getQuantidade(),
                    "Venda de Produto",
                    JOptionPane.INFORMATION_MESSAGE
                );
                limpar();
            } else {
                JOptionPane.showMessageDialog(
                    null,
                    "Venda não realizada. Verifique o código do produto ou a quantidade.",
                    "ERROR",
                    JOptionPane.ERROR_MESSAGE
                );
                limpar(); 
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(
                null,
                "O valor digitado é inválido! Digite números inteiros.",
                "ERRO de Formato",
                JOptionPane.ERROR_MESSAGE
            );
            cxCpfCliente.setText("");
            cxCodProd.setText(""); 
            cxQntProd.setText(""); 
            cxCpfCliente.requestFocus(); 
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
            java.util.logging.Logger.getLogger(FormVendaProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormVendaProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormVendaProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormVendaProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormVendaProd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btVender;
    private javax.swing.JTextField cxCodProd;
    private javax.swing.JTextField cxCpfCliente;
    private javax.swing.JTextField cxQntProd;
    private javax.swing.JLabel rotCodProd;
    private javax.swing.JLabel rotCpfCliente;
    private javax.swing.JLabel rotQntProd;
    private javax.swing.JLabel rotVenda;
    private javax.swing.JSeparator separador;
    // End of variables declaration//GEN-END:variables
}
