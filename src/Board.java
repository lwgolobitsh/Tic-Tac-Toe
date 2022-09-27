package src;

import javax.swing.*;
import java.awt.*;

public class Board extends JComponent{

    private int w;
    private int h;
    static String turn;
    public Board(int w, int h) {
        this.w = w;
        Board.turn="x";
        this.h = h;
        this.setLayout(new GridLayout(3, 3, 30, 30));
        //this.setSize(w, h);
        //this.setBounds(x, y, w, h);
        this.setVisible(true);
        this.setOpaque(true);
        this.add(new Box());
        this.add(new Box());
        this.add(new Box());
        this.add(new Box());
        this.add(new Box());
        this.add(new Box());
        this.add(new Box());
        this.add(new Box());
        this.add(new Box());
    }
    public static void changeTurns() {
        if (Board.turn.equals("x")) {
            Board.turn="o";
        } else {
            Board.turn="x";
        }
    }

    public void paint(Graphics g) {  
        g.setColor(new Color(252, 119, 3));
        g.drawLine(w/3,0, w/3, h);
        g.drawLine(0, h/3, w, h/3);
        g.drawLine(w-w/3,0, w-w/3, h);
        g.drawLine(0, h-h/3, w, h-h/3);
    }
}