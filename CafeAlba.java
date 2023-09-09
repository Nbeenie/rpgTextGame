package gwajae_eun;

import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class CafeAlba {
	private static List<Menu> menuList;
	static int menu_num;
	static int worktime;
	static int count;
	static int experience;
	static int pay = 0;
	static int wage = 9610;

	void Cafe() {
		this.count = 0;
		this.worktime = 0;
		this.pay = 0;
	}

	public CafeAlba(List<Menu> menuList) {
		this.menuList = menuList;
	}

	static void enterCafe() {
		time1();
		System.out.println("다음과 같은 옵션 중 하나를 선택하여 업무를 시작할 수 있습니다.");
		System.out.println("1. 주문 받고 음료 만들기");
		System.out.println("2. 카페 청소하기");
		System.out.println("3. 재료 정리하기");
		System.out.println("99. 카페에서 나가기");
	}

	// 카페 알바 프로세스
	static void cafeprocess() {
		System.out.println("아침 햇살이 들어오는 카페 안으로 들어서면, 다양한 손님들이 찾아와 카페 메뉴를 주문하고 있습니다.");
		time1();
		enterCafe();
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		switch (option) {
		case 1:
			takeOrder();
			show();
			cafeprocess();
			break;
		case 2:
			cleanCafe();
			cafeprocess();
			break;
		case 3:
			cleanCafe2();
			cafeprocess();
			break;
		case 99:
			Junbi.game.play();
		}
	}

	// 주문 받기, 주문 성공 여부 확인, 돈과 경험치 증가
	static void takeOrder() {
		Random random = new Random();
		int menuIndex = random.nextInt(Lists.menu_list.size()); // 메뉴 리스트에서 랜덤하게 메뉴 선택
		Menu menu = Lists.menu_list.get(menuIndex);
		String order = "손님이 " + menu.getname() + "을 주문하였습니다.";
		System.out.println(order);
		time1();

		// 주문 성공 여부 확인
		if (random.nextDouble() <= menu.getsuccessprobability()) {
			// 주문 성공 시 알바생의 돈과 경험치 증가
			System.out.println("음료 만들기를 성공했습니다.");
			time1();
			System.out.println("여기 주문하신 " + menu.getname() + " 입니다. 맛있게 드세요!");
			time1();
			MoneyAndExp(menu.getprice() / 10, menu.getexp() / 10);
			time1();
			count++;
			if (count % 10 == 0) {
				worktime++;
				wage += 2000;
				MoneyAndExp(wage, 0);
				System.out.println("음료를 만들기에 5번 성공해서 근무시간이 1시간 증가했습니다.");
				System.out.println("음료 만들기에 10번 성공해서 시급이 증가했습니다.");
			} else if (count % 5 == 0) {
				MoneyAndExp(wage, 0);
				worktime++;
				System.out.println("음료를 만들기에 5번 성공해서 근무시간이 1시간 증가했습니다.");
			}
		} else {
			time1();
			System.out.println("음료 만들기를 실패했습니다.");
			time1();
			System.out.println("고객님 죄송합니다. 제가 실수를 해버렸네요...");
		}
	}

	static void cleanCafe() {
		time1();
		System.out.println("뽀드득 뽀드득");
		time1();
		System.out.println("카페가 깨끗해졌습니다.");
		time1();
		MoneyAndExp(1000, 100);
	}

	static void cleanCafe2() {
		time1();
		System.out.println("재료를 정리하고 유통기한을 확인하는 중입니다.");
		time1();
		System.out.println("카페가 정돈되었습니다.");
		time1();
		MoneyAndExp(1500, 50);
	}

	static void MoneyAndExp(int pay, int experience) {
		// 알바생의 돈과 경험치 증가
		User.hero_money += pay;
		Junbi.알바생.hero_experience += experience;
		System.out.println(pay + "원을 얻었습니다.");
		System.out.println(experience + "경험치를을 얻었습니다.");
	}

	public static void show() {
		System.out.println("*****************");
		System.out.println("음료 제조 횟수: " + count + "번");
		System.out.println("일한 시간: " + worktime + "시간");
		System.out.println("현재 시급: " + wage + "원");
		System.out.println("현재 " + User.hero_name + "의 돈 : " + User.hero_money + "원");
		System.out.println("현재 " + User.hero_name + "의 경험치 : " + User.hero_experience + "/" + User.hero_maxexperience);
		System.out.println("*****************");
	}

	static void time1() {
		try {
			TimeUnit.SECONDS.sleep(1); // 1초 지연
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
