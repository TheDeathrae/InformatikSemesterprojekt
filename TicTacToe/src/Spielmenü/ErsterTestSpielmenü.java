package Spielmen�;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class ErsterTestSpielmen� extends JFrame {
    
    public ErsterTestSpielmen�() {

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
            ErsterTestSpielmen� ex = new ErsterTestSpielmen�();
            ex.setVisible(true);
        });
    }
}