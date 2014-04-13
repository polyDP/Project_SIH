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
public class GestionLitsTest {
    
    public GestionLitsTest() {
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
     * Test of getLits method, of class GestionLits.
     */
    @Test
    public void testGetLits() {
        System.out.println("getLits");
        GestionLits instance = null;
        ArrayList<Lit> expResult = null;
        ArrayList<Lit> result = instance.getLits();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLits method, of class GestionLits.
     */
    @Test
    public void testSetLits() {
        System.out.println("setLits");
        ArrayList<Lit> val = null;
        GestionLits instance = null;
        instance.setLits(val);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of afficherLits method, of class GestionLits.
     */
    @Test
    public void testAfficherLits() {
        System.out.println("afficherLits");
        GestionLits instance = null;
        String expResult = "";
        String result = instance.afficherLits();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIndex method, of class GestionLits.
     */
    @Test
    public void testGetIndex() {
        System.out.println("getIndex");
        Lit l = null;
        GestionLits instance = null;
        int expResult = 0;
        int result = instance.getIndex(l);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ajouterPatient method, of class GestionLits.
     */
    @Test
    public void testAjouterPatient() {
        System.out.println("ajouterPatient");
        Patient p = null;
        GestionLits instance = null;
        instance.ajouterPatient(p);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
