package SIH;

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Locale;

// #[regen=yes,id=DCE.2CAF514F-54A4-C6A2-E022-9FA5DB6E537E]
// </editor-fold> 
public class Date {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.464E1913-6ED6-3C1B-5947-BC3857D7851D]
    // </editor-fold> 
    private int annee;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.0E89D8A7-9D9F-E0F9-FE45-E0358A567E43]
    // </editor-fold> 
    private int mois;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.3E305776-E6EF-08F3-F0B0-AA9D9F452582]
    // </editor-fold> 
    private int jour;
    
    private String date;
    
    private String dateType;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.DFF8AA20-9D48-5929-07E0-212FED1A4199]
    // </editor-fold> 
    public Date(int jour,int mois, int annee) {
        this.annee = annee;
        this.mois = mois;
        this.jour = jour;
        
        dateType = "intType";
    }
    public Date(){
    annee = 0;
    mois=0;
    jour=0;
}
    public Date(String date){
        dateType = "StringType";
        this.date = date;
    }
    

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.54B460C6-AC3B-3E5D-63BC-A7D37D026AB9]
    // </editor-fold> 
    public int getAnnee() {
        return annee;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.64EE229C-7137-89FD-FDE2-7C6E601056BD]
    // </editor-fold> 
    public void setAnnee(int val) {
        this.annee = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.0DECBFAC-C682-2A54-7200-50B5F9735F88]
    // </editor-fold> 
    public int getJour() {
        return jour;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.25380BE7-5F37-797A-3FFC-6CB3276CD10F]
    // </editor-fold> 
    public void setJour(int val) {
        this.jour = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.EC7918FF-9CFF-C04F-7B9A-B072F0975B40]
    // </editor-fold> 
    public int getMois() {
        return mois;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.326ACF4E-62F4-542E-1D69-431282ECE339]
    // </editor-fold> 
    public void setMois(int val) {
        this.mois = val;
    }

    public String toString() {
        String dateToString=null;
        if(dateType.equals("intType")){
            
        dateToString = this.formatJourString() + "/" + this.formatMoisString() + "/" + this.formatAnneeString();
        } else if (dateType.equals("StringType")){
            dateToString = date;
        }
        return dateToString;
    }

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
    
    public Date dateJour(){
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
