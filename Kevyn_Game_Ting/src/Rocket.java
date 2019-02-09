import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Rocket {
	int x;
	int y;
	int width;
	int height;
	int dy = 0;
	public Rocket(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	void update() {
		dy -= 1;
		y -= dy;
	}
	void draw(Graphics g) {
		g.setColor(Color.magenta);
		g.fillRect(x, y - height*2, width, height);
	}
}
