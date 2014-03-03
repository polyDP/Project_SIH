/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SIH;

/**
 *
 * @author Baptiste-PC
 */
public class DMA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Services servMed1 = Services.gynecologie_obstetrique;
        MedecinPH med1 = new MedecinPH("8", "lol", "Labat", "paul", "gynéco", servMed1); //va chercher médecins dans la base de données

        //-------------------------------------------------CREATION DU PATIENT---------------------------------------------
        Date dateAdmPat1 = new Date(21, 02, 2014);     // date admission patient 1
        Date dateNaisPat1 = new Date(15, 02, 1990);    // date naisssance patient1
        Services servPat1 = Services.medecine;
        Lits litPat1 = new Lits(servPat1); // ajout d'un lit pour la patient1

        Patient pat1 = new Patient("Robin", "Eudes", "0655889977", "Labat Paul, medecine generale", "Rodolphe", "vegetarien", "Homme", dateAdmPat1, dateNaisPat1, litPat1); // creation du patient

        DossierMedicalAdministratif dosMedAdm1 = new DossierMedicalAdministratif(pat1, med1); // a la création du patient, creation du dossier medical administratif

        GestionLits gestLit = new GestionLits(servPat1); // ajout d'une gestion des Lits ?

        litPat1.setGestionLits(gestLit); // mise en place de la gestion des lits pour le patient1

        //-------------------------------------------------RECHERCHE DU PATIENT---------------------------------------------
        System.out.println("from Dossier Medical administratif nom patient : " + dosMedAdm1.getPatients().getNom());
        System.out.println("from Dossier Medical administratif prenom patient : " + dosMedAdm1.getPatients().getPrenom());
        System.out.println("from Dossier Medical administratif telephone patient : " + dosMedAdm1.getPatients().getTelephone());
        System.out.println("from Dossier Medical administratif medecin traitant: " + dosMedAdm1.getPatients().getNomMedecinTraitant());
        System.out.println("from Dossier Medical administratif liste patients : " + dosMedAdm1.getPatients().getSexe());

        if (dosMedAdm1.getPatients().getPrestationsEffectuees() != null) {
            for (int i = 0; i < dosMedAdm1.getPatients().getPrestationsEffectuees().size(); i++) {
                System.out.println("from Dossier Medical administratif prestations effectuees : " + dosMedAdm1.getPatients().getPrestationsEffectuees().get(i).affichage()); // affichage des prestations effectuees pour le patient 1 et le medecin1
            }
        } else {
            System.out.println("le patient n'a pas d'antécédants");
        }

        if (dosMedAdm1.getLettreSortie() != null) {
            System.out.println("from Dossier Medical administratif lettre sortie : " + dosMedAdm1.getLettreSortie().getMessage());
        } else {
            System.out.println("pas de lettre de sortie");
        }

        // ------------------- ajout des données----------------------------------//
        dosMedAdm1.setDate(dateAdmPat1);
        System.out.println("from dossier Medical administratif date entree service : " + dosMedAdm1.getDate());

        dosMedAdm1.setNumSejour(10);
        System.out.println("from dossier Medical administratif num séjour : " + dosMedAdm1.getNumSejour());

        dosMedAdm1.getPatients().getLocalisation().setServices(servPat1);
        System.out.println("from dossier Medical administratif service patient : " + dosMedAdm1.getPatients().getLocalisation().getServices());

        dosMedAdm1.getPatients().getLocalisation().setGestionLits(gestLit);
        System.out.println("from dossier Medical administratif : " + dosMedAdm1.getPatients().getLocalisation().getGestionLits().getLits());

        dosMedAdm1.getPatients().setPHResponsable(med1);
        System.out.println("from dossier Medical administratif PH responsable : " + dosMedAdm1.getMedecinPH().toString());
    }

}
