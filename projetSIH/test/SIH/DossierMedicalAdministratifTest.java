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
public class DossierMedicalAdministratifTest {
    
    public DossierMedicalAdministratifTest() {
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
     * Test of getLettreSortie method, of class DossierMedicalAdministratif.
     */
    @Test
    public void testGetLettreSortie() {
        System.out.println("getLettreSortie");
        DossierMedicalAdministratif instance = null;
        LettreSortie expResult = null;
        LettreSortie result = instance.getLettreSortie();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLettreSortie method, of class DossierMedicalAdministratif.
     */
    @Test
    public void testSetLettreSortie() {
        System.out.println("setLettreSortie");
        LettreSortie val = null;
        DossierMedicalAdministratif instance = null;
        instance.setLettreSortie(val);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDate method, of class DossierMedicalAdministratif.
     */
    @Test
    public void testGetDate() {
        System.out.println("getDate");
        DossierMedicalAdministratif instance = null;
        Date expResult = null;
        Date result = instance.getDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDate method, of class DossierMedicalAdministratif.
     */
    @Test
    public void testSetDate() {
        System.out.println("setDate");
        Date val = null;
        DossierMedicalAdministratif instance = null;
        instance.setDate(val);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMedecinPH method, of class DossierMedicalAdministratif.
     */
    @Test
    public void testGetMedecinPH() {
        System.out.println("getMedecinPH");
        DossierMedicalAdministratif instance = null;
        MedecinPH expResult = null;
        MedecinPH result = instance.getMedecinPH();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMedecinPH method, of class DossierMedicalAdministratif.
     */
    @Test
    public void testSetMedecinPH() {
        System.out.println("setMedecinPH");
        MedecinPH val = null;
        DossierMedicalAdministratif instance = null;
        instance.setMedecinPH(val);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrestations method, of class DossierMedicalAdministratif.
     */
    @Test
    public void testGetPrestations() {
        System.out.println("getPrestations");
        DossierMedicalAdministratif instance = null;
        ArrayList<Prestations> expResult = null;
        ArrayList<Prestations> result = instance.getPrestations();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrestations method, of class DossierMedicalAdministratif.
     */
    @Test
    public void testSetPrestations() {
        System.out.println("setPrestations");
        ArrayList<Prestations> val = null;
        DossierMedicalAdministratif instance = null;
        instance.setPrestations(val);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumSejour method, of class DossierMedicalAdministratif.
     */
    @Test
    public void testGetNumSejour() {
        System.out.println("getNumSejour");
        DossierMedicalAdministratif instance = null;
        int expResult = 0;
        int result = instance.getNumSejour();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumSejour method, of class DossierMedicalAdministratif.
     */
    @Test
    public void testSetNumSejour() {
        System.out.println("setNumSejour");
        int val = 0;
        DossierMedicalAdministratif instance = null;
        instance.setNumSejour(val);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPatients method, of class DossierMedicalAdministratif.
     */
    @Test
    public void testGetPatients() {
        System.out.println("getPatients");
        DossierMedicalAdministratif instance = null;
        Patient expResult = null;
        Patient result = instance.getPatients();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPatients method, of class DossierMedicalAdministratif.
     */
    @Test
    public void testSetPatients() {
        System.out.println("setPatients");
        Patient val = null;
        DossierMedicalAdministratif instance = null;
        instance.setPatients(val);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isArchivage method, of class DossierMedicalAdministratif.
     */
    @Test
    public void testIsArchivage() {
        System.out.println("isArchivage");
        DossierMedicalAdministratif instance = null;
        boolean expResult = false;
        boolean result = instance.isArchivage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setArchivage method, of class DossierMedicalAdministratif.
     */
    @Test
    public void testSetArchivage() {
        System.out.println("setArchivage");
        boolean archivage = false;
        DossierMedicalAdministratif instance = null;
        instance.setArchivage(archivage);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getService method, of class DossierMedicalAdministratif.
     */
    @Test
    public void testGetService() {
        System.out.println("getService");
        DossierMedicalAdministratif instance = null;
        Services expResult = null;
        Services result = instance.getService();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setService method, of class DossierMedicalAdministratif.
     */
    @Test
    public void testSetService() {
        System.out.println("setService");
        Services val = null;
        DossierMedicalAdministratif instance = null;
        instance.setService(val);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
