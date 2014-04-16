package SIH;



public class DossierMedicalClinique extends DossierMedical {

    private String Operation;

    private String resultat;

    private LettreSortie mLettreSortie;
    
    private NumeroSejour numSej;

    public DossierMedicalClinique (Patient p, Services s) {
        
        
    }

    /**
     * @return the Operation
     */
    public String getOperation() {
        return Operation;
    }

    /**
     * @param Operation the Operation to set
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * @return the resultat
     */
    public String getResultat() {
        return resultat;
    }

    /**
     * @param resultat the resultat to set
     */
    public void setResultat(String resultat) {
        this.resultat = resultat;
    }

    /**
     * @return the mLettreSortie
     */
    public LettreSortie getmLettreSortie() {
        return mLettreSortie;
    }

    /**
     * @param mLettreSortie the mLettreSortie to set
     */
    public void setmLettreSortie(LettreSortie mLettreSortie) {
        this.mLettreSortie = mLettreSortie;
    }

    /**
     * @return the numSej
     */
    public NumeroSejour getNumSej() {
        return numSej;
    }

    /**
     * @param numSej the numSej to set
     */
    public void setNumSej(NumeroSejour numSej) {
        this.numSej = numSej;
    }

    

}

