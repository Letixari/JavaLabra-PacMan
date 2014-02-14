/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalabrapacman.pacman.logiikka;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Event;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Letixari
 */
public class Peli extends JPanel implements ActionListener {

    Dimension dimension;
    boolean ongoing = false;
    int deathcounter;
    int score;
    Timer timer;
    Color dotcolor = new Color(192, 192, 0);
    Color mapcolor;
    Olio Pacman = new Olio();
    Olio Ghost1 = new Olio();
    Olio Ghost2 = new Olio();
    Olio Ghost3 = new Olio();
    Olio Ghost4 = new Olio();

    public Peli() {
        addKeyListener(new KeyPress());
        mapcolor = new Color(5, 100, 5);
        setFocusable(true);
        dimension = new Dimension(400, 400);
        setBackground(Color.BLACK);
        setDoubleBuffered(true);
        timer = new Timer(40, this);
        this.Pacman.PacmanCreate();
        this.Ghost1.Ghost1Create();
        this.Ghost2.Ghost2Create();
        this.Ghost3.Ghost3Create();
        this.Ghost4.Ghost4Create();
        timer.start();
    }

    class KeyPress extends KeyAdapter {

        public void KeyPressed(KeyEvent event) {
            int key = event.getKeyCode();
            if (ongoing == true) {
                if (key == KeyEvent.VK_UP) {
                    if (Pacman.WallCheck(0, 1) == false) {
                        Pacman.SetMovementY(1);
                    }
                } else if (key == KeyEvent.VK_DOWN) {
                    if (Pacman.WallCheck(0, -1) == false) {
                        Pacman.SetMovementY(-1);
                    }
                } else if (key == KeyEvent.VK_LEFT) {
                    if (Pacman.WallCheck(-1, 0) == false) {
                        Pacman.SetMovementX(-1);
                    }
                } else if (key == KeyEvent.VK_RIGHT) {
                    if (Pacman.WallCheck(1, 0) == false) {
                        Pacman.SetMovementX(1);
                    }
                } else if (key == KeyEvent.VK_ESCAPE) {
                    ongoing = false;
                }
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }
}
