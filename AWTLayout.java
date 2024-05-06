package core_GUI.java;
import java.awt.*;
import java.awt.event.*;
public class AWTLayout {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
Frame frame = new Frame("AWT Layout Manager Application");
//flow layout
/*
FlowLayout flowobj = new FlowLayout();

//Create panel -> simplest container
Panel flowpanel = new Panel(flowobj);



//add componets
flowpanel.add(new Button("Button 1"));
flowpanel.add(new Button("Button 2"));
flowpanel.add(new Button("Button 3"));
flowpanel.add(new Button("Button 4"));
flowpanel.add(new Button("Button 5"));

frame.add(flowpanel);
frame.add(flowpanel); 


// border Layout
BorderLayout borderobj = new BorderLayout();
frame.setLayout(borderobj);
Button button6 = new Button("Button 6");
Button button7 = new Button("Button 7");
Button button8 = new Button("Button 8");

frame.add(button6, BorderLayout.NORTH); // 5 Regions
frame.add(button7, BorderLayout.CENTER); 
frame.add(button8, BorderLayout.WEST); 
*/

// gridLayout

GridLayout gridobj = new GridLayout(2,2);
Panel gridpanel = new Panel(gridobj);
gridpanel.add(new Button("Button9"));
gridpanel.add(new Button("Button10"));
gridpanel.add(new Button("Button11"));
gridpanel.add(new Button("Button12"));

frame.add(gridpanel);

//Handle closing
frame.addWindowListener(new WindowAdapter() {
	public void windowClosing(WindowEvent e) {
	System.exit(0);
	}
});


frame.setSize(500,400);
frame.setVisible(true);
	}


	
	
	
	
	
	}

