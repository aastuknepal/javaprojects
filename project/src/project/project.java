package lab;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class lab implements ActionListener {
	JTextField t1;
	JTextField t2;
	JButton sum;
	JFrame frame;
	JPanel panel;
	JLabel label;

	public lab() {

		frame = new JFrame();
		frame.setSize(700, 700);
		panel = new JPanel();

		panel.setLayout(new GridBagLayout());
		GridBagConstraints g = new GridBagConstraints();

		t1 = new JTextField();
		t2 = new JTextField();
		sum = new JButton("sum");
		label = new JLabel("Sum: ");

		sum.addActionListener(this);
		    
		g.gridx = 0;
		g.gridy = 0;
		g.ipadx = 150;
		g.insets.set(5, 5, 5, 5);
		panel.add(t1, g);

		g.gridx = 0;
		g.gridy = 1;
		panel.add(t2, g);

		g.gridx = 0;
		g.gridy = 2;
		panel.add(t2, g);

		g.gridx = 0;
		g.gridy = 3;
		panel.add(sum, g);

		g.gridx = 0;
		g.gridy = 4;
		panel.add(label, g);

		frame.add(panel);
		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {

		int n1 = Integer.parseInt(t1.getText());
		int n2 = Integer.parseInt(t2.getText());
		int sum = n1 + n2;
		label.setText("Sum:" + sum);
	}



public static void main(String[] args) {
	new lab();
	}

}
