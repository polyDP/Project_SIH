/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SIH;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ludivine
 */
public class PatientTest {
    
    public PatientTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getAllergies method, of class Patient.
     */
    @Test
    public void testGetAllergies() {
        System.out.println("getAllergies");
        Patient instance = null;
        String expResult = "";
        String result = instance.getAllergies();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAllergies method, of class Patient.
     */
    @Test
    public void testSetAllergies() {
        System.out.println("setAllergies");
        String val = "";
        Patient instance = null;
        instance.setAllergies(val);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLocalisation method, of class Patient.
     */
    @Test
    public void testGetLocalisation() {
        System.out.println("getLocalisation");
        Patient instance = null;
        Lit expResult = null;
        Lit result = instance.getLocalisation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLocalisation method, of class Patient.
     */
    @Test
    public void testSetLocalisation() {
        System.out.println("setLocalisation");
        Lit val = null;
        Patient instance = null;
        instance.setLocalisation(val);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDateAdmission method, of class Patient.
     */
    @Test
    public void testGetDateAdmission() {
        System.out.println("getDateAdmission");
        Patient instance = null;
        Date expResult = null;
        Date result = instance.getDateAdmission();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDateAdmission method, of class Patient.
     */
    @Test
    public void testSetDateAdmission() {
        System.out.println("setDateAdmission");
        Date val = null;
        Patient instance = null;
        instance.setDateAdmission(val);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDateNaissance method, of class Patient.
     */
    @Test
    public void testGetDateNaissance() {
        System.out.println("getDateNaissance");
        Patient instance = null;
        Date expResult = null;
        Date result = instance.getDateNaissance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDateNaissance method, of class Patient.
     */
    @Test
    public void testSetDateNaissance() {
        System.out.println("setDateNaissance");
        Date val = null;
        Patient instance = null;
        instance.setDateNaissance(val);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMaladie method, of class Patient.
     */
    @Test
    public void testGetMaladie() {
        System.out.println("getMaladie");
        Patient instance = null;
        Maladie expResult = null;
        Maladie result = instance.getMaladie();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMaladie method, of class Patient.
     */
    @Test
    public void testSetMaladie() {
        System.out.println("setMaladie");
        Maladie val = null;
        Patient instance = null;
        instance.setMaladie(val);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrestationsEffectuees method, of class Patient.
     */
    @Test
    public void testGetPrestationsEffectuees() {
        System.out.println("getPrestationsEffectuees");
        Patient instance = null;
        ArrayList<PrestationsEffectuees> expResult = null;
        ArrayList<PrestationsEffectuees> result = instance.getPrestationsEffectuees();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrestationsEffectuees method, of class Patient.
     */
    @Test
    public void testSetPrestationsEffectuees() {
        System.out.println("setPrestationsEffectuees");
        ArrayList<PrestationsEffectuees> val = null;
        Patient instance = null;
        instance.setPrestationsEffectuees(val);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNom method, of class Patient.
     */
    @Test
    public void testGetNom() {
        System.out.println("getNom");
        Patient instance = null;
        String expResult = "";
        String result = instance.getNom();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNom method, of class Patient.
     */
    @Test
    public void testSetNom() {
        System.out.println("setNom");
        String val = "";
        Patient instance = null;
        instance.setNom(val);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNomMedecinTraitant method, of class Patient.
     */
    @Test
    public void testGetNomMedecinTraitant() {
        System.out.println("getNomMedecinTraitant");
        Patient instance = null;
        String expResult = "";
        String result = instance.getNomMedecinTraitant();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNomMedecinTraitant method, of class Patient.
     */
    @Test
    public void testSetNomMedecinTraitant() {
        System.out.println("setNomMedecinTraitant");
        String val = "";
        Patient instance = null;
        instance.setNomMedecinTraitant(val);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrenom method, of class Patient.
     */
    @Test
    public void testGetPrenom() {
        System.out.println("getPrenom");
        Patient instance = null;
        String expResult = "";
        String result = instance.getPrenom();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrenom method, of class Patient.
     */
    @Test
    public void testSetPrenom() {
        System.out.println("setPrenom");
        String val = "";
        Patient instance = null;
        instance.setPrenom(val);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRegimeAlimentaire method, of class Patient.
     */
    @Test
    public void testGetRegimeAlimentaire() {
        System.out.println("getRegimeAlimentaire");
        Patient instance = null;
        String expResult = "";
        String result = instance.getRegimeAlimentaire();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRegimeAlimentaire method, of class Patient.
     */
    @Test
    public void testSetRegimeAlimentaire() {
        System.out.println("setRegimeAlimentaire");
        String val = "";
        Patient instance = null;
        instance.setRegimeAlimentaire(val);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSexe method, of class Patient.
     */
    @Test
    public void testGetSexe() {
        System.out.println("getSexe");
        Patient instance = null;
        String expResult = "";
        String result = instance.getSexe();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSexe method, of class Patient.
     */
    @Test
    public void testSetSexe() {
        System.out.println("setSexe");
        String val = "";
        Patient instance = null;
        instance.setSexe(val);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTelephone method, of class Patient.
     */
    @Test
    public void testGetTelephone() {
        System.out.println("getTelephone");
        Patient instance = null;
        String expResult = "";
        String result = instance.getTelephone();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTelephone method, of class Patient.
     */
    @Test
    public void testSetTelephone() {
        System.out.println("setTelephone");
        String val = "";
        Patient instance = null;
        instance.setTelephone(val);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Patient.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Patient instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPHResponsable method, of class Patient.
     */
    @Test
    public void testGetPHResponsable() {
        System.out.println("getPHResponsable");
        Patient instance = null;
        MedecinPH expResult = null;
        MedecinPH result = instance.getPHResponsable();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPHResponsable method, of class Patient.
     */
    @Test
    public void testSetPHResponsable() {
        System.out.println("setPHResponsable");
        MedecinPH pHResponsable = null;
        Patient instance = null;
        instance.setPHResponsable(pHResponsable);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of affichagePatient method, of class Patient.
     */
    @Test
    public void testAffichagePatient() {
        System.out.println("affichagePatient");
        Patient instance = null;
        String expResult = "";
        String result = instance.affichagePatient();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of afficheAntecedants method, of class Patient.
     */
    @Test
    public void testAfficheAntecedants() {
        System.out.println("afficheAntecedants");
        Patient p = null;
        Patient instance = null;
        String expResult = "";
        String result = instance.afficheAntecedants(p);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAdresse method, of class Patient.
     */
    @Test
    public void testGetAdresse() {
        System.out.println("getAdresse");
        Patient instance = null;
        Adresse expResult = null;
        Adresse result = instance.getAdresse();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAdresse method, of class Patient.
     */
    @Test
    public void testSetAdresse() {
        System.out.println("setAdresse");
        Adresse adresse = null;
        Patient instance = null;
        instance.setAdresse(adresse);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIpp method, of class Patient.
     */
    @Test
    public void testGetIpp() {
        System.out.println("getIpp");
        Patient instance = null;
        IPP expResult = null;
        IPP result = instance.getIpp();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIpp method, of class Patient.
     */
    @Test
    public void testSetIpp() {
        System.out.println("setIpp");
        IPP ipp = null;
        Patient instance = null;
        instance.setIpp(ipp);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
