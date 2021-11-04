package asm3;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class ATMWindow {
    JFrame mainFrame = null;
    JTextField textFieldObject = null;
    JButton enterButton = null;

    public ATMWindow(String tittleString){
        mainFrame = new JFrame(tittleString);
        textFieldObject = new JTextField("Text field");
        enterButton = new JButton("Enter");
    }

    public void call(){
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(1000, 1000);

        mainFrame.getContentPane().add(BorderLayout.EAST,textFieldObject);
        mainFrame.getContentPane().add(BorderLayout.NORTH,enterButton);

        mainFrame.setVisible(true);
    }
}
