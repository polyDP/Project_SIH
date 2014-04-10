package SIH;

import java.util.ArrayList;

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.052478CC-0607-8777-C772-D62C7D622551]
// </editor-fold> 
public class GestionLits {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.8EFDF072-FCC6-30EE-292E-60EABFDE5640]
    // </editor-fold> 
    private ArrayList<Lit> mLit;

    private Services service;

    private Lit lit;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.C705E0D4-A90D-AF37-8C1B-7596774C3938]
    // </editor-fold> 
    public GestionLits(Services s) {
        if (s == Services.Chirurgie) {
            mLit = new ArrayList();
            int nbChambres=300;
            int numDepart=100;
            int index = numDepart;
            int i;
            for (i = 0; i < nbChambres; i++) {
                
                lit = new Lit(index, "P", null);
                mLit.add(lit);
                lit = new Lit(index, "F", null);
                mLit.add(lit);
                index++;
            }
            this.setLits(mLit);
            
        } else if (s == Services.Gynecologie_obstetrique) {
            mLit = new ArrayList();
            int nbChambres=200;
            int numDepart=400;
            int index = numDepart;
            int i;
            for (i = 0; i < nbChambres; i++) {

                lit = new Lit(index, "P", null);
                mLit.add(lit);
                lit = new Lit(index, "F", null);
                mLit.add(lit);
                 index++;
            }
            this.setLits(mLit);
            
        }
    }
    
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.C9BD0777-88D2-C97B-44DB-D9BC5FCCDFB6]
    // </editor-fold> 
    public ArrayList<Lit> getLits() {
        return mLit;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.AC3B5EAB-BD23-1EC5-1F8A-6FFBAB407227]
    // </editor-fold> 
    public void setLits(ArrayList<Lit> val) {
        this.mLit = val;
    }

    public String afficherLits() {
        String aff = "";
        for (int i = 0; i < mLit.size(); i++) {
            aff = aff + mLit.get(i).afficherLit() + "\n";
        }
        return aff;
    }

    public int getIndex(Lit l) {

        int i = 0;
        while ((!this.mLit.get(i).idLit().equals(l.idLit()))) {
            i++;
            
            if (i >= this.mLit.size()) {
                System.out.println("le lit demandé ne fais pas parti du bon service, le numéro de chambre est trop grand");
                i = -1;
                
            } else if (this.mLit.get(0).getNumero()>l.getNumero()) {
                System.out.println("le lit demandé ne fais pas parti du bon service, le numéro de chambre est trop petit");
            i = -2;
        }
        }

        return i;

    }

    public void ajouterPatient(Patient p) {

        Lit l = new Lit(p.getLocalisation().getNumero(), p.getLocalisation().getCote(), p);

        this.mLit.set(getIndex(l), l);
        this.setLits(mLit);

    }
}
