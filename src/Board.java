package src;

import javax.swing.*;
import java.awt.*;

public class Board extends JComponent{

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
        g.drawLine(this.getWidth()/3,0, this.getWidth()/3, this.getHeight());
        g.drawLine(0, this.getHeight()/3, this.getWidth(), this.getHeight()/3);
        g.drawLine(this.getWidth()-this.getWidth()/3,0, this.getWidth()-this.getWidth()/3, this.getHeight());
        g.drawLine(0, this.getHeight()-this.getHeight()/3, this.getWidth(), this.getHeight()-this.getHeight()/3);
    }
}