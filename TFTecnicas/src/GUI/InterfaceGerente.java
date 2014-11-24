/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;

import Negocio.FachadaServicoTmdb;
import Negocio.FachadaServicoTmdbException;
import Negocio.Filme;
import com.omertron.themoviedbapi.MovieDbException;
import com.omertron.themoviedbapi.TheMovieDbApi;
import com.omertron.themoviedbapi.model.MovieDb;
import com.omertron.themoviedbapi.model.Person;
import java.awt.HeadlessException;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Marcos
 */
public class InterfaceGerente extends javax.swing.JFrame {
    private static TheMovieDbApi tmdb;
    String chave = "7f33d776068a7e8045c703100347fd69";
    MyComboModelMovieDB comboFilmes;
    FachadaServicoTmdb fachada;
    
    public InterfaceGerente() throws FachadaServicoTmdbException {
        initComponents();
        fachada = new FachadaServicoTmdb(chave);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        txtNomeFilme = new javax.swing.JTextField();
        lblAno = new javax.swing.JLabel();
        txtAnoLancamento = new javax.swing.JTextField();
        lblDiretor = new javax.swing.JLabel();
        txtDiretor = new javax.swing.JTextField();
        lblAtores = new javax.swing.JLabel();
        lblBusca = new javax.swing.JLabel();
        txtBuscaFilme = new javax.swing.JTextField();
        ddlFilmes = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAtores = new javax.swing.JTextArea();
        btnBuscaFilme = new javax.swing.JButton();
        lblPoster = new javax.swing.JLabel();
        btnInfoFilme = new javax.swing.JButton();
        lblSinopse = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtSinopse = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnAdicionaSessao = new javax.swing.JButton();
        btnAdicionaFilme = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNome.setText(" Nome");

        txtNomeFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeFilmeActionPerformed(evt);
            }
        });

        lblAno.setText("Ano Lançamento");

        lblDiretor.setText("Diretor");

        txtDiretor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiretorActionPerformed(evt);
            }
        });

        lblAtores.setText("Atores");

        lblBusca.setText("Digite sua busca:");

        txtBuscaFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscaFilmeActionPerformed(evt);
            }
        });

        ddlFilmes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ddlFilmesActionPerformed(evt);
            }
        });

        txtAtores.setColumns(20);
        txtAtores.setRows(5);
        jScrollPane1.setViewportView(txtAtores);

        btnBuscaFilme.setText("Buscar");
        btnBuscaFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaFilmeActionPerformed(evt);
            }
        });

        lblPoster.setText("jLabel8");

        btnInfoFilme.setText("Info");
        btnInfoFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoFilmeActionPerformed(evt);
            }
        });

        lblSinopse.setText("Sinopse");

        txtSinopse.setColumns(20);
        txtSinopse.setRows(5);
        jScrollPane2.setViewportView(txtSinopse);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(ddlFilmes, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblBusca)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBuscaFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBuscaFilme)
                            .addComponent(btnInfoFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblPoster, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblSinopse)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNomeFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblAtores)
                                            .addComponent(lblDiretor))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtDiretor)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblAno)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtAnoLancamento, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscaFilme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBusca)
                    .addComponent(btnBuscaFilme))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ddlFilmes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInfoFilme))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPoster, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSinopse)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNomeFilme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAno)
                            .addComponent(txtAnoLancamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDiretor)
                    .addComponent(txtDiretor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAtores)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 168, Short.MAX_VALUE)
        );

        btnAdicionaSessao.setText("Adicionar Sessão");
        btnAdicionaSessao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionaSessaoActionPerformed(evt);
            }
        });

        btnAdicionaFilme.setText("Adicionar Filme");
        btnAdicionaFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionaFilmeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(btnAdicionaSessao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAdicionaFilme)
                .addGap(167, 167, 167))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(jLabel7)
                        .addGap(25, 25, 25)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAdicionaFilme)
                    .addComponent(btnAdicionaSessao))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInfoFilmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoFilmeActionPerformed
        if(comboFilmes != null){
            MovieDb filmeSelecionado = comboFilmes.getInfosFilme(ddlFilmes.getSelectedIndex());

            txtNomeFilme.setText(filmeSelecionado.getTitle());
            txtAnoLancamento.setText(filmeSelecionado.getReleaseDate().substring(0, Math.min(filmeSelecionado.getReleaseDate().length(), 4)));
            txtSinopse.setText(filmeSelecionado.getOverview());

            try {
                List<Person> atores = fachada.getAtores(filmeSelecionado.getId());
                String nomesAtores = "";
                for(Person p : atores){
                    nomesAtores += (p.getName()+"\n");
                    if(p.getJob().equalsIgnoreCase("director")){
                        txtDiretor.setText(p.getName());
                    }
                }
                txtAtores.setText(nomesAtores);
            } catch (MovieDbException ex) {
                Logger.getLogger(InterfaceGerente.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                String path = "http://image.tmdb.org/t/p/w500" + filmeSelecionado.getPosterPath();
                System.out.println("Get Image from " + path);
                URL url2 = new URL(path);

                BufferedImage image = ImageIO.read(url2);
                System.out.println("Load image into frame...");
                lblPoster.setIcon(new ImageIcon(image));

                /*
                f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                f.getContentPane().add(jLabel8);
                f.pack();
                f.setLocation(200, 200);
                f.setBounds(200, 200, 200, 200);
                f.setVisible(true);*/
            } catch (IOException | HeadlessException exp) {
            }
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum filme selecionado", "Erro", WIDTH, null);
        }
    }//GEN-LAST:event_btnInfoFilmeActionPerformed

    private void btnBuscaFilmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaFilmeActionPerformed
        String nomeFilme;
        try{
            nomeFilme = txtBuscaFilme.getText();
            nomeFilme = nomeFilme.toUpperCase();
            FachadaServicoTmdb fachada = new FachadaServicoTmdb(chave);
            List<MovieDb> filmes = fachada.buscarFilmesPorNome(nomeFilme);
            if(filmes.isEmpty()){
                JOptionPane.showMessageDialog(null, "Nenhum filme encontrado", "Erro", WIDTH, null);
            }else{
                comboFilmes = new MyComboModelMovieDB(filmes);
                ddlFilmes.removeAllItems();
                ddlFilmes.setModel(comboFilmes);
            }
        }
        catch (FachadaServicoTmdbException ex) {
            JOptionPane.showMessageDialog(null, "Filme não encontrado", "Erro", WIDTH, null);
        }
        
    }//GEN-LAST:event_btnBuscaFilmeActionPerformed

    private void ddlFilmesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ddlFilmesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ddlFilmesActionPerformed

    private void txtBuscaFilmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscaFilmeActionPerformed

    }//GEN-LAST:event_txtBuscaFilmeActionPerformed

    private void txtDiretorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiretorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiretorActionPerformed

    private void txtNomeFilmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeFilmeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeFilmeActionPerformed

    private void btnAdicionaFilmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionaFilmeActionPerformed
        if(comboFilmes != null){
            MovieDb filmeSelecionado = comboFilmes.getInfosFilme(ddlFilmes.getSelectedIndex());
            int idFilme = filmeSelecionado.getId();
            String nomeFilme = txtNomeFilme.getText();
            String posterFilme = filmeSelecionado.getPosterPath();
            int anoFilme = Integer.parseInt(txtAnoLancamento.getText());
            String sinopseFilme = txtSinopse.getText();
            String diretorFilme = txtDiretor.getText();
            String[] atoresFilme = txtAtores.getText().split("\n");
            Filme filme = new Filme(idFilme, nomeFilme, anoFilme, diretorFilme, sinopseFilme, posterFilme, atoresFilme);
            try {
                fachada.addFilme(filme);
            } catch (Exception ex) {
                Logger.getLogger(InterfaceGerente.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum filme selecionado", "Erro", WIDTH, null);
        }
    }//GEN-LAST:event_btnAdicionaFilmeActionPerformed

    private void btnAdicionaSessaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionaSessaoActionPerformed
        GerenciarSessoes sessoes = null;
        try {
            sessoes = new GerenciarSessoes();
        } catch (FachadaServicoTmdbException ex) {
            Logger.getLogger(InterfaceGerente.class.getName()).log(Level.SEVERE, null, ex);
        }
        sessoes.setVisible(true);
    }//GEN-LAST:event_btnAdicionaSessaoActionPerformed

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[])throws Exception {
        String chave ="7f33d776068a7e8045c703100347fd69";
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
            java.util.logging.Logger.getLogger(InterfaceGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new InterfaceGerente().setVisible(true);
                } catch (FachadaServicoTmdbException ex) {
                    Logger.getLogger(InterfaceGerente.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionaFilme;
    private javax.swing.JButton btnAdicionaSessao;
    private javax.swing.JButton btnBuscaFilme;
    private javax.swing.JButton btnInfoFilme;
    private javax.swing.JComboBox ddlFilmes;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAno;
    private javax.swing.JLabel lblAtores;
    private javax.swing.JLabel lblBusca;
    private javax.swing.JLabel lblDiretor;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPoster;
    private javax.swing.JLabel lblSinopse;
    private javax.swing.JTextField txtAnoLancamento;
    private javax.swing.JTextArea txtAtores;
    private javax.swing.JTextField txtBuscaFilme;
    private javax.swing.JTextField txtDiretor;
    private javax.swing.JTextField txtNomeFilme;
    private javax.swing.JTextArea txtSinopse;
    // End of variables declaration//GEN-END:variables
}
