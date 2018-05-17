/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gitlab1;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Yana Horkun
 */
public class SimpleCalcTest {
    
    public SimpleCalcTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getMN method, of class SimpleCalc.
     */
    @Test
    public void testGetMN() {
        System.out.println("getMN");
        SimpleCalc instance = null;
        double expResult = 0.0;
        double result = instance.getMN();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDil method, of class SimpleCalc.
     */
    @Test
    public void testGetDil() {
        System.out.println("getDil");
        SimpleCalc instance = null;
        double expResult = 0.0;
        double result = instance.getDil();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getsum method, of class SimpleCalc.
     */
    @Test
    public void testGetsum() {
        System.out.println("getsum");
        SimpleCalc instance = null;
        double expResult = 0.0;
        double result = instance.getsum();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getrisn method, of class SimpleCalc.
     */
    @Test
    public void testGetrisn() {
        System.out.println("getrisn");
        SimpleCalc instance = null;
        double expResult = 0.0;
        double result = instance.getrisn();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
