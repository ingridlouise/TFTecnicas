/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Negocio.FachadaServicoTmdb;
import Negocio.FachadaServicoTmdbException;
import Negocio.FachadaSessao;
import Negocio.Filme;
import Negocio.FilmeDAO;
import Persistencia.HorarioDAODerby;
import Persistencia.SalaDAODerby;
import static java.awt.image.ImageObserver.WIDTH;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ingridlouisepanizzirodrigues
 */
public class ComprarIngressos extends javax.swing.JFrame {

   
    String chave = "7f33d776068a7e8045c703100347fd69";
    MyComboModelFilme comboFilmes;
    MyComboModelSalas comboSalas;
    MyComboModelHorarios comboHorarios;
    FachadaSessao fachadaSessao;
    FachadaServicoTmdb fachada;
    FilmeDAO filmeDAOFilmes;
    SalaDAODerby salaDAOFilmes = new SalaDAODerby();
    HorarioDAODerby horarioDAOFilmes = new HorarioDAODerby();

    /**
     * Creates new form ComprarIngressos
     */
    public ComprarIngressos() throws FachadaServicoTmdbException {
        initComponents();
        fachada = new FachadaServicoTmdb(chave);
        fachadaSessao = new FachadaSessao();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ddlFilmes = new javax.swing.JComboBox();
        btnInfoFilme = new javax.swing.JButton();
        ddlSessoes = new javax.swing.JComboBox();
        lblFilmes = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblBuscar = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtData = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        lblSessoes = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        btnBuscarFilme = new javax.swing.JButton();
        btnBuscarSessao = new javax.swing.JButton();
        btnEscolherSessao = new javax.swing.JButton();
        btnCarregarFilmes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ddlFilmes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione" }));
        ddlFilmes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ddlFilmesActionPerformed(evt);
            }
        });

        btnInfoFilme.setText("Ver Informações do Filme");
        btnInfoFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoFilmeActionPerformed(evt);
            }
        });

        ddlSessoes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione" }));
        ddlSessoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ddlSessoesActionPerformed(evt);
            }
        });

        lblFilmes.setText("Filmes em cartaz:");

        lblBuscar.setText("Buscar Filme:");

        lblNome.setText("Por Nome:");

        lblData.setText("Por Data:");

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        lblSessoes.setText("Sessões:");

        jLabel3.setText("Comprar Ingressos:");

        btnBuscarFilme.setText("Buscar");
        btnBuscarFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarFilmeActionPerformed(evt);
            }
        });

        btnBuscarSessao.setText("Buscar Sessão");

        btnEscolherSessao.setText("Escolher Sessão");

        btnCarregarFilmes.setText("Carregar Filmes em Cartaz");
        btnCarregarFilmes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarregarFilmesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addComponent(jSeparator3)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(lblData)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtData))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblSessoes)
                                .addGap(18, 18, 18)
                                .addComponent(ddlSessoes, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnBuscarSessao)
                                .addGap(18, 18, 18)
                                .addComponent(btnEscolherSessao))
                            .addComponent(lblBuscar)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblFilmes)
                                .addGap(18, 18, 18)
                                .addComponent(ddlFilmes, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnCarregarFilmes)
                                    .addComponent(btnInfoFilme))))
                        .addGap(0, 27, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnBuscarFilme)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFilmes)
                    .addComponent(ddlFilmes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCarregarFilmes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnInfoFilme)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(lblData)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(btnBuscarFilme)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSessoes)
                    .addComponent(ddlSessoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarSessao)
                    .addComponent(btnEscolherSessao))
                .addGap(24, 24, 24)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap(143, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ddlSessoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ddlSessoesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ddlSessoesActionPerformed

    private void ddlFilmesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ddlFilmesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ddlFilmesActionPerformed

    private void btnInfoFilmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoFilmeActionPerformed
        if (ddlFilmes != null) {

            Filme filmeSelecionado = comboFilmes.getInfosFilme(ddlFilmes.getSelectedIndex());

            String nomeFilme = filmeSelecionado.getNome();
            String diretor = filmeSelecionado.getDiretor();
            int ano = filmeSelecionado.getAnoLancamento();
            String sinopse = filmeSelecionado.getSinopse();
            String[] atores = filmeSelecionado.getAtores();
            InformacoesFilme info = null;

            info = new InformacoesFilme(nomeFilme, sinopse, diretor, ano, atores);

            info.setVisible(true);

        }
    }//GEN-LAST:event_btnInfoFilmeActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void btnBuscarFilmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarFilmeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarFilmeActionPerformed

    private void btnCarregarFilmesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarregarFilmesActionPerformed
        List<Filme> filmes = fachada.getFilmes();


        if (filmes.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhum filme encontrado", "Erro", WIDTH, null);
        } else {
            comboFilmes = new MyComboModelFilme(filmes);
            ddlFilmes.removeAllItems();
            ddlFilmes.setModel(comboFilmes);

        }
    }//GEN-LAST:event_btnCarregarFilmesActionPerformed

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
            java.util.logging.Logger.getLogger(ComprarIngressos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ComprarIngressos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ComprarIngressos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ComprarIngressos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ComprarIngressos().setVisible(true);
                } catch (FachadaServicoTmdbException ex) {
                    Logger.getLogger(ComprarIngressos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarFilme;
    private javax.swing.JButton btnBuscarSessao;
    private javax.swing.JButton btnCarregarFilmes;
    private javax.swing.JButton btnEscolherSessao;
    private javax.swing.JButton btnInfoFilme;
    private javax.swing.JComboBox ddlFilmes;
    private javax.swing.JComboBox ddlSessoes;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblFilmes;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSessoes;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
