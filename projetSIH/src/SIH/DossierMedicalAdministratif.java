package SIH;

import java.util.ArrayList;

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.DA8F361C-507F-BFBD-ADE5-16A21B0B9C18]
// </editor-fold> 
public class DossierMedicalAdministratif {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.8AD8CDEB-FE6E-6065-4A65-E383844673A0]
    // </editor-fold> 
    private Patient patients;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.A10E2CC6-9C9B-2AE2-7CA0-18D703482500]
    // </editor-fold> 
    private int numSejour;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.4B359980-11EA-BB4A-C3FF-A3026FE4D35D]
    // </editor-fold> 
    private MedecinPH medecinPH;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.D4B2D652-F2FE-F027-6A30-6C4682280AA9]
    // </editor-fold> 
    private ArrayList<Prestations> prestations;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.4687BE56-7C10-1372-5B2E-FA7CC8276D2A]
    // </editor-fold> 
    private LettreSortie lettreSortie;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.51D22F73-BCEA-AB58-B833-7A5B99E6EBE1]
    // </editor-fold> 
    private Date mDate;

    private boolean archivage;

    private Services service;
    
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.F95856C4-B092-31B1-A413-E0234FD2BF05]
    // </editor-fold> 
    public DossierMedicalAdministratif(Patient p, MedecinPH m) {
        this.patients = p;
        this.medecinPH = m;

    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.3D79F658-6E64-037D-19AB-84FDC3A70EA0]
    // </editor-fold> 
    public LettreSortie getLettreSortie() {
        return lettreSortie;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.D228CBAA-7FBD-0551-DFCC-C1472966AB35]
    // </editor-fold> 
    public void setLettreSortie(LettreSortie val) {
        this.lettreSortie = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.87A37820-2CA7-0DB8-B427-4634E4D8F220]
    // </editor-fold> 
    public Date getDate() {
        return mDate;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.791FFC40-63ED-F64A-5B84-35C40172E734]
    // </editor-fold> 
    public void setDate(Date val) {
        this.mDate = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.A5BC3C8A-48B8-B95A-173C-81B281118AD2]
    // </editor-fold> 
    public MedecinPH getMedecinPH() {
        return medecinPH;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.FF79214C-B2D8-70BC-5445-5845C107B3E4]
    // </editor-fold> 
    public void setMedecinPH(MedecinPH val) {
        this.medecinPH = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.A088A2EB-C2AE-340A-5CDB-754B38C80E8B]
    // </editor-fold> 
    public ArrayList<Prestations> getPrestations() {
        return prestations;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.1398B10A-9381-9C64-9594-D149FAB7A98A]
    // </editor-fold> 
    public void setPrestations(ArrayList<Prestations> val) {
        this.prestations = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.71BF60A4-2682-8D23-4EA0-3CB1853F6722]
    // </editor-fold> 
    public int getNumSejour() {
        return numSejour;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.92A23BE4-C253-1E9D-3383-09CC68ED5180]
    // </editor-fold> 
    public void setNumSejour(int val) {
        this.numSejour = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.F70DD985-D6AB-3EB4-7D69-DD880B2A5C0F]
    // </editor-fold> 
    public Patient getPatients() {
        return patients;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.AECCBD94-A1D5-559D-E43A-2CA987DA3440]
    // </editor-fold> 
    public void setPatients(Patient val) {
        this.patients = val;
    }

    /**
     * @return the archivage
     */
    public boolean isArchivage() {
        return archivage;
    }

    /**
     * @param archivage the archivage to set
     */
    public void setArchivage(boolean archivage) {
        this.archivage = archivage;
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
