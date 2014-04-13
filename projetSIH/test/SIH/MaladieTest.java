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
public class MaladieTest {
    
    public MaladieTest() {
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
     * Test of getDiagnostique method, of class Maladie.
     */
    @Test
    public void testGetDiagnostique() {
        System.out.println("getDiagnostique");
        Maladie instance = null;
        String expResult = "";
        String result = instance.getDiagnostique();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDiagnostique method, of class Maladie.
     */
    @Test
    public void testSetDiagnostique() {
        System.out.println("setDiagnostique");
        String val = "";
        Maladie instance = null;
        instance.setDiagnostique(val);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMotifHospitalisation method, of class Maladie.
     */
    @Test
    public void testGetMotifHospitalisation() {
        System.out.println("getMotifHospitalisation");
        Maladie instance = null;
        String expResult = "";
        String result = instance.getMotifHospitalisation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMotifHospitalisation method, of class Maladie.
     */
    @Test
    public void testSetMotifHospitalisation() {
        System.out.println("setMotifHospitalisation");
        String val = "";
        Maladie instance = null;
        instance.setMotifHospitalisation(val);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDateMaladie method, of class Maladie.
     */
    @Test
    public void testGetDateMaladie() {
        System.out.println("getDateMaladie");
        Maladie instance = null;
        Date expResult = null;
        Date result = instance.getDateMaladie();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDateMaladie method, of class Maladie.
     */
    @Test
    public void testSetDateMaladie() {
        System.out.println("setDateMaladie");
        Date dateMaladie = null;
        Maladie instance = null;
        instance.setDateMaladie(dateMaladie);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Maladie.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Maladie instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
