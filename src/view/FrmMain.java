/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.Toolkit;
import view.login.FrmLoginAdm;
import view.login.FrmLoginCaixa;

/**
 *
 * @author Fellipe Leonardo
 */
public class FrmMain extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public FrmMain() {
        initComponents();
        
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../img/icone.png")));
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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButtonDev = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QuickMart");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(735, 515));
        setResizable(false);
        setSize(new java.awt.Dimension(735, 515));

        jPanelMain.setBackground(new java.awt.Color(255, 255, 255));
        jPanelMain.setMinimumSize(new java.awt.Dimension(720, 480));
        jPanelMain.setPreferredSize(new java.awt.Dimension(720, 480));
        jPanelMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 51, 102));
        jPanel2.setPreferredSize(new java.awt.Dimension(400, 240));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Selecione o sistema para acessar");
        jLabel2.setName("tTitulo2"); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 410, -1));

        jButton1.setBackground(new java.awt.Color(254, 254, 254));
        jButton1.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jButton1.setText("Painel de Controle");
        jButton1.setBorderPainted(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setName(""); // NOI18N
        jButton1.setPreferredSize(new java.awt.Dimension(200, 40));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 330, -1));

        jButton2.setBackground(new java.awt.Color(254, 254, 254));
        jButton2.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jButton2.setText("Sistema de Caixa");
        jButton2.setBorderPainted(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 330, 40));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 290, 3));

        jPanelMain.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 220, 430, 200));

        jButtonDev.setBackground(new java.awt.Color(0, 51, 102));
        jButtonDev.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonDev.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDev.setMnemonic('D');
        jButtonDev.setText("Desenvolvedores");
        jButtonDev.setBorderPainted(false);
        jButtonDev.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonDev.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonDevMouseClicked(evt);
            }
        });
        jButtonDev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDevActionPerformed(evt);
            }
        });
        jPanelMain.add(jButtonDev, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 440, 200, -1));

        jPanel4.setBackground(new java.awt.Color(0, 51, 102));
        jPanel4.setPreferredSize(new java.awt.Dimension(430, 170));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/New_Small_Horizontal_Banner.png"))); // NOI18N
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 170));

        jPanelMain.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 30, -1, -1));

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

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        dispose();
        var painel = new FrmLoginAdm();
        painel.setVisible(true);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButtonDevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDevActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonDevActionPerformed

    private void jButtonDevMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonDevMouseClicked
       var painel = new DialogDev(this, true);
       painel.setVisible(true);
    }//GEN-LAST:event_jButtonDevMouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        dispose();
        var painel = new FrmLoginCaixa();
        painel.setVisible(true);
    }//GEN-LAST:event_jButton2MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonDev;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanelMain;
    // End of variables declaration//GEN-END:variables
}
