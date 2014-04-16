package SIH;


public class Infirmiere extends PersonnelMedical {

    private Services service;

    private String fonction;
    
    private String motDePasse;

    public Infirmiere(String id, String nom, String prenom, Services service) {
        super(id, nom, prenom, service);
        this.service = service;
        this.fonction = "Infirmier";
    }
    
    public Infirmiere(String id,String motDePasse, String nom, String prenom, Services service) {
        super(id, nom, prenom, service);
        this.service = service;
        this.fonction = "Infirmier";
        this.motDePasse = motDePasse;
    }

    /**
     * @return the id
     */
    public String getId() {
        return super.getId();
    }


    /**
     * @return the nom
     */
    public String getNom() {
        return super.getNom();
    }

    /**
     * @return the prenom
     */
    public String getPrenom() {
        return super.getPrenom();
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

    /**
     * @return the fonction
     */
    public String getFonction() {
        return fonction;
    }

    /**
     * @param fonction the fonction to set
     */
    public void setFonction(String fonction) {
        this.fonction = fonction;
    }

    /**
     * @return the motDePasse
     */
    public String getMotDePasse() {
        return motDePasse;
    }

    /**
     * @param motDePasse the motDePasse to set
     */
    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

}
