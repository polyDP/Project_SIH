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
public class MedecinPHTest {
    
    public MedecinPHTest() {
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
     * Test of getNom method, of class MedecinPH.
     */
    @Test
    public void testGetNom() {
        System.out.println("getNom");
        MedecinPH instance = null;
        String expResult = "";
        String result = instance.getNom();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNom method, of class MedecinPH.
     */
    @Test
    public void testSetNom() {
        System.out.println("setNom");
        String val = "";
        MedecinPH instance = null;
        instance.setNom(val);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class MedecinPH.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        MedecinPH instance = null;
        String expResult = "";
        String result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class MedecinPH.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        String val = "";
        MedecinPH instance = null;
        instance.setId(val);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getServices method, of class MedecinPH.
     */
    @Test
    public void testGetServices() {
        System.out.println("getServices");
        MedecinPH instance = null;
        Services expResult = null;
        Services result = instance.getServices();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setServices method, of class MedecinPH.
     */
    @Test
    public void testSetServices() {
        System.out.println("setServices");
        Services val = null;
        MedecinPH instance = null;
        instance.setServices(val);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrenom method, of class MedecinPH.
     */
    @Test
    public void testGetPrenom() {
        System.out.println("getPrenom");
        MedecinPH instance = null;
        String expResult = "";
        String result = instance.getPrenom();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrenom method, of class MedecinPH.
     */
    @Test
    public void testSetPrenom() {
        System.out.println("setPrenom");
        String val = "";
        MedecinPH instance = null;
        instance.setPrenom(val);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class MedecinPH.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        MedecinPH instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
