package SIH;

import java.util.ArrayList; 

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.CB26DCDA-382B-90F9-B646-C47F73DA675B]
// </editor-fold> 
public class Patient {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.03BA1327-31A0-A480-CEE5-C9E65958E741]
    // </editor-fold> 
    private String nom;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.0A4D7EA7-982B-56CB-7510-CFA979DE7DF4]
    // </editor-fold> 
    private String prenom;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.825148C0-B5EE-8536-B8B9-42D8600E8A4D]
    // </editor-fold> 
    private String id;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.497DCF02-1673-E4BD-2BB1-D3608F38FA6B]
    // </editor-fold> 
    private String telephone;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.3F7DC2DB-0742-1E79-B9D3-8BBF662D2642]
    // </editor-fold> 
    private String nomMedecinTraitant;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.41908AD7-AD80-3D4C-95FA-C64D91A4ADAA]
    // </editor-fold> 
    private String allergies;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.FBFBEA94-EBEA-39F0-5278-0A65B9333C18]
    // </editor-fold> 
    private String regimeAlimentaire;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.0DCA7252-DF16-18B1-F2C8-B29785BA3996]
    // </editor-fold> 
    private String sexe;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.87877E4F-1673-5C59-434D-6BAFEA7858BF]
    // </editor-fold> 
    private Date date;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.7F7151D7-D1AA-201C-7389-1D7022A5337D]
    // </editor-fold> 
    private Date dateNaissance;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.2F1217D3-CFA1-F84F-21EE-C9ABF7E75311]
    // </editor-fold> 
    private ArrayList<PrestationsEffectuees> prestationsEffectuees;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.33A16E70-B9C0-20B6-5FC3-89D83B4A4966]
    // </editor-fold> 
    private Maladie mMaladie;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.22F9C283-A0F1-9ED5-EC85-870408E0F52A]
    // </editor-fold> 
    private Lits localisation;

    private MedecinPH pHResponsable;
    
    private ArrayList<Maladie> antecedents;
    
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.057BF4F0-7F86-3D07-A63A-107C5971146E]
    // </editor-fold> 
    public Patient (String nom, String prenom, String telephone, String nomMedecinTraitant, String allergies, String regimeAlimentaire, String sexe, Date dateJour, Date dateNaissance, Lits lit) {
        this.nom=nom;
        this.prenom = prenom;
        this.telephone = telephone;
        this.nomMedecinTraitant = nomMedecinTraitant;
        this.allergies = allergies;
        this.regimeAlimentaire = regimeAlimentaire;
        this.sexe=sexe;
        this.date = dateJour;
        this.dateNaissance = dateNaissance;
        this.id=date.getAnnee2();
        this.localisation = lit;
        
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.B13A644E-8B04-A6F3-A633-6121376183DD]
    // </editor-fold> 
    public String getAllergies () {
        return allergies;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.F9A022B2-953B-38B9-716E-0125EC112AC0]
    // </editor-fold> 
    public void setAllergies (String val) {
        this.allergies = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.7FF3BB32-69F7-99EA-3988-977C31D4A674]
    // </editor-fold> 
    public String getId () {
        return id;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.862CED97-8BAC-E34C-17D2-3C59533F8FED]
    // </editor-fold> 
    public void setId (String val) {
        this.id = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.269C8905-8F26-58A0-C2E9-70980A679458]
    // </editor-fold> 
    public Lits getLocalisation () {
        return localisation;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.A39D5CD6-7498-0CE5-2585-CF4C1000E417]
    // </editor-fold> 
    public void setLocalisation (Lits val) {
        this.localisation = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.6AF9DA82-4F23-852D-8242-24DA7CC330D1]
    // </editor-fold> 
    public Date getDate () {
        return date;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.04AB8DF0-BDA9-01D9-6081-C426EC1DBB2A]
    // </editor-fold> 
    public void setDate (Date val) {
        this.date = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.CD9B4C7C-4867-37EE-07FF-98A8D8BBFA29]
    // </editor-fold> 
    public Date getDateNaissance () {
        return dateNaissance;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.E52B9E8A-1612-9BAB-BA4E-53B67C14BF3A]
    // </editor-fold> 
    public void setDateNaissance (Date val) {
        this.dateNaissance = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.AB993BA4-5494-5218-3E68-6A6339F346DD]
    // </editor-fold> 
    public Maladie getMaladie () {
        return mMaladie;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.8FF96BB4-7DF9-5969-43FE-23A31DBDD487]
    // </editor-fold> 
    public void setMaladie (Maladie val) {
        this.mMaladie = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.02C87013-1C8E-88A5-29F2-100299630378]
    // </editor-fold> 
    public ArrayList<PrestationsEffectuees> getPrestationsEffectuees () {
        return prestationsEffectuees;
    }
    

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.662AD0EF-9497-2EE3-DD5B-C0E02E297FF7]
    // </editor-fold> 
    public void setPrestationsEffectuees (ArrayList<PrestationsEffectuees> val) {
        this.prestationsEffectuees = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.DC77F7AD-8D4E-2158-C1C2-0D7E1F5C6241]
    // </editor-fold> 
    public String getNom () {
        return nom;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.2D3F5B4D-089A-D3D1-CFF2-AE1614910FA6]
    // </editor-fold> 
    public void setNom (String val) {
        this.nom = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.BC3A5789-BB6A-A6F7-7870-B8A261A20469]
    // </editor-fold> 
    public String getNomMedecinTraitant () {
        return nomMedecinTraitant;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.5878B51F-E47B-B32E-27BD-94734EC0F0C8]
    // </editor-fold> 
    public void setNomMedecinTraitant (String val) {
        this.nomMedecinTraitant = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.42703460-5D37-422B-CB26-BBD76C193256]
    // </editor-fold> 
    public String getPrenom () {
        return prenom;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.1BFDF451-7B45-6196-E21C-568EB8341A83]
    // </editor-fold> 
    public void setPrenom (String val) {
        this.prenom = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.9FA66D35-B313-4C80-43C3-BDDEAB274841]
    // </editor-fold> 
    public String getRegimeAlimentaire () {
        return regimeAlimentaire;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.436DDAE6-823E-E61A-55A2-CC874668D155]
    // </editor-fold> 
    public void setRegimeAlimentaire (String val) {
        this.regimeAlimentaire = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.8F482D37-5867-AA10-B4F7-A156C85ECEFE]
    // </editor-fold> 
    public String getSexe () {
        return sexe;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.6C65A561-39EC-ACB9-3EAF-0FBCED8A5656]
    // </editor-fold> 
    public void setSexe (String val) {
        this.sexe = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.2A61DF55-A73F-F3C6-54CA-687A60B56BCE]
    // </editor-fold> 
    public String getTelephone () {
        return telephone;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.36F561FF-AE30-EC3A-6D51-D91981A72555]
    // </editor-fold> 
    public void setTelephone (String val) {
        this.telephone = val;
    }
    
    public String IPP(){
        String IPP = getDate().getAnnee2();
        IPP = IPP + "0000000";
        return IPP;
    }
   public String toString(){
       return nom +" "+ prenom;
   }

    
    public MedecinPH getPHResponsable() {
        return pHResponsable;
    }

    
    public void setPHResponsable(MedecinPH pHResponsable) {
        this.pHResponsable = pHResponsable;
    }

    public String affichagePatient(){
        String aff = null;
        aff = " nom patient : " + nom + "\n";
        aff = aff + " prenom patient : " + prenom + "\n";
        aff = aff + " sexe patient : " + sexe + "\n";
        aff = aff + " numero telephone patient : " + telephone + "\n";
        aff = aff + " nom medecin traitant : " + nomMedecinTraitant + "\n";
        aff = aff + " maladie patient : " + this.getMaladie().toString() + "\n";
        aff = aff + " antecedents patient : " + this.afficheAntecedants(this);
        return aff;
        
    }
    
    public String afficheAntecedants(Patient p){
        antecedents = new ArrayList<>();
        String antecedent = " ";
        
        // va chercher dans la base de données les antecedants du patient sous forme de maladie
       // if (base de données non vide)
        Date d = new Date(1992,05,21);
        Maladie m = new Maladie("ceci","cela",d);

        antecedents.add(m);
        
        for(int i = 0; i< antecedents.size();i++){
            antecedent = antecedent + "date : " + antecedents.get(i).getDateMaladie().toString() + " motif : " +antecedents.get(i).getMotifHospitalisation() + ", Diagnostique : " + antecedents.get(i).getDiagnostique();  
        }
        return antecedent;
        
        //else {
                //return "le patient n'a pas d'antécédents"
                //}
    }
    
    
}

