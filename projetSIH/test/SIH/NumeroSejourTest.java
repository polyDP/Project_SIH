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
public class NumeroSejourTest {
    
    public NumeroSejourTest() {
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
     * Test of incrementerCompteur method, of class NumeroSejour.
     */
    @Test
    public void testIncrementerCompteur() {
        System.out.println("incrementerCompteur");
        NumeroSejour instance = null;
        instance.incrementerCompteur();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDate method, of class NumeroSejour.
     */
    @Test
    public void testGetDate() {
        System.out.println("getDate");
        NumeroSejour instance = null;
        Date expResult = null;
        Date result = instance.getDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDate method, of class NumeroSejour.
     */
    @Test
    public void testSetDate() {
        System.out.println("setDate");
        Date date = null;
        NumeroSejour instance = null;
        instance.setDate(date);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCompteur method, of class NumeroSejour.
     */
    @Test
    public void testGetCompteur() {
        System.out.println("getCompteur");
        NumeroSejour instance = null;
        int expResult = 0;
        int result = instance.getCompteur();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCompteur method, of class NumeroSejour.
     */
    @Test
    public void testSetCompteur() {
        System.out.println("setCompteur");
        int compteur = 0;
        NumeroSejour instance = null;
        instance.setCompteur(compteur);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumero method, of class NumeroSejour.
     */
    @Test
    public void testGetNumero() {
        System.out.println("getNumero");
        NumeroSejour instance = null;
        String expResult = "";
        String result = instance.getNumero();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumero method, of class NumeroSejour.
     */
    @Test
    public void testSetNumero() {
        System.out.println("setNumero");
        String numero = "";
        NumeroSejour instance = null;
        instance.setNumero(numero);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumeroSejour method, of class NumeroSejour.
     */
    @Test
    public void testGetNumeroSejour() {
        System.out.println("getNumeroSejour");
        NumeroSejour instance = null;
        String expResult = "";
        String result = instance.getNumeroSejour();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
