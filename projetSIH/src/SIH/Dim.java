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
public class Dim extends Personnel {

    private Services service;

    private String fonction;

    public Dim(String id, String nom, String prenom) {
        super(id, nom, prenom);
        this.service = service.Administration;
        this.fonction = "DIM";
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

}
