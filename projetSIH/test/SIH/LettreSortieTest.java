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
public class LettreSortieTest {
    
    public LettreSortieTest() {
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
     * Test of getMessage method, of class LettreSortie.
     */
    @Test
    public void testGetMessage() {
        System.out.println("getMessage");
        LettreSortie instance = null;
        String expResult = "";
        String result = instance.getMessage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMessage method, of class LettreSortie.
     */
    @Test
    public void testSetMessage() {
        System.out.println("setMessage");
        String val = "";
        LettreSortie instance = null;
        instance.setMessage(val);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDossierMedical method, of class LettreSortie.
     */
    @Test
    public void testGetDossierMedical() {
        System.out.println("getDossierMedical");
        LettreSortie instance = null;
        MedecinPH expResult = null;
        MedecinPH result = instance.getDossierMedical();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDossierMedical method, of class LettreSortie.
     */
    @Test
    public void testSetDossierMedical() {
        System.out.println("setDossierMedical");
        MedecinPH val = null;
        LettreSortie instance = null;
        instance.setDossierMedical(val);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
