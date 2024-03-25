package adapter;

import javax.swing.*;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.*;

class MyAdapter extends MouseAdapter {
    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Mouse Entered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("Mouse Exited");
    }
}

public class Adapter {
    public static void main(String[] args) {
    	JTextField t1;
    	JTextField t2;
    	JButton sum;
    	JFrame frame;
    	JPanel panel;
    	JLabel label;
        frame = new JFrame();
        panel = new JPanel();
        panel.setLayout(new GridBagLayout());
		GridBagConstraints g = new GridBagConstraints();

		t1 = new JTextField();
		t2 = new JTextField();
		sum = new JButton("sum");
		label = new JLabel("Sum: ");

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

        sum.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	int n1 = Integer.parseInt(t1.getText());
        		int n2 = Integer.parseInt(t2.getText());
        		int sum = n1 + n2;
        		label.setText("Sum:" + sum);
            }
        });

        t1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("Key Pressed");
            }
        });
        
        t2.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("Key Pressed");
            }
        });

        t1.addMouseListener(new MyAdapter());
        t2.addMouseListener(new MyAdapter());

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("Closing window");
                System.exit(0);
            }
        });

    
        frame.add(panel);
        frame.setSize(700, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
