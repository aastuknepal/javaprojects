package gridb;


import java.awt.*;

import javax.swing.*;

public class exam {
	JFrame f;
	exam(){	
	    f = new JFrame();// creating instance of JFrame

		JPanel panel = new JPanel();

		JButton b1 = new JButton("button 1");
		JButton b2 = new JButton("button 2");
		JButton b3 = new JButton("button 3");
		JButton b4 = new JButton("button 4");
		JButton b5 = new JButton("button 5");
		JButton b6 = new JButton("button 6");

		panel.setLayout(new GridLayout(2,1));

		panel.add(b1);
		panel.add(b2);
		panel.add(b4);
		panel.add(b5);
		panel.add(b3);
		panel.add(b6);

		f.add(panel);

		f.setSize(800, 500);// 400 width and 500 height
		f.setVisible(true);// making the frame visible
	}
public static void main(String[] args) {
	new exam();
}
}

