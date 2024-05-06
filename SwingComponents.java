package core_GUI.java;
import javax.swing.*;
import java.awt.event.*;
public class SwingComponents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		        JFrame frame = new JFrame("User Registration Form");
		        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        frame.setSize(400, 300);
		        frame.setLayout(null);

		        JLabel nameLabel = new JLabel("Name:");
		        nameLabel.setBounds(50, 20, 80, 25);
		        frame.add(nameLabel);

		        JTextField nameField = new JTextField();
		        nameField.setBounds(150, 20, 200, 25);
		        frame.add(nameField);

		        JLabel lastNameLabel = new JLabel("Last Name:");
		        lastNameLabel.setBounds(50, 50, 80, 25);
		        frame.add(lastNameLabel);

		        JTextField lastNameField = new JTextField();
		        lastNameField.setBounds(150, 50, 200, 25);
		        frame.add(lastNameField);

		        JLabel passwordLabel = new JLabel("Password:");
		        passwordLabel.setBounds(50, 80, 80, 25);
		        frame.add(passwordLabel);

		        JPasswordField passwordField = new JPasswordField();
		        passwordField.setBounds(150, 80, 200, 25);
		        frame.add(passwordField);

		        JLabel phoneLabel = new JLabel("Phone No.:");
		        phoneLabel.setBounds(50, 110, 80, 25);
		        frame.add(phoneLabel);

		        JTextField phoneField = new JTextField();
		        phoneField.setBounds(150, 110, 200, 25);
		        frame.add(phoneField);

		        JLabel interestLabel = new JLabel("Interests:");
		        interestLabel.setBounds(50, 140, 80, 25);
		        frame.add(interestLabel);

		        JCheckBox travelCheckBox = new JCheckBox("Traveling");
		        travelCheckBox.setBounds(150, 140, 100, 25);
		        frame.add(travelCheckBox);

		        JLabel genderLabel = new JLabel("Gender:");
		        genderLabel.setBounds(50, 170, 80, 25);
		        frame.add(genderLabel);

		        JRadioButton maleRadioButton = new JRadioButton("Male");
		        maleRadioButton.setBounds(150, 170, 80, 25);
		        frame.add(maleRadioButton);

		        JRadioButton femaleRadioButton = new JRadioButton("Female");
		        femaleRadioButton.setBounds(230, 170, 80, 25);
		        frame.add(femaleRadioButton);

		        ButtonGroup genderGroup = new ButtonGroup();
		        genderGroup.add(maleRadioButton);
		        genderGroup.add(femaleRadioButton);

		        JButton submitButton = new JButton("Submit");
		        submitButton.setBounds(150, 210, 100, 25);
		        frame.add(submitButton);

		        submitButton.addActionListener(new ActionListener() {
		            public void actionPerformed(ActionEvent e) {
		                String name = nameField.getText();
		                String lastName = lastNameField.getText();
		                String password = new String(passwordField.getPassword());
		                String phone = phoneField.getText();
		                boolean travelInterest = travelCheckBox.isSelected();
		                String gender = maleRadioButton.isSelected() ? "Male" : "Female";

		                // You can process the user data here.
		                
		                System.out.println("Name: " + name);
		                System.out.println("Last Name: " + lastName);
		                System.out.println("Password: " + password);
		                System.out.println("Phone No.: " + phone);
		                System.out.println("Interests - Traveling: " + travelInterest);
		                System.out.println("Gender: " + gender);
		            }
		        });

		        frame.setVisible(true);
		    }
		}
