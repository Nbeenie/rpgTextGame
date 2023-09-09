package gwajae_eun;

public class Monster {

	private String monster_name;
	private int monster_count; // 쓰러트린 횟수
	private int monster_level;
	private int monster_hp;
	private double monster_power;
	private double monster_defense;
	private int monster_money;
	private int monster_experience;
	private String monster_talk1;
	private String monster_talk2;

	public Monster(String monster_name, int monster_level, int monster_hp, double monster_power, double monster_defense,
			int monster_money, int monster_experience, String monster_talk1, String monster_talk2) {
		this.monster_name = monster_name;
		this.monster_level = monster_level;
		this.monster_hp = monster_hp;
		this.monster_power = monster_power;
		this.monster_defense = monster_defense;
		this.monster_money = monster_money;
		this.monster_experience = monster_experience;
		this.monster_talk1 = monster_talk1;
		this.monster_talk2 = monster_talk2;
	}

	public String getname() {
		return monster_name;
	}

	public int getcount() {
		return monster_count;
	}

	public int getlv() {
		return monster_level;
	}

	public int gethp() {
		return monster_hp;
	}

	public double getpower() {
		return monster_power;
	}

	public double getdef() {
		return monster_defense;
	}

	public int getmoney() {
		return monster_money;
	}

	public int getexp() {
		return monster_experience;
	}

	public String gettalk1() {
		return monster_talk1;
	}

	public String gettalk2() {
		return monster_talk2;
	}

	void count() {
		monster_count++;
		monster_level++;
		monster_power += 3;
		monster_defense += 3;
		monster_hp += 300;
		monster_money += 6000;
		monster_experience += 15;
	}

}
