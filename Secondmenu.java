package gwajae_eun;

public class Secondmenu {
	private String menu_name; // 아이템 이름
	private int menu_price; // 아이템 가격
	private int menu_experience; // 아이템 경험치
	private String menu_image; // 아이템 이미지

	public Secondmenu(String menu_name, int menu_price, int menu_experience, String menu_image) {
		this.menu_name = menu_name;
		this.menu_price = menu_price;
		this.menu_experience = menu_experience;
		this.menu_image = menu_image;
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

	public String getimage() {
		return menu_image;
	}
}
