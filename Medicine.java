package gwajae_eun;

public class Medicine {

	private String medicine_name;
	private int plus_power;
	private int plus_defense;
	private int plus_hp;
	private int medicine_price;

	public Medicine(String medicine_name, int plus_power, int plus_defense, int plus_hp, int medicine_price) {
		this.medicine_name = medicine_name;
		this.plus_power = plus_power;
		this.plus_defense = plus_defense;
		this.plus_hp = plus_hp;
		this.medicine_price = medicine_price;
	}

	public String getname() {
		return medicine_name;
	}

	public int getpower() {
		return plus_power;
	}

	public int getdefense() {
		return plus_defense;
	}

	public int gethp() {
		return plus_hp;
	}

	public int getprice() {
		return medicine_price;
	}

	void get() {
		System.out.println(medicine_name + "을 구매하였습니다.");
		System.out.println("공격력이" + plus_power + "증가합니다.");
		System.out.println("방어력이" + plus_defense + "증가합니다.");
		System.out.println("체력이" + plus_hp + "증가합니다.");
	}

	void up() {
		Junbi.알바생.hero_power += plus_power;
		Junbi.알바생.hero_defense += plus_defense;
		Junbi.알바생.hero_maxhp += plus_hp;
		Junbi.알바생.hero_currenthp += plus_hp;
	}

}
