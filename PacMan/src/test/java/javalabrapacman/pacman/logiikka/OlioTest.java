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
    public void testlocationX() {
        System.out.println("LocationX");
        Olio instance = new Olio();
        int expResult = 0;
        int result = instance.locationX();
        assertEquals(expResult, result);
        System.out.println(instance.locationX());
    }

    /**
     * Test of LocationY method, of class Olio.
     */
    @Test
    public void testlocationY() {
        System.out.println("LocationY");
        Olio instance = new Olio();
        int expResult = 0;
        int result = instance.locationY();
        assertEquals(expResult, result);
        System.out.println(instance.locationY());
    }

    /**
     * Test of SetLocation method, of class Olio.
     */
    @Test
    public void testsetLocation() {
        System.out.println("SetLocation");
        int x = 11;
        int y = 12;
        Olio instance = new Olio();
        instance.setLocation(x, y);
        assertEquals(11,instance.locationX());
        assertEquals(12,instance.locationY());
    }

    /**
     * Test of OutOfMapCheck method, of class Olio.
     */
    @Test
    public void testoutOfMapCheck() {
        System.out.println("OutOfMapCheck");
        Olio instance = new Olio();
        int x = 31;
        int y = 32;
        instance.setLocation(x, y);
        instance.outOfMapCheck();
        assertEquals(26,instance.locationX());
        assertEquals(29,instance.locationY());
    }

    /**
     * Test of WallCheck method, of class Olio.
     */
    @Test
    public void testwallCheck() {
        System.out.println("WallCheck");
        Olio instance = new Olio();
        instance.setLocation(26,29);
        instance.setMovementX(3);
        assertEquals(26,instance.locationX());
    }

    /**
     * Test of Movement method, of class Olio.
     */
    @Test
    public void testmovement() {
        System.out.println("Movement");
        Olio instance = new Olio();
        instance.setLocation(13, 13);
        instance.setMovementX(1);
        instance.movement();
        assertEquals(14,instance.locationX());
    }
    
}
