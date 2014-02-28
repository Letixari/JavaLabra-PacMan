package javalabrapacman.pacman;

import javalabrapacman.pacman.logiikka.*;
import javax.swing.JFrame;

public class App extends JFrame {

    public static void main(String[] args) {
        new App();
    }

    /**
     *Starts the game
     */
    public App() {
        add(new Peli());
        setTitle("Pacman");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(580, 680);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
