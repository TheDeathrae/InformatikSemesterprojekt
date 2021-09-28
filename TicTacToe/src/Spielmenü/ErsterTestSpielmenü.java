package Spielmenü;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class ErsterTestSpielmenü extends JFrame {
    
    public ErsterTestSpielmenü() {

        initUI();
    }

    private void initUI() {

        add(new Board());

        setSize(250, 200);

        setTitle("Application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }    
    
    public static void main(String[] args) {
        
        EventQueue.invokeLater(() -> {
            ErsterTestSpielmenü ex = new ErsterTestSpielmenü();
            ex.setVisible(true);
        });
    }
}