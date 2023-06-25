package PlaneAttack;

public class Bullet extends FlyingObject{

	private int speed = 3;
	
	public Bullet(int x, int y) {
		this.x = x;
		this.y = y;
		this.image = ShootGame.bullet;
	}
	
	@Override
	public boolean outofBounds() {
		return y < - height;
	}

	@Override
	public void step() {
		y -= speed;
	}
	

}
