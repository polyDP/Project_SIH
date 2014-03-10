package SIH;

import java.util.ArrayList;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.723C44FA-E95F-1949-2829-54F7208CCB84]
// </editor-fold> 
public class Maladie {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.FDCAEFF5-94A2-43E1-3FE6-ECC64DF47FBF]
    // </editor-fold> 
    private String motifHospitalisation;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.D88BF484-7B91-17AD-546C-71914FCAC502]
    // </editor-fold> 
    private String diagnostique;
    
    private Date dateMaladie;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.8A1BFEFE-B057-2A39-6474-96DFFF3490FD]
    // </editor-fold> 
    public Maladie (String motifHospitalisation, String diagnostique, Date dateMaladie) {
        this.motifHospitalisation = motifHospitalisation;
        this.diagnostique = diagnostique;
        this.dateMaladie = dateMaladie;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.FDC85551-6D5C-82FE-0990-BA76BA16B488]
    // </editor-fold> 
    public String getDiagnostique () {
        return diagnostique;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.C81A6DC4-95EA-BF1B-A2D3-0B45F4A5C92C]
    // </editor-fold> 
    public void setDiagnostique (String val) {
        this.diagnostique = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.029AFDF5-FD28-E5A4-D1BE-5540A67733B6]
    // </editor-fold> 
    public String getMotifHospitalisation () {
        return motifHospitalisation;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.F91E4B40-FA6E-E3AF-2B22-06538D18EC1D]
    // </editor-fold> 
    public void setMotifHospitalisation (String val) {
        this.motifHospitalisation = val;
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
   
    public String toString(){
        return "Date : " + dateMaladie + " Motif : " + motifHospitalisation + " Diagnostique : " + diagnostique;
    }

    
}

