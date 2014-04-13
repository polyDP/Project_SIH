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
public class DossierMedicalTest {
    
    public DossierMedicalTest() {
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
     * Test of getConstantes method, of class DossierMedical.
     */
    @Test
    public void testGetConstantes() {
        System.out.println("getConstantes");
        DossierMedical instance = new DossierMedicalImpl();
        ArrayList<Constantes> expResult = null;
        ArrayList<Constantes> result = instance.getConstantes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setConstantes method, of class DossierMedical.
     */
    @Test
    public void testSetConstantes() {
        System.out.println("setConstantes");
        ArrayList<Constantes> val = null;
        DossierMedical instance = new DossierMedicalImpl();
        instance.setConstantes(val);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPatients method, of class DossierMedical.
     */
    @Test
    public void testGetPatients() {
        System.out.println("getPatients");
        DossierMedical instance = new DossierMedicalImpl();
        Patient expResult = null;
        Patient result = instance.getPatients();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPatients method, of class DossierMedical.
     */
    @Test
    public void testSetPatients() {
        System.out.println("setPatients");
        Patient val = null;
        DossierMedical instance = new DossierMedicalImpl();
        instance.setPatients(val);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getServices method, of class DossierMedical.
     */
    @Test
    public void testGetServices() {
        System.out.println("getServices");
        DossierMedical instance = new DossierMedicalImpl();
        Services expResult = null;
        Services result = instance.getServices();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setServices method, of class DossierMedical.
     */
    @Test
    public void testSetServices() {
        System.out.println("setServices");
        Services val = null;
        DossierMedical instance = new DossierMedicalImpl();
        instance.setServices(val);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getObservation method, of class DossierMedical.
     */
    @Test
    public void testGetObservation() {
        System.out.println("getObservation");
        DossierMedical instance = new DossierMedicalImpl();
        String expResult = "";
        String result = instance.getObservation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setObservation method, of class DossierMedical.
     */
    @Test
    public void testSetObservation() {
        System.out.println("setObservation");
        String val = "";
        DossierMedical instance = new DossierMedicalImpl();
        instance.setObservation(val);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrescription method, of class DossierMedical.
     */
    @Test
    public void testGetPrescription() {
        System.out.println("getPrescription");
        DossierMedical instance = new DossierMedicalImpl();
        String expResult = "";
        String result = instance.getPrescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrescription method, of class DossierMedical.
     */
    @Test
    public void testSetPrescription() {
        System.out.println("setPrescription");
        String val = "";
        DossierMedical instance = new DossierMedicalImpl();
        instance.setPrescription(val);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class DossierMedicalImpl extends DossierMedical {
    }
    
}
