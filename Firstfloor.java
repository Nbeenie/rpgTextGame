package gwajae_eun;

import java.util.Random;
import java.util.Scanner;

public class Firstfloor {

	static int audience;
	static int manage_num;
	static int first_num;

	static void movie() {
		System.out.println("영화관 업무를 시작합니다.");
		CafeAlba.time1();
		Random random = new Random();
		int audience = random.nextInt(100);
		System.out.println(User.hero_name + " : 영화 상영을 시작합니다! 어서 자리에 앉아주세요!");
		CafeAlba.time1();
		System.out.println("관객이" + audience + "명 입니다.");
		CafeAlba.time1();
		System.out.println("영화 상영으로 인해 얻은 수익은" + (audience * 1500) + "원을 벌었습니다.");
		Junbi.알바생.upmoney(audience * 1500);
	}

	static void manage() {
		System.out.println("가게 관리에 입장하였습니다. 무엇을 강화하시겠습니까?");
		for (int i = 0; i < Lists.item_list.size(); i++) {
			System.out.print(i + ". " + Lists.item_list.get(i).getname());
			System.out.print(" " + Lists.item_list.get(i).getlv() + "LV/" + Lists.item_list.get(i).getmaxlv() + "LV");
			System.out.println(" " + Lists.item_list.get(i).getpayprice());
		}
		System.out.println("99. 나가기.");
		Scanner sc = new Scanner(System.in);
		manage_num = sc.nextInt();

		if (manage_num != 99) {
			if (Lists.item_list.get(manage_num).first_if()) {
				Junbi.알바생.pay(Lists.item_list.get(manage_num).getpayprice());
				System.out.println(Lists.item_list.get(manage_num).getname() + "를 구매하였습니다. 레벨이 1 증가합니다.");
				Lists.item_list.get(manage_num).upgrade();
				if (Lists.item_list.get(0).getlv() == 8 && Lists.item_list.get(1).getlv() == 8
						&& Lists.item_list.get(2).getlv() == 8) {
					CafeAlba.time1();
					System.out.println("★★★ 2층 가게 업그레이드 ★★★ ");
					CafeAlba.time1();
					System.out.println(User.hero_name + " : 1층 영화관의 성공적인 영업으로 2층 가게를 열 수 있게 되었어!");
					CafeAlba.time1();
				} else if (Lists.item_list.get(manage_num).second_if()) {
					System.out.println("최대 레벨에 도달하였습니다");
				} else {
					System.out.println("돈이 부족합니다.");
				}
				CafeAlba.time1();
				System.out.println();
				manage();
			} else {
				System.out.println("가게 관리에서 나갔습니다.");
			}
		}
	}

	static void firstfloor_play() {
		System.out.println("영화관에 들어왔습니다.");
		System.out.println("무엇을 하시겠습니까?");
		System.out.println("1. 영화 상영");
		System.out.println("2. 가게 관리");
		System.out.println("99. 나가기");
		Scanner sc = new Scanner(System.in);
		first_num = sc.nextInt();

		switch (first_num) {
		case 1:
			movie();
			CafeAlba.time1();
			System.out.println();
			firstfloor_play();
			break;
		case 2:
			manage();
			CafeAlba.time1();
			System.out.println();
			break;
		case 99:
			Junbi.game.play();
		}
	}
}
