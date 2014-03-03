package SIH;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.4F5A7D05-7BE5-638B-4955-C2FE056FF426]
// </editor-fold> 
public class LettreSortie {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.AD7B3796-BDC3-71C4-6171-3B8560526389]
    // </editor-fold> 
    private String message;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.1691919E-1021-0B76-4F38-C72DDBED41F5]
    // </editor-fold> 
    private MedecinPH mDossierMedical;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.4E92D643-5FD5-3C2E-2668-1447F6C4DFE5]
    // </editor-fold> 
    public LettreSortie (MedecinPH m, String message) {
        this.mDossierMedical = m;
        this.message=message;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.73C1DC18-DBF9-2BF6-5AAD-8729BEDC5BE4]
    // </editor-fold> 
    public String getMessage () {
        return message;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.B5B4A892-0DD0-8711-F226-D4DE273FF1CD]
    // </editor-fold> 
    public void setMessage (String val) {
        this.message = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.1209EA0B-D96C-91B3-EE7D-997DEA1BBF4B]
    // </editor-fold> 
    public MedecinPH getDossierMedical () {
        return mDossierMedical;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.E4D47C8A-E1BB-F757-B432-5F6432736AF6]
    // </editor-fold> 
    public void setDossierMedical (MedecinPH val) {
        this.mDossierMedical = val;
    }

}

