package src;

import javax.swing.*;
import java.awt.*;

public class Board extends JPanel{

    private int w;
    private int h;
    public Board(int w, int h) {
        this.setSize(w, h);
        this.setVisible(true);

    }

    public void paint(Graphics g) {  
        g.setColor(Color.RED);
        g.drawLine(0, 0, w, h);
    }
}