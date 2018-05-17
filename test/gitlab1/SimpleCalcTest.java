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
    double p1=4;
    double p2=5;
    SimpleCalc sc = new SimpleCalc(p1,p2);
    public SimpleCalcTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("BeforeClass");
        
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("AfterClass");
    }

    /**
     * Test of getMN method, of class SimpleCalc.
     */
    @Test
    public void testGetMN() {
        System.out.println("getMN");
        assertEquals(20, sc.getMN(), 0.0);
       
    }

    /**
     * Test of getDil method, of class SimpleCalc.
     */
    @Test
    public void testGetDil() {
        System.out.println("getDil");
        assertEquals(0.8, sc.getDil(), 0.0);

    }

    /**
     * Test of getsum method, of class SimpleCalc.
     */
    @Test
    public void testGetsum() {
        System.out.println("getsum");
        assertEquals(9, sc.getsum(), 0.0);
       
    }

    /**
     * Test of getrisn method, of class SimpleCalc.
     */
    @Test
    public void testGetrisn() {
        System.out.println("getrisn");
        assertEquals(-1, sc.getrisn(), 0.0);
    }
    
}
