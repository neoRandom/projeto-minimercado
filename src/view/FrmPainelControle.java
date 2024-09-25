/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author user
 */
public class FrmPainelControle extends javax.swing.JFrame {

    /**
     * Creates new form FrmPainelControle
     */
    public FrmPainelControle() {
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
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItemAdmClassific = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItemMetodosPag = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItemSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Painel de Controle");
        setBounds(new java.awt.Rectangle(0, 0, 720, 480));
        setResizable(false);
        setSize(new java.awt.Dimension(720, 480));

        jPanelMain.setBackground(new java.awt.Color(255, 255, 255));
        jPanelMain.setMinimumSize(new java.awt.Dimension(740, 480));
        jPanelMain.setName("MainPanel"); // NOI18N
        jPanelMain.setPreferredSize(new java.awt.Dimension(740, 480));
        jPanelMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(246, 246, 246));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanelMain.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 15, 700, 400));

        jLabel2.setText("Usuário: Admin");
        jPanelMain.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, -1, -1));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Nível de Acesso: 1");
        jPanelMain.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 430, -1, -1));

        jMenu1.setMnemonic('G');
        jMenu1.setText("Gerenciar");

        jMenu2.setText("Recursos Humanos");

        jMenuItem13.setText("Controle de Clientes");
        jMenu2.add(jMenuItem13);

        jMenuItem1.setText("Controle de Funcionários");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem3.setText("Administrar Horários");
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("Administrar Cargos");
        jMenu2.add(jMenuItem4);

        jMenu1.add(jMenu2);

        jMenu3.setText("Produtos e Compras");

        jMenuItem5.setText("Controle de Produtos");
        jMenu3.add(jMenuItem5);

        jMenuItem10.setText("Controle de Categorias");
        jMenu3.add(jMenuItem10);

        jMenuItem6.setText("Controle de Lotes");
        jMenu3.add(jMenuItem6);

        jMenuItem7.setText("Controle de Fabricantes");
        jMenu3.add(jMenuItem7);

        jMenuItem8.setText("Gerenciar Promoções");
        jMenu3.add(jMenuItem8);

        jMenuItem15.setText("Gerenciar Compras");
        jMenu3.add(jMenuItem15);

        jMenu1.add(jMenu3);

        jMenu4.setText("Outros");

        jMenuItemAdmClassific.setText("Administrar Classificações");
        jMenuItemAdmClassific.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAdmClassificActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItemAdmClassific);

        jMenuItem14.setText("Administrar Telefones");
        jMenu4.add(jMenuItem14);

        jMenuItemMetodosPag.setText("Métodos de Pagamento");
        jMenuItemMetodosPag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemMetodosPagActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItemMetodosPag);

        jMenu1.add(jMenu4);
        jMenu1.add(jSeparator1);

        jMenuItem2.setText("Contas");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);
        jMenu1.add(jSeparator2);

        jMenuItemSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItemSair.setText("Sair");
        jMenuItemSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItemSairMouseClicked(evt);
            }
        });
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemSair);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelMain, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMain, javax.swing.GroupLayout.PREFERRED_SIZE, 457, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItemSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItemSairMouseClicked
        
    }//GEN-LAST:event_jMenuItemSairMouseClicked

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
        dispose();
        var main = new FrmMain();
        main.setVisible(true);
    }//GEN-LAST:event_jMenuItemSairActionPerformed

    private void jMenuItemMetodosPagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMetodosPagActionPerformed
        dispose();
        var painel = new FrmMetodosPag();
        painel.setVisible(true);
    }//GEN-LAST:event_jMenuItemMetodosPagActionPerformed

    private void jMenuItemAdmClassificActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAdmClassificActionPerformed
        dispose();
        var painel = new FrmAdmClassific();
        painel.setVisible(true);
    }//GEN-LAST:event_jMenuItemAdmClassificActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPainelControle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPainelControle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPainelControle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPainelControle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPainelControle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItemAdmClassific;
    private javax.swing.JMenuItem jMenuItemMetodosPag;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
