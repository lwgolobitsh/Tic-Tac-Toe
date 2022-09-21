package src;

import javax.swing.*;
import java.awt.*;

public class Board extends JComponent{

    private int w;
    private int h;
    public Board(int x, int y, int w, int h) {
        this.w = w;
        this.h = h;
        this.setSize(w, h);
        this.setBounds(x, y, w, h);;
        this.setVisible(true);
        this.add(new Box(200, 200, 300,300));
    }

    public void paint(Graphics g) {  
        g.setColor(Color.RED);
        g.drawLine(w/3,0, w/3, h);
        g.drawLine(0, h/3, w, h/3);
        g.drawLine(w-w/3,0, w-w/3, h);
        g.drawLine(0, h-h/3, w, h-h/3);
    }
}