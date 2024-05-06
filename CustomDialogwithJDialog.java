package core_GUI.java;
import javax.swing.*;
public class CustomDialogwithJDialog {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		        JFrame frame = new JFrame("Custom Dialog Example");
		        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		        JButton showDialogButton = new JButton("Show Custom Dialog");
		        showDialogButton.addActionListener(e -> {
		            CustomDialog dialog = new CustomDialog(frame, "Custom Dialog", true);
		            dialog.setVisible(true);
		        });

		        frame.getContentPane().add(showDialogButton);
		        frame.setSize(300, 200);
		        frame.setLocationRelativeTo(null);
		        frame.setVisible(true);
		    }

		    static class CustomDialog extends JDialog {
		        public CustomDialog(JFrame parent, String title, boolean modal) {
		            super(parent, title, modal);
		            JLabel label = new JLabel("This is a custom dialog!");
		            getContentPane().add(label);
		            setSize(200, 100);
		            setLocationRelativeTo(parent);
		        }
		    }
		


	}


