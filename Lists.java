package gwajae_eun;

import java.util.ArrayList;
import java.util.Arrays;

public class Lists {
	// Monster 객체 생성
	static Monster 도둑 = new Monster("도둑", 1, 1000, 9.9, 9.9, 20000, 50, "샤샥-", "도둑이 주머니에 몰래 컵라면을 훔쳐 도망갑니다.");
	static Monster 전도사 = new Monster("전도사", 1, 1000, 8.9, 10.9, 20000, 50, "손님이 물건을 사지 않고 말을 건다.",
			"학생, 인상이 참 좋아 보이는데 혹시 예체능 하나?");
	static Monster 취객 = new Monster("취객", 1, 1000, 10.9, 8.9, 20000, 50, "술병을 들고 취객이 다가온다.", "갑자기 노래를 부르기 시작한다!");

	// Monster 리스트 생성
	static Monster[] data = { 도둑, 전도사, 취객 };
	static ArrayList<Monster> monster_list = new ArrayList<>(Arrays.asList(data));

	// Item 객체 생성
	static Item 팝콘기계 = new Item("팝콘 기계", 0, 100000, 8);
	static Item 영화관좌석 = new Item("영화관 좌석", 0, 200000, 8);
	static Item IMAX = new Item("IMAX", 0, 300000, 8);

	// Item 리스트 생성
	static Item[] data2 = { 팝콘기계, 영화관좌석, IMAX };
	static ArrayList<Item> item_list = new ArrayList<>(Arrays.asList(data2));

	// Menu 객체 생성
	static Menu 아메리카노 = new Menu("아메리카노", 3500, 20, 0.9);
	static Menu 스무디 = new Menu("스무디", 5000, 30, 0.8);
	static Menu 버블티 = new Menu("버블티", 6500, 40, 0.7);

	// Menu 리스트 생성
	static Menu[] data3 = { 아메리카노, 스무디, 버블티 };
	static ArrayList<Menu> menu_list = new ArrayList<>(Arrays.asList(data3));

	// 약국 객체 선언
	static Medicine 공증 = new Medicine("공격력 증가", 1, 0, 0, 10000);
	static Medicine 방증 = new Medicine("방어력 증가", 0, 1, 0, 10000);
	static Medicine 체증 = new Medicine("체력 증가", 0, 0, 100, 10000);

	// 약국 리스트 생성
	static Medicine[] data4 = { 공증, 방증, 체증 };
	static ArrayList<Medicine> medicine_list = new ArrayList<>(Arrays.asList(data4));

	// 2층 메뉴 객체 선언
	static Secondmenu 초밥 = new Secondmenu("초밥", 500000, 200,
			"\r\n" + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣀⡀⠀⠀⢀⣀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣤⣴⣾⡿⠿⠖⠛⠉⣀⣸⣿⣶⣶⡟⢈⣝⣒⠠⢄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣴⣿⣿⣿⠉⣠⣴⣶⣶⡿⠿⠿⠛⠀⢀⣤⡛⠛⠛⠿⣷⡬⠓⠤⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢿⣿⣿⣿⠀⣿⣿⣿⣿⠁⣴⣶⣾⣿⣿⡿⠿⠒⠀⠀⢈⣠⣤⣶⣌⢆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣮⡉⠉⠉⠉⠉⠛⠻⠿⣀⣿⣿⣿⣿⠃⣀⣴⣶⣿⣿⣿⣿⣿⣿⣿⠈⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡗⠀⠀⠠⠀⠀⠀⠀⠀⠀⠙⠿⡟⢣⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡜⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣯⠄⠀⠀⠀⠀⠀⠈⠀⠀⠀⠀⠈⢿⣿⣿⣿⣿⣿⡿⠿⠟⠛⠋⠁  ⢼⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠧⢄⣠⠀⠀⠀⠀⠀⠠⡀⠀⠀⠀⠉⠉⠉⠉⠀⠀⠀⠀⠀⠀   ⠀⣹⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠺⠴⣠⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀   ⠀⣸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⠒⠧⢄⣀⠈⠀⠀⠀⠀⠀⠀⠀⣀⢀⣀⡤⠔⠊⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠚⠤⠦⢶⡠⡰⠴⠓⠋⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n" + "");
	static Secondmenu 새우튀김 = new Secondmenu("새우튀김", 100000, 70,
			"\r\n" + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠤⡀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠊⢸⠃⠀⡁⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡌⢠⠇⠀⡠⠃⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠁⡎⠀⡰⠁⡠⣀⡔⠒⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣴⣁⠀⠀⠠⠀⡞⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠟⣻⠇⠀⠀⡄⢸⠁⠀⡜⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠔⠁⣘⡿⠀⠀⠀⠁⡏⢀⠌⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⢤⠊⠀⣾⣿⠁⠀⠀⣸⢾⣄⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⡀⡠⢀⣀⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⠤⢴⡷⠀⢀⠁⣿⡏⠀⠀⠀⠟⣽⡇⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⢰⣮⣭⠝⠃⠈⠉⠀⠀⠀⠀⠉⠓⣶⡶⠠⢀⣀⣀⠤⠀⠀⠤⢺⣦⠄⠁⠀⢀⣿⡿⠛⠁⠀⡐⠉⣈⡽⠃⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⢀⣠⣿⣩⠅⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠁⠀⠀⠉⠈⠁⠀⠀⠈⠁⠘⠀⠀⣉⣿⣿⠇⢀⡤⠎⢀⢸⣿⡇⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⣸⣏⡉⠋⠀⢰⣦⣤⠀⣀⣄⣤⣤⣤⣤⣶⣆⣀⣀⣀⣠⣤⣀⣀⣀⡌⣿⣽⣿⣿⣟⣁⡠⡾⠇⠐⡈⣸⣿⠃⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠰⣿⣿⣿⣷⣶⠠⣨⣴⣾⣿⣿⡿⠿⠟⠉⠙⠛⠛⠿⢿⣿⡿⣿⣿⣿⣿⡿⠿⠿⡿⣧⡤⠌⠐⠀⣸⣿⡟⠁⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠈⠿⠿⣿⣿⣿⣿⣿⣷⡖⡁⠀⠀⠀⠀⠀⠀⠀⠀⠈⠛⠂⠀⠹⠋⠀⠉⠁⠀⠈⠁⠁⠀⠠⣽⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠘⠻⢻⣿⣷⡶⠀⠀⡀⠀⠀⠀⠀⠀⠀⠀⢀⣤⠄⠀⠀⠀⢀⣀⠀⢀⣀⡘⣾⣾⣿⣿⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⣼⣧⣄⣁⣀⠘⠻⠛⡀⠠⢄⡏⠀⣾⠋⢠⠧⢀⣀⠳⣄⣀⣉⣙⣵⣶⣾⣿⣿⠟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠘⠿⣿⣿⣿⣯⣕⣴⣷⣶⣧⣶⣶⣤⣈⣤⣶⣦⣦⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠛⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⡿⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠉⠀⠉⠙⠋⠁⠀⠉⠉⠛⠋⠉⠛⠉⠉⠛⠛⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠁⠁⠀⠉⠀⠀⠀⠀⠈⠀⠀⠀⠁⠀⠀⠀⠀⠉⠈⠀⠂⠀⠀⠈⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n" + "");
	static Secondmenu 돈까스 = new Secondmenu("돈까스", 300000, 150,
			"\r\n" + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠀⠀⠀⢀⠀⠀⠄⠀⠀⠀⢀⠀⠀⠀⠀⠀⢀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠚⠉⠉⠸⠰⣀⡠⠁⢀⣾⡟⠉⢱⣿⡿⠉⠑⢄⠀⠀⣿⣿⣶⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⢰⠂⠓⠁⠀⠀⠀⠀⠀⢰⣾⠏⢸⣿⡇⠀⣸⣿⠃⠀⠀⠈⠢⢼⣿⣿⣿⣿⣆⢀⣤⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⡀⠂⠀⠈⠀⠠⡀⠀⠀⠀⠀⠀⢸⣿⡇⠀⣿⣷⠀⢹⣿⠀⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠰⠀⠀⠀⠀⠀⠀⠒⠂⠀⠀⠀⠀⢻⣿⡄⢸⣿⣇⠸⣿⡇⠀⠀⠀⢠⣿⣿⣿⣿⣿⣿⣿⣿⣿⠆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⡀⠀⠐⠀⠀⠀⠀⠀⠀⠄⠀⠈⢿⣿⣆⠻⣿⡄⢻⣷⠀⠀⠀⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠢⠑⢄⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⢀⠁⠀⠀⠘⠀⠀⠀⢀⠰⠀⠀⠀⠄⠹⣿⣷⣝⢿⣿⣿⣷⡀⣠⣿⣿⣿⣟⠟⢛⣋⢭⡙⠛⠦⠤⠤⣀⠁⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⢰⢁⠀⠀⠀⠀⠉⠀⠀⠀⠀⠀⠀⣀⣀⣠⡟⠋⠉⣉⣉⣻⣙⣿⡍⠶⠶⢀⣻⣿⣾⣿⣿⣿⣶⣀⣶⠆⢸⡀⠐⡀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠆⠠⠃⠀⠀⠀⠀⢀⣀⣤⡤⠚⡿⡭⠬⠍⠛⢦⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡏⣀⣤⢨⡇⠀⢱⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⢴⠁⠈⠀⢠⠾⠀⠈⠿⣶⣤⣴⣶⣶⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣯⡋⠁⠁⢘⠆⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠘⢰⡀⢠⡇⠀⠛⠆⢠⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠏⠘⢷⣆⣤⠿⠀⠀⢀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⢃⠀⠀⠀⠀⢼⠀⠀⣤⡤⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠟⣫⣭⡍⠙⢿⡏⠀⠀⠀⢠⠏⠀⠀⠀⠀⡘⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠈⠂⠐⠀⠀⠈⠹⣤⠀⢰⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠋⢧⡀⠁⠀⠀⠀⣾⠃⣀⣤⠶⠋⠀⠀⠠⠀⠐⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠠⡀⠀⠀⠀⠈⠲⡄⠻⠿⠿⠿⠿⠛⠉⠙⠻⣿⠟⠋⠁⠀⠸⣗⠀⠀⣠⡼⠟⠋⣉⠏⠉⠉⡢⠀⢀⠔⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠈⠀⡈⠀⠀⠀⠙⣄⠈⠙⠛⠀⠀⠀⠀⠀⣽⠀⠀⠀⣀⠶⠓⠞⠋⠁⠀⠀⠐⢅⡀⢀⡠⢃⠀⠁⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠀⠄⠀⠀⠈⠓⠶⡤⠤⠤⠤⠴⠚⠳⠒⠒⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠠⠈⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠂⠤⢀⠀⠀⠀⠂⠀⠀⠠⠤⠤⠀⠀⠀⠂⠀⠀⢀⡀⠤⠒⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n" + "");
	static Secondmenu 사케 = new Secondmenu("사케", 1100000, 1100,
			"\r\n" + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣤⣤⣤⣤⣤⣤⣤⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠰⣏⠀⠀⠀⠀⠀⠀⠀⢹⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠻⣆⠀⠀⠀⠀⠀⣠⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹⠀⠀⠀⠀⠰⣟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡿⠀⠀⠀⠀⠀⢿⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣸⠇⠀⠀⣀⠀⠀⠘⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡀⠀⢀⠀⢀⡿⠀⡴⠛⠉⠛⣦⠀⢻⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⡾⠃⣴⠏⠀⠀⠀⠀⢀⡾⠃⢰⡞⠀⣸⠇⠀⣧⠀⠀⢀⣿⠀⠘⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⣻⡆⢙⡧⠀⠀⠀⠀⠀⢻⡆⠈⣻⠄⠿⠀⠀⠈⠛⠛⠛⠁⠀⠀⢿⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣤⣤⡄⠘⠋⠀⠚⠁⣠⣤⣤⣄⠐⠏⠀⠸⠋⢠⣤⣤⣤⣄⠀⠀⠀⠀⠀⠀⢸⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⠶⠲⠶⠶⠶⠶⠆⠀⡿⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⢿⠀⠀⠀⠀⠀⠀⠸⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠀⠀⠀⠀⠀⠀    ⠀⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⡄⠀⠀⠀⠀⠀⠀⠀⢷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡾⠀⠀⠀⠀⠀   ⠀⢀⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠻⣦⣀⠀⠀⠀⠀⠀⠈⢳⣄⡀⠀⠀⠀⠀⠀⠀⢀⣠⡞⠁⠀⠀⠀⠀⠀⠀⣸⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⣾⣟⣛⣛⣛⣛⣛⣛⣛⣛⣛⣛⣛⣛⣛⣛⣛⣛⣛⣛⣛⣛⣛⣛⣛⣛⣛⣛⣛⣛⣻⣷⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠛⣿⣛⣛⣛⣛⣛⣛⣛⣛⣛⣛⣛⣛⣛⣛⣛⣛⣛⣛⣛⣛⣛⣛⣛⣛⣛⣛⣿⠛⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n" + "");

	// Skill 리스트 생성
	static Secondmenu[] data5 = { 초밥, 새우튀김, 돈까스, 사케 };
	static ArrayList<Secondmenu> Secondmenu_list = new ArrayList<>(Arrays.asList(data5));

	// Item 객체 생성
	static Item 사시미칼 = new Item("사시미칼", 0, 200000, 8);
	static Item 튀김기 = new Item("튀김기", 0, 400000, 8);
	static Item 매장크기 = new Item("매장크기", 0, 600000, 8);

	// Item 리스트 생성
	static Item[] data6 = { 사시미칼, 튀김기, 매장크기 };
	static ArrayList<Item> item2_list = new ArrayList<>(Arrays.asList(data6));
}
