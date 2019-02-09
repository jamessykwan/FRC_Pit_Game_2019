

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainClass {
	JFrame gameFrame = new JFrame();
	GamePanel gamePanel = new GamePanel();
	JButton gameButton = new JButton();
	static final int WINDOW_WIDTH = 800;
	static final int WINDOW_HEIGHT = 800;
	public static void main(String[] args) {
		MainClass mainClass = new MainClass();
		mainClass.setUp();
	}
	public void setUp() {
		gameFrame.add(gamePanel);
		gameFrame.pack();
		gameFrame.setVisible(true);
		gameFrame.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gamePanel.startGame();
		gameFrame.addKeyListener(gamePanel);
	}
}
