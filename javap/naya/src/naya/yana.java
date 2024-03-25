package naya;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

import javax.swing.*;

public class yana implements ActionListener {
	public static void main(String[] args) {
		JFrame f = new JFrame();

		JMenuBar mb = new JMenuBar();

		JMenu fileMenu = new JMenu("File");
		JMenu editMenu = new JMenu("Edit");
		JMenu saveMenu = new JMenu("save");
		JMenu saveAsMenu = new JMenu("pdf");
		JMenuItem open = new JMenuItem("open");
		JMenuItem saveAs = new JMenuItem("save As");
		saveMenu.add(saveAs);
		saveMenu.add(saveAsMenu);
		fileMenu.add(saveMenu);
		fileMenu.add(open);

		mb.add(fileMenu);
		mb.add(editMenu);

		JPanel panel = new JPanel();
		JLabel fnameLabel = new JLabel("First Name");
		JTextField fname = new JTextField();
		JLabel lnameLabel = new JLabel("Last Name");
		JTextField lname = new JTextField();
		JPasswordField password = new JPasswordField();
		JLabel passwordLabel = new JLabel("Password");
		JLabel emailLabel = new JLabel("Email");
		JTextField email = new JTextField();
		JLabel gender = new JLabel("Gender");
		JRadioButton r1 = new JRadioButton("Male");
		JRadioButton r2 = new JRadioButton("Female");
		ButtonGroup bg = new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		JLabel interests = new JLabel("Interests");
		JCheckBox singing = new JCheckBox("Singing");
		JCheckBox dancing = new JCheckBox("Dancing");
		JLabel aboutLabel = new JLabel("About Yourself");
		JTextArea about = new JTextArea();
		JLabel birthLabel = new JLabel("Date of Birth");
		String year[] = { "2000", "2001", "2002", "2003" };
		JComboBox birth = new JComboBox(year);

		JButton submit = new JButton("Submit");
		submit.addActionListener(new yana());

		panel.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();

		gbc.ipadx = 150;
		gbc.ipady = 25;

		gbc.gridx = 0;
		gbc.gridy = 0;
		panel.add(fnameLabel, gbc);
		gbc.gridx = 0;

		gbc.gridy = 1;
		panel.add(lnameLabel, gbc);

		gbc.gridx = 1;
		gbc.gridy = 0;
		panel.add(fname, gbc);
		gbc.gridx = 1;
		gbc.gridy = 1;
		panel.add(lname, gbc);

		gbc.gridx = 1;
		gbc.gridy = 2;
		panel.add(email, gbc);
		gbc.gridx = 0;
		gbc.gridy = 2;
		panel.add(emailLabel, gbc);

		gbc.gridx = 1;
		gbc.gridy = 3;
		panel.add(password, gbc);
		gbc.gridx = 0;
		gbc.gridy = 3;
		panel.add(passwordLabel, gbc);

		gbc.gridx = 0;
		gbc.gridy = 4;
		panel.add(gender, gbc);
		gbc.gridx = 1;
		gbc.gridy = 4;
		panel.add(r1, gbc);
		gbc.gridx = 2;
		gbc.gridy = 4;
		panel.add(r2, gbc);

		gbc.gridx = 0;
		gbc.gridy = 5;
		panel.add(interests, gbc);
		gbc.gridx = 1;
		gbc.gridy = 5;
		panel.add(singing, gbc);
		gbc.gridx = 2;
		gbc.gridy = 5;
		panel.add(dancing, gbc);

		gbc.gridx = 0;
		gbc.gridy = 6;
		panel.add(birthLabel, gbc);
		gbc.gridx = 1;
		gbc.gridy = 6;
		gbc.ipadx = 50;
		gbc.ipady = 10;
		panel.add(birth, gbc);

		gbc.gridx = 1;
		gbc.gridy = 7;
		gbc.ipadx = 150;
		gbc.ipady = 50;
		panel.add(about, gbc);
		gbc.gridx = 0;
		gbc.gridy = 7;
		panel.add(aboutLabel, gbc);

		gbc.gridx = 0;
		gbc.gridy = 8;
		gbc.ipadx = 50;
		gbc.ipady = 10;
		panel.add(submit, gbc);
		f.setJMenuBar(mb);
		f.add(panel);
		f.setSize(800, 500);
		f.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		System.out.println("button clicked");
	}
	
}
