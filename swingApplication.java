package core_GUI.java;

import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class swingApplication {

	protected char[] passwordField;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//Frame 
		
JFrame frame = new JFrame("Registeration Form");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
frame.setSize(500,500);
frame.setLocationRelativeTo(null);
frame.setVisible(true);
JPanel panel = new JPanel();
panel.setLayout ( new GridLayout(7,2,10,10));

//Label, text fields, radio, checkBox

JLabel Name = new JLabel("Name : ");
JLabel EMail = new JLabel("EMail : ");
JLabel Password = new JLabel("Password : ");
JLabel Gender = new JLabel("Gender : ");
JLabel Interests = new JLabel("Interests : ");

JTextField nametext = new JTextField();
JTextField emailtext = new JTextField();
JTextField passwordtext = new JTextField();

//Radio
JRadioButton Male = new JRadioButton("Male");
JRadioButton Female = new JRadioButton("Female");
	ButtonGroup GenderGroup = new ButtonGroup();
	GenderGroup.add(femaleRadioButton);
	GenderGroup.add(maleRadioButton);
	
	//Checkbooks
	JCheckBox programmingCheckBox = new JCheckBox("Programming");
	JCheckBox readingCheckBox = new JCheckBox("Reading");//
	JCheckBox travallingCheckBox = new JCheckBox("Travelling");

	
	// JButton
	
	JButton submit = new JButton("Sumit");
	submit.addActionListener(new ActionListener() {
	
		@Override
		public void actionPerformed(ActionEvent e) {
		String name = nameTextField.getText();
		String email = emailTextField.getText();
		char[] password = passwordField.getPassword();
		String gender = maleRadioButton.isSelected()? "Male":"Female";
		String interests = "";
		if(programmingCheckBox.isSelected())
			interests+="Programming";
		if(readingCheckBox.isSelected())
			interests+="Reading";
		if(programmingCheckBox.isSelected())
			interests+="Travelling";
string message = "Name :"name+"\nEmail :"+email+"\nGender :"+gender+"\nintersting :"+intersting;
		}
	});
	panel.add(Name);
	panel.add(EMail);
	panel.add(Password);
	panel.add(Gender);
	panel.add(Interests);
	panel.add(travelling);
	panel.add(programming);
	panel.add(reading);
	panel.add(Male);
	panel.add(Female);
	panel.add(emailtext);
	panel.add(passwordtext);
	panel.add(nametext);
frame.add(panel);
frame.setVisible(true);
	
	
	}

}
