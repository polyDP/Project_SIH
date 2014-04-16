package SIH;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.2B21EDB3-3477-2144-BA06-224C47A6A7AF]
// </editor-fold> 
public class Constantes {


    private int taille;

    private double poids;

    private String tension;

    private double glycemie;
    
    private double temperature;
    
    private String autreSoins;
    
    private Patient patient;
    
    private String prelevement;
    
    private String medicamentAdministre;
    


    public Constantes (int taille,double poids,String tension,double glycemie,double temperature,String autreSoins) {
        this.taille = taille;
        this.poids = poids;
        this.tension = tension;
        this.glycemie = glycemie;
        this.temperature= temperature;
        this.autreSoins=autreSoins;
    }


    public double getGlycemie () {
        return glycemie;
    }


    public void setGlycemie (double val) {
        this.glycemie = val;
    }


    public double getPoids () {
        return poids;
    }


    public void setPoids (double val) {
        this.poids = val;
    }


    public int getTaille () {
        return taille;
    }


    public void setTaille (int val) {
        this.taille = val;
    }


    public String getTension () {
        return tension;
    }


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

