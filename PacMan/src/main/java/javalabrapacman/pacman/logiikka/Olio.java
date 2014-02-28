/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalabrapacman.pacman.logiikka;

import java.util.ArrayList;
import java.util.Random;

/**
 * Class is used for object/Pacman and Ghost related purposes.
 * @author Letixari
 */
public class Olio {

    private int X = 0;
    private int Y = 0;
    private int movementX = 0;
    private int movementY = 0;
    private int oldmX = 0;
    private int oldmY = 0;
    private boolean IsPacman;
    Maailma Map = new Maailma();

    /**
     * Creates a map and pacman and set pacman at starting location.
     */
    public void pacmanCreate() {
        mapCreate();
        this.IsPacman = true;
        setLocation(13, 23);
    }

    /**
     * Creates a map and Ghost1 and set Ghost1 at starting location.
     */
    public void ghost1Create() {
        mapCreate();
        this.IsPacman = false;
        setLocation(13, 11);
    }

    /**
     * Creates a map and Ghost2 and set Ghost2 at starting location.
     */
    public void ghost2Create() {
        mapCreate();
        this.IsPacman = false;
        setLocation(12, 14);
    }

    /**
     * Creates a map and Ghost3 and set Ghost3 at starting location.
     */
    public void ghost3Create() {
        mapCreate();
        this.IsPacman = false;
        setLocation(13, 14);
    }

    /**
     * Creates a map and Ghost4 and set Ghost4 at starting location.
     */
    public void ghost4Create() {
        mapCreate();
        this.IsPacman = false;
        setLocation(14, 14);
    }

    private void mapCreate() {
        Map.MapCreate();
    }

    /**
     * Starts the chain to move the object in a random direction with some rules in order to avoid objects/ghosts from going backwards.
     */
    public void moveRandom() {
        Random r = new Random();
        int random = r.nextInt(4) + 1;
        if ((Map.wallCheck(this.X - 1, this.Y) && Map.wallCheck(this.X + 1, this.Y)) || (Map.wallCheck(this.X, this.Y - 1) && Map.wallCheck(this.X, this.Y + 1))) {
            move(this.movementX, this.movementY);
        } else {
            switch (random) {
                case 1:
                    if (this.oldmY != -1) {
                        move(0, 1);
                    } else {
                        move(0, -1);
                    }
                    break;
                case 2:
                    if (this.oldmY != 1) {
                        move(0, -1);
                    } else {
                        move(0, 1);
                    }
                    break;
                case 3:
                    if (this.oldmX != 1) {
                        move(-1, 0);
                    } else {
                        move(1, 0);
                    }
                    break;
                case 4:
                    if (this.oldmX != -1) {
                        move(1, 0);
                    } else {
                        move(-1, 0);
                    }
                    break;
            }
        }

    }

    /**
     * Method checks that the intended movement is allowed by the game rules and starts the movement if it is.
     * @param mx movement in direction X.
     * @param my movement in direction Y.
     */
    public void move(int mx, int my) {
        if (wallCheck(mx, my) == false) {
            this.movementX = mx;
            this.movementY = my;
            this.oldmX=mx;
            this.oldmY=my;
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

    /**
     * Used to manually set movement in specific direction X.
     * @param movement
     */
    public void setMovementX(int movement) {
        if (movement > 1) {
            movement = 1;
        } else if (movement < 0) {
            movement = 0;
        }
        this.movementX = movement;
    }

    /**
     * Method is used to manually set movement in specific direction Y.
     * @param movement
     */
    public void setMovementY(int movement) {
        if (movement > 1) {
            movement = 1;
        } else if (movement < 0) {
            movement = 0;
        }
        this.movementY = movement;
    }

    /**
     * Returns coordinate X of the object.
     * @return
     */
    public int locationX() {
        return this.X;
    }

    /**
     * Returns coodinate Y of the object.
     * @return
     */
    public int locationY() {
        return this.Y;
    }

    /**
     * Method is used to manually set the location of the object.
     * @param x Coordinate X.
     * @param y Coordinate Y.
     */
    public void setLocation(int x, int y) {
        this.X = x;
        this.Y = y;
    }

    /**
     * Method checks that the objects coordinates are not out of the map limits.
     */
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

    /**
     * Method checks that movement is within game rules.
     * @param mx
     * @param my
     * @return
     */
    public boolean wallCheck(int mx, int my) {
        this.outOfMapCheck();
        boolean WallStatus = Map.wallCheck(this.X + mx, this.Y + my);
        if (WallStatus == true) {
            return true;
        }
        return false;
    }

    /**
     * Moves the object in a direction.
     */
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
