import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener {
	Timer timer;
	int starterX = MainClass.WINDOW_WIDTH/2;
	int starterY = MainClass.WINDOW_HEIGHT;
	int rocketWidth = 50;
	int rocketHeight = 80;
	static GameStage gameStages = GameStage.Menu;
	Rocket r = new Rocket(starterX, starterY, rocketWidth, rocketHeight);
	public GamePanel() {
		timer = new Timer(1000/75, this);
	}
	public void startGame() {
		timer.start();
	}

	public void userInput(String input) {
		
	}
	public void drawMenuStage(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, MainClass.WINDOW_WIDTH, MainClass.WINDOW_HEIGHT);
	}
	public void drawGameStage(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, MainClass.WINDOW_WIDTH, MainClass.WINDOW_HEIGHT);
		r.draw(g);
	}
	public void drawEndStage(Graphics g) {
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	}
	@Override
	public void paintComponent(Graphics i) {
		if (gameStages == GameStage.Menu) {
			drawMenuStage(i);
		}
		if (gameStages == GameStage.Game) {
			drawGameStage(i);
		}
		if (gameStages == GameStage.End) {
			drawEndStage(i);
		}
		repaint();
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			if (gameStages == GameStage.Menu) {
				gameStages = GameStage.Game;
				System.out.println(gameStages);
			}
		}
	}
}
