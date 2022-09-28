package src;

import javax.swing.*;
import javax.swing.event.MouseInputListener;
import javax.swing.text.StringContent;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;

public class Box extends JPanel{

    String val = null;
    boolean locked;

    public Box() {
        this.addMouseListener(new ClickListener());
        this.setVisible(true);
        this.locked=false;
    }
    

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        if(Board.turn.equals("x")) {
            g.setColor(Color.blue);
            g.drawLine(0,0,this.getWidth(),this.getHeight());
            g.drawLine(0, this.getHeight(), this.getWidth(), 0);
        } else {
            g.setColor(Color.green);
            g.drawOval(0, 0, this.getWidth(), this.getHeight());
        }
    }







    private class ClickListener implements MouseInputListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            if (!locked){
                repaint();
                val=Board.turn;
                Board.changeTurns();
                locked=true;
            }
            
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