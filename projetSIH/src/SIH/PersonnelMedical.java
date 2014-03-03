package SIH;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.9E057853-6104-E7CA-FB26-9B523676B911]
// </editor-fold> 
public class PersonnelMedical extends Personnel {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.DAD67ADF-951C-84C2-84D1-A80B8EB4A418]
    // </editor-fold> 
    private String metier;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.60FC8C18-C163-264A-DF4B-AEC488C28C93]
    // </editor-fold> 
    private Services mServices;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.63548C80-246B-FB49-7A9D-A1DE6EB18685]
    // </editor-fold> 
    public PersonnelMedical (String id, String motDePasse, String nom, String prenom ,String metier) {
        super(id,motDePasse,nom,prenom);
        this.metier = metier; 
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.9C2888FF-EF67-ED91-73E4-F7265FFF961C]
    // </editor-fold> 
    public String getNom () {
       return super.getNom();
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.EED27845-D496-E0A8-DB9E-8DE1A75E76F8]
    // </editor-fold> 
    public void setNom (String val) {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.16472579-E309-1237-50AE-83550560F167]
    // </editor-fold> 
    public String getId () {
        return super.getId();
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.D666FFD9-68B9-70E5-6902-8C37ACB5C01E]
    // </editor-fold> 
    public void setId (String val) {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.A9FBFCAF-6294-265B-745D-9B4FD2EC8892]
    // </editor-fold> 
    public String getLogin () {
        return super.getLogin();
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.1BBD8B35-507F-071E-5A62-7313FE0883BB]
    // </editor-fold> 
    public void setLogin (String val) {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.CE722D86-89AA-B97C-F945-0F2D5C0C4627]
    // </editor-fold> 
    public Services getServices () {
        return mServices;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.92680015-3F49-E378-9B58-0390ACF3E6F8]
    // </editor-fold> 
    public void setServices (Services val) {
        this.mServices = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.C02777DB-57C7-7EF1-1130-583F212C585E]
    // </editor-fold> 
    public String getMetier () {
        return metier;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.7CCEDF11-ADA7-2393-B78C-1E80210F4D39]
    // </editor-fold> 
    public void setMetier (String val) {
        this.metier = val;
    }
    public String getPrenom () {
        return super.getPrenom();
    }
 
    public void setPrenom (String val) {
    }

}

