/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pizza;

/**
 *
 * @author krishshah
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Pizza extends JFrame{
    private Frame frame;
    private JPanel line = new JPanel();
    private Object lab;
    String psize;
    double serving;

    
    Pizza(){
        frame = new JFrame();
        JLabel title = new JLabel("Pizza Servings Calculator",SwingConstants.CENTER);
        title.setForeground(Color.red);
        title.setFont(new Font("Sans",Font.CENTER_BASELINE, 24));
        JLabel inp=new JLabel("Enter the size of the pizza in inches: ");
        JTextField textField = new JTextField(4);
        line.add(textField);
        JButton calculate = new JButton("Calculate Servings");
        JLabel lab = new JLabel("",SwingConstants.CENTER);
        calculate.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent perform){
                psize = textField.getText();
                serving = (Double.parseDouble(psize)/8)*2;
              lab.setText("A "+psize+" inch pizza will serve "+serving+" people");
            }
});

        frame.add(title);
        frame.add(line);
        frame.add(calculate);
        frame.add(lab);
        frame.setLayout(new GridLayout(4,1));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350,300);
        frame.setTitle("Pizza Servings Calculator");
        frame.setVisible(true);
    }
        

           
    
    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        // TODO code application logic here

            new Pizza();
    }
    
}

