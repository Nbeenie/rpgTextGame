package gwajae_eun;

public class Junbi {

	public static User 알바생 = new User();
	public static Play game = new Play();

	public static void main(String[] args) {
		Junbi.알바생.start();
		while (game.action_num != 99) {
			if (Lists.item2_list.get(0).getlv() == 8 && Lists.item2_list.get(1).getlv() == 8
					&& Lists.item2_list.get(2).getlv() == 8) {
				Ending.ending();
				break;
			} else if (Lists.item_list.get(0).getlv() == 8 && Lists.item_list.get(1).getlv() == 8
					&& Lists.item_list.get(2).getlv() == 8) {
				game.play2();
			} else if (User.hero_level == 10) {
				game.play1();
			} else {
				game.play();
			}
		}

	}
}
