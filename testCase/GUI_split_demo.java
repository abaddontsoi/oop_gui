package testCase;
import java.awt.*;
import javax.swing.*;

public class GUI_split_demo {

    private JFrame demo = null;
    private JCheckBox checkBox = null;
    private JRadioButton radioButton = null;
    private JButton buttonObject = null;
    private JLabel labelObject = null;
    private JTextArea textObject = null;

    public GUI_split_demo(String tittleString){
        demo = new JFrame(tittleString);
        checkBox = new JCheckBox("new checkbox");
        radioButton = new JRadioButton("radio");
        buttonObject = new JButton("button");
        labelObject = new JLabel("label");
        textObject = new JTextArea("text");
    }

    public void call(){

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
