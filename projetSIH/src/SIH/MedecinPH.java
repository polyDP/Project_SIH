package SIH;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.1DDE8BFD-C3EE-60DB-31E7-A438174C7702]
// </editor-fold> 
public class MedecinPH extends PersonnelMedical {
    private Services services;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.3C59CF4B-46AD-791D-5CB4-E08C44CD21A5]
    // </editor-fold> 
    public MedecinPH (String id, String motDePasse, String nom, String prenom, String metier, Services services) {
        super(id,motDePasse,nom,prenom,metier);
        this.services=services;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.37FFD308-491E-FD2C-0BB2-5CAAAB93ECAC]
    // </editor-fold> 
    public String getNom () {
        return super.getNom();
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.EA6068F8-B76E-84B5-2A8B-D88853562EEC]
    // </editor-fold> 
    public void setNom (String val) {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.8FC0C348-E255-18DD-307B-90794E3D405F]
    // </editor-fold> 
    public String getId () {
       return super.getId();
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.AF67B558-6D8D-46F9-BCFE-2CD6F89F7AC5]
    // </editor-fold> 
    public void setId (String val) {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.7F75BE02-426F-1DE6-6763-3DF8EBF939FD]
    // </editor-fold> 
    public String getLogin () {
        return super.getLogin();
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.02420475-08FD-3B98-0293-8BAEF0C82F47]
    // </editor-fold> 
    public void setLogin (String val) {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.AF427A56-C13A-565B-9C15-5F07A4D6B504]
    // </editor-fold> 
    public Services getServices () {
        return services;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.F09CB15D-E4BD-F97E-C3C7-2C08C1DF0A04]
    // </editor-fold> 
    public void setServices (Services val) {
        this.services = val;
    }
public String getPrenom () {
        return super.getPrenom();
    }
 
    public void setPrenom (String val) {
    }
    
    public String toString(){
        return super.getNom() +" "+ super.getPrenom()+ " "+getMetier()+" " +services;
    }
}

