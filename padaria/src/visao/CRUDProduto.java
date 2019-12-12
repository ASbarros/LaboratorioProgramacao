package visao;

import controle.produtoCntrl;
import javax.swing.JOptionPane;

public class CRUDProduto extends javax.swing.JFrame {

    public CRUDProduto() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTCodigo = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jBNovo = new javax.swing.JButton();
        jBSalvar = new javax.swing.JButton();
        jBCancelar = new javax.swing.JButton();
        jBExcluir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTUnidade = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTPreco = new javax.swing.JTextField();
        jLImg = new javax.swing.JLabel();
        jLImgAlert = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Produto");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Codigo");
        jLabel1.setPreferredSize(new java.awt.Dimension(33, 25));

        jTCodigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTCodigoFocusLost(evt);
            }
        });

        jButton5.setText("?");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("<<");
        jButton6.setActionCommand("JButton6");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });

        jButton7.setText("<");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });

        jButton8.setText(">");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });

        jButton9.setText(">>");
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5)
                    .addComponent(jButton6)
                    .addComponent(jButton7)
                    .addComponent(jButton8)
                    .addComponent(jButton9)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, -1));

        jBNovo.setText("Novo");
        jBNovo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBNovoMouseClicked(evt);
            }
        });

        jBSalvar.setText("Salvar");
        jBSalvar.setEnabled(false);
        jBSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBSalvarMouseClicked(evt);
            }
        });

        jBCancelar.setText("Cancelar");
        jBCancelar.setEnabled(false);
        jBCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBCancelarMouseClicked(evt);
            }
        });

        jBExcluir.setText("Excluir");
        jBExcluir.setEnabled(false);
        jBExcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBExcluirMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jBNovo)
                .addGap(18, 18, 18)
                .addComponent(jBSalvar)
                .addGap(18, 18, 18)
                .addComponent(jBCancelar)
                .addGap(18, 18, 18)
                .addComponent(jBExcluir)
                .addGap(34, 34, 34))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBNovo)
                    .addComponent(jBSalvar)
                    .addComponent(jBCancelar)
                    .addComponent(jBExcluir)))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 255, 370, -1));

        jLabel2.setText("Nome");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jTNome.setEnabled(false);
        jPanel1.add(jTNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 190, -1));

        jLabel3.setText("Unidade");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jTUnidade.setEnabled(false);
        jPanel1.add(jTUnidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 70, -1));

        jLabel4.setText("Preço");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, -1, -1));

        jTPreco.setEnabled(false);
        jPanel1.add(jTPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 80, -1));

        jLImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconOk.png"))); // NOI18N
        jPanel1.add(jLImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 30, 30));

        jLImgAlert.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconAlert.png"))); // NOI18N
        jPanel1.add(jLImgAlert, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jBNovoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBNovoMouseClicked
        if (this.jBNovo.isEnabled()) {
            jTCodigo.setText("0");
            jTCodigo.setEditable(false);
            this.camposEnable(true);
            this.limparCampos();
            this.trocarBotoes(true);
        }
    }//GEN-LAST:event_jBNovoMouseClicked

    private void jBSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBSalvarMouseClicked
        if (this.jBSalvar.isEnabled()) {
            produtoCntrl cntrl = new produtoCntrl();
            String[] dados = new String[4];
            dados[0] = jTCodigo.getText();
            dados[1] = jTNome.getText();
            dados[2] = jTPreco.getText();
            dados[3] = jTUnidade.getText();
            
            boolean statusSalvar = cntrl.salvar(dados);
            
            jLImg.setVisible(statusSalvar);
            jLImgAlert.setVisible(!statusSalvar);
            this.trocarBotoes(false);
            this.jBExcluir.setEnabled(false);
        }
    }//GEN-LAST:event_jBSalvarMouseClicked

    private void jBCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBCancelarMouseClicked
        if (this.jBCancelar.isEnabled()) {
            this.limparCampos();
            jTCodigo.setText("");
            jTCodigo.setEditable(true);
            this.camposEnable(false);
            this.trocarBotoes(false);
            this.jBExcluir.setEnabled(false);
        }
    }//GEN-LAST:event_jBCancelarMouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        PesquisaProduto janela = new PesquisaProduto(this);
        janela.setVisible(true);
    }//GEN-LAST:event_jButton5MouseClicked

    private void jBExcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBExcluirMouseClicked
        String id = jTCodigo.getText();
        produtoCntrl cntrl = new produtoCntrl();
        if (!id.equals("")) {
            cntrl.excluir(Integer.parseInt(id));
            this.limparCampos();
            this.camposEnable(false);
            this.trocarBotoes(false);
        }
    }//GEN-LAST:event_jBExcluirMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        jLImg.setVisible(false);
        jLImgAlert.setVisible(false);
    }//GEN-LAST:event_formWindowOpened

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
        produtoCntrl cntrl = new produtoCntrl();
        String[] dados = new String[4];
        dados = cntrl.recuperarUltimo();
        jTCodigo.setText(dados[0]);
        jTNome.setText(dados[1]);
        jTPreco.setText(dados[2]);
        jTUnidade.setText(dados[3]);
        this.camposEnable(true);
    }//GEN-LAST:event_jButton9MouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        produtoCntrl cntrl = new produtoCntrl();
        String[] dados = new String[4];
        dados = cntrl.recuperarPrimeiro();
        jTCodigo.setText(dados[0]);
        jTNome.setText(dados[1]);
        jTPreco.setText(dados[2]);
        jTUnidade.setText(dados[3]);
        this.camposEnable(true);
    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        // TODO add your handling code here:
        produtoCntrl cntrl = new produtoCntrl();
        String[] dados = new String[4];
        String id = jTCodigo.getText();
        dados = cntrl.recuperarAnterior(id);
        jTCodigo.setText(dados[0]);
        jTNome.setText(dados[1]);
        jTPreco.setText(dados[2]);
        jTUnidade.setText(dados[3]);
        this.camposEnable(true);

    }//GEN-LAST:event_jButton7MouseClicked

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
        // TODO add your handling code here:
        produtoCntrl cntrl = new produtoCntrl();
        String[] dados = new String[4];
        String id = jTCodigo.getText();
        dados = cntrl.recuperarProximo(id);
        jTCodigo.setText(dados[0]);
        jTNome.setText(dados[1]);
        jTPreco.setText(dados[2]);
        jTUnidade.setText(dados[3]);
        this.camposEnable(true);

    }//GEN-LAST:event_jButton8MouseClicked

    private void jTCodigoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTCodigoFocusLost
        produtoCntrl cntrl = new produtoCntrl();
        if (!jTCodigo.getText().equals("")) {
            String[] dados = cntrl.recuperar(Integer.parseInt(jTCodigo.getText()));
            if (dados[0].equals("0")) {
                JOptionPane.showMessageDialog(null, "Não foi possivel encontrar esse codigo");
            } else {
                jTNome.setText(dados[1]);
                jTPreco.setText(dados[2]);
                jTUnidade.setText(dados[3]);
                this.camposEnable(true);
                this.jBExcluir.setEnabled(true);
                this.trocarBotoes(true);
            }
        }
    }//GEN-LAST:event_jTCodigoFocusLost

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(CRUDProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CRUDProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CRUDProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CRUDProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CRUDProduto().setVisible(true);
            }
        });
    }
    
    public void recebeDados(String dados) {
        this.setjTCodigo(dados);
    }
    
    public void setTrocarBotoes(boolean valor) {
        this.trocarBotoes(valor);
    }
    
    private void trocarBotoes(boolean valor) {
        this.jBSalvar.setEnabled(valor);
        this.jBNovo.setEnabled(!valor);
        this.jBCancelar.setEnabled(valor);
    }
    
    public void setjTCodigo(String text) {
        this.jTCodigo.setText(text);
    }
    
    public void setjTNome(String text) {
        this.jTNome.setText(text);
    }
    
    public void setjTPreco(String text) {
        this.jTPreco.setText(text);
    }
    
    public void setjTUnidade(String text) {
        this.jTUnidade.setText(text);
    }
    
    public void setCampoEnable(boolean valor) {
        this.camposEnable(valor);
    }
    
    private void camposEnable(boolean valor) {
        jTUnidade.setEnabled(valor);
        jTPreco.setEnabled(valor);
        jTNome.setEnabled(valor);
    }
    
    private void limparCampos() {
        jTNome.setText("");
        jTUnidade.setText("");
        jTPreco.setText("");
        jLImg.setVisible(false);
        jLImgAlert.setVisible(false);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBExcluir;
    private javax.swing.JButton jBNovo;
    private javax.swing.JButton jBSalvar;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLImg;
    private javax.swing.JLabel jLImgAlert;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTCodigo;
    private javax.swing.JTextField jTNome;
    private javax.swing.JTextField jTPreco;
    private javax.swing.JTextField jTUnidade;
    // End of variables declaration//GEN-END:variables
}
