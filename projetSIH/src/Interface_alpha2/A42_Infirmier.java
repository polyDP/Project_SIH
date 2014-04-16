/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface_alpha2;

import SIH.Constantes;
import SIH.Date;
import SIH.Infirmiere;
import SIH.NumeroSejour;
import SIH.Patient;
import SIH.SQL;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Ludivine
 */
public class A42_Infirmier extends javax.swing.JFrame {

    /**
     * Creates new form Premiere_page_dma
     *
     */
    public A42_Infirmier(Infirmiere inf, Patient patient) {

        dateJour = new Date();
        dateJour = dateJour.dateJour();
        this.patient = patient;
        this.inf = inf;
        initComponents();
        try {
            sql = new SQL();

            jTextArea1.setText(sql.infoHistoriqueSejourPatient(patient, sql.rechercherNumeroSejourPatient(patient.getIpp())).infosSejour());
            numSej = sql.rechercherNumeroSejourPatient(patient.getIpp());
            constantes = sql.getConstantesInitialesPatientSejour(patient, numSej);
            patient = sql.afficherTherapeutique(patient, numSej);
            comboListePrescriptions = new DefaultComboBoxModel(sql.listePrescriptionsMedecinPH(patient, numSej));
            comboListePrescriptions.insertElementAt("Prescriptions ", 0);
            jComboBox1.setModel(comboListePrescriptions);
            jComboBox1.setSelectedIndex(0);
            

        
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
        jLabel15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
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
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jComboBox1 = new javax.swing.JComboBox();
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
        setTitle("DM patient Infirmier");
        setBackground(new java.awt.Color(153, 204, 255));
        setBounds(new java.awt.Rectangle(200, 100, 0, 0));
        setExtendedState(10);
        setMinimumSize(new java.awt.Dimension(800, 600));
        setResizable(false);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setPreferredSize(new java.awt.Dimension(500, 500));
        jPanel8.setLayout(new java.awt.BorderLayout());

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new java.awt.GridLayout(0, 3));

        jLabel4.setBackground(new java.awt.Color(153, 204, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("patient : "+patient.getNom()+ " "+patient.getPrenom());
        jPanel9.add(jLabel4);

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText(dateJour.toString());
        jPanel9.add(jLabel15);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("identifiant : "+inf.getNom()+" "+inf.getPrenom());
        jPanel9.add(jLabel1);

        jPanel8.add(jPanel9, java.awt.BorderLayout.PAGE_START);

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

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane1.setMinimumSize(new java.awt.Dimension(0, 0));
        jTabbedPane1.setName(""); // NOI18N
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(500, 400));

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
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
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
        jPanel13.add(jTextField1);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Glycémie (g/L) :");
        jPanel13.add(jLabel7);

        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel13.add(jTextField6);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Température (en °C) :");
        jPanel13.add(jLabel6);

        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel13.add(jTextField4);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Autres :");
        jPanel13.add(jLabel8);

        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
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

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField7)
                    .addComponent(jTextField10)
                    .addComponent(jTextField8, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField7, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField10, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField8, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.add(jPanel14);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));

        jTextField9.setEditable(false);

        jLabel12.setText("Antécédents : ");

        jLabel13.setText("Diagnostic : ");

        jTextField11.setEditable(false);

        jTextField12.setEditable(false);
        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });

        jLabel14.setText("Motif d'hospitalisation :");

        jButton3.setText("validation");
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
                .addContainerGap(140, Short.MAX_VALUE)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextField12)
                        .addComponent(jTextField11)
                        .addComponent(jTextField9, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)))
                .addContainerGap(140, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField12, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField11, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jTextField9, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                        .addGap(10, 10, 10)
                        .addComponent(jButton3))
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel5.add(jPanel15);

        jTabbedPane1.addTab("Visite d'arrivée", jPanel5);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setMinimumSize(new java.awt.Dimension(200, 300));
        jPanel10.setName(""); // NOI18N
        jPanel10.setOpaque(false);
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
            .addGap(0, 328, Short.MAX_VALUE)
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
            .addGap(0, 328, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        jPanel10.add(jPanel18);

        jButton5.setText("Jour précédent");
        jPanel10.add(jButton5);

        jButton6.setText("Jour suivant");
        jPanel10.add(jButton6);

        jTabbedPane1.addTab("Suivi", jPanel10);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jComboBox1.setToolTipText("");
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(295, 295, 295)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Prescriptions PH", jPanel6);

        jPanel8.add(jTabbedPane1, java.awt.BorderLayout.CENTER);

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
            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 856, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
     * Changement de mot de passe à partir du menu
     *
     * @param evt
     */
    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        Changer_mdp mdp = new Changer_mdp();
        if (!mdp.isVisible()) {
            mdp.setVisible(true);
            JOptionPane.showConfirmDialog(null, "la fonction n’est pas encore implémentée dans cette version ", " information ", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
            if (JOptionPane.INFORMATION_MESSAGE == 1) {
                mdp.dispose();
            }
        }

    }//GEN-LAST:event_jMenuItem4ActionPerformed
    /**
     *
     * @param evt
     */
    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12ActionPerformed
    /**
     *
     * @param evt
     */
    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed
    /**
     * Permet d'ouvrir la page d'ajout d'un soin, cette page ayant pour nom
     * ajout d'un soin + heure pour ne pas se tromper
     *
     * @param evt
     */
    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        Ajout_soins_suivi fenetre = new Ajout_soins_suivi(jLabel19);
        if (!fenetre.isVisible()) {
            fenetre.setTitle("Ajout d'un soin: Minuit - 2 heures");
            fenetre.setVisible(true);
        }
    }//GEN-LAST:event_jLabel19MouseClicked
    /**
     * Permet d'ouvrir la page d'ajout d'un soin, cette page ayant pour nom
     * ajout d'un soin + heure pour ne pas se tromper
     *
     * @param evt
     */
    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        Ajout_soins_suivi fenetre = new Ajout_soins_suivi(jLabel21);
        if (!fenetre.isVisible()) {
            fenetre.setVisible(true);
            fenetre.setTitle("Ajout d'un soin: 2 heures - 4 heures");
        }
    }//GEN-LAST:event_jLabel21MouseClicked
    /**
     * Permet d'ouvrir la page d'ajout d'un soin, cette page ayant pour nom
     * ajout d'un soin + heure pour ne pas se tromper
     *
     * @param evt
     */
    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
        Ajout_soins_suivi fenetre = new Ajout_soins_suivi(jLabel23);
        if (!fenetre.isVisible()) {
            fenetre.setVisible(true);
            fenetre.setTitle("Ajout d'un soin: 4 heures - 6 heures");
        }
    }//GEN-LAST:event_jLabel23MouseClicked
    /**
     * Permet d'ouvrir la page d'ajout d'un soin, cette page ayant pour nom
     * ajout d'un soin + heure pour ne pas se tromper
     *
     * @param evt
     */
    private void jLabel25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseClicked
        Ajout_soins_suivi fenetre = new Ajout_soins_suivi(jLabel25);
        if (!fenetre.isVisible()) {
            fenetre.setVisible(true);
            fenetre.setTitle("Ajout d'un soin: 6 heures - 8 heures");
        }
    }//GEN-LAST:event_jLabel25MouseClicked
    /**
     * Permet d'ouvrir la page d'ajout d'un soin, cette page ayant pour nom
     * ajout d'un soin + heure pour ne pas se tromper
     *
     * @param evt
     */
    private void jLabel27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseClicked
        Ajout_soins_suivi fenetre = new Ajout_soins_suivi(jLabel27);
        if (!fenetre.isVisible()) {
            fenetre.setVisible(true);
            fenetre.setTitle("Ajout d'un soin: 8 heures - 10 heures");
        }
    }//GEN-LAST:event_jLabel27MouseClicked
    /**
     * Permet d'ouvrir la page d'ajout d'un soin, cette page ayant pour nom
     * ajout d'un soin + heure pour ne pas se tromper
     *
     * @param evt
     */
    private void jLabel34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel34MouseClicked
        Ajout_soins_suivi fenetre = new Ajout_soins_suivi(jLabel34);
        if (!fenetre.isVisible()) {
            fenetre.setVisible(true);
            fenetre.setTitle("Ajout d'un soin: 10 heures - 12 heures");
        }
    }//GEN-LAST:event_jLabel34MouseClicked
    /**
     * Permet d'ouvrir la page d'ajout d'un soin, cette page ayant pour nom
     * ajout d'un soin + heure pour ne pas se tromper
     *
     * @param evt
     */
    private void jLabel38MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel38MouseClicked
        Ajout_soins_suivi fenetre = new Ajout_soins_suivi(jLabel38);
        if (!fenetre.isVisible()) {
            fenetre.setVisible(true);
            fenetre.setTitle("Ajout d'un soin: 12 heures - 14 heures");
        }
    }//GEN-LAST:event_jLabel38MouseClicked
    /**
     * Permet d'ouvrir la page d'ajout d'un soin, cette page ayant pour nom
     * ajout d'un soin + heure pour ne pas se tromper
     *
     * @param evt
     */
    private void jLabel39MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel39MouseClicked
        Ajout_soins_suivi fenetre = new Ajout_soins_suivi(jLabel39);
        if (!fenetre.isVisible()) {
            fenetre.setVisible(true);
            fenetre.setTitle("Ajout d'un soin: 14 heures - 16 heures");
        }
    }//GEN-LAST:event_jLabel39MouseClicked
    /**
     * Permet d'ouvrir la page d'ajout d'un soin, cette page ayant pour nom
     * ajout d'un soin + heure pour ne pas se tromper
     *
     * @param evt
     */
    private void jLabel43MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel43MouseClicked
        Ajout_soins_suivi fenetre = new Ajout_soins_suivi(jLabel43);
        if (!fenetre.isVisible()) {
            fenetre.setVisible(true);
            fenetre.setTitle("Ajout d'un soin: 16 heures - 18 heures");
        }
    }//GEN-LAST:event_jLabel43MouseClicked
    /**
     * Permet d'ouvrir la page d'ajout d'un soin, cette page ayant pour nom
     * ajout d'un soin + heure pour ne pas se tromper
     *
     * @param evt
     */
    private void jLabel40MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel40MouseClicked
        Ajout_soins_suivi fenetre = new Ajout_soins_suivi(jLabel40);
        if (!fenetre.isVisible()) {
            fenetre.setVisible(true);
            fenetre.setTitle("Ajout d'un soin: 18 heures - 20 heures");
        }
    }//GEN-LAST:event_jLabel40MouseClicked
    /**
     * Permet d'ouvrir la page d'ajout d'un soin, cette page ayant pour nom
     * ajout d'un soin + heure pour ne pas se tromper
     *
     * @param evt
     */
    private void jLabel41MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel41MouseClicked
        Ajout_soins_suivi fenetre = new Ajout_soins_suivi(jLabel41);
        if (!fenetre.isVisible()) {
            fenetre.setVisible(true);
            fenetre.setTitle("Ajout d'un soin: 20 heures - 22 heures");
        }
    }//GEN-LAST:event_jLabel41MouseClicked
    /**
     * Permet d'ouvrir la page d'ajout d'un soin, cette page ayant pour nom
     * ajout d'un soin + heure pour ne pas se tromper
     *
     * @param evt
     */
    private void jLabel29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel29MouseClicked
        Ajout_soins_suivi fenetre = new Ajout_soins_suivi(jLabel29);
        if (!fenetre.isVisible()) {
            fenetre.setVisible(true);
            fenetre.setTitle("Ajout d'un soin: 22 heures - Minuit");
        }
    }//GEN-LAST:event_jLabel29MouseClicked
    /**
     * déconnexion, retour à la première page avec le menu
     *
     * @param evt
     */
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        A0_Accueil a0 = new A0_Accueil();
        a0.setVisible(true);
        this.dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
                sql.ajouterSoinsArriveeMiseAJour(patient, numSej, inf, dateJour, constantes);
                if (sql.getErr() != 1) {
                JOptionPane.showMessageDialog(null, "les constantes ont bien été actualisees", "information", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                sql.ajouterSoinsArrivee(patient, numSej, inf, dateJour, constantes);
                if (sql.getErr() != 1) {
                JOptionPane.showMessageDialog(null, "les constantes ont bien été validées", "information", JOptionPane.WARNING_MESSAGE);
                }
            }

        }
        if (a5 == true) {

            if (!jTextField7.isEditable() || !jTextField10.isEditable() || !jTextField8.isEditable()) {
                sql.ajouterTherapeutiqueMiseAJour(patient, numSej);
                if (sql.getErr() != 1) {
                JOptionPane.showMessageDialog(null, "la thérapeutique été validée", "information", JOptionPane.WARNING_MESSAGE);
            }

            } else {

                sql.ajouterTherapeutique(patient, numSej);
                if (sql.getErr() != 1) {
                JOptionPane.showMessageDialog(null, "la thérapeutique été actualise", "information", JOptionPane.WARNING_MESSAGE);
            }
            }
            
            if (a6 == true) {

            }
        } else {

            JOptionPane.showMessageDialog(null, "un des champs n'est pas valide, veuillez remplir au moins un champ des 3 groupes", "information", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        JOptionPane.showConfirmDialog(null, "la fonction n’est pas encore implémentée dans cette version ", " information ", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        JOptionPane.showConfirmDialog(null, "la fonction n’est pas encore implémentée dans cette version ", " information ", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenu4MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu4MenuSelected
        JOptionPane.showConfirmDialog(null, "la fonction n’est pas encore implémentée dans cette version ", " information ", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jMenu4MenuSelected

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        if (jComboBox1.getSelectedIndex() != 0) {
        String val;
        val = jComboBox1.getSelectedItem().toString();
        String[] splited = val.split("\\s");
        String datePrescri = splited[0];
        String heurePrescri = splited[1];
        
        String dateHeurePrescri = datePrescri + " " + heurePrescri;
        jTextArea2.setText(sql.getPrescriptionsPatient(patient, numSej, dateHeurePrescri));
        jTextArea2.repaint();
        jTextArea2.revalidate();
       
            jTextArea2.setEditable(false);
           
        } else {
            
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         A41_Infirmier fenetre41 = new A41_Infirmier(inf);
        int response = JOptionPane.showConfirmDialog(null, "Etes-vous sûr d'avoir tout validé?", "Confirmer",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.YES_OPTION) {
            fenetre41.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jButton1ActionPerformed


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
            java.util.logging.Logger.getLogger(A42_Infirmier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(A42_Infirmier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(A42_Infirmier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(A42_Infirmier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new A42_Infirmier().setVisible(true);
            }
        });
    }
   private DefaultComboBoxModel comboListePrescriptions;
   private NumeroSejour numSej;
   private Constantes constantes;
    private SQL sql = null;
    private Patient patient;
    private String taille;
    private String tension;
    private String poids;
    private String glycemie;
    private String temperature;
    private String autres;
    private int tailleI;
    //private boolean actualiser = false;
    private double poidsD;
    private double glycemieD;
    private double temperatureD;
    private String traitement;
    private String allergie;
    private String regime;
    private String motif;
    private String diagnostic;
    private String antecedent;
    private Date dateJour;
    private Infirmiere inf;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox jComboBox1;
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
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
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
