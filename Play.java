package gwajae_eun;

import java.util.Scanner;

public class Play {

	static int action_num;

	void play() {
		System.out.println("무엇을 하시겠습니까?");
		Scanner sc = new Scanner(System.in);
		System.out.println("0. 레벨업 시스템");
		System.out.println("1. 스탯창");
		System.out.println("2. 카페 알바");
		System.out.println("3. 편의점 알바");
		System.out.println("4. 약국");
		System.out.println("99. 종료");
		action_num = sc.nextInt();

		switch (action_num) {
		case 0:
			Junbi.알바생.level();
			break;
		case 1:
			Junbi.알바생.stat();
			break;
		case 2:
			CafeAlba.cafeprocess();
			break;
		case 3:
			Fight.fight();
			break;
		case 4:
			Pharmacy.pharmacy();
			break;
		case 99:
			System.out.println("게임을 종료합니다.");
			break;
		}
	}

	void play1() {
		System.out.println("무엇을 하시겠습니까?");
		Scanner sc = new Scanner(System.in);
		System.out.println("0. 레벨업 시스템");
		System.out.println("1. 스탯창");
		System.out.println("2. 카페 알바");
		System.out.println("3. 편의점 알바");
		System.out.println("4. 약국");
		System.out.println("5. 1층 가게");
		System.out.println("99. 종료");
		action_num = sc.nextInt();

		switch (action_num) {
		case 0:
			Junbi.알바생.level();
			break;
		case 1:
			Junbi.알바생.stat();
			break;
		case 2:
			CafeAlba.cafeprocess();
			break;
		case 3:
			Fight.fight();
			break;
		case 4:
			Pharmacy.pharmacy();
			break;
		case 5:
			Firstfloor.firstfloor_play();
			break;
		case 99:
			System.out.println("게임을 종료합니다.");
			break;
		}
	}

	void play2() {
		System.out.println("무엇을 하시겠습니까?");
		Scanner sc = new Scanner(System.in);
		System.out.println("0. 레벨업 시스템");
		System.out.println("1. 스탯창");
		System.out.println("2. 카페 알바");
		System.out.println("3. 편의점 알바");
		System.out.println("4. 약국");
		System.out.println("5. 1층 가게");
		System.out.println("6. 2층 가게");
		System.out.println("99. 종료");
		action_num = sc.nextInt();

		switch (action_num) {
		case 0:
			Junbi.알바생.level();
			break;
		case 1:
			Junbi.알바생.stat();
			break;
		case 2:
			CafeAlba.cafeprocess();
			break;
		case 3:
			Fight.fight();
			break;
		case 4:
			Pharmacy.pharmacy();
			break;
		case 5:
			Firstfloor.firstfloor_play();
			break;
		case 6:
			Secondfloor.Secondfloor_play();
		case 99:
			System.out.println("게임을 종료합니다.");
			break;
		}
	}
}
