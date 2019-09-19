package com.testGUI;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HelloSwing extends JFrame {

	private static final long serialVersionUID = 1L;

	public void init() {
		JFrame frame = new JFrame("Hello World");
		frame.setSize(666, 233);
	    //frame.getContentPane().setBackground(Color.red);

		JButton btn1 = new JButton("董天宇今天学习JAVA了ma?");
		JButton btn2 = new JButton("董天宇可以考上东北大学ma?");

		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		p2.add(btn1);
		p2.add(btn2);

		frame.add(p1, BorderLayout.NORTH);
		frame.add(p2, BorderLayout.CENTER);
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("当然Submit！");

			}
		});
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("憋想了Cancel！");

			}
		});
	}

	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new HelloSwing().init();
			}
		});
	}
}
