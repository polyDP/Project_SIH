/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SIH;

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
public class DossierMedicalCliniqueTest {
    
    public DossierMedicalCliniqueTest() {
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
     * Test of getObservation method, of class DossierMedicalClinique.
     */
    @Test
    public void testGetObservation() {
        System.out.println("getObservation");
        DossierMedicalClinique instance = null;
        String expResult = "";
        String result = instance.getObservation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setObservation method, of class DossierMedicalClinique.
     */
    @Test
    public void testSetObservation() {
        System.out.println("setObservation");
        String val = "";
        DossierMedicalClinique instance = null;
        instance.setObservation(val);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrescription method, of class DossierMedicalClinique.
     */
    @Test
    public void testGetPrescription() {
        System.out.println("getPrescription");
        DossierMedicalClinique instance = null;
        String expResult = "";
        String result = instance.getPrescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrescription method, of class DossierMedicalClinique.
     */
    @Test
    public void testSetPrescription() {
        System.out.println("setPrescription");
        String val = "";
        DossierMedicalClinique instance = null;
        instance.setPrescription(val);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOperation method, of class DossierMedicalClinique.
     */
    @Test
    public void testGetOperation() {
        System.out.println("getOperation");
        DossierMedicalClinique instance = null;
        String expResult = "";
        String result = instance.getOperation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOperation method, of class DossierMedicalClinique.
     */
    @Test
    public void testSetOperation() {
        System.out.println("setOperation");
        String val = "";
        DossierMedicalClinique instance = null;
        instance.setOperation(val);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLettreSortie method, of class DossierMedicalClinique.
     */
    @Test
    public void testGetLettreSortie() {
        System.out.println("getLettreSortie");
        DossierMedicalClinique instance = null;
        LettreSortie expResult = null;
        LettreSortie result = instance.getLettreSortie();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLettreSortie method, of class DossierMedicalClinique.
     */
    @Test
    public void testSetLettreSortie() {
        System.out.println("setLettreSortie");
        LettreSortie val = null;
        DossierMedicalClinique instance = null;
        instance.setLettreSortie(val);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getResultat method, of class DossierMedicalClinique.
     */
    @Test
    public void testGetResultat() {
        System.out.println("getResultat");
        DossierMedicalClinique instance = null;
        String expResult = "";
        String result = instance.getResultat();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setResultat method, of class DossierMedicalClinique.
     */
    @Test
    public void testSetResultat() {
        System.out.println("setResultat");
        String val = "";
        DossierMedicalClinique instance = null;
        instance.setResultat(val);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of archivage method, of class DossierMedicalClinique.
     */
    @Test
    public void testArchivage() {
        System.out.println("archivage");
        DossierMedicalClinique instance = null;
        boolean expResult = false;
        boolean result = instance.archivage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
