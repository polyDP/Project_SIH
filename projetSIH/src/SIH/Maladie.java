package SIH;

import java.util.ArrayList;

public class Maladie {

    private String motifHospitalisation;

    private String diagnostique;

    private Date dateMaladie;

    public Maladie(String motifHospitalisation, String diagnostique, Date dateMaladie) {
        this.motifHospitalisation = motifHospitalisation;
        this.diagnostique = diagnostique;
        this.dateMaladie = dateMaladie;
    }

    public String toString() {
        return "Date : " + dateMaladie + " Motif : " + motifHospitalisation + " Diagnostique : " + diagnostique;
    }

    /**
     * @return the motifHospitalisation
     */
    public String getMotifHospitalisation() {
        return motifHospitalisation;
    }

    /**
     * @param motifHospitalisation the motifHospitalisation to set
     */
    public void setMotifHospitalisation(String motifHospitalisation) {
        this.motifHospitalisation = motifHospitalisation;
    }

    /**
     * @return the diagnostique
     */
    public String getDiagnostique() {
        return diagnostique;
    }

    /**
     * @param diagnostique the diagnostique to set
     */
    public void setDiagnostique(String diagnostique) {
        this.diagnostique = diagnostique;
    }

    /**
     * @return the dateMaladie
     */
    public Date getDateMaladie() {
        return dateMaladie;
    }

    /**
     * @param dateMaladie the dateMaladie to set
     */
    public void setDateMaladie(Date dateMaladie) {
        this.dateMaladie = dateMaladie;
    }

}
