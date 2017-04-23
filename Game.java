
public class Game {

	public static int count;
	public static String[] elements = {"fire", "water", "earth", "air"};
	public boolean gameOver;
	private Player player;
	public Game() {
		count = 1;
		player = new Player();
		gameOver = false;
		play();
	}
	
	public void play() {
		while(!gameOver) {
			gameOver = round();
			if(gameOver) {
				//end game screen
			} else {
				levelUp(method to select health or attack());
				count++;
				round();
			}
		}
	}
	
	public boolean turn(Monster monster, int weapon) {//when player attacks, return if won
		int playerDmg = player.attack(weapon, monster.getDefense());
		monster.takeDamage(playerDmg);
		if (monster.getHP() <= 0) {
			return true;
		}
		int monsterDmg = monster.attack(player.getDefense());
		player.takeDamage(monsterDmg);
		return false;		
	}
	
	public boolean turn(Monster monster) {//when player heals
		player.heal();
		int monsterDmg = monster.attack(player.getDefense());
		player.takeDamage(monsterDmg);
		return false;
	}
	
	public void round() {//returns if player won the level
		Monster monster = new Monster(player);
		boolean lost = false;
		boolean finished = false;
		boolean won = false;
		while(!finished) {
			//choose to attack or heal
			won = turn(attack or heal);
			if(won) {//if player won already, finished = true, won = true
				finished = true;
			} else if (player.getHP()<=0) {//if player lost, finished = true, won = false
				finished = true;
			}
		}
		return won;		
	}

}
