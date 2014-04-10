package SIH;

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.B9361F9C-6E4A-7FD8-D92A-0D9064D13916]
// </editor-fold> 
public class Lit {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.B108CD9C-DCE2-3BBE-8206-195F81ED3E87]
    // </editor-fold> 
    private Services service;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.9FF7364D-EC71-383D-109B-EEA1AFCB61D6]
    // </editor-fold> 
    private Patient patient;

    private String cote;

    private int numero;

    private GestionLits gestLit;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.F236F082-73BF-D0C9-CAD4-EC50B8BF3164]
    // </editor-fold> 
    public Lit(int numero, String cote) {
        this.numero = numero;
        this.cote = cote;

    }

    public Lit(int numero, String cote, Patient p) {

        this.numero = numero;
        this.cote = cote;
        this.patient = p;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.BC66F62C-1708-6432-CD78-5E6AA1578B06]
    // </editor-fold> 
    public Patient getPatients() {
        return patient;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.E731DABF-E864-DBB9-2C18-F397E53AA0D9]
    // </editor-fold> 
    public void setPatients(Patient val) {
        this.patient = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.D1FB75B6-C505-0ABF-40D8-FCF211F177ED]
    // </editor-fold> 
    public Services getServices() {
        return service;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.F718A126-D648-8B8E-EB8C-5B3554414752]
    // </editor-fold> 
    public void setServices(Services val) {
        this.service = val;
    }

    /**
     * @return the cote
     */
    public String getCote() {
        return cote;
    }

    /**
     * @param cote the cote to set
     */
    public void setCote(String cote) {
        this.cote = cote;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String afficherLit() {
        return numero + cote +" " +patient;
    }

    public String idLit() {
        return numero + cote;
    }

}
