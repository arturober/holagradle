/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Arturo
 */
public class HelloGradleTest {
    
    public HelloGradleTest() {
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
     * Test of suma method, of class HelloGradle.
     */
    @Test
    public void testSuma() {
        int n1 = 2;
        int n2 = 4;
        int expResult = 6;
        int result = HelloGradle.suma(n1, n2);
        assertEquals(expResult, result);
    }
    
}
