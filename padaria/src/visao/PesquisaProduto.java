package visao;

import controle.produtoCntrl;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.table.DefaultTableModel;

public final class PesquisaProduto extends javax.swing.JFrame {

    private CRUDProduto CRUDProd = null;
    private CRUDPedido CRUDPed = null;

    public CRUDPedido getCRUDPed() {
        return CRUDPed;
    }

    public void setCRUDPed(CRUDPedido CRUDPed) {
        this.CRUDPed = CRUDPed;
    }

    public CRUDProduto getCRUDProd() {
        return CRUDProd;
    }

    public void setCRUDProd(CRUDProduto crud) {
        this.CRUDProd = crud;
    }

    public PesquisaProduto(CRUDPedido crud) {
        this.setCRUDPed(crud);
        this.dispose();
        initComponents();
    }

    public PesquisaProduto(CRUDProduto crud) {
        this.setCRUDProd(crud);
        this.dispose();
        initComponents();
    }

    private PesquisaProduto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jCcampo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jTvalor = new javax.swing.JTextField();
        jBPesquisa = new javax.swing.JButton();
        jBConfirmar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pesquisa de produtos");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nome", "Preço", "Unidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("Qual o campo de pesquisa");

        jCcampo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Codigo", "Nome", "Preço", "Unidade" }));

        jLabel2.setText("Qual o valor");

        jBPesquisa.setText("Pesquisar");
        jBPesquisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBPesquisaMouseClicked(evt);
            }
        });
        jBPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPesquisaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCcampo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addComponent(jTvalor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBPesquisa)
                .addGap(107, 107, 107))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCcampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jBPesquisa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTvalor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jBConfirmar.setText("Confirmar");
        jBConfirmar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBConfirmarMouseClicked(evt);
            }
        });
        jBConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConfirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jBConfirmar)
                                .addGap(149, 149, 149))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBConfirmar)
                .addContainerGap())
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void insereNaTabela() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setNumRows(0);
        for (int i = 0; i < indeces.size(); i++) {
            for (ArrayList<String> prod : listaProdutos) {
                if (indeces.get(i) == Integer.parseInt(prod.get(0))) {
                    model.addRow(new Object[]{Integer.parseInt(prod.get(0)), prod.get(1), Double.parseDouble(prod.get(2)), prod.get(3)});
                }
            }
        }
    }


    private void jBPesquisaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBPesquisaMouseClicked
        produtoCntrl cntrl = new produtoCntrl();
        String[] dados = new String[4];
        String[][] matDados;

        switch (jCcampo.getSelectedIndex()) {
            case 0:
                dados = cntrl.recuperar(Integer.parseInt(jTvalor.getText()));
                if (indeces.indexOf(Integer.parseInt(dados[0])) == -1 && !dados[0].equals("0")) {
                    indeces.add(Integer.parseInt(dados[0]));
                    Collections.sort(indeces);
                    ArrayList<String> array = new ArrayList<>();
                    array.add(dados[0]);
                    array.add(dados[1]);
                    array.add(dados[2]);
                    array.add(dados[3]);
                    listaProdutos.add(array);
                    this.insereNaTabela();
                }
                idProduto = Integer.parseInt(jTvalor.getText());
                break;
            case 1:
                matDados = cntrl.recuperarTodos("where nome like '%" + jTvalor.getText() + "%'");
                for (String[] matDado : matDados) {
                    if (indeces.indexOf(Integer.parseInt(matDado[0])) == -1 && !matDado[0].equals("0")) {
                        indeces.add(Integer.parseInt(matDado[0]));
                        Collections.sort(indeces);
                        ArrayList<String> array = new ArrayList<>();
                        array.add(matDado[0]);
                        array.add(matDado[1]);
                        array.add(matDado[2]);
                        array.add(matDado[3]);
                        listaProdutos.add(array);
                        this.insereNaTabela();
                    }
                }
                break;
            case 2:
                matDados = cntrl.recuperarTodos("where preco = " + jTvalor.getText());
                for (String[] matDado : matDados) {
                    if (indeces.indexOf(Integer.parseInt(matDado[0])) == -1 && !matDado[0].equals("0")) {
                        indeces.add(Integer.parseInt(matDado[0]));
                        Collections.sort(indeces);
                        ArrayList<String> array = new ArrayList<>();
                        array.add(matDado[0]);
                        array.add(matDado[1]);
                        array.add(matDado[2]);
                        array.add(matDado[3]);
                        listaProdutos.add(array);
                        this.insereNaTabela();
                    }
                }
                break;
            case 3:
                matDados = cntrl.recuperarTodos("where unidade like '%" + jTvalor.getText() + "%'");
                for (String[] matDado : matDados) {
                    if (indeces.indexOf(Integer.parseInt(matDado[0])) == -1 && !matDado[0].equals("0")) {
                        indeces.add(Integer.parseInt(matDado[0]));
                        Collections.sort(indeces);
                        ArrayList<String> array = new ArrayList<>();
                        array.add(matDado[0]);
                        array.add(matDado[1]);
                        array.add(matDado[2]);
                        array.add(matDado[3]);
                        listaProdutos.add(array);
                        this.insereNaTabela();
                    }
                }
                break;
        }
    }//GEN-LAST:event_jBPesquisaMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    private void jBConfirmarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBConfirmarMouseClicked
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int linha = jTable1.getSelectedRow();
        if (linha > -1) {
            if (this.CRUDProd != null) {
                this.CRUDProd.setjTCodigo(String.valueOf((int) model.getValueAt(linha, 0)));
                this.CRUDProd.setjTNome(String.valueOf((String) model.getValueAt(linha, 1)));
                this.CRUDProd.setjTPreco(String.valueOf((double) model.getValueAt(linha, 2)));
                this.CRUDProd.setjTUnidade(String.valueOf((String) model.getValueAt(linha, 3)));
                this.CRUDProd.setTrocarBotoes(true);
                this.CRUDProd.setCampoEnable(true);
            } else if (this.CRUDPed != null) {
                int[] linhas = jTable1.getSelectedRows();
                String[][] dados = new String[linhas.length][3];
                for (int i : linhas) {
                    dados[i][0] = String.valueOf((String) model.getValueAt(i, 1));
                    dados[i][1] = String.valueOf(model.getValueAt(i, 2));
                    dados[i][2] = String.valueOf(idProduto);
                    this.CRUDPed.insereNaTabela(dados);
                    this.CRUDPed.JBSalvarEnabled(true);
                }
            }

            System.out.println(linha);
        }
    }//GEN-LAST:event_jBConfirmarMouseClicked

    private void jBConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConfirmarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBConfirmarActionPerformed

    private void jBPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBPesquisaActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PesquisaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new PesquisaProduto().setVisible(true);
        });
    }
    ArrayList<ArrayList<String>> listaProdutos = new ArrayList<>();
    ArrayList<Integer> indeces = new ArrayList<>();
    private int idProduto;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBConfirmar;
    private javax.swing.JButton jBPesquisa;
    private javax.swing.JComboBox<String> jCcampo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTvalor;
    // End of variables declaration//GEN-END:variables
}
