
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
		gameOver = round();
		while(!gameOver) {
			if(gameOver) {
				//end game screen
			} else {
				levelUp(method to select health or attack());
				count++;
				gameOver = round();
			}
		}
		//end game screen
	}
	
	public boolean turn(Monster monster, int weapon) {//when player attacks, return if won
		int playerDmg = player.attack(weapon, monster.getDefense());
		monster.takeDamage(playerDmg);
		if (monster.getHP() <= 0) {
			return true;
		}
		int monsterTurn = monster.takeTurn();
		int monsterDmg = monster.attack(player.getDefense());
		if(monsterTurn==0) {
			player.takeDamage(monsterDmg);
		} else {
			monster.heal();
		}
		return false;		
	}
	
	public boolean turn(Monster monster) {//when player heals
		player.heal();
		int monsterTurn = monster.takeTurn();
		int monsterDmg = monster.attack(player.getDefense());
		if(monsterTurn==0) {
			player.takeDamage(monsterDmg);
		} else {
			monster.heal();
		}
		return false;
	}
	
	public boolean round() {//returns if player won the level
		Monster monster = new Monster(player);
		boolean lost = false;
		boolean finished = false;
		boolean won = false;
		while(!finished) {
			int choice = //choose to attack or heal
			if(choice==-1) {
				won = turn(monster);
			} else {
				won = turn(monster, choice);
			}
			if(won) {//if player won already, finished = true, won = true
				finished = true;
			} else if (player.getHP()<=0) {//if player lost, finished = true, won = false
				finished = true;
			}
		}
		return won;		
	}

}
