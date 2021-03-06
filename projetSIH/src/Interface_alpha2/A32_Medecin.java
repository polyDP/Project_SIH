/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface_alpha2;

import SIH.Constantes;
import SIH.Date;
import SIH.MedecinPH;
import SIH.NumeroSejour;
import SIH.Patient;
import SIH.SQL;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Ludivine
 */
public class A32_Medecin extends javax.swing.JFrame {

    public Patient getPatient() {
        return patient;
    }

    /**
     * Creates new form Premiere_page_dma Appel à une méthode qui permet de
     * fermer l'application avec la croix en demandant l'autorisation à
     * l'utilisateur
     *
     * @param medecin
     * @param patient
     */
    public A32_Medecin(MedecinPH medecin, Patient patient) {
        this.medecin = medecin;
        this.patient = patient;
        dateJour = new Date();
        dateJour = dateJour.dateJour();
        Calendar calendrier = Calendar.getInstance();
        dateHeureJour = dateJour + " " + calendrier.get(Calendar.HOUR_OF_DAY) + ":" + calendrier.get(Calendar.MINUTE) + ":" + calendrier.get(Calendar.SECOND);
        initComponents();
        try {
            sql = new SQL();
            numeroSejour = sql.rechercherNumeroSejourPatient(patient.getIpp());

            jTextArea1.setText(sql.infoHistoriqueSejourPatient(patient, numeroSejour).infosSejour());

            constantes = sql.getConstantesInitialesPatientSejour(patient, numeroSejour);
            patient = sql.afficherTherapeutique(patient, numeroSejour);

            comboListePrescriptions = new DefaultComboBoxModel(sql.listePrescriptionsMedecinPH(patient, numeroSejour));
            comboListePrescriptions.insertElementAt("prescription a effectuer", 0);
            jComboBox2.setModel(comboListePrescriptions);
            jComboBox2.setSelectedIndex(0);

            comboListeObservations = new DefaultComboBoxModel(sql.listeObservationsMedecinPH(patient, numeroSejour));
            comboListeObservations.insertElementAt("Observations ", 0);
            jComboBox3.setModel(comboListeObservations);
            jComboBox3.setSelectedIndex(0);
            
             comboListeCrAnest = new DefaultComboBoxModel(sql.listeObservationsMedecinPH(patient, numeroSejour));
            comboListeCrAnest.insertElementAt("Compte rendu anesthesiste ", 0);
            jComboBox4.setModel(comboListeObservations);
            jComboBox4.setSelectedIndex(0);

            if (constantes.getTaille() != 0) {
                jTextField2.setText((taille.valueOf(constantes.getTaille())));
                jTextField2.setEditable(false);
            } else {
                jTextField2.setText("");
                jTextField2.setEditable(true);
            }
            if (constantes.getTension().equals(" / ")) {

                jFormattedTextField1.setText(tension.valueOf(constantes.getTension()));
                jFormattedTextField1.setEditable(false);
            } else {
                jFormattedTextField1.setText("");
                jFormattedTextField1.setEditable(true);
            }
            if (constantes.getPoids() != 0.0) {
                jTextField1.setText(poids.valueOf(constantes.getPoids()));
                jTextField1.setEditable(false);
            } else {

                jTextField1.setText("");
                jTextField1.setEditable(true);
            }
            if (constantes.getGlycemie() != 0.0) {
                jTextField6.setText(glycemie.valueOf(constantes.getGlycemie()));
                jTextField6.setEditable(false);
            } else {

                jTextField6.setText("");
                jTextField6.setEditable(true);
            }
            if (constantes.getTemperature() != 0.0) {
                jTextField4.setText(temperature.valueOf(constantes.getTemperature()));
                jTextField4.setEditable(false);
            } else {

                jTextField4.setText("");
                jTextField4.setEditable(true);
            }
            if (!constantes.getAutreSoins().isEmpty()) {
                jTextField5.setText(constantes.getAutreSoins());
                jTextField5.setEditable(false);
            } else {

                jTextField5.setText("");
                jTextField5.setEditable(true);
            }
            if (!patient.getAllergies().isEmpty()) {
                jTextField10.setText(patient.getAllergies());
                jTextField10.setEditable(false);
            } else {
                jTextField10.setText("");
                jTextField10.setEditable(true);
            }

            if (!patient.getTraitmentPersonnel().isEmpty()) {
                jTextField7.setText(patient.getTraitmentPersonnel());
                jTextField7.setEditable(false);
            } else {
                jTextField7.setText("");
                jTextField7.setEditable(true);
            }

            if (!patient.getRegimeAlimentaire().isEmpty()) {
                jTextField8.setText(patient.getRegimeAlimentaire());
                jTextField8.setEditable(false);

            } else {
                jTextField8.setText("");
                jTextField8.setEditable(true);
            }
            if (!sql.getLettreSortiePatient(numeroSejour).isEmpty()) {
                jTextArea5.setText(sql.getLettreSortiePatient(numeroSejour));
                jTextArea5.setEditable(false);
                jButton7.setVisible(false);
            } else {
                jTextArea5.setText("");
                jTextArea5.setEditable(true);
            }

        } catch (SQLException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(A12_DMA.class.getName()).log(Level.SEVERE, null, ex);

        } catch (NullPointerException e) {

        }

        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                JFrame frame = (JFrame) e.getSource();
                int result = JOptionPane.showConfirmDialog(
                        null,
                        "Etes-vous sûr de vouloir quitter Asclépios, Avez-vous tout enregistré ?",
                        "Quitter",
                        JOptionPane.YES_NO_OPTION);
                if (result == JOptionPane.YES_OPTION) {

                    System.exit(0);
                }

            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jPanel14 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jPanel15 = new javax.swing.JPanel();
        jTextField9 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jButton4 = new javax.swing.JButton();
        jComboBox3 = new javax.swing.JComboBox();
        jPanel10 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jPanel16 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextArea6 = new javax.swing.JTextArea();
        jComboBox4 = new javax.swing.JComboBox();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jButton7 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
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
        setTitle("DM patient PH");
        setBackground(new java.awt.Color(153, 204, 255));
        setBounds(new java.awt.Rectangle(200, 100, 0, 0));
        setExtendedState(10);
        setMinimumSize(new java.awt.Dimension(800, 600));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setMaximumSize(new java.awt.Dimension(800, 600));
        jPanel8.setMinimumSize(new java.awt.Dimension(500, 400));
        jPanel8.setPreferredSize(new java.awt.Dimension(800, 600));
        jPanel8.setLayout(new java.awt.BorderLayout());

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new java.awt.GridLayout(0, 3));

        jLabel4.setBackground(new java.awt.Color(153, 204, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("patient : "+patient.getNom()+ " "+patient.getPrenom());
        jPanel9.add(jLabel4);

        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText(dateJour.toString());
        jPanel9.add(jLabel30);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("identifiant : "+medecin.getNom()+" "+medecin.getPrenom());
        jPanel9.add(jLabel1);

        jPanel8.add(jPanel9, java.awt.BorderLayout.PAGE_START);

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(700, 532));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setEnabled(false);
        jPanel4.setPreferredSize(new java.awt.Dimension(500, 400));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Données Patient", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setPreferredSize(new java.awt.Dimension(500, 400));
        jPanel5.setLayout(new java.awt.GridLayout(3, 0));

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setLayout(new java.awt.GridLayout(3, 4, 10, 50));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Taille (en cm) :");
        jLabel2.setToolTipText("");
        jPanel13.add(jLabel2);

        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel13.add(jTextField2);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Tension (en cmHg) :");
        jLabel5.setToolTipText("");
        jPanel13.add(jLabel5);

        try {
            jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFormattedTextField1.setToolTipText("la tension doit etre au format ../.. \npar exemple 12/08");
        jPanel13.add(jFormattedTextField1);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Poids (en kg) :");
        jPanel13.add(jLabel3);

        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel13.add(jTextField1);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Glycémie (g/L) :");
        jPanel13.add(jLabel7);

        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jPanel13.add(jTextField6);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Température (en °C) :");
        jPanel13.add(jLabel6);

        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel13.add(jTextField4);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Autres :");
        jPanel13.add(jLabel8);

        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jPanel13.add(jTextField5);

        jPanel5.add(jPanel13);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setText("Traitement personnel : ");

        jLabel10.setText("Allergie(s) : ");

        jLabel11.setText("Régime alimentaire :");

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });

        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField7)
                    .addComponent(jTextField10)
                    .addComponent(jTextField8, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField7, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField10, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jPanel5.add(jPanel14);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));

        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });

        jLabel12.setText("Antécédents : ");

        jLabel13.setText("Diagnostic : ");

        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });

        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });

        jLabel14.setText("Motif d'hospitalisation :");

        jButton3.setText("Validation");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButton3))
                    .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextField12)
                        .addComponent(jTextField11)
                        .addComponent(jTextField9, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jTextField12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField11, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField9, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.add(jPanel15);

        jTabbedPane1.addTab("Visite d'arrivée", jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setPreferredSize(new java.awt.Dimension(500, 400));
        jPanel6.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jPanel6ComponentHidden(evt);
            }
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanel6ComponentShown(evt);
            }
        });

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jButton2.setText("Validation");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("Pensez à mettre vos prescriptions à jour régulièrement");

        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(92, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jButton2))
                    .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE))
                .addContainerGap(92, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jButton2)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Prescriptions", jPanel6);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setPreferredSize(new java.awt.Dimension(500, 400));

        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jScrollPane4.setViewportView(jTextArea4);

        jButton4.setText("Validation");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(237, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(238, 238, 238))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Observations", jPanel7);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setPreferredSize(new java.awt.Dimension(500, 400));
        jPanel10.setLayout(new java.awt.GridLayout(15, 0));

        jLabel16.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Heures");
        jLabel16.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel10.add(jLabel16);

        jLabel17.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Ajouter un soin");
        jLabel17.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel10.add(jLabel17);

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Minuit - 2 heures");
        jLabel18.setToolTipText("");
        jLabel18.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel10.add(jLabel18);

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel19.setToolTipText("Pr: prelevement" +"\n"+" Pd: poids"+" \n"+" Tp: température" +"\n"+" M: médicament" +"\n "+"A: autres"+ "\n"+ "G:glycemie" +"\n "+"Ts: tension");
        jLabel19.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });
        jPanel10.add(jLabel19);

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("2 heures - 4 heures");
        jLabel20.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel10.add(jLabel20);

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel21.setToolTipText("Pr: prelevement" +"\n"+" Pd: poids"+" \n"+" Tp: température" +"\n"+" M: médicament" +"\n "+"A: autres"+ "\n"+ "G:glycemie" +"\n "+"Ts: tension");
        jLabel21.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });
        jPanel10.add(jLabel21);

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("4 heures - 6 heures");
        jLabel22.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel10.add(jLabel22);

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel23.setToolTipText("Pr: prelevement" +"\n"+" Pd: poids"+" \n"+" Tp: température" +"\n"+" M: médicament" +"\n "+"A: autres"+ "\n"+ "G:glycemie" +"\n "+"Ts: tension");
        jLabel23.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
        });
        jPanel10.add(jLabel23);

        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("6 heures - 8 heures");
        jLabel24.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel10.add(jLabel24);

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel25.setToolTipText("Pr: prelevement" +"\n"+" Pd: poids"+" \n"+" Tp: température" +"\n"+" M: médicament" +"\n "+"A: autres"+ "\n"+ "G:glycemie" +"\n "+"Ts: tension");
        jLabel25.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel25MouseClicked(evt);
            }
        });
        jPanel10.add(jLabel25);

        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("8 heures - 10 heures");
        jLabel26.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel10.add(jLabel26);

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel27.setToolTipText("Pr: prelevement" +"\n"+" Pd: poids"+" \n"+" Tp: température" +"\n"+" M: médicament" +"\n "+"A: autres"+ "\n"+ "G:glycemie" +"\n "+"Ts: tension");
        jLabel27.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel27MouseClicked(evt);
            }
        });
        jPanel10.add(jLabel27);

        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("10 heures - 12 heures");
        jLabel32.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel10.add(jLabel32);

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel34.setToolTipText("Pr: prelevement" +"\n"+" Pd: poids"+" \n"+" Tp: température" +"\n"+" M: médicament" +"\n "+"A: autres"+ "\n"+ "G:glycemie" +"\n "+"Ts: tension");
        jLabel34.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel34MouseClicked(evt);
            }
        });
        jPanel10.add(jLabel34);

        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("12 heures - 14 heures");
        jLabel28.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel10.add(jLabel28);

        jLabel38.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel38.setToolTipText("Pr: prelevement" +"\n"+" Pd: poids"+" \n"+" Tp: température" +"\n"+" M: médicament" +"\n "+"A: autres"+ "\n"+ "G:glycemie" +"\n "+"Ts: tension");
        jLabel38.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel38MouseClicked(evt);
            }
        });
        jPanel10.add(jLabel38);

        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("14 heures - 16 heures");
        jLabel37.setToolTipText("");
        jLabel37.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel10.add(jLabel37);

        jLabel39.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel39.setToolTipText("Pr: prelevement" +"\n"+" Pd: poids"+" \n"+" Tp: température" +"\n"+" M: médicament" +"\n "+"A: autres"+ "\n"+ "G:glycemie" +"\n "+"Ts: tension");
        jLabel39.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel39.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel39MouseClicked(evt);
            }
        });
        jPanel10.add(jLabel39);

        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("16 heures - 18 heures");
        jLabel33.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel10.add(jLabel33);

        jLabel43.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel43.setToolTipText("Pr: prelevement" +"\n"+" Pd: poids"+" \n"+" Tp: température" +"\n"+" M: médicament" +"\n "+"A: autres"+ "\n"+ "G:glycemie" +"\n "+"Ts: tension");
        jLabel43.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel43.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel43MouseClicked(evt);
            }
        });
        jPanel10.add(jLabel43);

        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setText("18 heures - 20 heures");
        jLabel42.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel10.add(jLabel42);

        jLabel40.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel40.setToolTipText("Pr: prelevement" +"\n"+" Pd: poids"+" \n"+" Tp: température" +"\n"+" M: médicament" +"\n "+"A: autres"+ "\n"+ "G:glycemie" +"\n "+"Ts: tension");
        jLabel40.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel40MouseClicked(evt);
            }
        });
        jPanel10.add(jLabel40);

        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("20 heures - 22 heures");
        jLabel35.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel10.add(jLabel35);

        jLabel41.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel41.setToolTipText("Pr: prelevement" +"\n"+" Pd: poids"+" \n"+" Tp: température" +"\n"+" M: médicament" +"\n "+"A: autres"+ "\n"+ "G:glycemie" +"\n "+"Ts: tension");
        jLabel41.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel41MouseClicked(evt);
            }
        });
        jPanel10.add(jLabel41);

        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("22 heures - Minuit");
        jLabel36.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel10.add(jLabel36);

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel29.setToolTipText("Pr: prelevement" +"\n"+" Pd: poids"+" \n"+" Tp: température" +"\n"+" M: médicament" +"\n "+"A: autres"+ "\n"+ "G:glycemie" +"\n "+"Ts: tension");
        jLabel29.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel29MouseClicked(evt);
            }
        });
        jPanel10.add(jLabel29);

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        jPanel10.add(jPanel17);

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        jPanel10.add(jPanel18);

        jButton5.setText("Jour précédent");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton5);

        jButton6.setText("Jour suivant");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton6);

        jTabbedPane1.addTab("Suivi", jPanel10);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setPreferredSize(new java.awt.Dimension(500, 400));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "résultats" }));

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Nous ne pouvons pas voir les images des résultats (imagerie, biologie) dans cette version du logiciel.\n Cette fonction sera implémentée dans des versions ultérieures");

        jTextArea3.setEditable(false);
        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane5.setViewportView(jTextArea3);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox1, 0, 250, Short.MAX_VALUE)
                    .addComponent(jScrollPane5)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Résultats", jPanel11);

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setPreferredSize(new java.awt.Dimension(500, 400));

        jTextArea6.setEditable(false);
        jTextArea6.setColumns(20);
        jTextArea6.setRows(5);
        jScrollPane7.setViewportView(jTextArea6);

        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(242, 242, 242)
                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Compte-rendu Anesthésie", jPanel16);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setPreferredSize(new java.awt.Dimension(500, 400));

        jTextArea5.setColumns(20);
        jTextArea5.setRows(5);
        jScrollPane6.setViewportView(jTextArea5);

        jButton7.setText("Validation");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(235, 235, 235)
                .addComponent(jButton7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Lettre de sortie", jPanel12);

        jPanel8.add(jTabbedPane1, java.awt.BorderLayout.CENTER);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.GridLayout(0, 1));
        jPanel8.add(jPanel1, java.awt.BorderLayout.LINE_START);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Sortie du dossier");
        jButton1.setToolTipText("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);

        jPanel8.add(jPanel2, java.awt.BorderLayout.PAGE_END);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 532, Short.MAX_VALUE)
        );

        jPanel8.add(jPanel3, java.awt.BorderLayout.LINE_END);

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));

        jMenu1.setText("Fichier");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Déconnecter");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Imprimer");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edition");

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Tout sélectionner");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Paramètres");

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setText("Changer le mot de passe");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Aide");
        jMenu4.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu4MenuSelected(evt);
            }
        });
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
     * changement du mot de passe à partir du menu
     *
     * @param evt
     */
    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        Changer_mdp mdp = new Changer_mdp();

        mdp.setVisible(true);
        JOptionPane.showConfirmDialog(null, "la fonction n’est pas encore implémentée dans cette version ", " information ", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
        if (JOptionPane.INFORMATION_MESSAGE == 1) {
            mdp.dispose();

        }

    }//GEN-LAST:event_jMenuItem4ActionPerformed
    /**
     *
     * @param evt
     */
    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed
    /**
     *
     * @param evt
     */
    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12ActionPerformed

    /**
     * retour à la première page du médecin avec demande de confirmation
     *
     * @param evt
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        A31_Medecin fenetre31 = new A31_Medecin(medecin);
        int response = JOptionPane.showConfirmDialog(null, "Etes-vous sûr d'avoir tout validé?", "Confirmer",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.YES_OPTION) {
            fenetre31.setVisible(true);
            this.dispose();
        }

    }//GEN-LAST:event_jButton1ActionPerformed
    /**
     * Permet d'ouvrir la page d'ajout d'un soin, cette page ayant pour nom
     * ajout d'un soin + heure pour ne pas se tromper
     *
     * @param evt
     */
    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        Ajout_soins_suivi fenetre = new Ajout_soins_suivi(jLabel19);
        tension = jFormattedTextField1.getText();
        poids = jTextField1.getText();
        glycemie = jTextField6.getText();
        temperature = jTextField4.getText();
        autres = jTextField5.getText();
        fenetre.setVisible(true);
        fenetre.setTitle("Ajout d'un soin: Minuit - 2 heures");


    }//GEN-LAST:event_jLabel19MouseClicked
    /**
     * Permet d'ouvrir la page d'ajout d'un soin, cette page ayant pour nom
     * ajout d'un soin + heure pour ne pas se tromper
     *
     * @param evt
     */
    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        Ajout_soins_suivi fenetre = new Ajout_soins_suivi(jLabel21);
        fenetre.setVisible(true);
        fenetre.setTitle("Ajout d'un soin: 2 heures - 4 heures");
    }//GEN-LAST:event_jLabel21MouseClicked
    /**
     * Permet d'ouvrir la page d'ajout d'un soin, cette page ayant pour nom
     * ajout d'un soin + heure pour ne pas se tromper
     *
     * @param evt
     */
    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
        Ajout_soins_suivi fenetre = new Ajout_soins_suivi(jLabel23);
        fenetre.setVisible(true);
        fenetre.setTitle("Ajout d'un soin: 4 heures - 6 heures");
    }//GEN-LAST:event_jLabel23MouseClicked
    /**
     * Permet d'ouvrir la page d'ajout d'un soin, cette page ayant pour nom
     * ajout d'un soin + heure pour ne pas se tromper
     *
     * @param evt
     */
    private void jLabel25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseClicked
        Ajout_soins_suivi fenetre = new Ajout_soins_suivi(jLabel25);
        fenetre.setVisible(true);
        fenetre.setTitle("Ajout d'un soin: 6 heures - 8 heures");
    }//GEN-LAST:event_jLabel25MouseClicked
    /**
     * Permet d'ouvrir la page d'ajout d'un soin, cette page ayant pour nom
     * ajout d'un soin + heure pour ne pas se tromper
     *
     * @param evt
     */
    private void jLabel27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseClicked
        Ajout_soins_suivi fenetre = new Ajout_soins_suivi(jLabel27);
        fenetre.setVisible(true);
        fenetre.setTitle("Ajout d'un soin: 8 heures - 10 heures");
    }//GEN-LAST:event_jLabel27MouseClicked
    /**
     * Permet d'ouvrir la page d'ajout d'un soin, cette page ayant pour nom
     * ajout d'un soin + heure pour ne pas se tromper
     *
     * @param evt
     */
    private void jLabel34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel34MouseClicked
        Ajout_soins_suivi fenetre = new Ajout_soins_suivi(jLabel34);
        fenetre.setVisible(true);
        fenetre.setTitle("Ajout d'un soin: 10 heures - 12 heures");
    }//GEN-LAST:event_jLabel34MouseClicked
    /**
     * Permet d'ouvrir la page d'ajout d'un soin, cette page ayant pour nom
     * ajout d'un soin + heure pour ne pas se tromper
     *
     * @param evt
     */
    private void jLabel38MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel38MouseClicked
        Ajout_soins_suivi fenetre = new Ajout_soins_suivi(jLabel38);
        fenetre.setVisible(true);
        fenetre.setTitle("Ajout d'un soin: 12 heures - 14 heures");
    }//GEN-LAST:event_jLabel38MouseClicked
    /**
     * Permet d'ouvrir la page d'ajout d'un soin, cette page ayant pour nom
     * ajout d'un soin + heure pour ne pas se tromper
     *
     * @param evt
     */
    private void jLabel39MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel39MouseClicked
        Ajout_soins_suivi fenetre = new Ajout_soins_suivi(jLabel39);
        fenetre.setVisible(true);
        fenetre.setTitle("Ajout d'un soin: 14 heures - 16 heures");
    }//GEN-LAST:event_jLabel39MouseClicked
    /**
     * Permet d'ouvrir la page d'ajout d'un soin, cette page ayant pour nom
     * ajout d'un soin + heure pour ne pas se tromper
     *
     * @param evt
     */
    private void jLabel43MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel43MouseClicked
        Ajout_soins_suivi fenetre = new Ajout_soins_suivi(jLabel43);
        fenetre.setVisible(true);
        fenetre.setTitle("Ajout d'un soin: 16 heures - 18 heures");
    }//GEN-LAST:event_jLabel43MouseClicked
    /**
     * Permet d'ouvrir la page d'ajout d'un soin, cette page ayant pour nom
     * ajout d'un soin + heure pour ne pas se tromper
     *
     * @param evt
     */
    private void jLabel40MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel40MouseClicked
        Ajout_soins_suivi fenetre = new Ajout_soins_suivi(jLabel40);
        fenetre.setVisible(true);
        fenetre.setTitle("Ajout d'un soin: 18 heures - 20 heures");
    }//GEN-LAST:event_jLabel40MouseClicked
    /**
     * Permet d'ouvrir la page d'ajout d'un soin, cette page ayant pour nom
     * ajout d'un soin + heure pour ne pas se tromper
     *
     * @param evt
     */
    private void jLabel41MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel41MouseClicked
        Ajout_soins_suivi fenetre = new Ajout_soins_suivi(jLabel41);
        fenetre.setVisible(true);
        fenetre.setTitle("Ajout d'un soin: 20 heures - 22 heures");
    }//GEN-LAST:event_jLabel41MouseClicked
    /**
     * Permet d'ouvrir la page d'ajout d'un soin, cette page ayant pour nom
     * ajout d'un soin + heure pour ne pas se tromper
     *
     * @param evt
     */
    private void jLabel29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel29MouseClicked
        Ajout_soins_suivi fenetre = new Ajout_soins_suivi(jLabel29);
        fenetre.setVisible(true);
        fenetre.setTitle("Ajout d'un soin: 22 heures - Minuit");
    }//GEN-LAST:event_jLabel29MouseClicked
    /**
     * Permet de se déconnecter, retour sur la page d'accueil à partir du menu
     *
     * @param evt
     */
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        A0_Accueil a0 = new A0_Accueil();
        a0.setVisible(true);
        this.dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        taille = jTextField2.getText();
        if (taille.length() != 0) {
            try {
                if (Integer.parseInt(taille) < 10 || Integer.parseInt(taille) > 3000) {
                    JOptionPane.showConfirmDialog(null, "ce n'est pas le bon format; la taille doit être comprise entre 10 et 300 cm  ", " information ", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showConfirmDialog(null, "ce n'est pas le bon format; la taille doit être comprise entre 10 et 300 cm  ", " information ", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);

            }

        }

    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        poids = jTextField1.getText();
        if (poids.length() != 0) {
            try {
                if (Integer.parseInt(poids) < 0 || Integer.parseInt(poids) > 1000) {
                    JOptionPane.showConfirmDialog(null, "ce n'est pas le bon format; le poids doit être comprise entre 0 et 1000 kg  ", " information ", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);

                }
            } catch (NumberFormatException e) {
                JOptionPane.showConfirmDialog(null, "ce n'est pas le bon format; le poids doit être comprise entre 0 et 1000 kg  ", " information ", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);

            }
        }

    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        glycemie = jTextField6.getText();
        if (glycemie.length() != 0) {
            try {
                if (Float.parseFloat(glycemie) < 0.2 || Float.parseFloat(glycemie) > 20) {
                    JOptionPane.showConfirmDialog(null, "ce n'est pas le bon format; la glycemie doit être comprise entre 0,2 et 20 g/L ", " information ", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);

                }
            } catch (NumberFormatException e) {
                JOptionPane.showConfirmDialog(null, "ce n'est pas le bon format; la glycemie doit être comprise entre 0,2 et 20 g/L  ", " information ", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);

            }

        }

    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        temperature = jTextField4.getText();
        if (jTextField2.getText().length() != 0) {
            try {
                if (Float.parseFloat(temperature) < 33 || Float.parseFloat(temperature) > 45) {
                    JOptionPane.showConfirmDialog(null, "ce n'est pas le bon format; la température doit être comprise entre 33 et 45 °C  ", " information ", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);

                }
            } catch (NumberFormatException e) {
                JOptionPane.showConfirmDialog(null, "ce n'est pas le bon format; la température doit être comprise entre 33 et 45 °C  ", " information ", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
            }
        }

    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        boolean a1 = true;
        boolean a2 = true;
        boolean a3 = true;
        boolean a4 = true;
        boolean a5 = true;
        boolean a6 = true;
        boolean a7 = true;
        taille = jTextField2.getText();
        tension = jFormattedTextField1.getText();
        poids = jTextField1.getText();
        glycemie = jTextField6.getText();
        temperature = jTextField4.getText();
        autres = jTextField5.getText();
        traitement = jTextField7.getText();
        allergie = jTextField10.getText();
        regime = jTextField8.getText();
        motif = jTextField12.getText();
        diagnostic = jTextField11.getText();
        antecedent = jTextField9.getText();

        if (temperature.length() != 0) {
            try {
                if (Double.parseDouble(temperature) < 33 || Double.parseDouble(temperature) > 45) {
                    JOptionPane.showConfirmDialog(null, "ce n'est pas le bon format; la température doit être comprise entre 33 et 45 °C  ", " information ", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
                    a1 = false;
                } else {

                    a1 = true;
                    temperatureD = Double.parseDouble(temperature);

                }
            } catch (NumberFormatException e) {
                JOptionPane.showConfirmDialog(null, "ce n'est pas le bon format; la température doit être comprise entre 33 et 45 °C  ", " information ", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
                a1 = false;
            }
        }
        if (poids.length() != 0) {
            try {
                if (Double.parseDouble(poids) < 0 || Double.parseDouble(poids) > 1000) {
                    JOptionPane.showConfirmDialog(null, "ce n'est pas le bon format; le poids doit être comprise entre 0 et 1000 kg  ", " information ", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);

                    a2 = false;
                } else {

                    a2 = true;
                    poidsD = Double.parseDouble(poids);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showConfirmDialog(null, "ce n'est pas le bon format; le poids doit être comprise entre 0 et 1000 kg  ", " information ", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
                a2 = false;

            }
        }
        if (glycemie.length() != 0) {
            try {
                if (Double.parseDouble(glycemie) < 0.2 || Double.parseDouble(glycemie) > 20) {
                    JOptionPane.showConfirmDialog(null, "ce n'est pas le bon format; la glycemie doit être comprise entre 0,2 et 20 g/L ", " information ", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
                    a2 = false;
                } else {

                    a2 = true;
                    glycemieD = Double.parseDouble(glycemie);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showConfirmDialog(null, "ce n'est pas le bon format; la glycemie doit être comprise entre 0,2 et 20 g/L  ", " information ", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);

            }

        }
        if (taille.length() != 0) {
            try {
                if (Integer.parseInt(taille) < 10 || Integer.parseInt(taille) > 300) {
                    JOptionPane.showConfirmDialog(null, "ce n'est pas le bon format; la taille doit être comprise entre 10 et 300 cm  ", " information ", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
                    a4 = false;
                } else {

                    a4 = true;
                    tailleI = Integer.parseInt(taille);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showConfirmDialog(null, "ce n'est pas le bon format; la taille doit être comprise entre 10 et 300 cm  ", " information ", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);

            }

        }
        if (!taille.isEmpty() || !poids.isEmpty() || !temperature.isEmpty() || !glycemie.isEmpty() || !taille.isEmpty() || !autres.isEmpty()) {
            a7 = true;
        } else {
            a7 = false;

        }

        if (!allergie.isEmpty() || !regime.isEmpty() || !traitement.isEmpty()) {
            a5 = true;
        } else {
            a5 = false;

        }
        if (!motif.isEmpty() || !diagnostic.isEmpty() || !antecedent.isEmpty()) {
            a6 = true;
        } else {
            a6 = false;

        }
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);
        System.out.println(a5);
        System.out.println(a6);

        //if (taille.isEmpty() || poids.isEmpty() || tension.isEmpty() || glycemie.isEmpty() && temperature.isEmpty() && autres.isEmpty() &&   motif.isEmpty() && diagnostic.isEmpty() && antecedent.isEmpty()) {
        patient.setAllergies(allergie);
        patient.setRegimeAlimentaire(regime);
        patient.setTraitmentPersonnel(traitement);

        if (a1 == true && a2 == true && a3 == true && a4 == true && a7 == true) {
            constantes = new Constantes(tailleI, poidsD, tension, glycemieD, temperatureD, autres);
            if (!jFormattedTextField1.isEditable() || !jTextField2.isEditable() || !jTextField4.isEditable() || !jTextField5.isEditable() || !jTextField6.isEditable() || !jTextField1.isEditable()) {
                sql.ajouterSoinsArriveeMiseAJour(patient, numeroSejour, medecin, dateJour, constantes);
                if (sql.getErr() != 1) {
                JOptionPane.showMessageDialog(null, "les constantes ont bien été actualisees", "information", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                sql.ajouterSoinsArrivee(patient, numeroSejour, medecin, dateJour, constantes);
                if (sql.getErr() != 1) {
                JOptionPane.showMessageDialog(null, "les constantes ont bien été validées", "information", JOptionPane.WARNING_MESSAGE);
                }
            }

        }
        if (a5 == true) {

            if (!jTextField7.isEditable() || !jTextField10.isEditable() || !jTextField8.isEditable()) {
                sql.ajouterTherapeutiqueMiseAJour(patient, numeroSejour);
                if (sql.getErr() != 1) {
                JOptionPane.showMessageDialog(null, "la thérapeutique été  actualise", "information", JOptionPane.WARNING_MESSAGE);
            }

            } else {

                sql.ajouterTherapeutique(patient, numeroSejour);
                if (sql.getErr() != 1) {
                JOptionPane.showMessageDialog(null, "la thérapeutique été actualisee", "information", JOptionPane.WARNING_MESSAGE);
            }
            }
            
            if (a6 == true) {

            }
        } else {

            JOptionPane.showMessageDialog(null, "un des champs n'est pas valide, veuillez remplir au moins un champ des 3 groupes", "information", JOptionPane.WARNING_MESSAGE);
        }


    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        JOptionPane.showConfirmDialog(null, " la fonction n’est pas encore implémentée dans cette version ", " information ", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        JOptionPane.showConfirmDialog(null, " la fonction n’est pas encore implémentée dans cette version ", " information ", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Calendar calendrier = Calendar.getInstance();
        String heure = calendrier.get(Calendar.HOUR_OF_DAY) + ":" + calendrier.get(Calendar.MINUTE) + ":" + calendrier.get(Calendar.SECOND);

        dateHeureJour = dateJour + " " + heure;

        sql.ajouterPrescriptionPH(patient, numeroSejour, medecin, dateHeureJour, jTextArea2.getText());
        if (sql.getErr() != 1) {
            JOptionPane.showMessageDialog(null, "la prescription a bien été validée", "information", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Calendar calendrier = Calendar.getInstance();
        String heure = calendrier.get(Calendar.HOUR_OF_DAY) + ":" + calendrier.get(Calendar.MINUTE) + ":" + calendrier.get(Calendar.SECOND);

        dateHeureJour = dateJour + " " + heure;

        sql.ajouterObservationPH(patient, numeroSejour, medecin, dateHeureJour, jTextArea4.getText());
        if (sql.getErr() != 1) {
            JOptionPane.showMessageDialog(null, "les observations ont bien été validées", "information", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        sql.ajouterLettreSortie(patient, numeroSejour, medecin, dateJour, jTextArea5.getText());
        if (sql.getErr() != 1) {
            JOptionPane.showMessageDialog(null, "la lettre de sortie a bien été validée, elle ne pourra plus etre modifiee", "information", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        JOptionPane.showConfirmDialog(null, "la fonction n’est pas encore implémentée dans cette version ", " information ", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        JOptionPane.showConfirmDialog(null, "la fonction n’est pas encore implémentée dans cette version ", " information ", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenu4MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu4MenuSelected
        JOptionPane.showConfirmDialog(null, "la fonction n’est pas encore implémentée dans cette version ", " information ", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jMenu4MenuSelected

    private void jPanel6ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel6ComponentHidden
        comboListePrescriptions = new DefaultComboBoxModel(sql.listePrescriptionsMedecinPH(patient, numeroSejour));
        comboListePrescriptions.insertElementAt("prescription du moment", 0);
        jComboBox2.setModel(comboListePrescriptions);
        if (!jTextArea2.getText().isEmpty()) {
            JOptionPane.showConfirmDialog(null, "avez vous validé votre prescription ?", " information ", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jPanel6ComponentHidden

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        if (jComboBox2.getSelectedIndex() != 0) {
            String val;
            val = jComboBox2.getSelectedItem().toString();
            String[] splited = val.split("\\s");
            String datePrescri = splited[0];
            String heurePrescri = splited[1];

            String dateHeurePrescri = datePrescri + " " + heurePrescri;
            jTextArea2.setText(sql.getPrescriptionsPatient(patient, numeroSejour, dateHeurePrescri));
            jTextArea2.repaint();
            jTextArea2.revalidate();

            jTextArea2.setEditable(false);
            jButton2.setVisible(false);

        } else {
            jTextArea2.setEditable(true);
            jButton2.setVisible(true);
        }
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jPanel6ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel6ComponentShown

        comboListePrescriptions = new DefaultComboBoxModel(sql.listePrescriptionsMedecinPH(patient, numeroSejour));
        comboListePrescriptions.insertElementAt("prescription du moment", 0);
        jComboBox2.setModel(comboListePrescriptions);
        jComboBox2.setSelectedIndex(0);
    }//GEN-LAST:event_jPanel6ComponentShown

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        if (jComboBox3.getSelectedIndex() != 0) {
            String val;
            val = jComboBox3.getSelectedItem().toString();
            String[] splited = val.split("\\s");
            String dateObs = splited[0];
            String heureObs = splited[1];

            String dateHeureObs = dateObs + " " + heureObs;
            jTextArea4.setText(sql.getObservationsPatient(patient, numeroSejour, dateHeureObs));
            jTextArea4.repaint();
            jTextArea4.revalidate();

            jTextArea4.setEditable(false);
            jButton4.setVisible(false);
        } else {
            jTextArea4.setEditable(true);
            jButton4.setVisible(true);
        }
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        if (jComboBox4.getSelectedIndex() != 0) {
            String val;
            val = jComboBox4.getSelectedItem().toString();
            String[] splited = val.split("\\s");
            String dateObs = splited[0];
            String heureObs = splited[1];

            String dateHeureObs = dateObs + " " + heureObs;
            jTextArea6.setText(sql.getObservationsPatient(patient, numeroSejour, dateHeureObs));
            jTextArea6.repaint();
            jTextArea6.revalidate();

            jTextArea6.setEditable(false);
            jButton6.setVisible(false);
        } else {
            jTextArea6.setEditable(true);
            jButton6.setVisible(true);
        }
    }//GEN-LAST:event_jComboBox4ActionPerformed

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
            java.util.logging.Logger.getLogger(A32_Medecin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(A32_Medecin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(A32_Medecin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(A32_Medecin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new A32_Medecin().setVisible(true);
            }
        });
    }
    private DefaultComboBoxModel comboListeCrAnest;
    private DefaultComboBoxModel comboListeObservations;
    private DefaultComboBoxModel comboListePrescriptions;
    private NumeroSejour numeroSejour;
    private Constantes constantes;
    private SQL sql = null;
    private Patient patient;
    private MedecinPH medecin;
    private Date dateJour;
    private String taille;
    private String tension;
    private String poids;
    private String glycemie;
    private String temperature;
    private String autres;
    private int tailleI;
    private double poidsD;
    private double glycemieD;
    private double temperatureD;
    private String dateHeureJour;
    private String traitement;
    private String allergie;
    private String regime;
    private String motif;
    private String diagnostic;
    private String antecedent;
    private String medicament;


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
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
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextArea jTextArea6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
