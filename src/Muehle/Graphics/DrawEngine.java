package Muehle.Graphics;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;

import TicTacToe.Components.*;

public class DrawEngine extends JPanel {
    private final List<Drawable> drawables = new ArrayList<Drawable>();
    private static final Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

    public DrawEngine() {

    }

    void toDraw(Drawable newDrawable) {
        drawables.add(newDrawable);
    }

    void reset() {
        drawables.clear();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        Images a = new Images();

        g2.drawImage(a.hintergrund, screenSize.width / 2 - 840 / 2, screenSize.height / 2 - 843 / 2, screenSize.width, screenSize.height, this);

        for (Drawable drawable : drawables) {
            g2.drawImage(drawable.image, drawable.get_x(), drawable.get_y(), screenSize.width, screenSize.height, this);
        }
    }
}