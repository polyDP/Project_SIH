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
public class PrestationsEffectueesTest {
    
    public PrestationsEffectueesTest() {
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
     * Test of getDate method, of class PrestationsEffectuees.
     */
    @Test
    public void testGetDate() {
        System.out.println("getDate");
        PrestationsEffectuees instance = null;
        Date expResult = null;
        Date result = instance.getDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDate method, of class PrestationsEffectuees.
     */
    @Test
    public void testSetDate() {
        System.out.println("setDate");
        Date val = null;
        PrestationsEffectuees instance = null;
        instance.setDate(val);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrestations method, of class PrestationsEffectuees.
     */
    @Test
    public void testGetPrestations() {
        System.out.println("getPrestations");
        PrestationsEffectuees instance = null;
        Prestations expResult = null;
        Prestations result = instance.getPrestations();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrestations method, of class PrestationsEffectuees.
     */
    @Test
    public void testSetPrestations() {
        System.out.println("setPrestations");
        Prestations val = null;
        PrestationsEffectuees instance = null;
        instance.setPrestations(val);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of affichage method, of class PrestationsEffectuees.
     */
    @Test
    public void testAffichage() {
        System.out.println("affichage");
        PrestationsEffectuees instance = null;
        String expResult = "";
        String result = instance.affichage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
