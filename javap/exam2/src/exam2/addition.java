
package exam2;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class addition implements MouseListener {
	JTextField t1;
	JTextField t2;
	JButton press;
	JFrame frame;
	JPanel panel;
	JLabel label;

	public addition() {

		frame = new JFrame();
		frame.setSize(700, 700);
		panel = new JPanel();

		panel.setLayout(new GridBagLayout());
		GridBagConstraints g = new GridBagConstraints();

		t1 = new JTextField();
		t2 = new JTextField();
		press = new JButton("press");
		label = new JLabel();

		press.addMouseListener(this);
		

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
		panel.add(press, g);

		g.gridx = 0;
		g.gridy = 4;
		panel.add(label, g);

		frame.add(panel);
		frame.setVisible(true);
	}


	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		int n1 = Integer.parseInt(t1.getText());
		int n2 = Integer.parseInt(t2.getText());
		int sum = n1 + n2;
		label.setText("Sum:" + sum);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		int n1 = Integer.parseInt(t1.getText());
		int n2 = Integer.parseInt(t2.getText());
		int sub = n1 - n2;
		label.setText("difference:" + sub);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		

	}
	
	

	public static void main(String[] args) {
		new addition();
		}

}
