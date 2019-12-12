package visao;

import controle.clienteCntrl;
import controle.pedidoCntrl;
import controle.pedido_produtoCntrl;
import controle.vendedorCntrl;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

public class CRUDPedido extends javax.swing.JFrame {

    private final ArrayList<Integer> listCliente = new ArrayList<>();
    private final ArrayList<Integer> listVendedor = new ArrayList<>();
    private ArrayList<Integer> idprodutos = new ArrayList<>();

    ;

    public void insereNaTabela(String[][] dados) {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setNumRows(0);
        for (String[] dado : dados) {
            model.addRow(new Object[]{dado[0], Float.parseFloat(dado[1])});
            idprodutos.add(Integer.parseInt(dado[2]));
        }
    }

    private void procuraCliente() {
        clienteCntrl cntrlCliente = new clienteCntrl();
        String[][] dados = cntrlCliente.recuperarTodos();
        this.jCCliente.removeAllItems();
        this.listCliente.removeAll(this.listCliente);

        for (int i = 0; i < dados.length; i++) {
            this.jCCliente.addItem(dados[i][jComboBox1.getSelectedIndex()]);
            this.listCliente.add(i, Integer.parseInt(dados[i][0]));
        }
        this.VerificaPedido();
    }

    private void VerificaPedido() {
        pedidoCntrl cntrl = new pedidoCntrl();
        int idCliente;
        int idProduto = 1;
        int idVendedor;

        if (!listCliente.isEmpty() && jCCliente.getSelectedIndex() != -1) {
            idCliente = listCliente.get(jCCliente.getSelectedIndex());
        } else {
            idCliente = 0;
        }

        if (!listVendedor.isEmpty() && jCVendedor.getSelectedIndex() != -1) {
            idVendedor = listVendedor.get(jCVendedor.getSelectedIndex());
        } else {
            idVendedor = 0;
        }

        try {
            String[] dados;
            dados = cntrl.recuperar(idCliente, idProduto, idVendedor);
            if (!dados[1].equals("0")) {
            } else {
            }
        } catch (Exception e) {
        }
    }

    public CRUDPedido() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jCVendedor = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jCCliente = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jBAdd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jBCalcTotal = new javax.swing.JButton();
        jBSalvar = new javax.swing.JButton();

        jFormattedTextField1.setText("jFormattedTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jCVendedor.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCVendedorItemStateChanged(evt);
            }
        });
        jCVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCVendedorActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Vendedor");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Cliente");

        jCCliente.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                VerificaPedido(evt);
            }
        });

        jLabel5.setText("Procurar pelo:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Id", "CPF", "Nome", "Sobrenome" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jCCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(100, 100, 100)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jBAdd.setText("Adicionar Produtos");
        jBAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAddActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Produto", "Preço", "Quantidade", "Preço Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Float.class, java.lang.Integer.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTable1FocusLost(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jBCalcTotal.setText("Calcular Preço Total");
        jBCalcTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCalcTotalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jBAdd)
                .addGap(74, 74, 74)
                .addComponent(jBCalcTotal)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBAdd)
                    .addComponent(jBCalcTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                .addContainerGap())
        );

        jBSalvar.setText("Salvar");
        jBSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addComponent(jBSalvar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jBSalvar)
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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        vendedorCntrl cntrlVendedor = new vendedorCntrl();
        String[][] dados2 = cntrlVendedor.recuperarTodos();
        for (int i = 0; i < dados2.length; i++) {
            this.jCVendedor.addItem(dados2[i][2]);
            listVendedor.add(i, Integer.parseInt(dados2[i][0]));
        }

        this.procuraCliente();
        this.VerificaPedido();
        
        
    }//GEN-LAST:event_formWindowOpened

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        this.procuraCliente();
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void VerificaPedido(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_VerificaPedido
        this.VerificaPedido();
    }//GEN-LAST:event_VerificaPedido

    private void jCVendedorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCVendedorItemStateChanged
        // TODO add your handling code here:
        this.VerificaPedido();
    }//GEN-LAST:event_jCVendedorItemStateChanged

    private void jCVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCVendedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCVendedorActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jBAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAddActionPerformed
        PesquisaProduto janela = new PesquisaProduto(this);
        janela.setVisible(true);
        this.estado = "I";
    }//GEN-LAST:event_jBAddActionPerformed

    private void jTable1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTable1FocusLost

    }//GEN-LAST:event_jTable1FocusLost

    private void jBCalcTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCalcTotalActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        //int linha = jTable1.getSelectedRow();
        int linhas = jTable1.getRowCount();
        String[][] dados = new String[linhas][4];
        for (int linha = 0; linha < linhas; linha++) {
            dados[linha][0] = model.getValueAt(linha, 0).toString();
            dados[linha][1] = model.getValueAt(linha, 1).toString();
            dados[linha][2] = model.getValueAt(linha, 2).toString();
        }
        model.setNumRows(0);
        for (int linha = 0; linha < linhas; linha++) {
            String produto = dados[linha][0];
            float preco = Float.parseFloat(dados[linha][1]);
            int qtde = Integer.parseInt(dados[linha][2]);
            float precoTotal = qtde * preco;
            model.addRow(new Object[]{produto, preco, qtde, precoTotal});
        }
    }//GEN-LAST:event_jBCalcTotalActionPerformed

    private void jBSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalvarActionPerformed
        // TODO add your handling code here:
        pedidoCntrl Pedido_cntrl = new pedidoCntrl();
        pedido_produtoCntrl PedidoProduto_cntrl = new pedido_produtoCntrl();
        String[] dados = new String[6];
        String[] dados2 = new String[6];
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        if (jTable1.getRowCount() > 0) {
            dados[0] = estado;
            dados[1] = listCliente.get(jCCliente.getSelectedIndex()).toString();
            dados[2] = listVendedor.get(jCVendedor.getSelectedIndex()).toString();
            dados[3] = new Date(System.currentTimeMillis()).toString();
            Pedido_cntrl.salvar(dados);
            int idPedido = Pedido_cntrl.recuperaUltimo();
            System.out.println(idPedido);
            ///-----------------------------------------------------
            dados2[0] = this.estado;
            dados2[1] = String.valueOf(idPedido);
            dados2[3] = model.getValueAt(0, 2).toString();
            dados2[4] = model.getValueAt(0, 1).toString();
            dados2[5] = model.getValueAt(0, 3).toString();
            for (int i = 0; i < idprodutos.size(); i++) {
                dados2[2] = String.valueOf(idprodutos.get(i));
                System.out.println(idprodutos.get(i));
                PedidoProduto_cntrl.salvar(dados2);
            }
            this.estado = "A";
            jBSalvar.setEnabled(false);
        }
    }//GEN-LAST:event_jBSalvarActionPerformed

    public void JBSalvarEnabled(boolean b){
        jBSalvar.setEnabled(b);
    }
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CRUDPedido.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        }
        //</editor-fold>

        //</editor-fold>
        java.awt.EventQueue.invokeLater(() -> {
            new CRUDPedido().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAdd;
    private javax.swing.JButton jBCalcTotal;
    private javax.swing.JButton jBSalvar;
    private javax.swing.JComboBox<String> jCCliente;
    private javax.swing.JComboBox<String> jCVendedor;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private String estado = "I";
    
    private String[][] getDadosTabela() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int linhas = jTable1.getRowCount();

        String[][] dados = new String[linhas][4];

        for (int i = 0; i < linhas; i++) {
            dados[i][0] = (String) model.getValueAt(i, 0);
            dados[i][1] = (String) model.getValueAt(i, 1);
            dados[i][2] = (String) model.getValueAt(i, 2);
            dados[i][3] = (String) model.getValueAt(i, 3);
        }
        return dados;
    }

}
