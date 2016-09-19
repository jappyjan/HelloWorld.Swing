package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello World");
        JFrame frame = new JFrame("Hello");
        JLabel label = new JLabel("Hallo Welt");
        frame.add(label);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
