package SIH;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.2B21EDB3-3477-2144-BA06-224C47A6A7AF]
// </editor-fold> 
public class Constantes {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.B3D5491D-02D7-1C9A-6D38-D4FF3E72996A]
    // </editor-fold> 
    private int taille;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.28FFF95A-2C76-A771-6A10-46CBD2E4D93E]
    // </editor-fold> 
    private double poids;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.64E0D9CC-C671-E185-B7E4-A5275A2F41E0]
    // </editor-fold> 
    private String tension;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.B8268880-2C64-208D-CB8D-D889213BAC48]
    // </editor-fold> 
    private double glycemie;
    
    private double temperature;
    
    private String autreSoins;
    
    private Patient patient;
    
    private String prelevement;
    
    private String medicamentAdministre;
    

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.8AF6EEA5-3FAB-3ADD-7261-297189E5CF14]
    // </editor-fold> 
    public Constantes (int taille,double poids,String tension,double glycemie,double temperature,String autreSoins) {
        this.taille = taille;
        this.poids = poids;
        this.tension = tension;
        this.glycemie = glycemie;
        this.temperature= temperature;
        this.autreSoins=autreSoins;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.6E795A59-61B1-731B-2959-1A2BCB62425D]
    // </editor-fold> 
    public double getGlycemie () {
        return glycemie;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.5113B933-7A8C-77FC-FC52-A7A0393BF7DE]
    // </editor-fold> 
    public void setGlycemie (double val) {
        this.glycemie = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.4F919A01-1657-8951-DD3E-E3160055D5C2]
    // </editor-fold> 
    public double getPoids () {
        return poids;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.A65F8DBF-D36C-20BB-F72E-F3B142DE570D]
    // </editor-fold> 
    public void setPoids (double val) {
        this.poids = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.638BF131-BD96-DB37-9170-332D9922AD6F]
    // </editor-fold> 
    public int getTaille () {
        return taille;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.C15127B6-33E1-D2D3-ADEB-9E72F76183B9]
    // </editor-fold> 
    public void setTaille (int val) {
        this.taille = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.E01243D1-160D-9EED-EBD5-C1FBEDC71BA5]
    // </editor-fold> 
    public String getTension () {
        return tension;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.4C587748-01AA-A920-2538-A70F8313EA3F]
    // </editor-fold> 
    public void setTension (String val) {
        this.tension = val;
    }


    /**
     * @return the temperature
     */
    public double getTemperature() {
        return temperature;
    }

    /**
     * @param temperature the temperature to set
     */
    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    /**
     * @return the autreSoins
     */
    public String getAutreSoins() {
        return autreSoins;
    }

    /**
     * @param autreSoins the autreSoins to set
     */
    public void setAutreSoins(String autreSoins) {
        this.autreSoins = autreSoins;
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
     * @return the prelevement
     */
    public String getPrelevement() {
        return prelevement;
    }

    /**
     * @param prelevement the prelevement to set
     */
    public void setPrelevement(String prelevement) {
        this.prelevement = prelevement;
    }

    /**
     * @return the medicamentAdministre
     */
    public String getMedicamentAdministre() {
        return medicamentAdministre;
    }

    /**
     * @param medicamentAdministre the medicamentAdministre to set
     */
    public void setMedicamentAdministre(String medicamentAdministre) {
        this.medicamentAdministre = medicamentAdministre;
    }
    
    

}

