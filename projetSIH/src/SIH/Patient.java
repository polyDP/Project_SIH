package SIH;

import java.util.ArrayList;

public class Patient {

    private String nom;

    private String prenom;

    private String telephone;

    private String nomMedecinTraitant;

    private String allergies;

    private String regimeAlimentaire;

    private String sexe;

    private Date dateAdmission;

    private Date dateNaissance;

    private Maladie mMaladie;

    private Lit localisation;

    private MedecinPH pHResponsable;

    private Adresse adresse;

    private IPP ipp;

    private String traitmentPersonnel;

    public Patient(String nom, String prenom, String telephone, String nomMedecinTraitant, String sexe, Date dateNaissance, Adresse adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
        this.nomMedecinTraitant = nomMedecinTraitant;
        this.sexe = sexe;
        this.dateNaissance = dateNaissance;
        this.adresse = adresse;

    }

    public String toString() {
        return nom + " " + prenom;
    }

    public MedecinPH getPHResponsable() {
        return pHResponsable;
    }

    public void setPHResponsable(MedecinPH pHResponsable) {
        this.pHResponsable = pHResponsable;
    }

    /**
     * renvoie un affichage des donnees du patient
     *
     * @return
     */
    public String affichagePatient() {
        String aff = null;
        aff = " nom patient : " + nom + "\n";
        aff = aff + " prenom patient : " + prenom + "\n";
        aff = aff + " sexe patient : " + sexe + "\n";
        aff = aff + "date naissance du patient : " + dateNaissance + "\n";
        aff = aff + " numero telephone patient : " + telephone + "\n";
        aff = aff + " nom medecin traitant : " + nomMedecinTraitant + "\n";
        return aff;

    }

    /**
     * renvoie les donnees d'un patient et de son numero de sejou
     *
     * @param p
     * @param sejPat
     * @return
     */
    public String donneePatient(Patient p, SejourPatient sejPat) {
        String donnee = "Information Patient : \n" + p.affichagePatient();
        donnee = donnee + sejPat.infosSejour();
        return donnee;
    }

    /**
     * @return the adresse
     */
    public Adresse getAdresse() {
        return adresse;
    }

    /**
     * @param adresse the adresse to set
     */
    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    /**
     * @return the ipp
     */
    public IPP getIpp() {
        return ipp;
    }

    /**
     * @param ipp the ipp to set
     */
    public void setIpp(IPP ipp) {
        this.ipp = ipp;
    }

    /**
     * @return the traitmentPersonnel
     */
    public String getTraitmentPersonnel() {
        return traitmentPersonnel;
    }

    /**
     * @param traitmentPersonnel the traitmentPersonnel to set
     */
    public void setTraitmentPersonnel(String traitmentPersonnel) {
        this.traitmentPersonnel = traitmentPersonnel;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * @param prenom the prenom to set
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * @return the telephone
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * @param telephone the telephone to set
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     * @return the nomMedecinTraitant
     */
    public String getNomMedecinTraitant() {
        return nomMedecinTraitant;
    }

    /**
     * @param nomMedecinTraitant the nomMedecinTraitant to set
     */
    public void setNomMedecinTraitant(String nomMedecinTraitant) {
        this.nomMedecinTraitant = nomMedecinTraitant;
    }

    /**
     * @return the allergies
     */
    public String getAllergies() {
        return allergies;
    }

    /**
     * @param allergies the allergies to set
     */
    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

    /**
     * @return the regimeAlimentaire
     */
    public String getRegimeAlimentaire() {
        return regimeAlimentaire;
    }

    /**
     * @param regimeAlimentaire the regimeAlimentaire to set
     */
    public void setRegimeAlimentaire(String regimeAlimentaire) {
        this.regimeAlimentaire = regimeAlimentaire;
    }

    /**
     * @return the sexe
     */
    public String getSexe() {
        return sexe;
    }

    /**
     * @param sexe the sexe to set
     */
    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    /**
     * @return the dateAdmission
     */
    public Date getDateAdmission() {
        return dateAdmission;
    }

    /**
     * @param dateAdmission the dateAdmission to set
     */
    public void setDateAdmission(Date dateAdmission) {
        this.dateAdmission = dateAdmission;
    }

    /**
     * @return the dateNaissance
     */
    public Date getDateNaissance() {
        return dateNaissance;
    }

    /**
     * @param dateNaissance the dateNaissance to set
     */
    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    /**
     * @return the mMaladie
     */
    public Maladie getmMaladie() {
        return mMaladie;
    }

    /**
     * @param mMaladie the mMaladie to set
     */
    public void setmMaladie(Maladie mMaladie) {
        this.mMaladie = mMaladie;
    }

    /**
     * @return the localisation
     */
    public Lit getLocalisation() {
        return localisation;
    }

    /**
     * @param localisation the localisation to set
     */
    public void setLocalisation(Lit localisation) {
        this.localisation = localisation;
    }

    /**
     * @return the pHResponsable
     */
    public MedecinPH getpHResponsable() {
        return pHResponsable;
    }

    /**
     * @param pHResponsable the pHResponsable to set
     */
    public void setpHResponsable(MedecinPH pHResponsable) {
        this.pHResponsable = pHResponsable;
    }
}
