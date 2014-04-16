package SIH;

import java.util.ArrayList;

public abstract class DossierMedical {

    private String observation;

    private String prescription;

    private ArrayList<Constantes> constantes;

    private Patient patients;

    private Services service;

    public DossierMedical() {

    }

    /**
     * @return the observation
     */
    public String getObservation() {
        return observation;
    }

    /**
     * @param observation the observation to set
     */
    public void setObservation(String observation) {
        this.observation = observation;
    }

    /**
     * @return the prescription
     */
    public String getPrescription() {
        return prescription;
    }

    /**
     * @param prescription the prescription to set
     */
    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }

    /**
     * @return the mConstantes
     */
    public ArrayList<Constantes> getmConstantes() {
        return constantes;
    }

    /**
     * @param mConstantes the mConstantes to set
     */
    public void setmConstantes(ArrayList<Constantes> mConstantes) {
        this.constantes = mConstantes;
    }

    /**
     * @return the mPatients
     */
    public Patient getmPatients() {
        return patients;
    }

    /**
     * @param mPatients the mPatients to set
     */
    public void setmPatients(Patient mPatients) {
        this.patients = mPatients;
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

   

}
