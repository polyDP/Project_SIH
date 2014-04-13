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
public class SejourPatientTest {
    
    public SejourPatientTest() {
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
     * Test of ouvertureDossier method, of class SejourPatient.
     */
    @Test
    public void testOuvertureDossier() {
        System.out.println("ouvertureDossier");
        SejourPatient instance = null;
        instance.ouvertureDossier();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fermetureDossier method, of class SejourPatient.
     */
    @Test
    public void testFermetureDossier() {
        System.out.println("fermetureDossier");
        SejourPatient instance = null;
        instance.fermetureDossier();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEtatDossier method, of class SejourPatient.
     */
    @Test
    public void testIsEtatDossier() {
        System.out.println("isEtatDossier");
        SejourPatient instance = null;
        boolean expResult = false;
        boolean result = instance.isEtatDossier();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEtatDossier method, of class SejourPatient.
     */
    @Test
    public void testSetEtatDossier() {
        System.out.println("setEtatDossier");
        boolean etatDossier = false;
        SejourPatient instance = null;
        instance.setEtatDossier(etatDossier);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
