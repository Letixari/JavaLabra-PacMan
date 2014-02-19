/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalabrapacman.pacman.logiikka;

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
    Maailma Map = new Maailma();
    Olio Pacman = new Olio();
    Olio Ghost1 = new Olio();
    Olio Ghost2 = new Olio();
    Olio Ghost3 = new Olio();
    Olio Ghost4 = new Olio();
    int pmx = 0;
    int pmy = 0;

    public Peli() {
        addKeyListener(new KeyPress());
        mapcolor = new Color(5, 100, 5);
        setFocusable(true);
        dimension = new Dimension(400, 400);
        setBackground(Color.BLACK);
        setDoubleBuffered(true);
        timer = new Timer(40, this);
        this.Map.MapCreate();
        this.Pacman.pacmanCreate();
        this.Ghost1.ghost1Create();
        this.Ghost2.ghost2Create();
        this.Ghost3.ghost3Create();
        this.Ghost4.ghost4Create();
        timer.start();
        this.ongoing = true;
    }

    public void drawMap(Graphics2D g2d) {
        int x, y;
        for (x = 0; x <= 27; x += 1) {
            for (y = 0; y <= 30; y += 1) {
                g2d.setColor(mapcolor);
                if (this.Map.WallCheck(x, y)) {
                    g2d.drawRect(x * 20, y * 20, 20, 20);
                }
            }
        }
    }

    public void drawPacman(Graphics2D g2d) {
        g2d.setColor(Color.BLUE);
        g2d.drawRect(Pacman.locationX() * 20, Pacman.locationY() * 20, 20, 20);
    }

    public void moveGhosts(Graphics2D g) {
        this.Ghost1.moveRandom();
        this.Ghost2.moveRandom();
        this.Ghost3.moveRandom();
        this.Ghost4.moveRandom();
    }

    public void movePacman() {
        this.Pacman.move(this.pmx, this.pmy);
    }

    public void play(Graphics2D g2d) {
        movePacman();
        drawPacman(g2d);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.BLACK);
        drawMap(g2d);
        if (ongoing) {
            play(g2d);
        }
        Toolkit.getDefaultToolkit().sync();
        g.dispose();
    }

    class KeyPress extends KeyAdapter {

        @Override
        public void keyPressed(KeyEvent e) {
            int key = e.getKeyCode();
            if (ongoing) {
                if (key == KeyEvent.VK_UP) {
                    pmy = -1;
                    pmx = 0;
                } else if (key == KeyEvent.VK_DOWN) {
                    pmy = 1;
                    pmx = 0;
                } else if (key == KeyEvent.VK_LEFT) {
                    pmx = -1;
                    pmy = 0;
                } else if (key == KeyEvent.VK_RIGHT) {
                    pmx = 1;
                    pmy = 0;
                }
            }
        }

        public void keyReleased(KeyEvent e) {
            int key = e.getKeyCode();
            if (key == Event.LEFT || key == Event.RIGHT || key == Event.UP || key == Event.DOWN) {
                pmx = 0;
                pmy = 0;
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }
}
