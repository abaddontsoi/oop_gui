package testCase;
import javax.swing.*;
import java.awt.*;

public class GUIDemo1 {
    
    public static void main(String[] args) {

        JFrame demo = new JFrame("tittle?");
        JCheckBox checkBox = new JCheckBox("new checkbox");
        JRadioButton radioButton = new JRadioButton("radio");
        JButton buttonObject = new JButton("button");
        JLabel labelObject = new JLabel("label");
        JTextArea textObject = new JTextArea("text");            

        demo.setSize(400, 300);
        demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        demo.getContentPane().add(BorderLayout.EAST, checkBox);
        demo.getContentPane().add(BorderLayout.WEST, radioButton);
        demo.getContentPane().add(BorderLayout.SOUTH, buttonObject);
        demo.getContentPane().add(BorderLayout.NORTH , labelObject);
        demo.getContentPane().add(BorderLayout.CENTER, textObject);

        demo.setVisible(true);
        
    }
}
