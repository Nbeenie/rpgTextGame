package gwajae_eun;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Secondfloor {

	static int menu_num;
	static int manage_num;
	static int second_num;

	static void Secondfloor_play() {
		System.out.println(User.hero_name + " : 이럇샤이마세!!");
		CafeAlba.time1();
		System.out.println(User.hero_name + " : 저희 일식집은 신선한 재료와 정교한 기술로 일본의 맛과 멋을 선사하고자 노력하고 있습니다.");
		CafeAlba.time1();
		System.out.println("무엇을 하시겠습니까?");
		System.out.println("1. 일식집 운영");
		System.out.println("2. 가게 관리");
		System.out.println("99. 나가기");
		Scanner sc = new Scanner(System.in);
		second_num = sc.nextInt();

		switch (second_num) {
		case 1:
			japanese();
			CafeAlba.time1();
			System.out.println();
			Secondfloor_play();
			break;
		case 2:
			manage();
			CafeAlba.time1();
			System.out.println();
			break;
		case 99:
			CafeAlba.time1();
			System.out.println();
			Junbi.game.play();
		}
	}

	static void manage() {
		System.out.println("가게 관리에 입장하였습니다. 무엇을 강화하시겠습니까?");
		for (int i = 0; i < Lists.item2_list.size(); i++) {
			System.out.print(i + ". " + Lists.item2_list.get(i).getname());
			System.out.print(" " + Lists.item2_list.get(i).getlv() + "LV/" + Lists.item2_list.get(i).getmaxlv() + "LV");
			System.out.println(" " + Lists.item2_list.get(i).getpayprice());
		}
		System.out.println("99. 나가기.");
		Scanner sc = new Scanner(System.in);
		manage_num = sc.nextInt();

		if (manage_num != 99) {
			if (Lists.item2_list.get(manage_num).first_if()) {
				Junbi.알바생.pay(Lists.item2_list.get(manage_num).getpayprice());
				System.out.println(Lists.item2_list.get(manage_num).getname() + "를 구매하였습니다. 레벨이 1 증가합니다.");
				Lists.item2_list.get(manage_num).upgrade();
			} else if (Lists.item2_list.get(manage_num).second_if()) {
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

	static void japanese() {
		Random random = new Random();
		int menuIndex = random.nextInt(Lists.Secondmenu_list.size()); // 메뉴 리스트에서 랜덤하게 메뉴 선택
		Secondmenu menu = Lists.Secondmenu_list.get(menuIndex);
		String order = "손님이 " + menu.getname() + "을 주문하였습니다.";
		System.out.println(order);
		time1();
		System.out.println();
		System.out.println("무엇을 판매하시겠습니까?");
		for (int i = 0; i < Lists.Secondmenu_list.size(); i++) {
			System.out.println(i + ". " + Lists.Secondmenu_list.get(i).getname());
		}
		Scanner sc = new Scanner(System.in);
		menu_num = sc.nextInt();
		if (menu.getname() == Lists.Secondmenu_list.get(menu_num).getname()) {
			time1();
			System.out.println("판매에 성공했습니다.");
			System.out.println("주문하신 " + Lists.Secondmenu_list.get(menu_num).getname() + " 나왔습니다!");
			System.out.println(Lists.Secondmenu_list.get(menu_num).getimage());
			System.out.println(Lists.Secondmenu_list.get(menu_num).getprice() + "원을 벌었습니다.");
			Junbi.알바생.upmoney(Lists.Secondmenu_list.get(menu_num).getprice());
		} else {
			System.out.println("판매에 실패했습니다.");
		}
	}

	static void time1() {
		try {
			TimeUnit.SECONDS.sleep(1); // 1초 지연
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}