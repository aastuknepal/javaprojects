package group;

import javax.swing.*;

public class grp {
	public static void main(String[] args) {
		JFrame f = new JFrame();

		JPanel panel = new JPanel();

		JButton b1 = new JButton("button 1");
		JButton b2 = new JButton("button 2");
		JButton b3 = new JButton("button 3");
		JButton b4 = new JButton("button 4");
		GroupLayout layout = new GroupLayout(panel);
		panel.setLayout(layout);
		layout.setHorizontalGroup(layout.createSequentialGroup().addComponent(b1).addComponent(b2)
				.addGroup(layout.createParallelGroup().addComponent(b3).addComponent(b4)));

		layout.setVerticalGroup(layout.createSequentialGroup()
				.addGroup(layout.createParallelGroup().addComponent(b1).addComponent(b2).addComponent(b3))
				.addComponent(b4));

		f.add(panel);
		f.setSize(800, 500);
		f.setVisible(true);
	}
}
