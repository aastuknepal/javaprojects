package gridbag;

import java.awt.*;

import javax.swing.*;

public class gridb {
	public static void main(String[] args) {
		JFrame f = new JFrame();

		JPanel panel = new JPanel();

		JButton b1 = new JButton("button 1");
		JButton b2 = new JButton("button 2");
		JButton b3 = new JButton("button 3");
		JButton b4 = new JButton("button 4");

		panel.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();

		gbc.gridx = 0;
		gbc.gridy = 0;
		panel.add(b1, gbc);

		gbc.gridx = 0;
		gbc.gridy = 1;
		panel.add(b2, gbc);

		gbc.gridx = 2;
		gbc.gridy = 0;
		panel.add(b3, gbc);

		gbc.gridx = 1;
		gbc.gridy = 4;
		panel.add(b4, gbc);

		f.add(panel);
		f.setSize(800,500);
		f.setVisible(true);
	}
}
