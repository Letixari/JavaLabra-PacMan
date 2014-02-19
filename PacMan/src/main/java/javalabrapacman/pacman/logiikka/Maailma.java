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
public class Maailma {

    private ArrayList<Integer> X0 = new ArrayList<Integer>();
    private ArrayList<Integer> X1 = new ArrayList<Integer>();
    private ArrayList<Integer> X2 = new ArrayList<Integer>();
    private ArrayList<Integer> X3 = new ArrayList<Integer>();
    private ArrayList<Integer> X4 = new ArrayList<Integer>();
    private ArrayList<Integer> X5 = new ArrayList<Integer>();
    private ArrayList<Integer> X6 = new ArrayList<Integer>();
    private ArrayList<Integer> X7 = new ArrayList<Integer>();
    private ArrayList<Integer> X8 = new ArrayList<Integer>();
    private ArrayList<Integer> X9 = new ArrayList<Integer>();
    private ArrayList<Integer> X10 = new ArrayList<Integer>();
    private ArrayList<Integer> X11 = new ArrayList<Integer>();
    private ArrayList<Integer> X12 = new ArrayList<Integer>();
    private ArrayList<Integer> X13 = new ArrayList<Integer>();
    private ArrayList<Integer> X14 = new ArrayList<Integer>();
    private ArrayList<Integer> X15 = new ArrayList<Integer>();
    private ArrayList<Integer> X16 = new ArrayList<Integer>();
    private ArrayList<Integer> X17 = new ArrayList<Integer>();
    private ArrayList<Integer> X18 = new ArrayList<Integer>();
    private ArrayList<Integer> X19 = new ArrayList<Integer>();
    private ArrayList<Integer> X20 = new ArrayList<Integer>();
    private ArrayList<Integer> X21 = new ArrayList<Integer>();
    private ArrayList<Integer> X22 = new ArrayList<Integer>();
    private ArrayList<Integer> X23 = new ArrayList<Integer>();
    private ArrayList<Integer> X24 = new ArrayList<Integer>();
    private ArrayList<Integer> X25 = new ArrayList<Integer>();
    private ArrayList<Integer> X26 = new ArrayList<Integer>();
    private ArrayList<Integer> X27 = new ArrayList<Integer>();

    public void MapCreate() {
        X0Create();
        X1Create();
        X2Create();
        X3Create();
        X4Create();
        X5Create();
        X6Create();
        X7Create();
        X8Create();
        X9Create();
        X10Create();
        X11Create();
        X12Create();
        X13Create();
        X14Create();
        X15Create();
        X16Create();
        X17Create();
        X18Create();
        X19Create();
        X20Create();
        X21Create();
        X22Create();
        X23Create();
        X24Create();
        X25Create();
        X26Create();
        X27Create();
    }
    public boolean WallCheck(int x, int y) {
        int wallstatus=1;
        switch (x) {
            case 0:
                wallstatus = this.X0.get(y);
                break;
            case 1:
                wallstatus = this.X1.get(y);
                break;
            case 2:
                wallstatus = this.X2.get(y);
                break;
            case 3:
                wallstatus = this.X3.get(y);
                break;
            case 4:
                wallstatus = this.X4.get(y);
                break;
            case 5:
                wallstatus = this.X5.get(y);
                break;
            case 6:
                wallstatus = this.X6.get(y);
                break;
            case 7:
                wallstatus = this.X7.get(y);
                break;
            case 8:
                wallstatus = this.X8.get(y);
                break;
            case 9:
                wallstatus = this.X9.get(y);
                break;
            case 10:
                wallstatus = this.X10.get(y);
                break;
            case 11:
                wallstatus = this.X11.get(y);
                break;
            case 12:
                wallstatus = this.X12.get(y);
                break;
            case 13:
                wallstatus = this.X13.get(y);
                break;
            case 14:
                wallstatus = this.X14.get(y);
                break;
            case 15:
                wallstatus = this.X15.get(y);
                break;
            case 16:
                wallstatus = this.X16.get(y);
                break;
            case 17:
                wallstatus = this.X17.get(y);
                break;
            case 18:
                wallstatus = this.X18.get(y);
                break;
            case 19:
                wallstatus = this.X19.get(y);
                break;
            case 20:
                wallstatus = this.X20.get(y);
                break;
            case 21:
                wallstatus = this.X21.get(y);
                break;
            case 22:
                wallstatus = this.X22.get(y);
                break;
            case 23:
                wallstatus = this.X23.get(y);
                break;
            case 24:
                wallstatus = this.X24.get(y);
                break;
            case 25:
                wallstatus = this.X25.get(y);
                break;
            case 26:
                wallstatus = this.X26.get(y);
                break;
            case 27:
                wallstatus = this.X27.get(y);
                break;
        }
        if(wallstatus==1){
            return true;
        }
        return false;
    }

    public void X0Create() {
        this.X0.add(1);
        while (this.X0.size() <= 30) {
            this.X0.add(1);
        }
    }

    public void X1Create() {
        this.X1.add(1);
        while (this.X1.size() < 9) {
            this.X1.add(0);
        }
        while (this.X1.size() < 20) {
            this.X1.add(1);
        }
        while (this.X1.size() < 24) {
            this.X1.add(0);
        }
        this.X1.add(1);
        this.X1.add(1);
        while (this.X1.size() < 30) {
            this.X1.add(0);
        }
        this.X1.add(1);
    }

    public void X2Create() {
        this.X2.add(1);
        this.X2.add(0);
        while (this.X2.size() < 5) {
            this.X2.add(1);
        }
        this.X2.add(0);
        this.X2.add(1);
        this.X2.add(1);
        this.X2.add(0);
        while (this.X2.size() < 20) {
            this.X2.add(1);
        }
        this.X2.add(0);
        this.X2.add(1);
        this.X2.add(1);
        this.X2.add(0);
        this.X2.add(1);
        this.X2.add(1);
        this.X2.add(0);
        this.X2.add(1);
        this.X2.add(1);
        this.X2.add(0);
        this.X2.add(1);
    }

    public void X3Create() {
        this.X3.add(1);
        this.X3.add(0);
        this.X3.add(1);
        this.X3.add(1);
        this.X3.add(1);
        this.X3.add(0);
        this.X3.add(1);
        this.X3.add(1);
        this.X3.add(0);
        while (this.X3.size() < 20) {
            this.X3.add(1);
        }
        this.X3.add(0);
        this.X3.add(1);
        this.X3.add(1);
        this.X3.add(0);
        this.X3.add(0);
        this.X3.add(0);
        this.X3.add(0);
        this.X3.add(1);
        this.X3.add(1);
        this.X3.add(0);
        this.X3.add(1);
    }

    public void X4Create() {
        this.X4.add(1);
        this.X4.add(0);
        this.X4.add(1);
        this.X4.add(1);
        this.X4.add(1);
        this.X4.add(0);
        this.X4.add(1);
        this.X4.add(1);
        this.X4.add(0);
        while (this.X4.size() < 20) {
            this.X4.add(1);
        }
        this.X4.add(0);
        this.X4.add(1);
        this.X4.add(1);
        this.X4.add(1);
        this.X4.add(1);
        this.X4.add(1);
        this.X4.add(0);
        this.X4.add(1);
        this.X4.add(1);
        this.X4.add(0);
        this.X4.add(1);
    }

    public void X5Create() {
        this.X5.add(1);
        this.X5.add(0);
        this.X5.add(1);
        this.X5.add(1);
        this.X5.add(1);
        this.X5.add(0);
        this.X5.add(1);
        this.X5.add(1);
        this.X5.add(0);
        while (this.X5.size() < 20) {
            this.X5.add(1);
        }
        this.X5.add(0);
        this.X5.add(1);
        this.X5.add(1);
        this.X5.add(1);
        this.X5.add(1);
        this.X5.add(1);
        this.X5.add(0);
        this.X5.add(1);
        this.X5.add(1);
        this.X5.add(0);
        this.X5.add(1);
    }

    public void X6Create() {
        this.X6.add(1);
        this.X6.add(0);
        while (this.X6.size() < 27) {
            this.X6.add(0);
        }
        this.X6.add(1);
        this.X6.add(1);
        this.X6.add(0);
        this.X6.add(1);
    }

    public void X7Create() {
        this.X7.add(1);
        this.X7.add(0);
        this.X7.add(1);
        this.X7.add(1);
        this.X7.add(1);
        this.X7.add(0);
        while (this.X7.size() < 16) {
            this.X7.add(1);
        }
        this.X7.add(0);
        while (this.X7.size() < 20) {
            this.X7.add(1);
        }
        this.X7.add(0);
        this.X7.add(1);
        this.X7.add(1);
        this.X7.add(0);
        this.X7.add(1);
        this.X7.add(1);
        this.X7.add(1);
        this.X7.add(1);
        this.X7.add(1);
        this.X7.add(0);
        this.X7.add(1);
    }

    public void X8Create() {
        this.X8.add(1);
        this.X8.add(0);
        this.X8.add(1);
        this.X8.add(1);
        this.X8.add(1);
        this.X8.add(0);
        while (this.X8.size() < 16) {
            this.X8.add(1);
        }
        this.X8.add(0);
        while (this.X8.size() < 20) {
            this.X8.add(1);
        }
        this.X8.add(0);
        this.X8.add(1);
        this.X8.add(1);
        this.X8.add(0);
        this.X8.add(1);
        this.X8.add(1);
        this.X8.add(1);
        this.X8.add(1);
        this.X8.add(1);
        this.X8.add(0);
        this.X8.add(1);
    }

    public void X9Create() {
        this.X9.add(1);
        this.X9.add(0);
        this.X9.add(1);
        this.X9.add(1);
        this.X9.add(1);
        this.X9.add(0);
        this.X9.add(0);
        this.X9.add(0);
        this.X9.add(0);
        this.X9.add(1);
        this.X9.add(1);
        while (this.X9.size() < 20) {
            this.X9.add(0);
        }
        this.X9.add(0);
        this.X9.add(1);
        this.X9.add(1);
        this.X9.add(0);
        this.X9.add(0);
        this.X9.add(0);
        this.X9.add(0);
        this.X9.add(1);
        this.X9.add(1);
        this.X9.add(0);
        this.X9.add(1);
    }

    public void X10Create() {
        this.X10.add(1);
        this.X10.add(0);
        this.X10.add(1);
        this.X10.add(1);
        this.X10.add(1);
        this.X10.add(0);
        this.X10.add(1);
        this.X10.add(1);
        this.X10.add(0);
        this.X10.add(1);
        this.X10.add(1);
        this.X10.add(0);
        this.X10.add(1);
        this.X10.add(1);
        this.X10.add(1);
        this.X10.add(1);
        this.X10.add(1);
        this.X10.add(0);
        this.X10.add(1);
        this.X10.add(1);
        this.X10.add(0);
        this.X10.add(1);
        this.X10.add(1);
        this.X10.add(0);
        this.X10.add(1);
        this.X10.add(1);
        this.X10.add(0);
        this.X10.add(1);
        this.X10.add(1);
        this.X10.add(0);
        this.X10.add(1);
    }

    public void X11Create() {
        this.X11.add(1);
        this.X11.add(0);
        this.X11.add(1);
        this.X11.add(1);
        this.X11.add(1);
        this.X11.add(0);
        this.X11.add(1);
        this.X11.add(1);
        this.X11.add(0);
        this.X11.add(1);
        this.X11.add(1);
        this.X11.add(0);
        this.X11.add(1);
        this.X11.add(0);
        this.X11.add(0);
        this.X11.add(0);
        this.X11.add(1);
        this.X11.add(0);
        this.X11.add(1);
        this.X11.add(1);
        this.X11.add(0);
        this.X11.add(1);
        this.X11.add(1);
        this.X11.add(0);
        this.X11.add(1);
        this.X11.add(1);
        this.X11.add(0);
        this.X11.add(1);
        this.X11.add(1);
        this.X11.add(0);
        this.X11.add(1);
    }

    public void X12Create() {
        this.X12.add(1);
        this.X12.add(0);
        this.X12.add(0);
        this.X12.add(0);
        this.X12.add(0);
        this.X12.add(0);
        this.X12.add(1);
        this.X12.add(1);
        this.X12.add(0);
        this.X12.add(0);
        this.X12.add(0);
        this.X12.add(0);
        this.X12.add(1);
        this.X12.add(0);
        this.X12.add(0);
        this.X12.add(0);
        this.X12.add(1);
        this.X12.add(0);
        this.X12.add(1);
        this.X12.add(1);
        this.X12.add(0);
        this.X12.add(0);
        this.X12.add(0);
        this.X12.add(0);
        this.X12.add(1);
        this.X12.add(1);
        this.X12.add(0);
        this.X12.add(0);
        this.X12.add(0);
        this.X12.add(0);
        this.X12.add(1);
    }

    public void X13Create() {
        this.X13.add(1);
        this.X13.add(1);
        this.X13.add(1);
        this.X13.add(1);
        this.X13.add(1);
        this.X13.add(0);
        this.X13.add(1);
        this.X13.add(1);
        this.X13.add(1);
        this.X13.add(1);
        this.X13.add(1);
        this.X13.add(0);
        this.X13.add(1);
        this.X13.add(0);
        this.X13.add(0);
        this.X13.add(0);
        this.X13.add(1);
        this.X13.add(0);
        this.X13.add(1);
        this.X13.add(1);
        this.X13.add(1);
        this.X13.add(1);
        this.X13.add(1);
        this.X13.add(0);
        this.X13.add(1);
        this.X13.add(1);
        this.X13.add(1);
        this.X13.add(1);
        this.X13.add(1);
        this.X13.add(0);
        this.X13.add(1);
    }

    public void X14Create() {
        this.X14.add(1);
        this.X14.add(1);
        this.X14.add(1);
        this.X14.add(1);
        this.X14.add(1);
        this.X14.add(0);
        this.X14.add(1);
        this.X14.add(1);
        this.X14.add(1);
        this.X14.add(1);
        this.X14.add(1);
        this.X14.add(0);
        this.X14.add(1);
        this.X14.add(0);
        this.X14.add(0);
        this.X14.add(0);
        this.X14.add(1);
        this.X14.add(0);
        this.X14.add(1);
        this.X14.add(1);
        this.X14.add(1);
        this.X14.add(1);
        this.X14.add(1);
        this.X14.add(0);
        this.X14.add(1);
        this.X14.add(1);
        this.X14.add(1);
        this.X14.add(1);
        this.X14.add(1);
        this.X14.add(0);
        this.X14.add(1);
    }

    public void X15Create() {
        this.X15.add(1);
        this.X15.add(0);
        this.X15.add(0);
        this.X15.add(0);
        this.X15.add(0);
        this.X15.add(0);
        this.X15.add(1);
        this.X15.add(1);
        this.X15.add(0);
        this.X15.add(0);
        this.X15.add(0);
        this.X15.add(0);
        this.X15.add(1);
        this.X15.add(0);
        this.X15.add(0);
        this.X15.add(0);
        this.X15.add(1);
        this.X15.add(0);
        this.X15.add(1);
        this.X15.add(1);
        this.X15.add(0);
        this.X15.add(0);
        this.X15.add(0);
        this.X15.add(0);
        this.X15.add(1);
        this.X15.add(1);
        this.X15.add(0);
        this.X15.add(0);
        this.X15.add(0);
        this.X15.add(0);
        this.X15.add(1);
    }

    public void X16Create() {
        this.X16.add(1);
        this.X16.add(0);
        this.X16.add(1);
        this.X16.add(1);
        this.X16.add(1);
        this.X16.add(0);
        this.X16.add(1);
        this.X16.add(1);
        this.X16.add(0);
        this.X16.add(1);
        this.X16.add(1);
        this.X16.add(0);
        this.X16.add(1);
        this.X16.add(0);
        this.X16.add(0);
        this.X16.add(0);
        this.X16.add(1);
        this.X16.add(0);
        this.X16.add(1);
        this.X16.add(1);
        this.X16.add(0);
        this.X16.add(1);
        this.X16.add(1);
        this.X16.add(0);
        this.X16.add(1);
        this.X16.add(1);
        this.X16.add(0);
        this.X16.add(1);
        this.X16.add(1);
        this.X16.add(0);
        this.X16.add(1);
    }

    public void X17Create() {
        this.X17.add(1);
        this.X17.add(0);
        this.X17.add(1);
        this.X17.add(1);
        this.X17.add(1);
        this.X17.add(0);
        this.X17.add(1);
        this.X17.add(1);
        this.X17.add(0);
        this.X17.add(1);
        this.X17.add(1);
        this.X17.add(0);
        this.X17.add(1);
        this.X17.add(1);
        this.X17.add(1);
        this.X17.add(1);
        this.X17.add(1);
        this.X17.add(0);
        this.X17.add(1);
        this.X17.add(1);
        this.X17.add(0);
        this.X17.add(1);
        this.X17.add(1);
        this.X17.add(0);
        this.X17.add(1);
        this.X17.add(1);
        this.X17.add(0);
        this.X17.add(1);
        this.X17.add(1);
        this.X17.add(0);
        this.X17.add(1);

    }

    public void X18Create() {
        this.X18.add(1);
        this.X18.add(0);
        this.X18.add(1);
        this.X18.add(1);
        this.X18.add(1);
        this.X18.add(0);
        this.X18.add(0);
        this.X18.add(0);
        this.X18.add(0);
        this.X18.add(1);
        this.X18.add(1);
        while (this.X18.size() < 20) {
            this.X18.add(0);
        }
        this.X18.add(0);
        this.X18.add(1);
        this.X18.add(1);
        this.X18.add(0);
        this.X18.add(0);
        this.X18.add(0);
        this.X18.add(0);
        this.X18.add(1);
        this.X18.add(1);
        this.X18.add(0);
        this.X18.add(1);

    }

    public void X19Create() {
        this.X19.add(1);
        this.X19.add(0);
        this.X19.add(1);
        this.X19.add(1);
        this.X19.add(1);
        this.X19.add(0);
        while (this.X19.size() < 16) {
            this.X19.add(1);
        }
        this.X19.add(0);
        while (this.X19.size() < 20) {
            this.X19.add(1);
        }
        this.X19.add(0);
        this.X19.add(1);
        this.X19.add(1);
        this.X19.add(0);
        this.X19.add(1);
        this.X19.add(1);
        this.X19.add(1);
        this.X19.add(1);
        this.X19.add(1);
        this.X19.add(0);
        this.X19.add(1);

    }

    public void X20Create() {
        this.X20.add(1);
        this.X20.add(0);
        this.X20.add(1);
        this.X20.add(1);
        this.X20.add(1);
        this.X20.add(0);
        while (this.X20.size() < 16) {
            this.X20.add(1);
        }
        this.X20.add(0);
        while (this.X20.size() < 20) {
            this.X20.add(1);
        }
        this.X20.add(0);
        this.X20.add(1);
        this.X20.add(1);
        this.X20.add(0);
        this.X20.add(1);
        this.X20.add(1);
        this.X20.add(1);
        this.X20.add(1);
        this.X20.add(1);
        this.X20.add(0);
        this.X20.add(1);

    }

    public void X21Create() {
        this.X21.add(1);
        this.X21.add(0);
        while (this.X21.size() < 27) {
            this.X21.add(0);
        }
        this.X21.add(1);
        this.X21.add(1);
        this.X21.add(0);
        this.X21.add(1);

    }

    public void X22Create() {
        this.X22.add(1);
        this.X22.add(0);
        this.X22.add(1);
        this.X22.add(1);
        this.X22.add(1);
        this.X22.add(0);
        this.X22.add(1);
        this.X22.add(1);
        this.X22.add(0);
        while (this.X22.size() < 20) {
            this.X22.add(1);
        }
        this.X22.add(0);
        this.X22.add(1);
        this.X22.add(1);
        this.X22.add(1);
        this.X22.add(1);
        this.X22.add(1);
        this.X22.add(0);
        this.X22.add(1);
        this.X22.add(1);
        this.X22.add(0);
        this.X22.add(1);

    }

    public void X23Create() {
        this.X23.add(1);
        this.X23.add(0);
        this.X23.add(1);
        this.X23.add(1);
        this.X23.add(1);
        this.X23.add(0);
        this.X23.add(1);
        this.X23.add(1);
        this.X23.add(0);
        while (this.X23.size() < 20) {
            this.X23.add(1);
        }
        this.X23.add(0);
        this.X23.add(1);
        this.X23.add(1);
        this.X23.add(1);
        this.X23.add(1);
        this.X23.add(1);
        this.X23.add(0);
        this.X23.add(1);
        this.X23.add(1);
        this.X23.add(0);
        this.X23.add(1);

    }

    public void X24Create() {
        this.X24.add(1);
        this.X24.add(0);
        this.X24.add(1);
        this.X24.add(1);
        this.X24.add(1);
        this.X24.add(0);
        this.X24.add(1);
        this.X24.add(1);
        this.X24.add(0);
        while (this.X24.size() < 20) {
            this.X24.add(1);
        }
        this.X24.add(0);
        this.X24.add(1);
        this.X24.add(1);
        this.X24.add(0);
        this.X24.add(0);
        this.X24.add(0);
        this.X24.add(0);
        this.X24.add(1);
        this.X24.add(1);
        this.X24.add(0);
        this.X24.add(1);

    }

    public void X25Create() {
        this.X25.add(1);
        this.X25.add(0);
        while (this.X25.size() < 5) {
            this.X25.add(1);
        }
        this.X25.add(0);
        this.X25.add(1);
        this.X25.add(1);
        this.X25.add(0);
        while (this.X25.size() < 20) {
            this.X25.add(1);
        }
        this.X25.add(0);
        this.X25.add(1);
        this.X25.add(1);
        this.X25.add(0);
        this.X25.add(1);
        this.X25.add(1);
        this.X25.add(0);
        this.X25.add(1);
        this.X25.add(1);
        this.X25.add(0);
        this.X25.add(1);

    }

    public void X26Create() {
        this.X26.add(1);
        while (this.X26.size() < 9) {
            this.X26.add(0);
        }
        while (this.X26.size() < 20) {
            this.X26.add(1);
        }
        while (this.X26.size() < 24) {
            this.X26.add(0);
        }
        this.X26.add(1);
        this.X26.add(1);
        while (this.X26.size() < 30) {
            this.X26.add(0);
        }
        this.X26.add(1);

    }

    public void X27Create() {
        this.X27.add(1);
        while (this.X27.size() <= 30) {
            this.X27.add(1);
        }
    }

}
