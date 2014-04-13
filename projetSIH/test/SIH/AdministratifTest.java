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
public class AdministratifTest {
    
    public AdministratifTest() {
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
     * Test of getNom method, of class Administratif.
     */
    @Test
    public void testGetNom() {
        System.out.println("getNom");
        Administratif instance = null;
        String expResult = "";
        String result = instance.getNom();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNom method, of class Administratif.
     */
    @Test
    public void testSetNom() {
        System.out.println("setNom");
        String val = "";
        Administratif instance = null;
        instance.setNom(val);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class Administratif.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Administratif instance = null;
        String expResult = "";
        String result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Administratif.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        String val = "";
        Administratif instance = null;
        instance.setId(val);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMotDePasse method, of class Administratif.
     */
    @Test
    public void testGetMotDePasse() {
        System.out.println("getMotDePasse");
        Administratif instance = null;
        String expResult = "";
        String result = instance.getMotDePasse();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMotDePasse method, of class Administratif.
     */
    @Test
    public void testSetMotDePasse() {
        System.out.println("setMotDePasse");
        String val = "";
        Administratif instance = null;
        instance.setMotDePasse(val);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
