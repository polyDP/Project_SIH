/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SIH;

/**
 *
 * @author Baptiste-PC
 */
public class SejourPatient {

    private boolean etatDossier;

    private NumeroSejour numSej;

    public SejourPatient(Patient p, NumeroSejour numSej) {
        etatDossier = false;
        this.numSej = numSej;

    }

    public void ouvertureDossier() {
        setEtatDossier(true);
    }

    public void fermetureDossier() {
        setEtatDossier(false);
    }

    /**
     * @return the etatDossier
     */
    public boolean isEtatDossier() {
        return etatDossier;
    }

    /**
     * @param etatDossier the etatDossier to set
     */
    public void setEtatDossier(boolean etatDossier) {
        this.etatDossier = etatDossier;
    }

}
