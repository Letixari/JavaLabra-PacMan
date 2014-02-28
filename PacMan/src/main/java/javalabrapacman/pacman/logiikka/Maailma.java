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
    public ArrayList<PacDot> PacDots = new ArrayList<PacDot>();

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

    public boolean wallCheck(int x, int y) {
        int wallstatus = 1;
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
        if (wallstatus == 1) {
            return true;
        }
        return false;
    }

    public void print() {
        System.out.println(this.X0.toString());
        System.out.println(this.X1.toString());
        System.out.println(this.X2.toString());
        System.out.println(this.X3.toString());
        System.out.println(this.X4.toString());
        System.out.println(this.X5.toString());
        System.out.println(this.X6.toString());
        System.out.println(this.X7.toString());
        System.out.println(this.X8.toString());
        System.out.println(this.X9.toString());
        System.out.println(this.X10.toString());
        System.out.println(this.X11.toString());
        System.out.println(this.X12.toString());
        System.out.println(this.X13.toString());
        System.out.println(this.X14.toString());
        System.out.println(this.X15.toString());
        System.out.println(this.X16.toString());
        System.out.println(this.X17.toString());
        System.out.println(this.X18.toString());
        System.out.println(this.X19.toString());
        System.out.println(this.X20.toString());
        System.out.println(this.X21.toString());
        System.out.println(this.X22.toString());
        System.out.println(this.X23.toString());
        System.out.println(this.X24.toString());
        System.out.println(this.X25.toString());
        System.out.println(this.X26.toString());
        System.out.println(this.X27.toString());
    }

    public void X0Create() {
        int X0List[] = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        for (int i = 0; i < X0List.length; i++) {
            this.X0.add(X0List[i]);
        }
    }

    public void X1Create() {
        int X1List[] = {1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1};
        for (int i = 0; i < X1List.length; i++) {
            this.X1.add(X1List[i]);
            if (X1List[i] == 0) {
                PacDots.add(new PacDot(1, i));
            }
        }
    }

    public void X2Create() {
        int X2List[] = {1, 0, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1};
        for (int i = 0; i < X2List.length; i++) {
            this.X2.add(X2List[i]);
            if (X2List[i] == 0) {
                PacDots.add(new PacDot(2, i));
            }
        }
    }

    public void X3Create() {
        int X3List[] = {1, 0, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 0, 0, 0, 0, 1, 1, 0, 1};
        for (int i = 0; i < X3List.length; i++) {
            this.X3.add(X3List[i]);
            if (X3List[i] == 0) {
                PacDots.add(new PacDot(3, i));
            }
        }
    }

    public void X4Create() {
        int X4List[] = {1, 0, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1};
        for (int i = 0; i < X4List.length; i++) {
            this.X4.add(X4List[i]);
            if (X4List[i] == 0) {
                PacDots.add(new PacDot(4, i));
            }
        }
    }

    public void X5Create() {
        int X5List[] = {1, 0, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1};
        for (int i = 0; i < X5List.length; i++) {
            this.X5.add(X5List[i]);
            if (X5List[i] == 0) {
                PacDots.add(new PacDot(5, i));
            }
        }
    }

    public void X6Create() {
        int X6List[] = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1};
        for (int i = 0; i < X6List.length; i++) {
            this.X6.add(X6List[i]);
            if (X6List[i] == 0) {
                PacDots.add(new PacDot(6, i));
            }
        }
    }

    public void X7Create() {
        int X7List[] = {1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1};
        for (int i = 0; i < X7List.length; i++) {
            this.X7.add(X7List[i]);
            if (X7List[i] == 0) {
                PacDots.add(new PacDot(7, i));
            }
        }
    }

    public void X8Create() {
        int X8List[] = {1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1};
        for (int i = 0; i < X8List.length; i++) {
            this.X8.add(X8List[i]);
            if (X8List[i] == 0) {
                PacDots.add(new PacDot(8, i));
            }
        }
    }

    public void X9Create() {
        int X9List[] = {1, 0, 1, 1, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1, 1, 0, 1};
        for (int i = 0; i < X9List.length; i++) {
            this.X9.add(X9List[i]);
            if (X9List[i] == 0) {
                if (i < 12 || i > 18) {
                    PacDots.add(new PacDot(9, i));
                }
            }
        }
    }

    public void X10Create() {
        int X10List[] = {1, 0, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1};
        for (int i = 0; i < X10List.length; i++) {
            this.X10.add(X10List[i]);
            if (X10List[i] == 0) {
                if (i < 12 || i > 18) {
                    PacDots.add(new PacDot(10, i));
                }
            }
        }
    }

    public void X11Create() {
        int X11List[] = {1, 0, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1};
        for (int i = 0; i < X11List.length; i++) {
            this.X11.add(X11List[i]);
            if (X11List[i] == 0) {
                if (i < 12 || i > 18) {
                    PacDots.add(new PacDot(11, i));
                }
            }
        }
    }

    public void X12Create() {
        int X12List[] = {1, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1};
        for (int i = 0; i < X12List.length; i++) {
            this.X12.add(X12List[i]);
            if (X12List[i] == 0) {
                if (i < 12 || i > 18) {
                    PacDots.add(new PacDot(12, i));
                }
            }
        }
    }

    public void X13Create() {
        int X13List[] = {1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1};
        for (int i = 0; i < X13List.length; i++) {
            this.X13.add(X13List[i]);
            if (X13List[i] == 0) {
                if ((i < 12 || i > 18) && (i != 23)) {
                    PacDots.add(new PacDot(13, i));
                }
            }
        }
    }

    public void X14Create() {
        int X14List[] = {1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1};
        for (int i = 0; i < X14List.length; i++) {
            this.X14.add(X14List[i]);
            if (X14List[i] == 0) {
                if (i < 12 || i > 18 && (i != 23)) {
                    PacDots.add(new PacDot(14, i));
                }
            }
        }
    }

    public void X15Create() {
        int X15List[] = {1, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1};
        for (int i = 0; i < X15List.length; i++) {
            this.X15.add(X15List[i]);
            if (X15List[i] == 0) {
                if (i < 12 || i > 18) {
                    PacDots.add(new PacDot(15, i));
                }
            }
        }
    }

    public void X16Create() {
        int X16List[] = {1, 0, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1};
        for (int i = 0; i < X16List.length; i++) {
            this.X16.add(X16List[i]);
            if (X16List[i] == 0) {
                if (i < 12 || i > 18) {
                    PacDots.add(new PacDot(16, i));
                }
            }
        }
    }

    public void X17Create() {
        int X17List[] = {1, 0, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1};
        for (int i = 0; i < X17List.length; i++) {
            this.X17.add(X17List[i]);
            if (X17List[i] == 0) {
                if (i < 12 || i > 18) {
                    PacDots.add(new PacDot(17, i));
                }
            }
        }
    }

    public void X18Create() {
        int X18List[] = {1, 0, 1, 1, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1, 1, 0, 1};
        for (int i = 0; i < X18List.length; i++) {
            this.X18.add(X18List[i]);
            if (X18List[i] == 0) {
                if (i < 12 || i > 18) {
                    PacDots.add(new PacDot(18, i));
                }
            }
        }

    }

    public void X19Create() {
        int X19List[] = {1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1};
        for (int i = 0; i < X19List.length; i++) {
            this.X19.add(X19List[i]);
            if (X19List[i] == 0) {
                PacDots.add(new PacDot(19, i));
            }
        }
    }

    public void X20Create() {
        int X20List[] = {1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1};
        for (int i = 0; i < X20List.length; i++) {
            this.X20.add(X20List[i]);
            if (X20List[i] == 0) {
                PacDots.add(new PacDot(20, i));
            }
        }
    }

    public void X21Create() {
        int X21List[] = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1};
        for (int i = 0; i < X21List.length; i++) {
            this.X21.add(X21List[i]);
            if (X21List[i] == 0) {
                PacDots.add(new PacDot(21, i));
            }
        }
    }

    public void X22Create() {
        int X22List[] = {1, 0, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1};
        for (int i = 0; i < X22List.length; i++) {
            this.X22.add(X22List[i]);
            if (X22List[i] == 0) {
                PacDots.add(new PacDot(22, i));
            }
        }
    }

    public void X23Create() {
        int X23List[] = {1, 0, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1};
        for (int i = 0; i < X23List.length; i++) {
            this.X23.add(X23List[i]);
            if (X23List[i] == 0) {
                PacDots.add(new PacDot(23, i));
            }
        }
    }

    public void X24Create() {
        int X24List[] = {1, 0, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 0, 0, 0, 0, 1, 1, 0, 1};
        for (int i = 0; i < X24List.length; i++) {
            this.X24.add(X24List[i]);
            if (X24List[i] == 0) {
                PacDots.add(new PacDot(24, i));
            }
        }
    }

    public void X25Create() {
        int X25List[] = {1, 0, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1};
        for (int i = 0; i < X25List.length; i++) {
            this.X25.add(X25List[i]);
            if (X25List[i] == 0) {
                PacDots.add(new PacDot(25, i));
            }
        }
    }

    public void X26Create() {
        int X26List[] = {1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1};
        for (int i = 0; i < X26List.length; i++) {
            this.X26.add(X26List[i]);
            if (X26List[i] == 0) {
                PacDots.add(new PacDot(26, i));
            }
        }
    }

    public void X27Create() {
        int X27List[] = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        for (int i = 0; i < X27List.length; i++) {
            this.X27.add(X27List[i]);
        }
    }

}
