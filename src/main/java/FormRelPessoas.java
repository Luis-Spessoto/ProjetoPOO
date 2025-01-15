
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

//Luis Felipe Spessoto - 2648016

public class FormRelPessoas extends javax.swing.JFrame {

    private GerenciamentoPessoas gesPes = GerenciamentoPessoas.geraGerPessoas();
    private Produto p = new Produto();
    
    //MÉTODO SINGLETON
    private static FormRelPessoas relatUnicoPes;
    
    public FormRelPessoas() {
        initComponents();
    }

    public static FormRelPessoas geraRelPes(){
        if(relatUnicoPes == null){
            relatUnicoPes = new FormRelPessoas();
        }
        return relatUnicoPes;
    }
    
    public void atualizarTabela(){
        System.out.println("Método atualizarTabela foi chamado!");
        DefaultTableModel modTab = (DefaultTableModel) tabRelPes.getModel();
        
        int posLin = 0;
        
        modTab.setRowCount(posLin);
        
        for(Funcionarios f : gesPes.getFuncionarios()) {
            modTab.insertRow(posLin, new Object[]{"Funcionário", f.getNome(),  f.getId()});
            posLin++;
        }

        for(Fornecedores forn : gesPes.getFornecedores()) {
            modTab.insertRow(posLin, new Object[]{"Fornecedor", forn.getNome(), forn.getId()});
            posLin++;
        }

        for(Clientes c : gesPes.getClientes()) {
            modTab.insertRow(posLin, new Object[]{"Cliente",  c.getNome(), c.getId(),
            });
            posLin++;
        }
    }
    
    
    private void linhaSelecionada(){
        System.out.println("Linha acionada para mais informações! Se aparecer funcionou!");
        int posLin = tabRelPes.getSelectedRow();
    
        
        if (posLin != -1) { 
            String tipo = tabRelPes.getModel().getValueAt(posLin, 0).toString();
            int id = Integer.parseInt(tabRelPes.getModel().getValueAt(posLin, 2).toString());

            String linha = "";

            switch (tipo) {
                case "Funcionário":
                    for(Funcionarios f : gesPes.getFuncionarios()) {
                        if(f.getId() == id) {
                            linha = "Funcionário:\n" + "ID: " + f.getId() + "\n" + "Nome: " + f.getNome() + "\n" +"Cargo: " + f.getCargo() + "\n" + "Turno: " + f.getPeriodoEscala();
                            break;
                        }
                    }   break;
                case "Fornecedor":
                    for(Fornecedores forn : gesPes.getFornecedores()) {
                        if(forn.getId() == id) {
                            linha = "Fornecedor:\n" + "ID: " + forn.getId() + "\n" + "Nome: " + forn.getNome() + "\n" + "CNPJ: " + forn.getCnpj() + "\n" + "Tipo de Produto: " + forn.getTipoProduto();
                            break;
                        }
                    }   break;
                case "Cliente":
                    for(Clientes c : gesPes.getClientes()) {
                        if(c.getId() == id) {
                            linha = "Cliente:\n" + "ID: " + c.getId() + "\n" + "Nome: " + c.getNome() + "\n" + "CPF: " + c.getCpf() + "\n" + "Idade: " + c.getIdade();
                            break;
                        }
                    }   break;
                default:
                    break;
            }

        if (linha.length() > 0) {
            JOptionPane.showMessageDialog(
                null,
                linha,
                "Detalhes da Pessoa Selecionada",
                JOptionPane.INFORMATION_MESSAGE
            );
        }
    }   
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rotRelPes = new javax.swing.JLabel();
        separador = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabRelPes = new javax.swing.JTable();
        rotInfor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        rotRelPes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rotRelPes.setText("Relatório de Pessoas Cadastradas no Sistema");

        tabRelPes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Tipo", "Nome", "ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabRelPes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabRelPesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabRelPes);

        rotInfor.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        rotInfor.setText("+ Clique na pessoa desejada para mais informações");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(rotRelPes)
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(rotInfor, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(rotRelPes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rotInfor)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        atualizarTabela();
    }//GEN-LAST:event_formWindowActivated

    
    private void tabRelPesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabRelPesMouseClicked
        linhaSelecionada();
    }//GEN-LAST:event_tabRelPesMouseClicked

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
            java.util.logging.Logger.getLogger(FormRelPessoas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormRelPessoas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormRelPessoas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormRelPessoas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormRelPessoas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel rotInfor;
    private javax.swing.JLabel rotRelPes;
    private javax.swing.JSeparator separador;
    private javax.swing.JTable tabRelPes;
    // End of variables declaration//GEN-END:variables
}
