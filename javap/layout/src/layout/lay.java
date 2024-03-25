package layout;

import java.awt.*;

import javax.swing.*;

public class lay {
	public static void main(String[] args) {
		JFrame f = new JFrame();

		JPanel panel = new JPanel();

		JButton b1 = new JButton("button 1");
		JButton b2 = new JButton("button 2");
		JButton b3 = new JButton("button 3");
		JButton b4 = new JButton("button 4");
		JButton b5 = new JButton("button 5");

		panel.setLayout(new BorderLayout());

		panel.add(b1, BorderLayout.NORTH);
		panel.add(b2, BorderLayout.SOUTH);
		panel.add(b4, BorderLayout.EAST);
		panel.add(b5, BorderLayout.WEST);
		panel.add(b3, BorderLayout.CENTER);

		f.add(panel);

		f.setSize(800, 500);
		f.setVisible(true);
	}
}