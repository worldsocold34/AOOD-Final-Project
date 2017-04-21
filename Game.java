
public class Game {

	public static int count;
	public static String[] elements = {"fire", "ice", "earth", "wind"};
	private Player player;
	public Game() {
		count = 0;
		player = new Player();
		play(player);
	}
	
	public void turn(Monster monster, int weapon) {//when player attacks
		while((player.getHP()>0)&&(monster.getHP()>0)) {
			int playerDmg = player.attack(weapon, monster.getDefense());
			monster.takeDamage(playerDmg);
			int monsterDmg = monster.attack(player.getDefense());
			player.takeDamage(monsterDmg);
		}
		
	}
	
	public void turn(Monster monster) {
		while((player.getHP()>0)&&(monster.getHP()>0)) {
			
		}
		
	}
	
	public void play(Player player) {
		Monster monster = new Monster(player);
		
	}

}
