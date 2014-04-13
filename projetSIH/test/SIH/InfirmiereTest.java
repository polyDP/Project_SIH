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
public class InfirmiereTest {
    
    public InfirmiereTest() {
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
     * Test of getNom method, of class Infirmiere.
     */
    @Test
    public void testGetNom() {
        System.out.println("getNom");
        Infirmiere instance = null;
        String expResult = "";
        String result = instance.getNom();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNom method, of class Infirmiere.
     */
    @Test
    public void testSetNom() {
        System.out.println("setNom");
        String val = "";
        Infirmiere instance = null;
        instance.setNom(val);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class Infirmiere.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Infirmiere instance = null;
        String expResult = "";
        String result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Infirmiere.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        String val = "";
        Infirmiere instance = null;
        instance.setId(val);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMotDePasse method, of class Infirmiere.
     */
    @Test
    public void testGetMotDePasse() {
        System.out.println("getMotDePasse");
        Infirmiere instance = null;
        String expResult = "";
        String result = instance.getMotDePasse();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLogin method, of class Infirmiere.
     */
    @Test
    public void testSetLogin() {
        System.out.println("setLogin");
        String val = "";
        Infirmiere instance = null;
        instance.setLogin(val);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getServices method, of class Infirmiere.
     */
    @Test
    public void testGetServices() {
        System.out.println("getServices");
        Infirmiere instance = null;
        Services expResult = null;
        Services result = instance.getServices();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setServices method, of class Infirmiere.
     */
    @Test
    public void testSetServices() {
        System.out.println("setServices");
        Services val = null;
        Infirmiere instance = null;
        instance.setServices(val);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
