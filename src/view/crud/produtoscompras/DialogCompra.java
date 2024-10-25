/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view.crud.produtoscompras;

import controller.CRUD;
import controller.enums.TipoAtributo;
import controller.db.Conexao;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author neo
 */
public class DialogCompra extends javax.swing.JDialog {
    Conexao conexao;
    CRUD crud;

    public DialogCompra(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        conexao = new Conexao();
        conexao.conectar();
        
        jTable.getColumnModel().getColumn(0).setPreferredWidth(50);
        jTable.getColumnModel().getColumn(1).setPreferredWidth(50);
        jTable.getColumnModel().getColumn(2).setPreferredWidth(50);
        jTable.getColumnModel().getColumn(3).setPreferredWidth(120);
        jTable.getColumnModel().getColumn(4).setPreferredWidth(50);
        jTable.getColumnModel().getColumn(5).setPreferredWidth(140);
        jTable.getColumnModel().getColumn(6).setPreferredWidth(140);
        
        DefaultTableModel modelo = (DefaultTableModel) jTable.getModel();
        
        crud = new CRUD(
                conexao,
                modelo,
                "compra",
                new String[] {
                    "cod_compra",
                    "id_func",
                    "id_cliente",
                    "data_compra",
                    "metodo_pag",
                    "preco_bruto",
                    "valor_desconto"
                },
                new TipoAtributo[] {
                    TipoAtributo.PK,
                    TipoAtributo.Number,
                    TipoAtributo.Number,
                    TipoAtributo.String,
                    TipoAtributo.Number,
                    TipoAtributo.Money,
                    TipoAtributo.Money
                },
                new JTextField[] {
                    jTextFieldCodigo,
                    jTextFieldFunc,
                    jTextFieldCliente,
                    jFormattedTextFieldData,
                    jTextFieldPag,
                    jTextFieldBruto,
                    jTextFieldDesconto
                }
        );
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
        jLabelPesquisa = new javax.swing.JLabel();
        jTextFieldPesquisa = new javax.swing.JTextField();
        jButtonPesquisar = new javax.swing.JButton();
        jToolBar = new javax.swing.JToolBar();
        jLabel3 = new javax.swing.JLabel();
        jButtonNovoRegistro = new javax.swing.JButton();
        jButtonGravar = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        jButtonPrimeiro = new javax.swing.JButton();
        jButtonAnterior = new javax.swing.JButton();
        jButtonProximo = new javax.swing.JButton();
        jButtonUltimo = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        jButtonSair = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jButtonTiposDeTelefone = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldFunc = new javax.swing.JTextField();
        jTextFieldCliente = new javax.swing.JTextField();
        jTextFieldPag = new javax.swing.JTextField();
        jTextFieldBruto = new javax.swing.JTextField();
        jTextFieldDesconto = new javax.swing.JTextField();
        jFormattedTextFieldData = new javax.swing.JFormattedTextField();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jComboBoxPesquisa1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerenciar Compras");
        setPreferredSize(new java.awt.Dimension(1080, 510));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelMain.setBackground(new java.awt.Color(255, 255, 255));
        jPanelMain.setMinimumSize(new java.awt.Dimension(735, 515));
        jPanelMain.setName(""); // NOI18N
        jPanelMain.setPreferredSize(new java.awt.Dimension(1024, 480));
        jPanelMain.setRequestFocusEnabled(false);
        jPanelMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelPesquisa.setText("Pesquisar por");
        jPanelMain.add(jLabelPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, -1, 20));
        jPanelMain.add(jTextFieldPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 470, 410, -1));

        jButtonPesquisar.setText("Pesquisar");
        jPanelMain.add(jButtonPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 470, -1, -1));

        jToolBar.setBackground(new java.awt.Color(0, 51, 102));
        jToolBar.setFloatable(false);
        jToolBar.setRollover(true);

        jLabel3.setText("   ");
        jToolBar.add(jLabel3);

        jButtonNovoRegistro.setText(" Novo Registro ");
        jButtonNovoRegistro.setFocusable(false);
        jButtonNovoRegistro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonNovoRegistro.setPreferredSize(new java.awt.Dimension(150, 23));
        jButtonNovoRegistro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonNovoRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoRegistroActionPerformed(evt);
            }
        });
        jToolBar.add(jButtonNovoRegistro);

        jButtonGravar.setText(" Gravar ");
        jButtonGravar.setFocusable(false);
        jButtonGravar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonGravar.setPreferredSize(new java.awt.Dimension(75, 24));
        jButtonGravar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGravarActionPerformed(evt);
            }
        });
        jToolBar.add(jButtonGravar);

        jButtonAlterar.setText(" Alterar ");
        jButtonAlterar.setToolTipText("");
        jButtonAlterar.setFocusable(false);
        jButtonAlterar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonAlterar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });
        jToolBar.add(jButtonAlterar);

        jButtonExcluir.setText(" Excluir ");
        jButtonExcluir.setFocusable(false);
        jButtonExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonExcluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });
        jToolBar.add(jButtonExcluir);
        jToolBar.add(jSeparator1);

        jButtonPrimeiro.setText(" Primeiro ");
        jButtonPrimeiro.setFocusable(false);
        jButtonPrimeiro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonPrimeiro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPrimeiroActionPerformed(evt);
            }
        });
        jToolBar.add(jButtonPrimeiro);

        jButtonAnterior.setText(" Anterior ");
        jButtonAnterior.setFocusable(false);
        jButtonAnterior.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonAnterior.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnteriorActionPerformed(evt);
            }
        });
        jToolBar.add(jButtonAnterior);

        jButtonProximo.setText(" Próximo ");
        jButtonProximo.setFocusable(false);
        jButtonProximo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonProximo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProximoActionPerformed(evt);
            }
        });
        jToolBar.add(jButtonProximo);

        jButtonUltimo.setText(" Último ");
        jButtonUltimo.setFocusable(false);
        jButtonUltimo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonUltimo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUltimoActionPerformed(evt);
            }
        });
        jToolBar.add(jButtonUltimo);
        jToolBar.add(jSeparator2);

        jButtonSair.setText("   Sair   ");
        jButtonSair.setFocusable(false);
        jButtonSair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonSair.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });
        jToolBar.add(jButtonSair);

        jPanelMain.add(jToolBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 40));

        jPanel3.setBackground(new java.awt.Color(0, 51, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Cód. da Compra:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, 30));

        jTextFieldCodigo.setEditable(false);
        jTextFieldCodigo.setPreferredSize(new java.awt.Dimension(60, 27));
        jPanel3.add(jTextFieldCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 90, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Id. do Funcionário:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, 30));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Preço Bruto:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, 30));

        jLabel11.setBackground(new java.awt.Color(200, 200, 200));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Atributos");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 190, -1));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 235, 2));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 190, 2));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Id. do Cliente:");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, 30));

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Valor Desconto:");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, 30));

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Método de Pagamento:");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, 30));

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Data da Compra:");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, 30));

        jButtonTiposDeTelefone.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonTiposDeTelefone.setText("Itens das Compras");
        jButtonTiposDeTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTiposDeTelefoneActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonTiposDeTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 190, 40));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Sub-tabela");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 160, -1));
        jPanel3.add(jTextFieldFunc, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 90, -1));
        jPanel3.add(jTextFieldCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 90, -1));
        jPanel3.add(jTextFieldPag, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 90, -1));
        jPanel3.add(jTextFieldBruto, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 120, -1));
        jPanel3.add(jTextFieldDesconto, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 120, -1));

        jFormattedTextFieldData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy hh:mm:ss "))));
        jPanel3.add(jFormattedTextFieldData, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 120, -1));

        jPanelMain.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 280, 400));

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CodCompra", "IdFunc", "IdCliente", "DataCompra", "MetodoPag", "PrecoBruto", "ValorDesconto"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane12.setViewportView(jTable);
        if (jTable.getColumnModel().getColumnCount() > 0) {
            jTable.getColumnModel().getColumn(0).setPreferredWidth(75);
            jTable.getColumnModel().getColumn(1).setPreferredWidth(75);
            jTable.getColumnModel().getColumn(2).setPreferredWidth(75);
            jTable.getColumnModel().getColumn(3).setPreferredWidth(100);
            jTable.getColumnModel().getColumn(4).setPreferredWidth(150);
            jTable.getColumnModel().getColumn(5).setPreferredWidth(100);
            jTable.getColumnModel().getColumn(6).setPreferredWidth(100);
        }

        jPanelMain.add(jScrollPane12, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 760, 410));

        jComboBoxPesquisa1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cód. da Compra", "Id. do Funcionário", "Id. do Cliente", "Data da Compra", "Método de Pagamento", "Preço Bruto", "Valor Desconto" }));
        jComboBoxPesquisa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxPesquisa1ActionPerformed(evt);
            }
        });
        jPanelMain.add(jComboBoxPesquisa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 470, -1, -1));

        getContentPane().add(jPanelMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 510));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jComboBoxPesquisa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxPesquisa1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxPesquisa1ActionPerformed

    private void jButtonTiposDeTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTiposDeTelefoneActionPerformed
        var painel = new DialogItens(this, true);
        painel.setVisible(true);
    }//GEN-LAST:event_jButtonTiposDeTelefoneActionPerformed

    private void jButtonNovoRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoRegistroActionPerformed
        crud.novoRegistro();
    }//GEN-LAST:event_jButtonNovoRegistroActionPerformed

    private void jButtonGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGravarActionPerformed
        crud.gravar();
    }//GEN-LAST:event_jButtonGravarActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        crud.alterar();
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        crud.excluir();
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrimeiroActionPerformed
        crud.primeiro();
    }//GEN-LAST:event_jButtonPrimeiroActionPerformed

    private void jButtonAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnteriorActionPerformed
        crud.anterior();
    }//GEN-LAST:event_jButtonAnteriorActionPerformed

    private void jButtonProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProximoActionPerformed
        crud.proximo();
    }//GEN-LAST:event_jButtonProximoActionPerformed

    private void jButtonUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUltimoActionPerformed
        crud.ultimo();
    }//GEN-LAST:event_jButtonUltimoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonAnterior;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonGravar;
    private javax.swing.JButton jButtonNovoRegistro;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JButton jButtonPrimeiro;
    private javax.swing.JButton jButtonProximo;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonTiposDeTelefone;
    private javax.swing.JButton jButtonUltimo;
    private javax.swing.JComboBox<String> jComboBoxPesquisa1;
    private javax.swing.JFormattedTextField jFormattedTextFieldData;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelPesquisa;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField jTextFieldBruto;
    private javax.swing.JTextField jTextFieldCliente;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldDesconto;
    private javax.swing.JTextField jTextFieldFunc;
    private javax.swing.JTextField jTextFieldPag;
    private javax.swing.JTextField jTextFieldPesquisa;
    private javax.swing.JToolBar jToolBar;
    // End of variables declaration//GEN-END:variables
}
