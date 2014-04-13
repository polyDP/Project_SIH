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
public class SejourPatient {

    private boolean etatDossier;

    private NumeroSejour numSej;

    private Patient patient;

    private Date dateEntree;

    private Services servicePat;

    private MedecinPH medResp;

    private Lit lit;

    private String lettreSortie;

    public SejourPatient(Patient p, NumeroSejour numSej) {
        etatDossier = false;
        this.numSej = numSej;

    }

    public SejourPatient(Patient patient, NumeroSejour numSej, Date dateEntree, Services servicePat, MedecinPH medResp, Lit lit, boolean etatDossier, String lettreSortie) {
        this.patient = patient;
        this.numSej = numSej;
        this.dateEntree = dateEntree;
        this.servicePat = servicePat;
        this.medResp = medResp;
        this.lit = lit;
        this.etatDossier = etatDossier;
        this.lettreSortie = lettreSortie;

    }

    public void ouvertureDossier() {
        setEtatDossier(true);
    }

    public void fermetureDossier() {
        setEtatDossier(false);
    }

    /**
     * @return the etatDossier
     */
    public boolean isEtatDossier() {
        return etatDossier;
    }

    /**
     * @param etatDossier the etatDossier to set
     */
    public void setEtatDossier(boolean etatDossier) {
        this.etatDossier = etatDossier;
    }

    /**
     * @return the numSej
     */
    public NumeroSejour getNumSej() {
        return numSej;
    }

    /**
     * @param numSej the numSej to set
     */
    public void setNumSej(NumeroSejour numSej) {
        this.numSej = numSej;
    }

    /**
     * @return the patient
     */
    public Patient getPatient() {
        return patient;
    }

    /**
     * @param patient the patient to set
     */
    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    /**
     * @return the dateEntree
     */
    public Date getDateEntree() {
        return dateEntree;
    }

    /**
     * @param dateEntree the dateEntree to set
     */
    public void setDateEntree(Date dateEntree) {
        this.dateEntree = dateEntree;
    }

    /**
     * @return the servicePat
     */
    public Services getServicePat() {
        return servicePat;
    }

    /**
     * @param servicePat the servicePat to set
     */
    public void setServicePat(Services servicePat) {
        this.servicePat = servicePat;
    }

    /**
     * @return the medResp
     */
    public MedecinPH getMedResp() {
        return medResp;
    }

    /**
     * @param medResp the medResp to set
     */
    public void setMedResp(MedecinPH medResp) {
        this.medResp = medResp;
    }

    /**
     * @return the lit
     */
    public Lit getLit() {
        return lit;
    }

    /**
     * @param lit the lit to set
     */
    public void setLit(Lit lit) {
        this.lit = lit;
    }

    public String infosSejour() {
        String infos = "Informations sejour : \n";
        infos = infos + "Numero du sejour : " + numSej.getNumeroSejour()+"\n";
        infos = infos + "Date de l'entree : " + dateEntree.toString()+"\n";
        infos = infos + "Service : " + servicePat.toString()+"\n";
        infos = infos + "Numero du lit : " + lit.idLit()+"\n";
        return infos;
    }

    public String historiqueSejour() {
        String infoHistorique = "Date d'entrée du patient : " + dateEntree.toString()+"\n";
        infoHistorique = infoHistorique + "\nservice d'hospitalisation du patient : " + servicePat.toString()+"\n";

        infoHistorique = infoHistorique + "\nPH responsable du patient : " + medResp.getNom() + " " + medResp.getPrenom()+"\n";

        infoHistorique = infoHistorique + "\nLettre de sortie :\n" + lettreSortie;
        return infoHistorique;
    }

}
