package Client;

import Server.Entity.Usuario;
import Server.Services.UsuarioService;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaUsuarios extends javax.swing.JFrame {

    public TelaUsuarios() {
        initComponents();
        popularTabela(service.getLista());
    }

    UsuarioService service = new UsuarioService();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        container = new javax.swing.JPanel();
        principal = new javax.swing.JPanel();
        filtro = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblUser = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        btnConsultar = new javax.swing.JButton();
        Cadastro = new javax.swing.JPanel();
        scroll = new javax.swing.JScrollPane();
        tblUsuarios = new javax.swing.JTable();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnIncluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        principal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        filtro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        lblNome.setText("Nome");

        lblUser.setText("Usuario");

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout filtroLayout = new javax.swing.GroupLayout(filtro);
        filtro.setLayout(filtroLayout);
        filtroLayout.setHorizontalGroup(
            filtroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(filtroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(filtroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                    .addComponent(lblNome, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUser, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnConsultar, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUsuario))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        filtroLayout.setVerticalGroup(
            filtroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(filtroLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lblNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnConsultar)
                .addContainerGap())
        );

        Cadastro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        tblUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Usuario", "Senha", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblUsuarios.setColumnSelectionAllowed(true);
        tblUsuarios.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                RowfocusLost(evt);
            }
        });
        tblUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                habilitarAlterar(evt);
            }
        });
        scroll.setViewportView(tblUsuarios);
        tblUsuarios.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        btnAlterar.setText("Alterar");
        btnAlterar.setEnabled(false);
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Inativar");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnIncluir.setText("Incluir");
        btnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CadastroLayout = new javax.swing.GroupLayout(Cadastro);
        Cadastro.setLayout(CadastroLayout);
        CadastroLayout.setHorizontalGroup(
            CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnIncluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        CadastroLayout.setVerticalGroup(
            CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CadastroLayout.createSequentialGroup()
                        .addComponent(btnIncluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluir)
                        .addGap(0, 159, Short.MAX_VALUE))
                    .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout principalLayout = new javax.swing.GroupLayout(principal);
        principal.setLayout(principalLayout);
        principalLayout.setHorizontalGroup(
            principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, principalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Cadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(filtro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        principalLayout.setVerticalGroup(
            principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(principalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(filtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(Cadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        filtro.getAccessibleContext().setAccessibleName("Filtro");

        javax.swing.GroupLayout containerLayout = new javax.swing.GroupLayout(container);
        container.setLayout(containerLayout);
        containerLayout.setHorizontalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        containerLayout.setVerticalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed
        String nome = JOptionPane.showInputDialog("Digite o nome do usuario");
        cancelarIncluirClicked(nome, evt);
        String usuario = JOptionPane.showInputDialog("Digite o login do usuario");
        cancelarIncluirClicked(usuario, evt);
        String senha = JOptionPane.showInputDialog("Digite a senha do usuario");
        cancelarIncluirClicked(senha, evt);
        Usuario user = new Usuario(nome, usuario, senha, "Ativo");
        String confirmSenha = JOptionPane.showInputDialog("Confirme a sua senha");
        while (!senha.equals(confirmSenha)) {
            confirmSenha = JOptionPane.showInputDialog("Confirme a sua senha");
        }
        service.cadastrarUsuario(user);
        popularTabela(service.getLista());
    }//GEN-LAST:event_btnIncluirActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        Integer codigo = tblUsuarios.getSelectedRow();
        service.inativarUsuario(codigo);
        popularTabela(service.getLista());
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        Integer codigo = tblUsuarios.getSelectedRow();
        String nome = JOptionPane.showInputDialog("Digite o nome do usuario");
        cancelarAlterarClicked(nome, evt);
        String usuario = JOptionPane.showInputDialog("Digite o login do usuario");
        cancelarAlterarClicked(usuario, evt);
        String senha = JOptionPane.showInputDialog("Digite a senha do usuario");
        cancelarAlterarClicked(senha, evt);
        if (nome.isEmpty()) {
            nome = service.getUsuarioByCodigo(codigo).getNome();
        }
        if (usuario.isEmpty()) {
            usuario = service.getUsuarioByCodigo(codigo).getLogin();
        }
        if (senha.isEmpty()) {
            senha = service.getUsuarioByCodigo(codigo).getSenha();
        }
        String ativo = service.getUsuarioByCodigo(codigo).getAtivo();
        Usuario user = new Usuario(nome, usuario, senha, ativo);
        service.alterarUsuario(user, codigo);
        popularTabela(service.getLista());
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        List<Usuario> usuarios;
        String nomeConsulta = txtNome.getText();
        String usuarioConsulta = txtUsuario.getText();
        usuarios = service.consultar(nomeConsulta, usuarioConsulta);
        popularTabela(usuarios);
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void habilitarAlterar(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_habilitarAlterar
        if("Ativo".equals(service.getUsuarioByCodigo(tblUsuarios.getSelectedRow()))) {
            btnAlterar.setEnabled(true);
            btnExcluir.setEnabled(true);
        }
    }//GEN-LAST:event_habilitarAlterar

    private void RowfocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RowfocusLost
        if("filtro".equalsIgnoreCase(evt.getOppositeComponent().getParent().getAccessibleContext().getAccessibleName()) ||
                !evt.getOppositeComponent().getClass().toString().contains("JButton")) {
            tblUsuarios.getSelectionModel().clearSelection();
            btnAlterar.setEnabled(false);
            btnExcluir.setEnabled(false);
        }
    }//GEN-LAST:event_RowfocusLost

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaUsuarios().setVisible(true);
            }
        });
    }

    private void popularTabela(List<Usuario> usuarios) {
        DefaultTableModel tabela = (DefaultTableModel) tblUsuarios.getModel();
        tabela.setNumRows(0);
        for (Usuario user : usuarios) {
            tabela.addRow(new Object[]{
                user.getNome(),
                user.getLogin(),
                "********",
                user.getAtivo()
            });
        }

    }
       
    private void cancelarAlterarClicked(String input, java.awt.event.ActionEvent evt) {
        if(input == null) {
            evt.getClass().cast(ABORT);
        }
    }
    
    private void cancelarIncluirClicked(String input, java.awt.event.ActionEvent evt) {
        if(input == null || input.isEmpty()) {
            evt.getClass().cast(ABORT);
        }
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Cadastro;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JPanel container;
    private javax.swing.JPanel filtro;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblUser;
    private javax.swing.JPanel principal;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JTable tblUsuarios;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

}
