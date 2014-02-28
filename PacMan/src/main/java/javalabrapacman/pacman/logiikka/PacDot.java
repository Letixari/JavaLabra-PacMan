/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalabrapacman.pacman.logiikka;

/**
 * Class is used to mark PacDot locations.
 * @author Letixari
 */
public class PacDot {

    private int X;
    private int Y;

    /**
     * Creates a pacdot in location xy.
     * @param x Coordinate X.
     * @param y Coordinate Y.
     */
    public PacDot(int x, int y) {
        this.X = x;
        this.Y = y;
    }

    /**
     * Returns the coordinate X of the pacdot.
     * @return
     */
    public int getX() {
        return this.X;
    }

    /**
     * Returns the coordinate Y of the pacdot.
     * @return
     */
    public int getY() {
        return this.Y;
    }
}
