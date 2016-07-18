/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Diego Valdez
 */
public class RadioTest {
    
    public RadioTest() {
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
     * Test of OnOff method, of class Radio.
     */
    @Test
    public void testOnOff() {
        System.out.println("OnOff");
        boolean estado = false;
        Radio instance = new Radio();
        instance.OnOff(estado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isOn method, of class Radio.
     */
    @Test
    public void testIsOn() {
        System.out.println("isOn");
        Radio instance = new Radio();
        boolean expResult = false;
        boolean result = instance.isOn();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFrequency method, of class Radio.
     */
    @Test
    public void testSetFrequency() {
        System.out.println("setFrequency");
        String frecuencia = "";
        Radio instance = new Radio();
        instance.setFrequency(frecuencia);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFrequency method, of class Radio.
     */
    @Test
    public void testGetFrequency() {
        System.out.println("getFrequency");
        Radio instance = new Radio();
        String expResult = "";
        String result = instance.getFrequency();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStation method, of class Radio.
     */
    @Test
    public void testSetStation() {
        System.out.println("setStation");
        String emisora = "";
        Radio instance = new Radio();
        instance.setStation(emisora);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStation method, of class Radio.
     */
    @Test
    public void testGetStation() {
        System.out.println("getStation");
        Radio instance = new Radio();
        String expResult = "";
        String result = instance.getStation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMemory method, of class Radio.
     */
    @Test
    public void testSetMemory() {
        System.out.println("setMemory");
        int position = 0;
        double emisora = 0.0;
        Radio instance = new Radio();
        instance.setMemory(position, emisora);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Forward method, of class Radio.
     */
    @Test
    public void testForward() {
        System.out.println("Forward");
        String frecuencia = "";
        String emisora = "";
        Radio instance = new Radio();
        instance.Forward(frecuencia, emisora);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Backward method, of class Radio.
     */
    @Test
    public void testBackward() {
        System.out.println("Backward");
        String frecuencia = "";
        String emisora = "";
        Radio instance = new Radio();
        instance.Backward(frecuencia, emisora);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectMemory method, of class Radio.
     */
    @Test
    public void testSelectMemory() {
        System.out.println("selectMemory");
        int position = 0;
        Radio instance = new Radio();
        String expResult = "";
        String result = instance.selectMemory(position);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
