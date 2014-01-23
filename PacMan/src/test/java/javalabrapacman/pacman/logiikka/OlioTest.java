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
public class OlioTest {
    
    public OlioTest() {
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
     * Test of LocationX method, of class Olio.
     */
    @Test
    public void testLocationX() {
        System.out.println("LocationX");
        Olio instance = new Olio();
        int expResult = 0;
        int result = instance.LocationX();
        assertEquals(expResult, result);
        System.out.println(instance.LocationX());
    }

    /**
     * Test of LocationY method, of class Olio.
     */
    @Test
    public void testLocationY() {
        System.out.println("LocationY");
        Olio instance = new Olio();
        int expResult = 0;
        int result = instance.LocationY();
        assertEquals(expResult, result);
        System.out.println(instance.LocationY());
    }

    /**
     * Test of SetLocation method, of class Olio.
     */
    @Test
    public void testSetLocation() {
        System.out.println("SetLocation");
        int x = 11;
        int y = 12;
        Olio instance = new Olio();
        instance.SetLocation(x, y);
        assertEquals(11,instance.LocationX());
        assertEquals(12,instance.LocationY());
    }

    /**
     * Test of OutOfMapCheck method, of class Olio.
     */
    @Test
    public void testOutOfMapCheck() {
        System.out.println("OutOfMapCheck");
        Olio instance = new Olio();
        int x = 31;
        int y = 32;
        instance.SetLocation(x, y);
        instance.OutOfMapCheck();
        assertEquals(26,instance.LocationX());
        assertEquals(29,instance.LocationY());
    }

    /**
     * Test of WallCheck method, of class Olio.
     */
    @Test
    public void testWallCheck() {
        System.out.println("WallCheck");
        Olio instance = new Olio();
        instance.SetLocation(26,29);
        instance.SetMovementX(3);
        instance.WallCheck();
        assertEquals(26,instance.LocationX());
    }

    /**
     * Test of Movement method, of class Olio.
     */
    @Test
    public void testMovement() {
        System.out.println("Movement");
        Olio instance = new Olio();
        instance.SetLocation(13, 13);
        instance.SetMovementX(1);
        instance.Movement();
        assertEquals(14,instance.LocationX());
    }
    
}
