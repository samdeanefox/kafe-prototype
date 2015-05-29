package kafe;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Kafe extends JFrame {
	
	public static final Kafe instance;
	private JPanel mainPanel;
	private JButton start;
	private JButton exit;
	
	static {
		instance = new Kafe();
	}
	
	public static void main(String[] args) {
		Kafe app = getKafe();
	}
	
	public static Kafe getKafe() {
		return instance;
	}
	
	private Kafe() {
		super("Kafe");
		//Main Menu
		start = new JButton("Let's play");
		exit = new JButton("Let's not");
		start.addActionListener(new ButtonListener());
		exit.addActionListener(new ButtonListener());
		//Build Panel
		mainPanel = new JPanel();
		mainPanel.add(start);
		mainPanel.add(exit);
		//Build Window
		setSize(500, 75);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(mainPanel); 
		//Position the window in the center of the screen
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize(); 	// Get the size of the screen
		int w = getSize().width; 	// Determine the new location of the window
		int h = getSize().height;
		int x = (dim.width-w)/2;
		int y = (dim.height-h)/2;
		setLocation(x, y); 	// Move the window
		setVisible(true);
	}
	
	private class ButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
		//Difficulty Menu
		if(start == e.getSource())
		{
			setVisible(false); //get rid of this window
			//Difficulty2 difficulty = new Difficulty2(); //launch next window
		}
		
		//If exit button is pressed
		if(exit == e.getSource())
		{
			System.exit(0); //quit
		}
		}
	}

}
