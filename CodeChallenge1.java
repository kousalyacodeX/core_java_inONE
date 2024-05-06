package core_GUI.java;
import javax.swing.*;
import java.awt.event.*;
public class CodeChallenge1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		   JFrame frame = new JFrame("Button Click Example");
		        JButton button = new JButton("Click Me");

		        // Registering an ActionListener to handle button click events
		        button.addActionListener(new ActionListener() {
		            public void actionPerformed(ActionEvent e) {
		                // This method is invoked when the button is clicked
		                JOptionPane.showMessageDialog(frame, "Button Clicked!");
		            }
		        });

		        frame.add(button);
		        frame.setSize(300, 200);
		        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        frame.setVisible(true);
		    }
		}

	
	
	

