package PlaneAttack;

import java.util.Timer;

import javax.swing.JPanel;

public class ShootGame extends JPanel {

	public static final int WIDTH = 400;
	public static final int HEIGHT = 654;
	
	private int state;
	private static final int START = 0;
	private static final int RUNNING = 1;
	private static final int PAUSE = 2;
	private static final int GAME_OVER = 3;
	
	private int score = 0;
	private Timer timer;
	private int intervel = 1000 / 100;
	
	
	
}
