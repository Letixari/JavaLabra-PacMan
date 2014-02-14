/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalabrapacman.pacman.logiikka;

import java.util.ArrayList;

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
    
    public void PacmanCreate(){
        MapCreate();
        this.IsPacman=true;
        SetLocation(13, 24);
    }
    public void Ghost1Create(){
        MapCreate();
        this.IsPacman=false;
        SetLocation(13, 11);
    }
    public void Ghost2Create(){
        MapCreate();
        this.IsPacman=false;
        SetLocation(12, 14);
    }
    public void Ghost3Create(){
        MapCreate();
        this.IsPacman=false;
        SetLocation(13, 14);
    }
    public void Ghost4Create(){
        MapCreate();
        this.IsPacman=false;
        SetLocation(14, 14);
    }

    private void MapCreate() {
        Map.MapCreate();
    }

    public void SetMovementX(int movement) {
        if (movement > 1) {
            movement = 1;
        } else if (movement < 0) {
            movement = 0;
        }
        this.movementX = movement;
    }

    public void SetMovementY(int movement) {
        if (movement > 1) {
            movement = 1;
        } else if (movement < 0) {
            movement = 0;
        }
        this.movementY = movement;
    }

    public int LocationX() {
        return this.X;
    }

    public int LocationY() {
        return this.Y;
    }

    public void SetLocation(int x, int y) {
        this.X = x;
        this.Y = y;
    }

    public void OutOfMapCheck() {
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

    public boolean WallCheck(int mx, int my) {
        this.OutOfMapCheck();
        boolean WallStatus=Map.WallCheck(this.X+mx, this.Y+my);
        if(WallStatus==true){
            return true;
        }
        return false;
    }

    public void Movement() {
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
