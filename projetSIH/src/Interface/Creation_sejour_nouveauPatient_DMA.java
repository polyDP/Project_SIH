/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interface;

/**
 *
 * @author Ludivine
 */
public class Creation_sejour_nouveauPatient_DMA extends javax.swing.JFrame {

    /**
     * Creates new form Creation_sejour_DMA
     */
    public Creation_sejour_nouveauPatient_DMA() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jComboBox3 = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Création d'un séour patient");

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel1.setText("Identifiant");
        jPanel2.add(jLabel1, java.awt.BorderLayout.EAST);

        jPanel1.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel3.setBackground(new java.awt.Color(153, 204, 255));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Logo_Asclepios.png"))); // NOI18N
        jPanel3.add(jLabel2, java.awt.BorderLayout.PAGE_END);

        jPanel1.add(jPanel3, java.awt.BorderLayout.LINE_END);

        jPanel4.setBackground(new java.awt.Color(153, 204, 255));

        jButton1.setBackground(new java.awt.Color(153, 204, 255));
        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton1.setText("Valider");
        jPanel4.add(jButton1);

        jButton2.setBackground(new java.awt.Color(153, 204, 255));
        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton2.setText("Retour");
        jPanel4.add(jButton2);

        jPanel1.add(jPanel4, java.awt.BorderLayout.PAGE_END);

        jPanel5.setBackground(new java.awt.Color(153, 204, 255));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Princetone_plainsboro.png"))); // NOI18N
        jPanel5.add(jLabel3, java.awt.BorderLayout.PAGE_END);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Création d'un dossier patient");
        jPanel5.add(jLabel4, java.awt.BorderLayout.PAGE_START);

        jPanel1.add(jPanel5, java.awt.BorderLayout.LINE_START);

        jPanel6.setLayout(new java.awt.BorderLayout());

        jPanel7.setBackground(new java.awt.Color(153, 204, 255));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel5.setText("Nouveau séjour");
        jPanel7.add(jLabel5);

        jPanel6.add(jPanel7, java.awt.BorderLayout.PAGE_START);

        jPanel8.setBackground(new java.awt.Color(153, 204, 255));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel6.setText("Date d'entrée:");

        jComboBox1.setEditable(true);
        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jComboBox2.setEditable(true);
        jComboBox2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Janvier", "Février", "Mars ", "Avril", "Mai", "Juin", "Juillet ", "Août", "Septembre", "Octobre", "Novembre ", "Décembre " }));

        jComboBox3.setEditable(true);
        jComboBox3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2014", "2015", "2016", "2017", "2018", "2019", "2020" }));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel7.setText("N° de séjour:");

        jLabel8.setBackground(new java.awt.Color(204, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("numéro de séjour");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel9.setText("Service d'affectation:");

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "cardio", "autre" }));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel10.setText("PH responsable:");

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Jean", "PAUL", " " }));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel11.setText("Localisation:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("numéro de chambre...");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(136, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox5, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(137, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addContainerGap(83, Short.MAX_VALUE))
        );

        jPanel6.add(jPanel8, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel6, java.awt.BorderLayout.CENTER);

        jScrollPane1.setViewportView(jPanel1);

        jMenu1.setText("Fichier");

        jMenuItem1.setText("Déconnecter");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Imprimer");
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edition");

        jMenuItem3.setText("Tout sélectionner");
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Paramètres");

        jMenuItem4.setText("Changer le mot de passe");
        jMenu3.add(jMenuItem4);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Aide");
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 764, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)
        );

        pack();
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
            java.util.logging.Logger.getLogger(Creation_sejour_nouveauPatient_DMA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Creation_sejour_nouveauPatient_DMA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Creation_sejour_nouveauPatient_DMA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Creation_sejour_nouveauPatient_DMA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Creation_sejour_nouveauPatient_DMA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
