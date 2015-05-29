package kafe;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Kafe extends JFrame {
	private static final Kafe instance = new Kafe();
	private static final int WINDOW_X = 691;
	private static final int WINDOW_Y = 922;
	private Dimension SCREEN_DIMENSION;
	private JPanel	view,
					DEFAULT_VIEW,
					LOGIN_VIEW,
					HOME_VIEW;
	private JLabel logoText;
	private JButton loginButton;
	public static Kafe getKafe() {  return instance;  }
	public static void main(String[] args) {  getKafe(); }
	
	private Kafe() {
		//Init Stuff
		super("Kafe");
		SCREEN_DIMENSION = Toolkit.getDefaultToolkit().getScreenSize();
		DEFAULT_VIEW = new JPanel();
		LOGIN_VIEW = new JPanel();
		HOME_VIEW = new JPanel();
		logoText = new JLabel("Kafe");
		loginButton = new JButton("Sign In");
		
		//Default View
		logoText.setFont(new Font("Serif", Font.PLAIN, 72));
		loginButton.addActionListener(new ButtonListener());
		DEFAULT_VIEW.add(logoText);
		DEFAULT_VIEW.add(loginButton);
		
		//Login View
		
		//Home View
		
		//Window position
		setSize(WINDOW_X, WINDOW_Y);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		int w = getSize().width,
			h = getSize().height,
			x = (SCREEN_DIMENSION.width-w)/2,
			y = (SCREEN_DIMENSION.height-h)/2;
		setLocation(x, y);
		
		//Fire it up
		view = DEFAULT_VIEW;
		add(view);
		setVisible(true);
	}
	
	private class ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == loginButton) {
				setVisible(false);
				System.exit(0);
			}
		}
	}
}
