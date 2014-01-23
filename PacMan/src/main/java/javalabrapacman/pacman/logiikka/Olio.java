/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javalabrapacman.pacman.logiikka;

/**
 *
 * @author Letixari
 */
public class Olio {
    private int X=0;
    private int Y=0;
    private int movementX=0;
    private int movementY=0;
    private boolean IsPacman;
    
    public void SetMovementX(int movement){
        if(movement>1){
            movement=1;
        }
        else if(movement<0){
            movement=0;
        }
        this.movementX=movement;
    }
    public void SetMovementY(int movement){
        if(movement>1){
            movement=1;
        }
        else if(movement<0){
            movement=0;
        }
        this.movementY=movement;
    }
    public int LocationX(){
        return this.X;
    }
    public int LocationY(){
        return this.Y;
    }
    public void SetLocation(int x, int y){
        this.X=x;
        this.Y=y;
    }
    public void OutOfMapCheck(){
        if(this.X>26){
            this.X=26;
        }
        else if(this.X<0){
            this.X=0;
        }
        if(this.Y>29){
            this.Y=29;
        }
        else if(this.Y<0){
            this.Y=0;
        }
    }
    public void WallCheck() { //VÄLIAIKAINEN VAIHDA ARRAYLIST TARKISTUKSEKSI MAPIN SUUNNITTELUN JÄLKEEN
        this.OutOfMapCheck();
        if((this.X==26 && this.movementX==1) || (this.X==0 && this.movementX==-1)){
            this.movementX=0;
        }
        if((this.Y==29 && this.movementY==1) || (this.Y==0 && this.movementY==-1)){
            this.movementY=0;
        } 
    }
    public void Movement() {
        this.WallCheck();
        if(this.movementX==1){
            this.X=this.X+1;
        }
        else if(this.movementX==-1){
            this.X=this.X-1;
        }
        else if(this.movementY==1){
            this.Y=this.Y+1;
        }
        else if(this.movementY==-1){
            this.Y=this.Y-1;
        }
    }
}
