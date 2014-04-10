package SIH;

import java.util.ArrayList;

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.659BA6F5-0E16-24B1-D7C2-904C3486BA03]
// </editor-fold> 
public class ListeDossierMedical {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.649BF734-EE53-E706-84CE-FEB83375CB5B]
    // </editor-fold> 
    private DossierMedical mDossierMedical;
    private ArrayList<DossierMedical> listeDossierMedical;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.301BA8C9-ED0E-2A09-42F1-181F2C1557AF]
    // </editor-fold> 
    public ListeDossierMedical() {
        listeDossierMedical = new ArrayList<DossierMedical>();
    }
    
    public void ajouterDossier(DossierMedical dossiers) {
        listeDossierMedical.add(dossiers);
    }
    
    public ArrayList<DossierMedical> listeDossierMedical(Services s) {
        
        for (int i = 0; i < listeDossierMedical.size(); i++) {
            DossierMedical d = listeDossierMedical.get(i);
                
                    listeDossierMedical.add(d);
        }
        return listeDossierMedical;
        
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.0F987C5B-436D-9E0D-AB6D-BF0BF109C90F]
    // </editor-fold> 
    public DossierMedical getDossierMedical(Services service) {
        return mDossierMedical;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.01E8EE9D-DC9B-794E-5FE8-2CDA0C533188]
    // </editor-fold> 
    public void setDossierMedical(DossierMedical val) {
        this.mDossierMedical = val;
    }

}
