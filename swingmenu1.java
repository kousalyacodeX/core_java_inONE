package core_GUI.java;
import java.awt.BorderLayout;

import javax.swing.*;
public class swingmenu1 {


	    public static void main(String[] args) {
	        JFrame frame = new JFrame("Toolbar Example");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        JToolBar toolBar = new JToolBar();
	        toolBar.add(new JButton("New"));
	        toolBar.add(new JButton("Open"));
	        toolBar.add(new JButton("Save"));
	        toolBar.addSeparator();
	        toolBar.add(new JButton("Cut"));
	        toolBar.add(new JButton("Copy"));
	        toolBar.add(new JButton("Paste"));

	        frame.add(toolBar, BorderLayout.NORTH);
	        frame.setSize(300, 200);
	        frame.setLocationRelativeTo(null);
	        frame.setVisible(true);
	    }
	}



