
package visao;

import controle.clienteCntrl;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class CRUDCliente extends javax.swing.JFrame {

    public CRUDCliente() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTid = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTnome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTsobrenome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTidade = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTtelefone = new javax.swing.JTextField();
        jTcpf = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLImg = new javax.swing.JLabel();
        jLImgAlert = new javax.swing.JLabel();
        jBNovo = new javax.swing.JButton();
        jBSalvar = new javax.swing.JButton();
        jBCancelar = new javax.swing.JButton();
        jBExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Clientes");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("IdCliente");

        jTid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTidFocusLost(evt);
            }
        });

        jButton1.setText("?");

        jButton2.setText("<");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jButton3.setText("<<");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jButton4.setText(">>");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText(">");
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTid, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1)
                        .addComponent(jButton2)
                        .addComponent(jButton3)
                        .addComponent(jButton4)
                        .addComponent(jButton5)))
                .addContainerGap())
        );

        jLabel2.setText("Nome");

        jTnome.setEnabled(false);

        jLabel3.setText("Sobre Nome");

        jTsobrenome.setEnabled(false);

        jLabel4.setText("CPF");

        jTidade.setEnabled(false);

        jLabel5.setText("Idade");

        jTtelefone.setEnabled(false);

        jTcpf.setEnabled(false);

        jLabel6.setText("Telefone");

        jLImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconOk.png"))); // NOI18N

        jLImgAlert.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconAlert.png"))); // NOI18N

        jBNovo.setText("Novo");
        jBNovo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBNovoMouseClicked(evt);
            }
        });

        jBSalvar.setText("Salvar");
        jBSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBSalvarMouseClicked(evt);
            }
        });
        jBSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalvarActionPerformed(evt);
            }
        });

        jBCancelar.setText("Cancelar");
        jBCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBCancelarMouseClicked(evt);
            }
        });

        jBExcluir.setText("Excluir");
        jBExcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBExcluirMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(89, 89, 89)
                        .addComponent(jLabel3)
                        .addGap(57, 57, 57)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTidade, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                                .addComponent(jTnome, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTsobrenome)
                                .addComponent(jTtelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE))
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTcpf, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLImgAlert)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jBNovo)
                        .addGap(18, 18, 18)
                        .addComponent(jBSalvar)
                        .addGap(18, 18, 18)
                        .addComponent(jBCancelar)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLImg)
                            .addComponent(jBExcluir))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTsobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTcpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTtelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLImg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLImgAlert))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBNovo)
                    .addComponent(jBSalvar)
                    .addComponent(jBCancelar)
                    .addComponent(jBExcluir))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jBSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalvarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBSalvarActionPerformed

    private void jTidFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTidFocusLost
        clienteCntrl cntrl = new clienteCntrl();
        if (!jTid.getText().equals("")) {
            String[] dados = cntrl.recuperar(Integer.parseInt(jTid.getText()));
            if (dados[0].equals("0")) {
                JOptionPane.showMessageDialog(null, "Não foi possivel encontrar esse codigo");
            } else {
                System.out.println("oasdjfo");
                jTcpf.setText(dados[1]);
                jTnome.setText(dados[2]);
                jTsobrenome.setText(dados[3]);
                jTidade.setText(dados[4]);
                jTtelefone.setText(dados[5]);
                this.camposEnable(true);
                this.jBExcluir.setEnabled(true);
                this.trocarBotoes(true);
            }
        }
    }//GEN-LAST:event_jTidFocusLost

    private void jBNovoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBNovoMouseClicked
        if (this.jBNovo.isEnabled()) {
            jTid.setText("0");
            jTid.setEditable(false);
            this.camposEnable(true);
            this.limparCampos();
            this.trocarBotoes(true);
        }
    }//GEN-LAST:event_jBNovoMouseClicked

    private void jBSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBSalvarMouseClicked
        if (this.jBSalvar.isEnabled()) {
            clienteCntrl cntrl = new clienteCntrl();
            String[] dados = new String[6];
            dados[0] = jTid.getText();
            dados[1] = jTcpf.getText();
            dados[2] = jTnome.getText();
            dados[3] = jTsobrenome.getText();
            dados[4] = jTidade.getText();
            dados[5] = jTtelefone.getText();

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
            jTid.setText("");
            jTid.setEditable(true);
            this.camposEnable(false);
            this.trocarBotoes(false);
            this.jBExcluir.setEnabled(false);
        }
    }//GEN-LAST:event_jBCancelarMouseClicked

    public JTextField getjTcpf() {
        return jTcpf;
    }

    public void setjTcpf(String jTcpf) {
        this.jTcpf.setText(jTcpf);
    }

    public JTextField getjTid() {
        return jTid;
    }

    public void setjTid(String jTid) {
        this.jTid.setText(jTid);
    }

    public JTextField getjTidade() {
        return jTidade;
    }

    public void setjTidade(String jTidade) {
        this.jTidade.setText(jTidade);
    }

    public JTextField getjTnome() {
        return jTnome;
    }

    public void setjTnome(String jTnome) {
        this.jTnome.setText(jTnome);
    }

    public JTextField getjTsobrenome() {
        return jTsobrenome;
    }

    public void setjTsobrenome(String jTsobrenome) {
        this.jTsobrenome.setText(jTsobrenome);
    }

    public JTextField getjTtelefone() {
        return jTtelefone;
    }

    public void setjTtelefone(String jTtelefone) {
        this.jTtelefone.setText(jTtelefone);
    }

    private void jBExcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBExcluirMouseClicked
        String id = jTid.getText();
        clienteCntrl cntrl = new clienteCntrl();
        if (!id.equals("")) {
            cntrl.excluir(Integer.parseInt(id));
            this.limparCampos();
            this.camposEnable(false);
            this.trocarBotoes(false);
        }
    }//GEN-LAST:event_jBExcluirMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        jLImg.setVisible(false);
        jLImgAlert.setVisible(false);    }//GEN-LAST:event_formWindowOpened

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        clienteCntrl cntrl = new clienteCntrl();
        String[] dados = new String[6];
        dados = cntrl.recuperarPrimeiro();
        jTid.setText(dados[0]);
        jTcpf.setText(dados[1]);
        jTnome.setText(dados[2]);
        jTsobrenome.setText(dados[3]);
        jTidade.setText(dados[4]);
        jTtelefone.setText(dados[5]);
        this.camposEnable(true);
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        clienteCntrl cntrl = new clienteCntrl();
        String[] dados = new String[6];
        String id = jTid.getText();
        dados = cntrl.recuperarAnterior(id);
        jTid.setText(dados[0]);
        jTcpf.setText(dados[1]);
        jTnome.setText(dados[2]);
        jTsobrenome.setText(dados[3]);
        jTidade.setText(dados[4]);
        jTtelefone.setText(dados[5]);
        this.camposEnable(true);
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        clienteCntrl cntrl = new clienteCntrl();
        String[] dados = new String[6];
        String id = jTid.getText();
        dados = cntrl.recuperarProximo(id);
        jTid.setText(dados[0]);
        jTcpf.setText(dados[1]);
        jTnome.setText(dados[2]);
        jTsobrenome.setText(dados[3]);
        jTidade.setText(dados[4]);
        jTtelefone.setText(dados[5]);
        this.camposEnable(true);
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        clienteCntrl cntrl = new clienteCntrl();
        String[] dados = new String[6];
        dados = cntrl.recuperarUltimo();
        jTid.setText(dados[0]);
        jTcpf.setText(dados[1]);
        jTnome.setText(dados[2]);
        jTsobrenome.setText(dados[3]);
        jTidade.setText(dados[4]);
        jTtelefone.setText(dados[5]);
        this.camposEnable(true);
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(CRUDCliente.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CRUDCliente.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CRUDCliente.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CRUDCliente.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CRUDCliente().setVisible(true);
            }
        });
    }

    private void trocarBotoes(boolean valor) {
        this.jBSalvar.setEnabled(valor);
        this.jBNovo.setEnabled(!valor);
        this.jBCancelar.setEnabled(valor);
    }

    public void camposEnable(boolean valor) {
        jTcpf.setEnabled(valor);
        jTidade.setEnabled(valor);
        jTnome.setEnabled(valor);
        jTsobrenome.setEnabled(valor);
        jTtelefone.setEnabled(valor);
    }

    private void limparCampos() {
        jTnome.setText("");
        jTsobrenome.setText("");
        jTcpf.setText("");
        jTidade.setText("");
        jTtelefone.setText("");
        jLImg.setVisible(false);
        jLImgAlert.setVisible(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBExcluir;
    private javax.swing.JButton jBNovo;
    private javax.swing.JButton jBSalvar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLImg;
    private javax.swing.JLabel jLImgAlert;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTcpf;
    private javax.swing.JTextField jTid;
    private javax.swing.JTextField jTidade;
    private javax.swing.JTextField jTnome;
    private javax.swing.JTextField jTsobrenome;
    private javax.swing.JTextField jTtelefone;
    // End of variables declaration//GEN-END:variables
}
