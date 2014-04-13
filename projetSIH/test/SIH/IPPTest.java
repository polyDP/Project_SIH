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
public class IPPTest {
    
    public IPPTest() {
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
     * Test of incrementerIPP method, of class IPP.
     */
    @Test
    public void testIncrementerIPP() {
        System.out.println("incrementerIPP");
        String numero = "";
        IPP instance = new IPP();
        String expResult = "";
        String result = instance.incrementerIPP(numero);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class IPP.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        IPP instance = new IPP();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDate method, of class IPP.
     */
    @Test
    public void testGetDate() {
        System.out.println("getDate");
        IPP instance = new IPP();
        Date expResult = null;
        Date result = instance.getDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDate method, of class IPP.
     */
    @Test
    public void testSetDate() {
        System.out.println("setDate");
        Date date = null;
        IPP instance = new IPP();
        instance.setDate(date);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCompteur method, of class IPP.
     */
    @Test
    public void testGetCompteur() {
        System.out.println("getCompteur");
        IPP instance = new IPP();
        int expResult = 0;
        int result = instance.getCompteur();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCompteur method, of class IPP.
     */
    @Test
    public void testSetCompteur() {
        System.out.println("setCompteur");
        int compteur = 0;
        IPP instance = new IPP();
        instance.setCompteur(compteur);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumero method, of class IPP.
     */
    @Test
    public void testGetNumero() {
        System.out.println("getNumero");
        IPP instance = new IPP();
        String expResult = "";
        String result = instance.getNumero();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumero method, of class IPP.
     */
    @Test
    public void testSetNumero() {
        System.out.println("setNumero");
        String numero = "";
        IPP instance = new IPP();
        instance.setNumero(numero);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of stringToIPP method, of class IPP.
     */
    @Test
    public void testStringToIPP() {
        System.out.println("stringToIPP");
        String ipp = "";
        IPP instance = new IPP();
        instance.stringToIPP(ipp);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
