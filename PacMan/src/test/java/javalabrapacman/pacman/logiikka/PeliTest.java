/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javalabrapacman.pacman.logiikka;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class PeliTest {
    
    public PeliTest() {
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

    @Test
    public void testTimingSuper() {
        System.out.println("timingSuper - waiting 10s");
        Peli instance = new Peli();
        instance.Super=true;
        try {
            Thread.sleep(11000);
        } catch (InterruptedException ex) {
            Logger.getLogger(PeliTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        instance.timingSuper();

    }

    /**
     * Test of moveGhosts method, of class Peli.
     */
    @Test
    public void testMoveGhosts() {
        System.out.println("moveGhosts");
        Peli instance = new Peli();
        instance.moveGhosts();
        assertTrue(instance.Ghost1.locationX()!=13||instance.Ghost1.locationY()!=11);


    }

    /**
     * Test of movePacman method, of class Peli.
     */
    @Test
    public void testMovePacman() {
        System.out.println("movePacman");
        Peli instance = new Peli();
        instance.pmx=1;
        instance.movePacman();
        assertTrue(instance.Pacman.locationX()!=13);
        

    }

    /**
     * Test of death method, of class Peli.
     */
    @Test
    public void testDeath() {
        System.out.println("death");
        Peli instance = new Peli();
        instance.death();
        assertTrue(instance.deathcounter!=0);

    }

    /**
     * Test of checkCollideDS method, of class Peli.
     */
    @Test
    public void testCheckCollideDS() {
        System.out.println("checkCollideDS");
        Peli instance = new Peli();
        instance.gameInit();
        instance.Ghost1.setLocation(1, 1);
        instance.Pacman.setLocation(1, 1);
        instance.checkCollideDS();
        assertTrue(instance.Pacman.locationX()!=instance.Ghost1.locationX());

    }

    /**
     * Test of checkCollide method, of class Peli.
     */
    @Test
    public void testCheckCollide() {
        System.out.println("checkCollide");
        Peli instance = new Peli();
        instance.gameInit();
        instance.Ghost1.setLocation(1, 1);
        instance.Pacman.setLocation(1, 1);
        instance.checkCollide();
        assertTrue(instance.Pacman.locationY()!=instance.Ghost1.locationY());

    }

    
}
