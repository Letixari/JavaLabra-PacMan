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
    Font font = new Font("Helvetica", Font.BOLD, 14);
    int deathcounter = 0;
    int totalscore;
    int score;
    boolean Super = false;
    Timer timer;
    Color mapcolor;
    long stime;
    Maailma Map = new Maailma();
    Olio Pacman = new Olio();
    Olio Ghost1 = new Olio();
    Olio Ghost2 = new Olio();
    Olio Ghost3 = new Olio();
    Olio Ghost4 = new Olio();
    int pmx = 0;
    int pmy = 0;
    Image pacman1down;
    Image pacman1up;
    Image pacman1left;
    Image pacman1right;
    
    public Peli() {
        addKeyListener(new KeyPress());
        mapcolor = new Color(5, 100, 5);
        setFocusable(true);
        dimension = new Dimension(400, 400);
        setBackground(Color.BLACK);
        setDoubleBuffered(true);
        timer = new Timer(40, this);
        gameInit();
    }

    public void gameInit() {
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
                if (this.Map.wallCheck(x, y)) {
                    g2d.drawRect(x * 20, y * 20, 20, 20);
                } else {
                    for (int i = 0; i < this.Map.PacDots.size(); i++) {
                        if (this.Map.PacDots.get(i).getX() == x && this.Map.PacDots.get(i).getY() == y) {
                            g2d.setColor(Color.YELLOW);
                            g2d.drawRect(x * 20, y * 20, 19, 19);
                        }

                    }
                    for (int i = 0; i < this.Map.SPacDots.size(); i++) {
                        if (this.Map.SPacDots.get(i).getX() == x && this.Map.SPacDots.get(i).getY() == y) {
                            g2d.setColor(Color.MAGENTA);
                            g2d.drawRect(x * 20, y * 20, 19, 19);
                        }
                    }
                }

            }
        }
    }

    public void drawPacman(Graphics2D g2d) {
        g2d.setColor(Color.BLUE);
        g2d.drawRect(Pacman.locationX()*20, Pacman.locationY()*20, 20, 20);
        
    }

    public void drawGhosts(Graphics2D g2d) {
        if (Super) {
            g2d.setColor(Color.WHITE);
        } else {
            g2d.setColor(Color.RED);
        }
        g2d.drawRect(Ghost1.locationX() * 20, Ghost1.locationY() * 20, 20, 20);
        g2d.drawRect(Ghost2.locationX() * 20, Ghost2.locationY() * 20, 20, 20);
        g2d.drawRect(Ghost3.locationX() * 20, Ghost3.locationY() * 20, 20, 20);
        g2d.drawRect(Ghost4.locationX() * 20, Ghost4.locationY() * 20, 20, 20);
    }

    public void drawScore(Graphics2D g2d) {
        g2d.setFont(font);
        g2d.setColor(Color.ORANGE);
        String s = "Score(this life): " + this.score;
        String ts = "Total Score: " + this.totalscore;
        String dc = "Deaths: " + this.deathcounter;
        g2d.drawString(dc, 1, 640);
        g2d.drawString(s, 150, 640);
        g2d.drawString(ts, 300, 640);
    }

    public void timingSuper() {
        if(this.Super){
            if((this.stime+10000)<System.currentTimeMillis()){
                this.Super=false;
                
            }
        }
    }

    public void moveGhosts() {
        this.Ghost1.moveRandom();
        this.Ghost2.moveRandom();
        this.Ghost3.moveRandom();
        this.Ghost4.moveRandom();
    }

    public void movePacman() {
        this.Pacman.move(this.pmx, this.pmy);
    }

    public void death() {
        this.ongoing = false;
        this.deathcounter++;
        this.pmx = 0;
        this.pmy = 0;
        this.Pacman.move(pmx, pmy);
        this.score = 0;
        gameInit();
    }

    public void checkCollideDS() {
        if (this.Pacman.locationX() == this.Ghost1.locationX() && this.Pacman.locationY() == this.Ghost1.locationY()) {
            this.Ghost1.setLocation(13, 11);
        } else if (this.Pacman.locationX() == this.Ghost2.locationX() && this.Pacman.locationY() == this.Ghost2.locationY()) {
            this.Ghost2.setLocation(12, 14);
        } else if (this.Pacman.locationX() == this.Ghost3.locationX() && this.Pacman.locationY() == this.Ghost3.locationY()) {
            this.Ghost3.setLocation(13, 14);
        } else if (this.Pacman.locationX() == this.Ghost4.locationX() && this.Pacman.locationY() == this.Ghost4.locationY()) {
            this.Ghost4.setLocation(14, 14);
        }
        for (int i = 0; i < this.Map.PacDots.size(); i++) {
            if (this.Map.PacDots.get(i).getX() == this.Pacman.locationX() && this.Map.PacDots.get(i).getY() == this.Pacman.locationY()) {
                this.score = this.score + 10;
                this.totalscore = this.totalscore + 10;
                this.Map.PacDots.remove(i);
            }
        }
        for (int i = 0; i < this.Map.SPacDots.size(); i++) {
            if (this.Map.SPacDots.get(i).getX() == this.Pacman.locationX() && this.Map.SPacDots.get(i).getY() == this.Pacman.locationY()) {
                this.Super = true;
                stime=System.currentTimeMillis();
                this.Map.SPacDots.remove(i);
            }
        }
    }

    public void checkCollide() {
        if (this.Pacman.locationX() == this.Ghost1.locationX() && this.Pacman.locationY() == this.Ghost1.locationY()) {
            death();
        } else if (this.Pacman.locationX() == this.Ghost2.locationX() && this.Pacman.locationY() == this.Ghost2.locationY()) {
            death();
        } else if (this.Pacman.locationX() == this.Ghost3.locationX() && this.Pacman.locationY() == this.Ghost3.locationY()) {
            death();
        } else if (this.Pacman.locationX() == this.Ghost4.locationX() && this.Pacman.locationY() == this.Ghost4.locationY()) {
            death();
        }
        for (int i = 0; i < this.Map.PacDots.size(); i++) {
            if (this.Map.PacDots.get(i).getX() == this.Pacman.locationX() && this.Map.PacDots.get(i).getY() == this.Pacman.locationY()) {
                this.score = this.score + 10;
                this.totalscore = this.totalscore + 10;
                this.Map.PacDots.remove(i);
            }
        }
        for (int i = 0; i < this.Map.SPacDots.size(); i++) {
            if (this.Map.SPacDots.get(i).getX() == this.Pacman.locationX() && this.Map.SPacDots.get(i).getY() == this.Pacman.locationY()) {
                this.Super = true;
                stime=System.currentTimeMillis();
                this.Map.SPacDots.remove(i);
            }
        }
    }

    public void play(Graphics2D g2d) {
        timingSuper();
        movePacman();
        if (Super) {
            checkCollideDS();
        } else {
            checkCollide();
        }
        moveGhosts();
        if (Super) {
            checkCollideDS();
        } else {
            checkCollide();
        }
        drawPacman(g2d);
        drawGhosts(g2d);
        if (this.Map.PacDots.isEmpty()) {
            this.score = this.score + 1000;
            this.totalscore = this.totalscore + 1000;
            gameInit();
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.BLACK);
        drawMap(g2d);
        drawScore(g2d);
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

        @Override
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
        try {
            Thread.sleep(50);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        repaint();
    }
}
