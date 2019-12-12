package visao;

import controle.clienteCntrl;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.table.DefaultTableModel;

public class PesquisaCliente extends javax.swing.JFrame {

    private CRUDCliente CRUDCli;

    private PesquisaCliente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public CRUDCliente getCRUDCli() {
        return CRUDCli;
    }

    public void setCRUDCli(CRUDCliente cli) {
        this.CRUDCli = cli;
    }

    public PesquisaCliente(CRUDCliente crud) {
        setCRUDCli(crud);
        this.dispose();
        initComponents();
    }

    private void insereNaTabela() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setNumRows(0);
        for (int i = 0; i < indeces.size(); i++) {
            for (ArrayList<String> cli : listaClientes) {
                if (indeces.get(i) == Integer.parseInt(cli.get(0))) {
                    model.addRow(new Object[]{cli.get(0), cli.get(1), cli.get(2), cli.get(3), cli.get(4)});
                }
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jCcampo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jTvalor = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jBConfirmar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Sobrenome", "CPF", "Idade", "Telefone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("Qual o campo da pesquisa: ");

        jCcampo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nome", "Sobrenome", "CPF", "Idade", "telefone" }));

        jLabel2.setText("Qual o valor");

        jButton1.setText("Pesquisa");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jBConfirmar.setText("Confirmar");
        jBConfirmar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBConfirmarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCcampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jTvalor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(100, 100, 100))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(jBConfirmar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCcampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTvalor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBConfirmarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBConfirmarMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int linha = jTable1.getSelectedRow();
        if (linha > -1) {
            this.CRUDCli.setjTnome(String.valueOf(model.getValueAt(linha, 0)));
            this.CRUDCli.setjTsobrenome(String.valueOf((String) model.getValueAt(linha, 1)));
            this.CRUDCli.setjTcpf(String.valueOf((double) model.getValueAt(linha, 2)));
            this.CRUDCli.setjTidade(String.valueOf((String) model.getValueAt(linha, 3)));
            this.CRUDCli.setjTtelefone(String.valueOf((String) model.getValueAt(linha, 4)));
            this.CRUDCli.camposEnable(true);
        }
    }//GEN-LAST:event_jBConfirmarMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        clienteCntrl cntrl = new clienteCntrl();
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
                    listaClientes.add(array);
                    this.insereNaTabela();
                }
                break;
            case 1:

                matDados = cntrl.recuperarTodos("where nome like '%" + jTvalor.getText() + "%'");
                for (int i = 0; i < matDados.length; i++) {
                    if (indeces.indexOf(Integer.parseInt(matDados[i][0])) == -1 && !matDados[i][0].equals("0")) {
                        indeces.add(Integer.parseInt(matDados[i][0]));
                        Collections.sort(indeces);
                        ArrayList<String> array = new ArrayList<>();
                        array.add(matDados[i][0]);
                        array.add(matDados[i][1]);
                        array.add(matDados[i][2]);
                        array.add(matDados[i][3]);
                        listaClientes.add(array);
                        this.insereNaTabela();
                    }
                }
                break;
            case 2:
                matDados = cntrl.recuperarTodos("where preco = " + jTvalor.getText());
                for (int i = 0; i < matDados.length; i++) {
                    if (indeces.indexOf(Integer.parseInt(matDados[i][0])) == -1 && !matDados[i][0].equals("0")) {
                        indeces.add(Integer.parseInt(matDados[i][0]));
                        Collections.sort(indeces);
                        ArrayList<String> array = new ArrayList<>();
                        array.add(matDados[i][0]);
                        array.add(matDados[i][1]);
                        array.add(matDados[i][2]);
                        array.add(matDados[i][3]);
                        listaClientes.add(array);
                        this.insereNaTabela();
                    }
                }
                break;
            case 3:
                matDados = cntrl.recuperarTodos("where unidade like '%" + jTvalor.getText() + "%'");
                for (int i = 0; i < matDados.length; i++) {
                    if (indeces.indexOf(Integer.parseInt(matDados[i][0])) == -1 && !matDados[i][0].equals("0")) {
                        indeces.add(Integer.parseInt(matDados[i][0]));
                        Collections.sort(indeces);
                        ArrayList<String> array = new ArrayList<>();
                        array.add(matDados[i][0]);
                        array.add(matDados[i][1]);
                        array.add(matDados[i][2]);
                        array.add(matDados[i][3]);
                        listaClientes.add(array);
                        this.insereNaTabela();
                    }
                }
                break;
        }
    }//GEN-LAST:event_jButton1MouseClicked

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PesquisaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PesquisaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PesquisaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PesquisaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                  new PesquisaCliente().setVisible(true);
            }
        });
    }

    ArrayList<ArrayList<String>> listaClientes = new ArrayList<>();
    ArrayList<Integer> indeces = new ArrayList<>();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBConfirmar;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jCcampo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTvalor;
    // End of variables declaration//GEN-END:variables
}
