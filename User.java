package gwajae_eun;

import java.util.Scanner;

public class User {
	static String hero_name;
	static int hero_level = 1;
	static int hero_power = 10;
	static int hero_defense = 10;
	static int hero_money = 0;
	static int hero_experience = 0;
	static int hero_maxexperience = 100;
	static int hero_currenthp = 1000;
	static int hero_maxhp = 1000;

	public User() {
		this.hero_name = hero_name;
		this.hero_power = hero_power;
		this.hero_defense = hero_defense;
		this.hero_money = hero_money;
		this.hero_experience = hero_experience;
		this.hero_maxexperience = hero_maxexperience;
		this.hero_currenthp = hero_currenthp;
		this.hero_maxhp = hero_maxhp;
	}

	void setname(String name) {
		hero_name = name;
	}

	void start() {
		System.out.println("\" 《알바왕 김자바 - 게임 시작》 \"");
		CafeAlba.time1();
		System.out.println("“ 대학생으로서 평범한 삶을 살아가고 있는 김자바… ”");
		CafeAlba.time1();
		System.out.println("“ 그러던 어느 날, 김자바는 우연히 이름도 없고, 어떤 종류의 가게인지도 알 수 없는 수상한 가게가 오픈된 것을 보고 호기심에 문을 열고 들어간다. ”");
		CafeAlba.time1();
		System.out.println("“ 김자바의 눈 앞에 사장의 포스를 풍기는 사람이 등장한다. “");
		CafeAlba.time1();
		System.out.println("\" 안녕, 김자바. 난 이 가게의 주인이야. 네가 원한다면, 여기서 '알바왕'이 될 기회를 줄게.\"");
		CafeAlba.time1();
		System.out.println("“ “☞ 알바왕 김자바 ☜” 시작합니다...”");
		CafeAlba.time1();
		System.out.print("이름을 입력하세요: ");
		Scanner name = new Scanner(System.in);
		hero_name = name.next();
		setname(hero_name);
	}

	// 스탯창 함수
	void stat() {
		System.out.println("**********************");
		System.out.println("현재 직원의 이름 : " + hero_name);
		System.out.println("현재 " + hero_name + "의 레벨 : " + hero_level);
		System.out.println("현재 " + hero_name + "의 HP : " + hero_currenthp + "/" + hero_maxhp);
		System.out.println("현재 " + hero_name + "의 힘 : " + hero_power);
		System.out.println("현재 " + hero_name + "의 방어력 : " + hero_defense);
		System.out.println("현재 " + hero_name + "의 돈 : " + hero_money + "원");
		System.out.println("현재 " + hero_name + "의 경험치 : " + hero_experience + "/" + hero_maxexperience);
		System.out.println("**********************");
	}

	void level() {
		System.out.println("레벨업 시스템입니다.");
		System.out.println("현재 " + hero_name + "의 경험치 : " + hero_experience + "/" + hero_maxexperience);
		CafeAlba.time1();
		if (hero_experience >= hero_maxexperience) {
			System.out.println("레벨업이 가능합니다.");
			CafeAlba.time1();
			System.out.println("레벨업!!!");
			levelup();
			stat();
		}
	}

	void pay(int price) {
		hero_money -= price;
	}

	void upexp(int exp) {
		hero_experience += exp;
	}

	void upmoney(int money) {
		hero_money += money;
	}

	void levelup() {
		hero_level++;
		hero_power += 3;
		hero_defense += 3;
		hero_maxhp += 300;
		hero_currenthp += 300;
		hero_experience = hero_experience - hero_maxexperience;
		hero_maxexperience *= 2;
		if (hero_level == 10) {
			System.out.println("★★★레벨 10 도달★★★★");
			CafeAlba.time1();
			System.out.println(User.hero_name + " : 드디어 나만의 가게를 차릴 수 있게 되었어!");
			CafeAlba.time1();
			System.out.println(User.hero_name + " : 새로운 공간에서 나만의 가게를 꾸리고. 고객들을 맞이해보자!");
		}
	}
}
