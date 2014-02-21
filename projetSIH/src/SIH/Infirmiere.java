package SIH;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.00EEA2CC-B426-0AAC-53C0-52F3A5AAFFBA]
// </editor-fold> 
public class Infirmiere extends PersonnelMedical {
    private Services services;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.6A14D205-9A1E-E6C4-C4DD-FC389F131394]
    // </editor-fold> 
    public Infirmiere (String id, String motDePasse,String nom,String prenom, String metier, Services service) {
        super(id,motDePasse,nom,prenom,metier);
        this.services=services;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.7CD7E6B1-D3AA-3590-4A23-63E62402DA96]
    // </editor-fold> 
    public String getNom () {
       return super.getNom();
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.CD372008-635C-883E-32FE-F36BD4D366AC]
    // </editor-fold> 
    public void setNom (String val) {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.6E2EFF78-8907-0345-E42F-5165FA0E15D7]
    // </editor-fold> 
    public String getId () {
        return super.getId();
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.41D17D9E-7304-6B51-5326-2474AE4999F4]
    // </editor-fold> 
    public void setId (String val) {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.C3E2006A-B403-70ED-551D-F84AB8622C98]
    // </editor-fold> 
    public String getLogin () {
       return super.getLogin();
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.D06AECBE-9F40-49A3-9318-CF8421B838D6]
    // </editor-fold> 
    public void setLogin (String val) {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.E62D90E9-D211-31BD-F5FB-03FA23403706]
    // </editor-fold> 
    public Services getServices () {
        return services;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.0F7C4E23-062F-335F-FF7D-3DA94B028820]
    // </editor-fold> 
    public void setServices (Services val) {
        this.services = val;
    }

}
