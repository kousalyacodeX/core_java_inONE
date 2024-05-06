package core_GUI.java;
import javax.swing.*;
public class SwingMenusandToolbars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		        JFrame frame = new JFrame("Menu Bar Example");
		        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		        JMenuBar menuBar = new JMenuBar();

		        JMenu fileMenu = new JMenu("File");
		        fileMenu.add(new JMenuItem("New"));
		        fileMenu.add(new JMenuItem("Open"));
		        fileMenu.add(new JMenuItem("Save"));
		        fileMenu.addSeparator();
		        fileMenu.add(new JMenuItem("Exit"));

		        JMenu editMenu = new JMenu("Edit");
		        editMenu.add(new JMenuItem("Cut"));
		        editMenu.add(new JMenuItem("Copy"));
		        editMenu.add(new JMenuItem("Paste"));

		        menuBar.add(fileMenu);
		        menuBar.add(editMenu);

		        frame.setJMenuBar(menuBar);
		        frame.setSize(300, 200);
		        frame.setLocationRelativeTo(null);
		        frame.setVisible(true);
		    }
		


	}


