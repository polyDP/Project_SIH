package SIH;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.A0E0220C-6018-B0D4-23CB-1BB0C36C13A3]
// </editor-fold> 
public class Administratif extends Personnel {
     private Services service;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.2618785F-BBF9-4555-9F92-BA78131A7BAA]
    // </editor-fold> 
    public Administratif (String id, String motDePasse, String nom, String prenom, String fonction, Services service) {
        super(id, motDePasse, nom, prenom,fonction);
        this.service=service;
        
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.34B79D4C-E548-4935-7BCF-70D7236E071F]
    // </editor-fold> 
    public String getNom () {
       return super.getNom();
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.B9AA1794-F801-87D2-05AA-C7EC0F8B9BFB]
    // </editor-fold> 
    public void setNom (String val) {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.F9AACC7A-88B3-F5BC-640D-9FB02EBDD508]
    // </editor-fold> 
    public String getId () {
        return super.getId();
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.9079FF6C-A42F-40D8-C43B-92189FBDB951]
    // </editor-fold> 
    public void setId (String val) {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.AC4A18AA-4556-C7B4-1EA8-49D901742856]
    // </editor-fold> 
    public String getMotDePasse () {
        return super.getMotDePasse();
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.A7805449-7E24-A87D-5B88-674066C72CC0]
    // </editor-fold> 
    public void setMotDePasse (String val) {
    }

}

