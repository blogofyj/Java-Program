
public class Lessonseven {

	/**
	 * @param args
	 */
	public final String Demo = "Here Lies a Dead monster";
	
	private int health  = 500;
	private int attack = 20;
	private int movement = 2;
	private int xPosition = 0;
	private int yPosition = 0;
	private boolean alive = true;
	
	public String name = "Big Monster";
	
	public int getAttack(){
		return attack;
	}
	
	public int getMovement(){
		return movement;
	}
	
	public int getHealth(){
		return health;
	}
	
	public void setHealth(int decreaseHealth){
		health = health - decreaseHealth;
		if(health < 0){
			alive = false;
		}
	}
	
	public void setHealth(double decrease){
		int intDecreaseHealth = (int) decreaseHealth;
		health = health - intDecreaseHealth;
		if(health < 0){
			alive = false;
		}
	}
	
	public  Lessonseven(int newHealth, int newAttack, int newMovement){
		this.health = newHealth;
		this.attack = newAttack;
		this.movement = newMovement;
		
	}
	
	//default Constructor
	public Lessonseven(){
		
	}
	
//	public Lessonseven(int newHealth){
//		health = newHealth;
//	}
//	public Lessonseven(int newHealth, int newAttack){
//		this(newHealth);
//		attack = newAttack;
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lessonseven monster = new Lessonseven();
		System.out.println(monster.name);

	}

}
