/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author Fellipe Leonardo
 */
public class FrmCaixa extends javax.swing.JFrame {

    /**
     * Creates new form FrmCaixa
     */
    public FrmCaixa() {
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

        jPanelMain = new javax.swing.JPanel();
        jPanelHeader = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanelBody = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jPanelCodigo = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jPanelQtde = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldQtde = new javax.swing.JTextField();
        jPanelPreco = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldPreco = new javax.swing.JTextField();
        jPanelSubtotal = new javax.swing.JPanel();
        jLabelSubtotal1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanelTotal = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabelSubtotal = new javax.swing.JLabel();
        jButtonAdicionar = new javax.swing.JButton();
        jButtonRemover = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Caixa");
        setPreferredSize(new java.awt.Dimension(1295, 760));
        setResizable(false);

        jPanelMain.setBackground(new java.awt.Color(255, 255, 255));
        jPanelMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelHeader.setBackground(new java.awt.Color(0, 51, 102));
        jPanelHeader.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(200, 200, 200));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        jPanelHeader.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 150, 70));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("31/12/9999  23:59    |    Operador: 0123456789");
        jPanelHeader.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, 500, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Caixa: 02    |    Nº da venda: 1234");
        jPanelHeader.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setText("Sair");
        jPanelHeader.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 20, 90, 30));

        jPanelMain.add(jPanelHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 70));

        jPanelBody.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Item", "Código", "Descrição", "Qtde", "Preço Un.", "Subtotal"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setRowHeight(25);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(25);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(25);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(275);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(25);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(50);
        }

        jPanelBody.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 840, 540));

        jPanel3.setBackground(new java.awt.Color(200, 200, 200));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );

        jPanelBody.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 20, 320, 180));

        jPanelCodigo.setBackground(new java.awt.Color(255, 255, 255));
        jPanelCodigo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Código:");
        jPanelCodigo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 30));
        jPanelCodigo.add(jTextFieldCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 0, 250, 30));

        jPanelBody.add(jPanelCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 220, 320, 30));

        jPanelQtde.setBackground(new java.awt.Color(255, 255, 255));
        jPanelQtde.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("Qtde:");
        jPanelQtde.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 30));
        jPanelQtde.add(jTextFieldQtde, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 90, 30));

        jPanelBody.add(jPanelQtde, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 260, 150, 30));

        jPanelPreco.setBackground(new java.awt.Color(255, 255, 255));
        jPanelPreco.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setText("Preço:");
        jPanelPreco.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 30));

        jTextFieldPreco.setToolTipText("");
        jPanelPreco.add(jTextFieldPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 90, 30));

        jPanelBody.add(jPanelPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 260, 150, 30));

        jPanelSubtotal.setBackground(new java.awt.Color(255, 255, 255));
        jPanelSubtotal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelSubtotal1.setFont(new java.awt.Font("Segoe UI", 0, 34)); // NOI18N
        jLabelSubtotal1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelSubtotal1.setText("R$ 00.000,00");
        jPanelSubtotal.add(jLabelSubtotal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 6, 240, 40));

        jLabel6.setText("Subtotal:");
        jPanelSubtotal.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanelBody.add(jPanelSubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 380, 320, 50));

        jPanelTotal.setBackground(new java.awt.Color(255, 255, 255));
        jPanelTotal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setText("Total:");
        jPanelTotal.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabelSubtotal.setFont(new java.awt.Font("Segoe UI", 0, 42)); // NOI18N
        jLabelSubtotal.setForeground(new java.awt.Color(0, 51, 102));
        jLabelSubtotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelSubtotal.setText("R$ 00.000,00");
        jPanelTotal.add(jLabelSubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 260, 60));

        jPanelBody.add(jPanelTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 440, 320, 60));

        jButtonAdicionar.setText("Adicionar");
        jPanelBody.add(jButtonAdicionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 310, 140, 30));

        jButtonRemover.setText("Remover");
        jPanelBody.add(jButtonRemover, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 310, 80, 30));

        jButtonLimpar.setText("Limpar");
        jPanelBody.add(jButtonLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 310, 80, 30));

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanelBody.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 360, 320, 2));

        jButton2.setText("Finalizar Compra");
        jPanelBody.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 530, 320, 30));

        jPanelMain.add(jPanelBody, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 94, 1240, 580));

        jLabel8.setText("Controles: Alt + S - Sair | [...]");
        jPanelMain.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 680, 1240, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(FrmCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCaixa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonAdicionar;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonRemover;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelSubtotal;
    private javax.swing.JLabel jLabelSubtotal1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanelBody;
    private javax.swing.JPanel jPanelCodigo;
    private javax.swing.JPanel jPanelHeader;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JPanel jPanelPreco;
    private javax.swing.JPanel jPanelQtde;
    private javax.swing.JPanel jPanelSubtotal;
    private javax.swing.JPanel jPanelTotal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldPreco;
    private javax.swing.JTextField jTextFieldQtde;
    // End of variables declaration//GEN-END:variables
}
