package SIH;

public class Administratif extends Personnel {

    private Services service;

    private String fonction;
    
    private String motDePasse;

    public Administratif(String id, String nom, String prenom) {
        super(id, nom, prenom);
        this.service = service.Administration;
        this.fonction = "Secretaire";
    }
public Administratif(String id,String motDePasse, String nom, String prenom) {
        super(id, nom, prenom);
        this.service = service.Administration;
        this.fonction = "Secretaire";
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
