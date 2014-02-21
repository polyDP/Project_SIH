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

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.CB2A5D7C-351E-DFA0-AB71-6E95306838E8]
    // </editor-fold> 
    private ArrayList<String> antecedents;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.8A1BFEFE-B057-2A39-6474-96DFFF3490FD]
    // </editor-fold> 
    public Maladie (String motifHospitalisation, String diagnostique,ArrayList<String> antecedents ) {
        this.motifHospitalisation = motifHospitalisation;
        this.diagnostique = diagnostique;
        this.antecedents = antecedents;
       
        
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

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.E4ACC813-30F3-62B2-3C53-98F2262227D0]
    // </editor-fold> 
    public ArrayList<String> getAntecedents () {
        return antecedents;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.A187CA8E-1F80-879A-2831-3A740F2F637F]
    // </editor-fold> 
    public void setAntecedents (ArrayList<String> val) {
        this.antecedents = val;
    }

   
    
}

