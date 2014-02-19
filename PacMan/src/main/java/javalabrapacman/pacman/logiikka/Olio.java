/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalabrapacman.pacman.logiikka;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Letixari
 */
public class Olio {

    private int X = 0;
    private int Y = 0;
    private int movementX = 0;
    private int movementY = 0;
    private boolean IsPacman;
    Maailma Map = new Maailma();

    public void pacmanCreate() {
        mapCreate();
        this.IsPacman = true;
        setLocation(13, 23);
    }

    public void ghost1Create() {
        mapCreate();
        this.IsPacman = false;
        setLocation(13, 11);
    }

    public void ghost2Create() {
        mapCreate();
        this.IsPacman = false;
        setLocation(12, 14);
    }

    public void ghost3Create() {
        mapCreate();
        this.IsPacman = false;
        setLocation(13, 14);
    }

    public void ghost4Create() {
        mapCreate();
        this.IsPacman = false;
        setLocation(14, 14);
    }

    private void mapCreate() {
        Map.MapCreate();
    }

    public void moveRandom() {
        Random r = new Random();
        int random = r.nextInt(4) + 1;
        switch (random) {
            case 1:
                move(0, 1);
                break;
            case 2:
                move(0, -1);
                break;
            case 3:
                move(-1, 0);
                break;
            case 4:
                move(1, 0);
                break;
        }
    }

    public void move(int mx, int my) {
        if (wallCheck(mx, my) == false) {
            this.movementX = mx;
            this.movementY = my;
            movement();
        } else {
            if (wallCheck(this.movementX, this.movementY)) {
                this.movementX = 0;
                this.movementY = 0;
            } else {
                movement();
            }
        }
    }

    public void setMovementX(int movement) {
        if (movement > 1) {
            movement = 1;
        } else if (movement < 0) {
            movement = 0;
        }
        this.movementX = movement;
    }

    public void setMovementY(int movement) {
        if (movement > 1) {
            movement = 1;
        } else if (movement < 0) {
            movement = 0;
        }
        this.movementY = movement;
    }

    public int locationX() {
        return this.X;
    }

    public int locationY() {
        return this.Y;
    }

    public void setLocation(int x, int y) {
        this.X = x;
        this.Y = y;
    }

    public void outOfMapCheck() {
        if (this.X > 26) {
            this.X = 26;
        } else if (this.X < 1) {
            this.X = 1;
        }
        if (this.Y > 29) {
            this.Y = 29;
        } else if (this.Y < 1) {
            this.Y = 1;
        }
    }

    public boolean wallCheck(int mx, int my) {
        this.outOfMapCheck();
        boolean WallStatus = Map.WallCheck(this.X + mx, this.Y + my);
        if (WallStatus == true) {
            return true;
        }
        return false;
    }

    public void movement() {
        if (this.movementX == 1) {
            this.X = this.X + 1;
        } else if (this.movementX == -1) {
            this.X = this.X - 1;
        } else if (this.movementY == 1) {
            this.Y = this.Y + 1;
        } else if (this.movementY == -1) {
            this.Y = this.Y - 1;
        }
    }
}
