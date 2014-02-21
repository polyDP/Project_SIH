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
        Services servPat1 = Services.medecine;
        MedecinPH med1 = new MedecinPH("8", "lol", "Labat", "paul", "gynéco", servMed1);
        Infirmiere inf1 = new Infirmiere("9", "XD", "Freby", "Rodolphe", "infirmiere", servInf1);
        Administratif adm1 = new Administratif("10", "mdr", "Reges", "Ombeline");

        //------------------------------Patients------------------------------//
        //--------------------------------------------------------------------//
        Date dateAdmPat1 = new Date(21, 02, 2014);     // date admission patient 1
        Date dateNaisPat1 = new Date(15, 02, 1990);    // date naisssance patient1
        Date datePrest1Pat1 = new Date(20, 03, 2014);   // date prestation 1 patient1
        Date datePrest2Pat1 = new Date(22, 03, 2014);   // date prestation 2 patient1

        ArrayList<String> antecedents; // va chercher dans la base de données si le patient a eu des antécédents
        antecedents = new ArrayList<String>();
        antecedents.add("Apendicectomie"); //ici creation d'un antecedant pour le test

        System.out.println("antededents patient1 : " + antecedents);

        Lits litPat1 = new Lits(servPat1); // ajout d'un lit pour la patient1

        GestionLits gestLit = new GestionLits(servPat1); // ajout d'une gestion des Lits ?

        litPat1.setGestionLits(gestLit); // mise en place de la gestion des lits pour le patient1
        System.out.println("lits du patient 1 : " + litPat1.getServices());

        Maladie malPat1 = new Maladie("diarhée aigue", "Gastro Entérite Aigue", antecedents); // creation de la maladie du patient1
        antecedents.add(malPat1.getDiagnostique()); // ajout automatique de la maladie aux antécédents du patient.

        Patient pat1 = new Patient("Robin", "Eudes", "0655889977", "Labat Paul, medecine generale", "Rodolphe", "vegetarien", "Homme", dateAdmPat1, dateNaisPat1, malPat1, litPat1); // creation du patient

        System.out.println("date de naissance : " + pat1.getDateNaissance().toString());
        System.out.println("localisation du patient : " + pat1.getLocalisation().getServices());
        System.out.println("Diagnotique de la maladie : " + pat1.getMaladie().getDiagnostique());
        System.out.println("antecedants du patient : " + pat1.getMaladie().getAntecedents());
        System.out.println("IPP : pas encore implemente " + pat1.IPP());

        Prestations pres1Pat1 = Prestations.CS;
        PrestationsEffectuees presEff1Pat1 = new PrestationsEffectuees(datePrest1Pat1, pres1Pat1, pat1); // creation d'une prestation1 pour le patient
        System.out.println(presEff1Pat1.getPrestations());

        ArrayList<PrestationsEffectuees> listPresEffPat1;
        listPresEffPat1 = new ArrayList<PrestationsEffectuees>(); // creation de la liste des prestatins effectuees

        listPresEffPat1.add(presEff1Pat1); // ajout de la prestation1 a la liste des presations effectuées du patient

        pat1.setPrestationsEffectuees(listPresEffPat1); // actualisation des prestations effectuees au patient1

        Prestations pres2Pat1 = Prestations.KFA;
        PrestationsEffectuees presEff2Pat1 = new PrestationsEffectuees(datePrest2Pat1, pres2Pat1, pat1); // creation d'une prestation2 pour le patient

        listPresEffPat1.add(presEff2Pat1); // ajout de la prestation2 a la liste des presations effectuées du patient

        pat1.setPrestationsEffectuees(listPresEffPat1); // actualisation des prestations effectuees au patient1

        for (int i = 0; i < listPresEffPat1.size(); i++) {
            System.out.println(pat1.getPrestationsEffectuees().get(i).getPrestations()); // affichage de toutes les prestations effectuees du patient1
        }

        //--------------------Dossier Medical Administratif-------------------//
        //--------------------------------------------------------------------//
        DossierMedicalAdministratif DosMedAdm1 = new DossierMedicalAdministratif(pat1, med1);

        for (int i = 0; i < listPresEffPat1.size(); i++) {
            System.out.println("prestations effectuees : " + DosMedAdm1.getPatients().getPrestationsEffectuees().get(i).affichage()); // affichage des prestations effectuees pour le patient 1 et le medecin1
        }
        System.out.println(DosMedAdm1.getPatients().getLocalisation().getServices());
        DosMedAdm1.setArchivage(false);

        ArrayList<DossierMedicalAdministratif> listeDossierMedical1;
        listeDossierMedical1 = new ArrayList<DossierMedicalAdministratif>(); // creation de la liste des prestatins effectuees
        
        listeDossierMedical1.add(DosMedAdm1);
        
        System.out.println(listeDossierMedical1.get(0).getPatients());
    }

}
