package SIH;

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.9E057853-6104-E7CA-FB26-9B523676B911]
// </editor-fold> 
public class PersonnelMedical extends Personnel {

    private Services service;

    public PersonnelMedical(String id, String nom, String prenom, Services service) {
        super(id, nom, prenom);
        this.service = service;

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

}
