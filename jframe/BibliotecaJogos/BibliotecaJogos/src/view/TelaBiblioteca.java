/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import model.BibliotecaModel;
import javax.swing.JTable;
import javax.swing.JOptionPane;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class TelaBiblioteca extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaBiblioteca.class.getName());

    /**
     * Creates new form TelaBiblioteca
     */
    public TelaBiblioteca() {
        initComponents();
        TableBiblioteca.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);//desliga o ajuste automático
        TableBiblioteca.getColumnModel().getColumn(0).setPreferredWidth(20);//ID
        TableBiblioteca.getColumnModel().getColumn(1).setPreferredWidth(200);//Titulo
        TableBiblioteca.getColumnModel().getColumn(2).setPreferredWidth(200);//Plataforma
        TableBiblioteca.getColumnModel().getColumn(3).setPreferredWidth(80);//Genero
        TableBiblioteca.getColumnModel().getColumn(4).setPreferredWidth(80);//Nota
        carregarTabela();
    }

    private void carregarTabela() {
        DefaultTableModel modelo = (DefaultTableModel) TableBiblioteca.getModel();//modelo da tabela
        modelo.setRowCount(0); // apaga as linhas atuais
        BibliotecaModel carregar = new BibliotecaModel();
        ArrayList<Object[]> linhas = carregar.listarTodos(); //pede ao model
        for (Object[] linha : linhas) { // adiciona cada linha
            modelo.addRow(linha);
        }

    }

    private void LimparCampos() {
        txtID.setText("");
        txtTitulo.setText("");
        txtPlataforma.setText("");
        txtGenero.setText("");
        txtNota.setText("");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JPanel();
        pnlDados = new javax.swing.JPanel();
        lblID = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        lblTitulo = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        lblNota = new javax.swing.JLabel();
        txtNota = new javax.swing.JTextField();
        lblPlataforma = new javax.swing.JLabel();
        txtPlataforma = new javax.swing.JTextField();
        lblGenero = new javax.swing.JLabel();
        txtGenero = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableBiblioteca = new javax.swing.JTable();
        pnlLateral = new javax.swing.JPanel();
        lblGAME = new javax.swing.JLabel();
        lblHUB = new javax.swing.JLabel();
        pnlLinha = new javax.swing.JPanel();
        btnCadastro = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(900, 520));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlPrincipal.setBackground(new java.awt.Color(51, 0, 153));
        pnlPrincipal.setPreferredSize(new java.awt.Dimension(900, 700));
        pnlPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlDados.setBackground(new java.awt.Color(102, 51, 255));

        lblID.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblID.setForeground(new java.awt.Color(255, 255, 255));
        lblID.setText("ID");

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Titulo");

        lblNota.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNota.setForeground(new java.awt.Color(255, 255, 255));
        lblNota.setText("Nota(0 a 10)");

        lblPlataforma.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPlataforma.setForeground(new java.awt.Color(255, 255, 255));
        lblPlataforma.setText("Plataforma");

        lblGenero.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblGenero.setForeground(new java.awt.Color(255, 255, 255));
        lblGenero.setText("Gênero");

        javax.swing.GroupLayout pnlDadosLayout = new javax.swing.GroupLayout(pnlDados);
        pnlDados.setLayout(pnlDadosLayout);
        pnlDadosLayout.setHorizontalGroup(
            pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDadosLayout.createSequentialGroup()
                        .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblID)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTitulo)
                            .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNota)
                            .addComponent(txtNota, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48))
                    .addGroup(pnlDadosLayout.createSequentialGroup()
                        .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPlataforma)
                            .addComponent(txtPlataforma, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblGenero)
                            .addComponent(txtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        pnlDadosLayout.setVerticalGroup(
            pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblID)
                    .addComponent(lblTitulo)
                    .addComponent(lblNota))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblGenero, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPlataforma))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPlataforma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        pnlPrincipal.add(pnlDados, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 650, 180));

        TableBiblioteca.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Titulo", "Plataforma", "Gênero", "Nota"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TableBiblioteca.setPreferredSize(new java.awt.Dimension(350, 90));
        TableBiblioteca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableBibliotecaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableBiblioteca);

        pnlPrincipal.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 650, 200));

        pnlLateral.setBackground(new java.awt.Color(0, 0, 0));
        pnlLateral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblGAME.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        lblGAME.setText("GAME");
        pnlLateral.add(lblGAME, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        lblHUB.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        lblHUB.setText("HUB");
        pnlLateral.add(lblHUB, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        pnlLinha.setBackground(new java.awt.Color(0, 0, 204));

        javax.swing.GroupLayout pnlLinhaLayout = new javax.swing.GroupLayout(pnlLinha);
        pnlLinha.setLayout(pnlLinhaLayout);
        pnlLinhaLayout.setHorizontalGroup(
            pnlLinhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        pnlLinhaLayout.setVerticalGroup(
            pnlLinhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        pnlLateral.add(pnlLinha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 150, 3));

        btnCadastro.setBackground(new java.awt.Color(0, 204, 204));
        btnCadastro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCadastro.setForeground(new java.awt.Color(0, 0, 0));
        btnCadastro.setText("Cadastrar");
        btnCadastro.addActionListener(this::btnCadastroActionPerformed);
        pnlLateral.add(btnCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 140, 35));

        btnAlterar.setBackground(new java.awt.Color(51, 0, 153));
        btnAlterar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAlterar.setForeground(new java.awt.Color(255, 255, 255));
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(this::btnAlterarActionPerformed);
        pnlLateral.add(btnAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 140, 35));

        btnLimpar.setBackground(new java.awt.Color(0, 51, 153));
        btnLimpar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLimpar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(this::btnLimparActionPerformed);
        pnlLateral.add(btnLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 140, 35));

        btnExcluir.setBackground(new java.awt.Color(204, 0, 204));
        btnExcluir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(this::btnExcluirActionPerformed);
        pnlLateral.add(btnExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 140, 35));

        pnlPrincipal.add(pnlLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 490));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Biblioteca de Jogos");
        pnlPrincipal.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 260, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("clique em um jogo da tabela para editar");
        pnlPrincipal.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, -1, -1));

        getContentPane().add(pnlPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 490));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroActionPerformed
        String titulo = txtTitulo.getText().trim();
        String plataforma = txtPlataforma.getText().trim();
        String genero = txtGenero.getText().trim();

        String textoNota = txtNota.getText().replace(",", "."); // replace troca a virgula por ponto para por exempro 25,60 ser 25.60
        double nota = Double.parseDouble(textoNota);// convertendo o texto em numero decimal (DOUBLE)

        BibliotecaModel cadastro = new BibliotecaModel();
        cadastro.inserir(titulo, plataforma, genero, nota);
        JOptionPane.showMessageDialog(
                null,
                "Cadastro realizado com sucesso!",
                "Sucesso",
                JOptionPane.INFORMATION_MESSAGE);
        //Limpar as caixas de texto
        LimparCampos();
        //Carregando a tabela ao iniciar
        carregarTabela();
    }//GEN-LAST:event_btnCadastroActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        String titulo = txtTitulo.getText().trim();
        String plataforma = txtPlataforma.getText().trim();
        String genero = txtGenero.getText().trim();
        int id = Integer.parseInt(txtID.getText().trim());

        String textoNota = txtNota.getText().replace(",", "."); // replace troca a virgula por ponto para por exempro 25,60 ser 25.60
        double nota = Double.parseDouble(textoNota);// convertendo o texto em numero decimal (DOUBLE)

        //Criando o Objeto para ter acesso aos métodos CRUD e atributos
        BibliotecaModel alterar = new BibliotecaModel();
        //Chamando o método atualizar
        String resposta = alterar.atualizar(id, titulo, plataforma, genero, nota);
        //mostra uma mensagem na Tela que foi gravado
        JOptionPane.showMessageDialog(
                null,
                resposta, "Sucesso",
                JOptionPane.INFORMATION_MESSAGE);
        //Limpar as caixas de texto
        LimparCampos();
        //Carregando a tabela ao iniciar
        carregarTabela();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        LimparCampos();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void TableBibliotecaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableBibliotecaMouseClicked
        int linha = TableBiblioteca.getSelectedRow();

        if (linha == -1) {
            return;
        }

        int codigo = Integer.parseInt(
                TableBiblioteca.getValueAt(linha, 0).toString()
        );

        txtID.setText(String.format("%03d", codigo));

        txtTitulo.setText(
                String.valueOf(TableBiblioteca.getValueAt(linha, 1))
        );

        txtPlataforma.setText(
                String.valueOf(TableBiblioteca.getValueAt(linha, 2))
        );

        txtGenero.setText(
                String.valueOf(TableBiblioteca.getValueAt(linha, 3))
        );

        double codNota = Double.parseDouble(
                TableBiblioteca.getValueAt(linha, 4).toString()
        );

        txtNota.setText(String.format("%.2f", codNota));

    }//GEN-LAST:event_TableBibliotecaMouseClicked

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
      if (txtID.getText().equals("")) {
            //mostra uma msg na Tela que foi gravado
            JOptionPane.showMessageDialog(
                    null,
                    "Favor Selecionar um Registro ",
                    "Sucesso",
                    JOptionPane.INFORMATION_MESSAGE
            );
        } else {
            Integer id = Integer.parseInt(txtID.getText().trim());

            //Criando o Objeto para ter acesso aos métodos CRUD e atributos
        BibliotecaModel age = new BibliotecaModel();
            String resposta = age.excluir(id);

            //mostra uma msg na Tela que foi gravado
            JOptionPane.showMessageDialog(
                    null,
                    resposta,
                    "Sucesso",
                    JOptionPane.INFORMATION_MESSAGE
            );

            //Limpar as caixas de Texto
            LimparCampos();

            //Carregando a tabela ao iniciar
            carregarTabela();
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

        /**
         * @param args the command line arguments
         */

        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
       
    public static void main(String args[]) {
            /* Create and display the form */
            java.awt.EventQueue.invokeLater(
                    () -> new TelaBiblioteca().setVisible(true));
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableBiblioteca;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCadastro;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblGAME;
    private javax.swing.JLabel lblGenero;
    private javax.swing.JLabel lblHUB;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblNota;
    private javax.swing.JLabel lblPlataforma;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlDados;
    private javax.swing.JPanel pnlLateral;
    private javax.swing.JPanel pnlLinha;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JTextField txtGenero;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNota;
    private javax.swing.JTextField txtPlataforma;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
