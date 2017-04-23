
public class Monster {
	
	private int[] defense = {100, 100, 100, 100};
	private int maxHP;
	private int HP;
	private int minAttack;
	private int maxAttack;
	
	private int element;
	private Player player;
	
	public Monster(Player player) {
		HP = 100 + Game.count;
		maxHP = 100 + Game.count;
		element = (int)(4*Math.random());
		minAttack = 5 + Game.count;
		maxAttack = 10 + Game.count;
		defense[element] = 50;
		defense[getReverseElement(element)] = 150;
		this.player = player;
	}
	
	public int getReverseElement(int element) {
		int reverse = element;
		switch(element) {
			case 0:
				reverse = 1;
				break;
			case 1:
				reverse = 0;
				break;
			case 2:
				reverse = 3;
				break;
			case 3:
				reverse = 2;
				break;
		}
		
		return reverse;
	}
	
	public int takeTurn() {//return 0 = attack, 1 = heal
		if(player health is less than minrange
		else if (monster health is less than player minrange
		else if (player health is less than maxrange
		else if (monster health 100%, attack
		else if (monster health less than 50% then 50 + missing% chance heal
		else (90% attack, 10% heal
	}
	public int attack(int playerDefense[]) {
		int damage = (int)((maxAttack-minAttack+1)*Math.random()+minAttack);
		player.takeDamage(damage*playerDefense[element]/100);
		return damage*playerDefense[element]/100;
	}

	public void takeDamage(int dmg) {
		HP-=dmg;
	}
	
	public int heal() {
		int healed = (int)(6*Math.random()+5);
		HP += healed;
		return HP; 
	}
	
	public int getHP() {
		return HP;
	}
	
	public int getMaxHP() {
		return maxHP;
	}
	
	public int[] getDefense() {
		return defense;
	}
}
