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
 * @author macbookair
 */
public class DiseasesTest {
    
    public DiseasesTest() {
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
     * Test of askQuestions method, of class Diseases.
     */
    @Test
    public void testAskQuestions() {
        System.out.println("askQuestions");
        String answer=("yes");
        Diseases instance = new Diseases();
        String expectedAnswer =("yes");
        instance.askQuestions();
        assertSame(expectedAnswer,answer);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of displayResult method, of class Diseases.
     */
    @Test
    public void testDisplayResult() {
        System.out.println("displayResult");
        Diseases instance = new Diseases();
        instance.displayResult();
        assertNotNull(instance.getResult());
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getResult method, of class Diseases.
     */
    @Test
    public void testGetResult() {
        System.out.println("getResult");
        Diseases instance = new Diseases();
        String expResult = "";
        String result = instance.getResult();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
