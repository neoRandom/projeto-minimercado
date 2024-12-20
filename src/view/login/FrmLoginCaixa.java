/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view.login;

import controller.db.Conexao;
import java.awt.Toolkit;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import view.FrmCaixa;
import view.FrmMain;

/**
 *
 * @author Fellipe Leonardo
 */
public class FrmLoginCaixa extends javax.swing.JFrame {
    Conexao conexao;
    
    /**
     * Creates new form FrmLoginCaixa
     */
    public FrmLoginCaixa() {
        initComponents();
        
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../../img/icone.png")));
    
        conexao = new Conexao();
        conexao.conectar();
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
        jLabelTitulo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabelSenha = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jButtonLogin = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jLabelUsuario = new javax.swing.JLabel();
        jPasswordField = new javax.swing.JPasswordField();
        jTextFieldCodOperador = new javax.swing.JTextField();
        jLabelCodOperador = new javax.swing.JLabel();
        jTextFieldNumCaixa = new javax.swing.JTextField();
        jLabelNumCaixa = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login - Sistema de Caixa");
        setPreferredSize(new java.awt.Dimension(735, 515));
        setResizable(false);

        jPanelMain.setBackground(new java.awt.Color(255, 255, 255));
        jPanelMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitulo.setFont(new java.awt.Font("Arial", 1, 32)); // NOI18N
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("Sistema de Caixa - Login");
        jPanelMain.add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 720, 50));

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelSenha.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabelSenha.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSenha.setText("Senha");
        jPanel1.add(jLabelSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, 30));

        jTextFieldUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 270, 30));

        jButtonLogin.setBackground(new java.awt.Color(254, 254, 254));
        jButtonLogin.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jButtonLogin.setText("Login");
        jButtonLogin.setBorderPainted(false);
        jButtonLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 100, 30));

        jButtonLimpar.setBackground(new java.awt.Color(254, 254, 254));
        jButtonLimpar.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jButtonLimpar.setText("Limpar");
        jButtonLimpar.setBorderPainted(false);
        jButtonLimpar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jButtonLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 100, 30));

        jLabelUsuario.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabelUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jLabelUsuario.setText("Usuário");
        jPanel1.add(jLabelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, 30));

        jPasswordField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldActionPerformed(evt);
            }
        });
        jPanel1.add(jPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 270, 30));

        jTextFieldCodOperador.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldCodOperador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodOperadorActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldCodOperador, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 190, 30));

        jLabelCodOperador.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabelCodOperador.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCodOperador.setText("Código do Operador");
        jPanel1.add(jLabelCodOperador, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, 30));

        jTextFieldNumCaixa.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel1.add(jTextFieldNumCaixa, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 70, 30));

        jLabelNumCaixa.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabelNumCaixa.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNumCaixa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNumCaixa.setText("Caixa Nº");
        jPanel1.add(jLabelNumCaixa, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 70, 30));

        jPanelMain.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 350, 300));

        jMenuBar1.setBackground(new java.awt.Color(0, 51, 102));

        jMenuSair.setMnemonic('S');
        jMenuSair.setText("Sair");
        jMenuSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuSairMouseClicked(evt);
            }
        });
        jMenuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSairActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenuSair);

        setJMenuBar(jMenuBar1);

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

    private void jMenuSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuSairMouseClicked
        dispose();
        var painel = new FrmMain();
        painel.setVisible(true);
    }//GEN-LAST:event_jMenuSairMouseClicked

    private void jMenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuSairActionPerformed

    private void jTextFieldUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUsuarioActionPerformed

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed
        int numCaixa = 0;
        int codOperador;
        
        if (!jTextFieldNumCaixa.getText().isBlank()) {
            try {
                numCaixa = Integer.parseInt(jTextFieldNumCaixa.getText());
            } catch (NumberFormatException e) {
                return;
            }
        }
        
        if (jTextFieldCodOperador.getText().isBlank()) {
            JOptionPane.showMessageDialog(
                    null, 
                    "Não é possível logar como \ncaixa sem um código de operador.", 
                    "Mensagem do Programa", 
                    JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        try {
            codOperador = Integer.parseInt(jTextFieldCodOperador.getText());
            
            conexao.executarSQL("SELECT * FROM funcionario WHERE id_func = " + codOperador);
            if (!conexao.resultset.first()) {
                JOptionPane.showMessageDialog(
                        null, 
                        "Erro: Funcionário inexistente.", 
                        "Mensagem do Programa", 
                        JOptionPane.INFORMATION_MESSAGE);
                return;
            }
        } 
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(
                    null, 
                    "Erro: O código do operador deve ser um número inteiro.", 
                    "Mensagem do Programa", 
                    JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(
                    null, 
                    "Erro: Erro na conexão com o banco de dados.\nSe esse erro persistir, consulte os desenvolvedores desse software.", 
                    "Mensagem do Programa", 
                    JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        if (jTextFieldUsuario.getText().isBlank() || jPasswordField.getText().isBlank()) {
            JOptionPane.showMessageDialog(
                    null, 
                    "Cerifique-se de digitar o usuário e senha.", 
                    "Mensagem do Programa", 
                    JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        String sql = "SELECT * FROM credenciais WHERE usuario LIKE '" + jTextFieldUsuario.getText() + "' AND senha LIKE '" + jPasswordField.getText() + "' AND cod_acesso = 2";
        conexao.executarSQL(sql);
        
        try {
            if (conexao.resultset.first()) {
                dispose();
                var painel = new FrmCaixa(numCaixa, codOperador);
                painel.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(
                    null, 
                    "Usuário ou senha inválido.", 
                    "Mensagem do Programa", 
                    JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException e) {}
    }//GEN-LAST:event_jButtonLoginActionPerformed

    private void jTextFieldCodOperadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodOperadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCodOperadorActionPerformed

    private void jPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JLabel jLabelCodOperador;
    private javax.swing.JLabel jLabelNumCaixa;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuSair;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JTextField jTextFieldCodOperador;
    private javax.swing.JTextField jTextFieldNumCaixa;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
