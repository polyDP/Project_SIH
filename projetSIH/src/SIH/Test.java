/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SIH;

import java.util.ArrayList;

/**
 *
 * @author Baptiste-PC
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Services servMed1 = Services.gynecologie_obstetrique;
        Services servInf1 = Services.chirurgie;
        MedecinPH med1 = new MedecinPH("8", "lol", "Labat", "paul", "gynéco", servMed1);
        Infirmiere inf1 = new Infirmiere("9", "XD", "Freby", "Rodolphe", "infirmiere", servInf1);
        Administratif adm1 = new Administratif("10", "mdr", "Reges", "Ombeline");
        

        //------------------------------Patients------------------------------//
        //--------------------------------------------------------------------//
        Date dateAdmPat1 = new Date(21, 02, 2014);     // date admission patient 1
        Date dateMal1 = new Date (21,02,2014);         //date maladie patient 1
        Date dateNaisPat1 = new Date(15, 02, 1990);    // date naisssance patient1
        Date datePrest1Pat1 = new Date(20, 03, 2014);   // date prestation 1 patient1
        Date datePrest2Pat1 = new Date(22, 03, 2014);   // date prestation 2 patient1

        Services servPat1 = Services.medecine;

       
               

        //litPat1.setGestionLit(gestLit); // mise en place de la gestion des lits pour le patient1
        Adresse adressePat1 = new Adresse("numero","rue","codepostal","ville");
        Patient pat1 = new Patient("Robin", "Eudes", "0655889977", "Labat Paul, medecine generale", "Homme", dateNaisPat1, adressePat1); // creation du patient
        
        ArrayList<String> antecedents; // va chercher dans la base de données si le patient a eu des antécédents
        antecedents = new ArrayList<String>();
        antecedents.add("Apendicectomie"); //ici creation d'un antecedant pour le test

        Maladie malPat1 = new Maladie("diarhée aigue", "Gastro Entérite Aigue",dateMal1); // creation de la maladie du patient1
        //antecedents.add(malPat1.getDiagnostique()); // ajout automatique de la maladie aux antécédents du patient.
        
        pat1.setMaladie(malPat1);
        
        System.out.println("affichage : \n" + pat1.affichagePatient());
        System.out.println("affichage 2 : " + pat1.afficheAntecedants(pat1));
        
        ArrayList<PrestationsEffectuees> listPresEffPat1;
        listPresEffPat1 = new ArrayList<PrestationsEffectuees>(); // si premiere admission du patient création d'une liste vide de prestations effectuées
        
        GestionLits gestLit = new GestionLits(servInf1); // ajout d'une gestion des Lits ?
         Lit litPat1 = new Lit(350,"P"); // ajout d'un lit pour la patient1
         
        pat1.setLocalisation(litPat1);

        gestLit.ajouterPatient(pat1);
       System.out.println(gestLit.afficherLits());
       
       GestionLits gestLit1 = new GestionLits(servMed1); // ajout d'une gestion des Lits ?
         Lit litPat2 = new Lit(500,"P"); // ajout d'un lit pour la patient1
         
        pat1.setLocalisation(litPat2);

        gestLit1.ajouterPatient(pat1);
       System.out.println(gestLit1.afficherLits());
        
        

        //--------------------------------------------------------------------//
        // ajoute des constantes par l'infirmiere
        
        Constantes consPat1 = new Constantes(pat1);
        consPat1.setGlycemie(1.23);
        consPat1.setPoids(85);
        consPat1.setTaille(159);
        consPat1.setTension(14.2);
        
        ArrayList<Constantes> listeConstantes;
        listeConstantes = new ArrayList<Constantes>();
        
        listeConstantes.add(consPat1);
        
        Constantes cons1Pat1 = new Constantes(pat1);
        consPat1.setGlycemie(1.50);
        consPat1.setPoids(86);
        consPat1.setTaille(159);
        consPat1.setTension(13.2);
        
        listeConstantes.add(cons1Pat1);
        
        //---------------------------------------------------------------------//   
        // lors de la réalisation d'un acte par une infirmiere ou medecin
        Prestations pres1Pat1 = Prestations.CS; // va chercher dans la liste des prestations
        PrestationsEffectuees presEff1Pat1 = new PrestationsEffectuees(datePrest1Pat1, pres1Pat1, pat1); // creation d'une prestation1 pour le patient

        listPresEffPat1.add(presEff1Pat1); // ajout de la prestation1 a la liste des presations effectuées du patient
        pat1.setPrestationsEffectuees(listPresEffPat1); // actualisation des prestations effectuees au patient1

        Prestations pres2Pat1 = Prestations.KFA;
        PrestationsEffectuees presEff2Pat1 = new PrestationsEffectuees(datePrest2Pat1, pres2Pat1, pat1); // creation d'une prestation2 pour le patient
        listPresEffPat1.add(presEff2Pat1); // ajout de la prestation2 a la liste des presations effectuées du patient

        pat1.setPrestationsEffectuees(listPresEffPat1); // actualisation des prestations effectuees au patient1

        for (int i = 0; i < listPresEffPat1.size(); i++) {
            System.out.println(pat1.getPrestationsEffectuees().get(i).getPrestations()); // affichage de toutes les prestations effectuees du patient1
        }
        
        System.out.println("from patient nom + prenom  : " + pat1.getNom()+pat1.getPrenom());
        System.out.println("from patient date de naissance : " + pat1.getDateNaissance().toString());
//        System.out.println("from patient localisation du patient : " + pat1.getLocalisation().getServices());
        System.out.println("from patient Diagnotique de la maladie : " + pat1.getMaladie().getDiagnostique());
        System.out.println("from patient antecedants du patient : " + pat1.afficheAntecedants(pat1));
        System.out.println("from patient motif hospitalisation "+pat1.getMaladie().getMotifHospitalisation());
//        System.out.println("from patient IPP : pas encore implemente " + pat1.IPP());     
        System.out.println("from patient numero telephone : " + pat1.getTelephone());
        System.out.println("from patient regime alimentaire : " + pat1.getRegimeAlimentaire());
        System.out.println("from patient medecin traitant : "+ pat1.getNomMedecinTraitant());
        
        
        //--------------------Dossier Medical Administratif-------------------//
        //--------------------------------------------------------------------//
      /*  
        
        DossierMedicalAdministratif dosMedAdm1 = new DossierMedicalAdministratif(pat1, med1); // a la création du patient, creation du dossier medical administratif
        
        ArrayList<DossierMedicalAdministratif> listeDossierMedical1;
        listeDossierMedical1 = new ArrayList<DossierMedicalAdministratif>(); // creation de la liste des dossiers médicaux
        
        System.out.println(dosMedAdm1.getPatients().getLocalisation().getServices());
        dosMedAdm1.setArchivage(false);
        
        listeDossierMedical1.add(dosMedAdm1);
        
        System.out.println(listeDossierMedical1.get(0).getPatients()); // affichage des dossiers médicaux du médecin x du service x
        
        String lettre = "le patient 1 peut sortir de l'hopitale suite a son intervention dans le service de gastro cordialement Dr folamour";
        LettreSortie lettreSortieMed1Pat1 = new LettreSortie(med1,lettre);
        
        dosMedAdm1.setLettreSortie(lettreSortieMed1Pat1);
        
        */
        
        //--------------------Dossier Medical-------------------//
        //--------------------------------------------------------------------//
        
        //DMMedicoTechnique dMMT = new DMMedicoTechnique(pat1,servMed1);  // a la création du patient, creation du dossier medical medicoTech
        //DMAnesthesie dMA = new DMAnesthesie(pat1,servMed1);              // a la création du patient, creation du dossier medical Adm
        //DossierMedicalClinique dMC = new DossierMedicalClinique(pat1,servMed1);  // a la création du patient, creation du dossier medical Adm
        
        String obs = "observations";
        //dMMT.setObservation(obs);
        //dMA.setObservation(obs);
        //dMC.setObservation(obs);
        
        //dMMT.setConstantes(listeConstantes);
        //dMA.setConstantes(listeConstantes);
        //dMC.setConstantes(listeConstantes);
        
        
        //----------------------- pour le DIM -----------------------------
        Dim dim1 = new Dim("id","motPasse","nom","prenom");
        dim1.affficheMedecins();
        
        
        Date dateSejour = new Date(2,3,2013);
        NumeroSejour numSej = new NumeroSejour(dateSejour);
        System.out.println(numSej.getCompteur());
        System.out.println(numSej.getNumero());
        System.out.println(numSej.getDate());
        numSej.incrementerCompteur();
        System.out.println(numSej.getNumeroSejour());
        
        System.out.println(numSej.getCompteur());
        System.out.println(numSej.getNumero());
        System.out.println(numSej.getDate());
        System.out.println(numSej.getNumeroSejour());
        
        IPP ipp = new IPP(dateSejour);
        System.out.println(ipp.getIpp());
        ipp.incrementerCompteur();
        System.out.println(ipp.getIpp());
    }

}
