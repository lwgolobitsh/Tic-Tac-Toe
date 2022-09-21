package src;

import javax.swing.*;
import javax.swing.event.MouseInputListener;

import java.awt.Graphics;
import java.awt.event.MouseEvent;

public class Box extends JComponent{

    String val = null;
    int x;
    int y;
    int w;
    int h;

    public Box(int x, int y, int w, int h) {
        this.x=x;
        this.y=y;
        this.w=w;
        this.h=h;
        this.addMouseListener(new ClickListener());
        this.setBounds(x, y, w, h);
        this.setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        g.drawOval((w-x)/2, (h-y)/2, 50, 50);
    }







    private class ClickListener implements MouseInputListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            // TODO Auto-generated method stub
            val = "X";
            System.out.println("x");
            
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void mouseExited(MouseEvent e) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void mousePressed(MouseEvent e) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void mouseDragged(MouseEvent e) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void mouseMoved(MouseEvent e) {
            // TODO Auto-generated method stub
            
        }
        
    }
}