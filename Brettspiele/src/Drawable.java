package TicTacToe.Components;

import TicTacToe.Graphics.DrawEngine;

import java.awt.image.BufferedImage;

public class Drawable {
    private int xKoordinate;
    private int yKoordinate;
    private int reihe;
    private int spalte;
    public BufferedImage image;

    public Drawable(int x, int y) {
        this.xKoordinate = x;
        this.yKoordinate = y;
    }

    public int get_x() {
        return this.xKoordinate;
    }

    public int get_y() {
        return this.yKoordinate;
    }

    public void set_x(int x) {
        this.xKoordinate = x;
    }

    public void set_y(int y) {
        this.yKoordinate = y;
    }

    public int getReihe() {
        return this.reihe;
    }

    public int getSpalte() {
        return this.spalte;
    }

    public void setReihe(int y) {
        this.reihe = y;
    }

    public void setSpalte(int y) {
        this.spalte = y;
    }

    static public void spalteToKoordinate(Drawable cr) {
        if (cr.spalte == 1) {
            cr.set_x(((int) (DrawEngine.getPositionBoardX() + DrawEngine.getBoardSize() / 3 * 0.2)));
        } else if (cr.spalte == 2) {
            cr.set_x(((int) (DrawEngine.getPositionBoardX() + DrawEngine.getBoardSize() / 3 + DrawEngine.getBoardSize() / 3 * 0.2)));
        } else {
            cr.set_x(((int) (DrawEngine.getPositionBoardX() + 2 * DrawEngine.getBoardSize() / 3 + DrawEngine.getBoardSize() / 3 * 0.2)));
        }
    }

    static public void reiheToKoordinate(Drawable cr) {
        if (cr.reihe == 1) {
            cr.set_y(((int) (DrawEngine.getPositionBoardY() + DrawEngine.getBoardSize() / 3 * 0.2)));
        } else if (cr.reihe == 2) {
            cr.set_y(((int) (DrawEngine.getPositionBoardY() + DrawEngine.getBoardSize() / 3 + DrawEngine.getBoardSize() / 3 * 0.2)));
        } else {
            cr.set_y(((int) (DrawEngine.getPositionBoardY() + 2 * DrawEngine.getBoardSize() / 3 + DrawEngine.getBoardSize() / 3 * 0.2)));
        }
    }
}
