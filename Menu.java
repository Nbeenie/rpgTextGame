
package gwajae_eun;

public class Menu {
	private String menu_name; // 아이템 이름
	private int menu_price; // 아이템 가격
	private int menu_experience; // 아이템 경험치
	private double menu_successprobability; // 메뉴 성공확률값

	public Menu(String menu_name, int menu_price, int menu_experience, double menu_random) {
		this.menu_name = menu_name;
		this.menu_price = menu_price;
		this.menu_experience = menu_experience;
		this.menu_successprobability = menu_random;
	}

	public String getname() {
		return menu_name;
	}

	public int getprice() {
		return menu_price;
	}

	public int getexp() {
		return menu_experience;
	}

	public double getsuccessprobability() {
		return menu_successprobability;
	}
}
