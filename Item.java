package gwajae_eun;

public class Item {
	private String item_name; // 아이템 이름
	private int item_level; // 아이템 레벨
	private int item_firstprice; // 아이템 기본가격
	private int item_maxlevel; // 아이템 최대 레벨

	public Item(String item_name, int item_level, int item_firstprice, int item_maxlevel) {
		this.item_name = item_name;
		this.item_level = item_level;
		this.item_firstprice = item_firstprice;
		this.item_maxlevel = item_maxlevel;
	}

	public String getname() {
		return item_name;
	}

	public int getlv() {
		return item_level;
	}

	public int getprice() {
		return item_firstprice;
	}

	public int getmaxlv() {
		return item_maxlevel;
	}

	public int getpayprice() {
		return ((item_level + 1) * item_firstprice);
	}

	public boolean first_if() {
		return Junbi.알바생.hero_money >= ((item_level + 1) * item_firstprice) && item_level < item_maxlevel;
	}

	public boolean second_if() {
		return item_level == item_maxlevel;
	}

	public void upgrade() {
		item_level += 1;
		System.out.println(item_level + "LV/" + item_maxlevel + "LV");
	}
}
