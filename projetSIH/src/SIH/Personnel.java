package SIH;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.DE7FAEEB-15AE-9FE5-C970-738ADFC0D48E]
// </editor-fold> 
public abstract class Personnel {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.0823B3A7-873A-2EA0-CBD2-8E0B8DEE4554]
    // </editor-fold> 
    private String nom;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.18609497-3178-F556-D0A8-9EC268235FBE]
    // </editor-fold> 
    private int id;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.339FF0D7-056C-D686-142C-3EDC2056D7E2]
    // </editor-fold> 
    private String motDePasse;
    
    private String prenom;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.FE942F7E-6F9C-B783-910F-2682FAAB5394]
    // </editor-fold> 
    public Personnel (int id, String motDePasse, String nom, String prenom) {
        this.id=id;
        this.motDePasse=motDePasse;
        this.nom=nom;
        this.prenom=prenom;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.EAEBC3A3-38D7-0213-869F-3A8543266127]
    // </editor-fold> 
    public int getId () {
        return id;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.D806A19C-33F4-16BE-0267-7D33FC12ACEC]
    // </editor-fold> 
    public void setId (int val) {
        this.id = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.AA91338A-BCAB-ECCB-D7AB-55D82D35A856]
    // </editor-fold> 
    public String getNom () {
        return nom;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.029F1077-25F6-A1F2-5F35-0947325DA85B]
    // </editor-fold> 
    public void setNom (String val) {
        this.nom = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.076F1609-777B-1D5E-A044-E418FD3A2CCF]
    // </editor-fold> 
    public String getLogin () {
        return motDePasse;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.72E1E8CC-84CE-84A3-524D-C6C9908B59A4]
    // </editor-fold> 
    public void setLogin (String val) {
        this.motDePasse = val;
    }
    
    public String getPrenom () {
        return prenom;
    }
 
    public void setPrenom (String val) {
        this.prenom = val;
    }
}

