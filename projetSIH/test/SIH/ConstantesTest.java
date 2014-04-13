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
public class ConstantesTest {
    
    public ConstantesTest() {
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
     * Test of getGlycemie method, of class Constantes.
     */
    @Test
    public void testGetGlycemie() {
        System.out.println("getGlycemie");
        Constantes instance = null;
        double expResult = 0.0;
        double result = instance.getGlycemie();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGlycemie method, of class Constantes.
     */
    @Test
    public void testSetGlycemie() {
        System.out.println("setGlycemie");
        double val = 0.0;
        Constantes instance = null;
        instance.setGlycemie(val);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPoids method, of class Constantes.
     */
    @Test
    public void testGetPoids() {
        System.out.println("getPoids");
        Constantes instance = null;
        double expResult = 0.0;
        double result = instance.getPoids();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPoids method, of class Constantes.
     */
    @Test
    public void testSetPoids() {
        System.out.println("setPoids");
        double val = 0.0;
        Constantes instance = null;
        instance.setPoids(val);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTaille method, of class Constantes.
     */
    @Test
    public void testGetTaille() {
        System.out.println("getTaille");
        Constantes instance = null;
        int expResult = 0;
        int result = instance.getTaille();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTaille method, of class Constantes.
     */
    @Test
    public void testSetTaille() {
        System.out.println("setTaille");
        int val = 0;
        Constantes instance = null;
        instance.setTaille(val);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTension method, of class Constantes.
     */
    @Test
    public void testGetTension() {
        System.out.println("getTension");
        Constantes instance = null;
        String expResult = "";
        String result = instance.getTension();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTension method, of class Constantes.
     */
    @Test
    public void testSetTension() {
        System.out.println("setTension");
        String val = "";
        Constantes instance = null;
        instance.setTension(val);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTemperature method, of class Constantes.
     */
    @Test
    public void testGetTemperature() {
        System.out.println("getTemperature");
        Constantes instance = null;
        double expResult = 0.0;
        double result = instance.getTemperature();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTemperature method, of class Constantes.
     */
    @Test
    public void testSetTemperature() {
        System.out.println("setTemperature");
        double temperature = 0.0;
        Constantes instance = null;
        instance.setTemperature(temperature);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAutreSoins method, of class Constantes.
     */
    @Test
    public void testGetAutreSoins() {
        System.out.println("getAutreSoins");
        Constantes instance = null;
        String expResult = "";
        String result = instance.getAutreSoins();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAutreSoins method, of class Constantes.
     */
    @Test
    public void testSetAutreSoins() {
        System.out.println("setAutreSoins");
        String autreSoins = "";
        Constantes instance = null;
        instance.setAutreSoins(autreSoins);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPatient method, of class Constantes.
     */
    @Test
    public void testGetPatient() {
        System.out.println("getPatient");
        Constantes instance = null;
        Patient expResult = null;
        Patient result = instance.getPatient();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPatient method, of class Constantes.
     */
    @Test
    public void testSetPatient() {
        System.out.println("setPatient");
        Patient patient = null;
        Constantes instance = null;
        instance.setPatient(patient);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrelevement method, of class Constantes.
     */
    @Test
    public void testGetPrelevement() {
        System.out.println("getPrelevement");
        Constantes instance = null;
        String expResult = "";
        String result = instance.getPrelevement();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrelevement method, of class Constantes.
     */
    @Test
    public void testSetPrelevement() {
        System.out.println("setPrelevement");
        String prelevement = "";
        Constantes instance = null;
        instance.setPrelevement(prelevement);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMedicamentAdministre method, of class Constantes.
     */
    @Test
    public void testGetMedicamentAdministre() {
        System.out.println("getMedicamentAdministre");
        Constantes instance = null;
        String expResult = "";
        String result = instance.getMedicamentAdministre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMedicamentAdministre method, of class Constantes.
     */
    @Test
    public void testSetMedicamentAdministre() {
        System.out.println("setMedicamentAdministre");
        String medicamentAdministre = "";
        Constantes instance = null;
        instance.setMedicamentAdministre(medicamentAdministre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
