package core_GUI.java;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CodeChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 // Create a JFrame (window) to hold the button
		        JFrame frame = new JFrame("Swing Button Example");
		        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        frame.setSize(300, 150);

		        // Create a JPanel to hold the button
		        JPanel panel = new JPanel();

		        // Create a button and set its text
		        JButton button = new JButton("Click Me!");

		        // Add an ActionListener to the button
		        button.addActionListener(new ActionListener() {
		            @Override
		            public void actionPerformed(ActionEvent e) {
		                // Show a message dialog when the button is clicked
		                JOptionPane.showMessageDialog(frame, "Button Clicked!");
		            }
		        });

		        // Add the button to the panel
		        panel.add(button);

		        // Add the panel to the frame
		        frame.add(panel, BorderLayout.CENTER);

		        // Center the frame on the screen
		        frame.setLocationRelativeTo(null);

		        // Make the frame visible
		        frame.setVisible(true);
		    }
		}

	


