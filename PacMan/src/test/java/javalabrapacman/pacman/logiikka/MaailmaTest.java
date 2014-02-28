/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalabrapacman.pacman.logiikka;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Letixari
 */
public class MaailmaTest {

    public MaailmaTest() {
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
     * Test of MapCreate method, of class Maailma.
     */
    @Test
    public void testMapCreate() {
        System.out.println("MapCreate");
        Maailma instance = new Maailma();
        instance.MapCreate();
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(instance.PacDots.size() != 0);
    }

    /**
     * Test of wallCheck method, of class Maailma.
     */
    @Test
    public void testWallCheck() {
        System.out.println("wallCheck");
        Maailma instance = new Maailma();
        instance.MapCreate();
        boolean expResult = true;
        boolean result = instance.wallCheck(0, 0);
        assertEquals(expResult, result);
    }

    /**
     * Test of X0Create method, of class Maailma.
     */
    @Test
    public void testX0Create() {
        System.out.println("X0Create");
        Maailma instance = new Maailma();
        instance.X0Create();
        assertTrue(instance.wallCheck(0, 1));
    }

    /**
     * Test of X1Create method, of class Maailma.
     */
    @Test
    public void testX1Create() {
        System.out.println("X1Create");
        Maailma instance = new Maailma();
        instance.X1Create();
        assertTrue(instance.wallCheck(1, 0));
    }

    /**
     * Test of X2Create method, of class Maailma.
     */
    @Test
    public void testX2Create() {
        System.out.println("X2Create");
        Maailma instance = new Maailma();
        instance.X2Create();
        assertTrue(instance.wallCheck(2, 0));

    }

    /**
     * Test of X3Create method, of class Maailma.
     */
    @Test
    public void testX3Create() {
        System.out.println("X3Create");
        Maailma instance = new Maailma();
        instance.X3Create();
        assertTrue(instance.wallCheck(3, 0));
    }

    /**
     * Test of X4Create method, of class Maailma.
     */
    @Test
    public void testX4Create() {
        System.out.println("X4Create");
        Maailma instance = new Maailma();
        instance.X4Create();
        assertTrue(instance.wallCheck(4, 0));
    }

    /**
     * Test of X5Create method, of class Maailma.
     */
    @Test
    public void testX5Create() {
        System.out.println("X5Create");
        Maailma instance = new Maailma();
        instance.X5Create();
        assertTrue(instance.wallCheck(5, 0));
    }
}
