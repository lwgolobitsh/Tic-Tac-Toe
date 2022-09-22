package src;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        final int side = 600;
        JFrame window = new JFrame("Tic-Tac-Toe");
        window.setSize(side,side);
        Board board = new Board(100,100,side, side);
        //board.setBounds(0, 0, 500, 500);
        window.add(board);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
}
