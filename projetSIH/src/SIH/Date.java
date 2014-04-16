package SIH;

import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Locale;

public class Date {

    private int annee;

    private int mois;

    private int jour;

    private String date;

    private String dateType;

    public Date(int jour, int mois, int annee) {
        this.annee = annee;
        this.mois = mois;
        this.jour = jour;
        dateType = "intType";
    }

    public Date(String date) {
        dateType = "StringType";
        this.date = date;
    }

    public Date() {
        annee = 0;
        mois = 0;
        jour = 0;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int val) {
        this.annee = val;
    }

    public int getJour() {
        return jour;
    }

    public void setJour(int val) {
        this.jour = val;
    }

    public int getMois() {
        return mois;
    }

    public void setMois(int val) {
        this.mois = val;
    }

    /**
     * renvoie un affichage formate de la date en fonction de son initialisation
     *
     * @return
     */
    public String toString() {
        String dateToString = null;
        if (dateType.equals("intType")) {

            dateToString = this.formatJourString() + "/" + this.formatMoisString() + "/" + this.formatAnneeString();
        } else if (dateType.equals("StringType")) {
            dateToString = date;
        }
        return dateToString;
    }

    /**
     * renvoie un formattage des 2 digits de l'annee
     *
     * @return
     */
    public String formatAnneeString2digit() {
        String annee2 = String.valueOf(annee);
        annee2 = annee2.substring(2);

        final int nbDigits = 2;
        NumberFormat nbf = NumberFormat.getNumberInstance();
        nbf.setMinimumIntegerDigits(nbDigits);
        nbf.setGroupingUsed(false);
        nbf.setMaximumIntegerDigits(nbDigits);
        annee2 = nbf.format(annee);
        return annee2;
    }

    /**
     * renvoie un affichage formate sur 4 digits de l'annee
     *
     * @return
     */
    public String formatAnneeString() {
        String annee2 = String.valueOf(annee);

        final int nbDigits = 4;
        NumberFormat nbf = NumberFormat.getNumberInstance();
        nbf.setMinimumIntegerDigits(nbDigits);
        nbf.setGroupingUsed(false);
        nbf.setMaximumIntegerDigits(nbDigits);
        annee2 = nbf.format(annee);
        return annee2;
    }

    /**
     * renvoie un affichage formate sur 2 digits du mois
     *
     * @return
     */
    public String formatMoisString() {
        String mois2 = String.valueOf(mois);

        final int nbDigits = 2;
        NumberFormat nbf = NumberFormat.getNumberInstance();
        nbf.setMinimumIntegerDigits(nbDigits);
        nbf.setGroupingUsed(false);
        nbf.setMaximumIntegerDigits(nbDigits);
        mois2 = nbf.format(mois);
        return mois2;
    }

    /**
     * renvoie un affichage formate sur 2 digits du jour
     *
     * @return
     */
    public String formatJourString() {
        String jour2 = String.valueOf(jour);

        final int nbDigits = 2;
        NumberFormat nbf = NumberFormat.getNumberInstance();
        nbf.setMinimumIntegerDigits(nbDigits);
        nbf.setGroupingUsed(false);
        nbf.setMaximumIntegerDigits(nbDigits);
        jour2 = nbf.format(jour);
        return jour2;
    }

    /**
     * renvoie la date du jour
     *
     * @return
     */
    public Date dateJour() {
        Locale locale = Locale.getDefault();
        Calendar cal = Calendar.getInstance(locale);

        jour = cal.get(Calendar.DAY_OF_MONTH);

        mois = cal.get(Calendar.MONTH);
        mois = mois + 1;
        annee = cal.get(Calendar.YEAR);

        Date dj = new Date(jour, mois, annee);

        return dj;

    }

}
