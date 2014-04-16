package SIH;

import java.util.ArrayList;

public class DossierMedicalAdministratif {

    private Patient patients;

    private int numSejour;

    private MedecinPH medecinPH;

    private LettreSortie lettreSortie;

    private Date date;

    private boolean archivage;

    private Services service;

    public DossierMedicalAdministratif(Patient p, MedecinPH m) {
        this.patients = p;
        this.medecinPH = m;

    }

    /**
     * @return the patients
     */
    public Patient getPatients() {
        return patients;
    }

    /**
     * @param patients the patients to set
     */
    public void setPatients(Patient patients) {
        this.patients = patients;
    }

    /**
     * @return the numSejour
     */
    public int getNumSejour() {
        return numSejour;
    }

    /**
     * @param numSejour the numSejour to set
     */
    public void setNumSejour(int numSejour) {
        this.numSejour = numSejour;
    }

    /**
     * @return the medecinPH
     */
    public MedecinPH getMedecinPH() {
        return medecinPH;
    }

    /**
     * @param medecinPH the medecinPH to set
     */
    public void setMedecinPH(MedecinPH medecinPH) {
        this.medecinPH = medecinPH;
    }


    /**
     * @return the lettreSortie
     */
    public LettreSortie getLettreSortie() {
        return lettreSortie;
    }

    /**
     * @param lettreSortie the lettreSortie to set
     */
    public void setLettreSortie(LettreSortie lettreSortie) {
        this.lettreSortie = lettreSortie;
    }

    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * @return the archivage
     */
    public boolean isArchivage() {
        return archivage;
    }

    /**
     * @param archivage the archivage to set
     */
    public void setArchivage(boolean archivage) {
        this.archivage = archivage;
    }

    /**
     * @return the service
     */
    public Services getService() {
        return service;
    }

    /**
     * @param service the service to set
     */
    public void setService(Services service) {
        this.service = service;
    }

   
}
