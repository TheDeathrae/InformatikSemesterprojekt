package Muehle.Graphics;

import Dame.MusicPlayer;
import Muehle.Spielzustand;
import Spielmenue.FrameSpielmenue;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DrawEngine extends JPanel {
    private final Spielzustand spielzustand = new Spielzustand();
    private static final Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    public static int boardSize = 801;
    public static int boardCornerWidth = screenSize.width / 2 - boardSize / 2;
    public static int boardCornerHeight = screenSize.height / 2 - boardSize / 2;
    public static int buttonSize = 84;
    boolean steinNehmen = false;
    Images a = new Images();
    public ImageIcon iconRed = a.BluePiece;
    public ImageIcon iconWhite = a.WhitePiece;
    private final JButton[] buttons = new JButton[24];
    int bewegenVonFeld;
    boolean kannBewegen = false;

    public DrawEngine() {
        for (int i = 0; i < buttons.length; i++) {
            JButton button = new JButton();
            int final_button_no = i;
            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    zug(button, final_button_no);
                }
            });
            add(button);
            buttons[i] = button;
            buttons[i].setOpaque(false);
            buttons[i].setBackground(new Color(0,0,0,0));
            buttons[i].setBorderPainted(false);
        }
    }

    void zug(JButton jButton, int button_no) {
        //Stein bewegen
        if (kannBewegen){
            System.out.println("bewegt");
            //spielzustand.bewegen(bewegenVonFeld, button_no);
            if (spielzustand.get_spielerAmZug() == 1) {
                jButton.setIcon(iconRed);
            } else {
                jButton.setIcon(iconWhite);
            }
            spielzustand.naechsterSpieler();
            buttons[bewegenVonFeld].setIcon(null);
            kannBewegen = false;
        }
        if (spielzustand.kannBewegen(button_no) && !steinNehmen){
            bewegenVonFeld = button_no;
            kannBewegen = true;
        }
        //Stein setzen
        if (spielzustand.setzen(button_no) && !steinNehmen) {
            System.out.println("gesetzt");
            if (spielzustand.get_spielerAmZug() == 1) {
                jButton.setIcon(iconRed);
            } else {
                jButton.setIcon(iconWhite);
            }
            spielzustand.naechsterSpieler();
        }
        //Stein aufnehmen
        if (steinNehmen) {
            if (spielzustand.steinNehmen(button_no)){
                System.out.println("nimmt");
                jButton.setIcon(null);
                steinNehmen = false;
                return;
            }
            System.out.println("kann diesen Stein nicht nehmen");
            return;
        }
        if (spielzustand.kannSteinNehmen(button_no) && !steinNehmen) {
            System.out.println("kann nehmen");
            steinNehmen = true;
        }
    }


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.drawImage(a.brett, screenSize.width / 2 - boardSize / 2, screenSize.height / 2 - boardSize / 2, boardSize, boardSize, this);
        g2.drawImage(a.hintergrund, 0, 0, screenSize.width, screenSize.height, this);

        buttons[0].setBounds(boardCornerWidth, boardCornerHeight, buttonSize, buttonSize);
        buttons[1].setBounds(boardCornerWidth + boardSize / 2 - buttonSize / 2, boardCornerHeight, buttonSize, buttonSize);
        buttons[2].setBounds(boardCornerWidth + boardSize - buttonSize, boardCornerHeight, buttonSize, buttonSize);
        buttons[3].setBounds(boardCornerWidth + (boardSize / 5) - buttonSize / 2, boardCornerHeight + boardSize / 5 - buttonSize / 2, buttonSize, buttonSize);
        buttons[4].setBounds(boardCornerWidth + (boardSize / 2) - buttonSize / 2, boardCornerHeight + boardSize / 5 - buttonSize / 2, buttonSize, buttonSize);
        buttons[5].setBounds(boardCornerWidth + (boardSize / 5) * 4 - buttonSize / 2, boardCornerHeight + boardSize / 5 - buttonSize / 2, buttonSize, buttonSize);
        buttons[6].setBounds(boardCornerWidth + (boardSize / 3) - buttonSize / 2, boardCornerHeight + boardSize / 3 - buttonSize / 2, buttonSize, buttonSize);
        buttons[7].setBounds(boardCornerWidth + (boardSize / 2) - buttonSize / 2, boardCornerHeight + boardSize / 3 - buttonSize / 2, buttonSize, buttonSize);
        buttons[8].setBounds(boardCornerWidth + (boardSize / 3) * 2 - buttonSize / 2, boardCornerHeight + boardSize / 3 - buttonSize / 2, buttonSize, buttonSize);
        buttons[9].setBounds(boardCornerWidth, boardCornerHeight + boardSize / 2 - buttonSize / 2, buttonSize, buttonSize);
        buttons[10].setBounds(boardCornerWidth + (boardSize / 5) - buttonSize / 2, boardCornerHeight + boardSize / 2 - buttonSize / 2, buttonSize, buttonSize);
        buttons[11].setBounds(boardCornerWidth + (boardSize / 3) - buttonSize / 2, boardCornerHeight + boardSize / 2 - buttonSize / 2, buttonSize, buttonSize);
        buttons[12].setBounds(boardCornerWidth + (boardSize / 3) * 2 - buttonSize / 2, boardCornerHeight + boardSize / 2 - buttonSize / 2, buttonSize, buttonSize);
        buttons[13].setBounds(boardCornerWidth + (boardSize / 5) * 4 - buttonSize / 2, boardCornerHeight + boardSize / 2 - buttonSize / 2, buttonSize, buttonSize);
        buttons[14].setBounds(boardCornerWidth + boardSize - buttonSize, boardCornerHeight + boardSize / 2 - buttonSize / 2, buttonSize, buttonSize);
        buttons[15].setBounds(boardCornerWidth + (boardSize / 3) - buttonSize / 2, boardCornerHeight + boardSize / 3 * 2 - buttonSize / 2, buttonSize, buttonSize);
        buttons[16].setBounds(boardCornerWidth + (boardSize / 2) - buttonSize / 2, boardCornerHeight + boardSize / 3 * 2 - buttonSize / 2, buttonSize, buttonSize);
        buttons[17].setBounds(boardCornerWidth + (boardSize / 3) * 2 - buttonSize / 2, boardCornerHeight + boardSize / 3 * 2 - buttonSize / 2, buttonSize, buttonSize);
        buttons[18].setBounds(boardCornerWidth + (boardSize / 5) - buttonSize / 2, boardCornerHeight + boardSize / 5 * 4 - buttonSize / 2, buttonSize, buttonSize);
        buttons[19].setBounds(boardCornerWidth + (boardSize / 2) - buttonSize / 2, boardCornerHeight + boardSize / 5 * 4 - buttonSize / 2, buttonSize, buttonSize);
        buttons[20].setBounds(boardCornerWidth + (boardSize / 5) * 4 - buttonSize / 2, boardCornerHeight + boardSize / 5 * 4 - buttonSize / 2, buttonSize, buttonSize);
        buttons[21].setBounds(boardCornerWidth, boardCornerHeight + boardSize - buttonSize, buttonSize, buttonSize);
        buttons[22].setBounds(boardCornerWidth + boardSize / 2 - buttonSize / 2, boardCornerHeight + boardSize - buttonSize, buttonSize, buttonSize);
        buttons[23].setBounds(boardCornerWidth + boardSize - buttonSize, boardCornerHeight + boardSize - buttonSize, buttonSize, buttonSize);
    }
}