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
        MedecinPH med1 = new MedecinPH("8","lol","Labat","paul","gynéco",servMed1);
        Infirmiere inf1 = new Infirmiere("9","XD","Freby","Rodolphe","infirmiere",servInf1);
        Administratif adm1 = new Administratif("10","mdr","Reges","Ombeline");
        Date dateAdmPat1 = new Date(21,02,2014);
        Date dateNaisPat1 = new Date(15,02,1990);
        
        ArrayList<String> antecedents; // va chercher dans la base de données si le patient a eu des antécédents
        antecedents = new ArrayList<String>();
        antecedents.add("Apendicectomie"); 
        
        System.out.println(antecedents);
        Lits litPat1 = new Lits(servPat1);
        Maladie malPat1 = new Maladie("diarhée aigue","Gastro Entérite Aigue",antecedents);
        antecedents.add(malPat1.getDiagnostique()); // ajouite la maladie aux antécédents du patient.
        
        Patient pat1 = new Patient("Robin","Eudes","0655889977","Labat Paul, medecine generale","Rodolphe","vegetarien","Homme",dateAdmPat1,dateNaisPat1,malPat1,litPat1);       
        System.out.println(pat1.getDateNaissance().toString());
        System.out.println(pat1.getLocalisation().getServices());
        System.out.println(pat1.getMaladie().getDiagnostique());
        System.out.println(pat1.getMaladie().getAntecedents());
        System.out.println(pat1.IPP());
        
        DossierMedicalAdministratif DosMedAdm1 = new DossierMedicalAdministratif(pat1,med1); 
        System.out.println(DosMedAdm1.getPatients().getNom());
        
        
    }
    
}
