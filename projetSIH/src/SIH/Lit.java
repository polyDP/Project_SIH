package SIH;

public class Lit {

    private Services service;

    private Patient patient;

    private String cote;

    private int numero;

    private String lit;

    private String typeLit;

    public Lit(int numero, String cote) {
        this.numero = numero;
        this.cote = cote;
        typeLit = "intType";
    }

    public Lit(int numero, String cote, Patient p) {

        this.numero = numero;
        this.cote = cote;
        this.patient = p;

        typeLit = "intType";
    }

    public Lit(String lit) {
        this.lit = lit;
        typeLit = "StringType";
    }
/**
 * renvoie une string avec un lit sous la forme numero+cote du lit
 * @return 
 */
    public String idLit() {
        String litId = null;
        if (typeLit.equals("intType")) {
            litId = numero + cote;
        } else if (typeLit.equals("StringType")) {
            litId = lit;
        }

        return litId;
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
     * @return the patient
     */
    public Patient getPatient() {
        return patient;
    }

    /**
     * @param patient the patient to set
     */
    public void setPatient(Patient patient) {
        this.patient = patient;
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

    /**
     * @return the lit
     */
    public String getLit() {
        return lit;
    }

    /**
     * @param lit the lit to set
     */
    public void setLit(String lit) {
        this.lit = lit;
    }

    /**
     * @return the typeLit
     */
    public String getTypeLit() {
        return typeLit;
    }

    /**
     * @param typeLit the typeLit to set
     */
    public void setTypeLit(String typeLit) {
        this.typeLit = typeLit;
    }
}
