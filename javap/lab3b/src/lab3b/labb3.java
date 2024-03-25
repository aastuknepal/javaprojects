
package lab3b;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class labb3 implements ActionListener, MouseListener, KeyListener {
	JTextField t1;
	JTextField t2;
	JButton sum;
	JFrame frame;
	JPanel panel;
	JLabel label;

	public labb3() {

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
		t1.addMouseListener(this);
		t2.addMouseListener(this);
		t1.addKeyListener(this);
		t2.addKeyListener(this);
		frame.addWindowListener(new WindowAdapter() {    
            public void windowClosing (WindowEvent e) {    
                frame.dispose();   
                System.out.println("window closing");
            }    
        });    
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

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("mouse entered");

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("mouse exited");

	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("key pressed");

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	

	public static void main(String[] args) {
		new labb3();
		}

}
