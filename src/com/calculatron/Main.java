package com.calculatron;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        var frame = new JFrame("Calculatron");
        frame.setContentPane(new GUI().MainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
 