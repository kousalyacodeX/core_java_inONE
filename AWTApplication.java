package core_GUI.java;
import java.awt.*;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class AWTApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		//Frame
	Frame frame = new Frame("AWT Application");
	
	//label, buttons
	//labes
	Label label = new Label("Name:");
	label.setBounds(50, 50, 50, 20);//Position -x,y widh height
	frame.add(label);
	//textfield
	TextField text = new TextField();
	text.setBounds(110, 50, 150, 20);
	//button
	Button btn = new Button("Submit");
btn.setBounds(110, 120, 100, 30);
	//checkbox!
	Checkbox chk = new Checkbox("I agree t&C");
	chk.setBounds(110, 120, 200, 20);
	//radio buttons
	CheckboxGroup chk_group = new CheckboxGroup();
	Checkbox radio1 = new Checkbox("Option1",chk_group,false);
	Checkbox radio2 = new Checkbox("Option2",chk_group, false);
	radio1.setBounds(110,150,100,20);
	radio2.setBounds(220,150,100,20);
	
//list
	List lst = new List();
	lst.add("Laptop");
    lst.add("Mouse");
    lst.add("Smartphone");

//ScrollBAr

Scrollbar sb = new Scrollbar();
sb.setBounds(250,180,20,80);


frame.add(label);
	frame.add(text);
	frame.add(radio2);
	frame.add(radio1);
	frame.add(chk);
	frame.add(btn);
	frame.add(lst);
	frame.add(sb);
	frame.setSize(400, 400);
	//window listern - interace window event
	frame.addWindowListener(new WindowAdapter(){
	public void windowClosing(WindowEvent e) {
	//close
	frame.dispose();

	}
	
	});
	frame.setVisible(true);
}
}