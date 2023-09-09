package gwajae_eun;

import java.util.Random;

public class Fight {

	static int monster_hp, hero_currenthp;
	static int monster_num;
	static int fight1, fight2;

	// 전투 프로세스 함수
	static void fight() {
		System.out.println("편의점 알바를 시작합니다.");
		Random rand = new Random();
		monster_num = rand.nextInt(3); // 0, 1, 2 중 랜덤 선택

		System.out.println(Lists.monster_list.get(monster_num).getname() + "와(과) 전투를 시작합니다.");
		CafeAlba.time1();
		System.out.println(Lists.monster_list.get(monster_num).gettalk1());
		CafeAlba.time1();
		System.out.println(Lists.monster_list.get(monster_num).gettalk2());
		monster_hp = Lists.monster_list.get(monster_num).gethp();
		hero_currenthp = Junbi.알바생.hero_currenthp;
		CafeAlba.time1();

		while (true) {
			// 히어로 공격,몬스터 방어
			System.out.println(Junbi.알바생.hero_name + "의 공격입니다.");
			if (Lists.monster_list.get(monster_num).getdef() >= Junbi.알바생.hero_power) {
				System.out.println(Lists.monster_list.get(monster_num).getname() + "에게 입힌 데미지는" + 0 + "입니다.");
				Mid_term_inspection();
			} else {
				fight1 = (int) ((Junbi.알바생.hero_power - Lists.monster_list.get(monster_num).getdef()) * 100);
				System.out.println(Lists.monster_list.get(monster_num).getname() + "에게 입힌 데미지는 " + fight1 + " 입니다.");
				monster_hp -= fight1;
				Mid_term_inspection();
			}
			if (monster_hp <= 0) {
				CafeAlba.time1();
				System.out.println(Lists.monster_list.get(monster_num).getname() + "을(를) 내쫓았습니다.");
				Junbi.알바생.upexp(Lists.monster_list.get(monster_num).getexp());
				Junbi.알바생.upmoney(Lists.monster_list.get(monster_num).getmoney());
				CafeAlba.time1();
				System.out.println("더 강해져서 돌아오겠다!!!");
				CafeAlba.time1();
				System.out.println(
						Lists.monster_list.get(monster_num).getname() + "을(를) 쓰러뜨렸다!" + User.hero_name + "은(는) 뿌듯해한다.");
				Lists.monster_list.get(monster_num).count();
				CafeAlba.time1();
				System.out.println("경험치를 " + Lists.monster_list.get(monster_num).getexp() + "만큼 획득하였습니다.");
				CafeAlba.time1();
				System.out.println("돈을 " + Lists.monster_list.get(monster_num).getmoney() + "만큼 획득하였습니다.");
				break;
			}
			CafeAlba.time1();
			System.out.println();
			// 히어로 방어, 몬스터 공격
			System.out.println(Lists.monster_list.get(monster_num).getname() + "의 공격입니다.");
			if (Junbi.알바생.hero_defense >= Lists.monster_list.get(monster_num).getpower()) {
				System.out.println(Junbi.알바생.hero_name + "이(가) 입은 데미지는 " + 0 + " 입니다.");
				Mid_term_inspection();
			} else {
				fight2 = (int) ((Lists.monster_list.get(monster_num).getpower() - Junbi.알바생.hero_defense) * 100);
				System.out.println(Junbi.알바생.hero_name + "이(가) 입은 데미지는 " + fight2 + " 입니다.");
				hero_currenthp -= fight2;
				Mid_term_inspection();
			}
			if (hero_currenthp <= 0) {
				CafeAlba.time1();
				System.out.println(Junbi.알바생.hero_name + "이(가) 감당할 수 있는 상황이 아니었습니다.");
				CafeAlba.time1();
				System.out.println("아쉽게도 패배했어... 다음 번에는 더 강해져서 이기도록 하겠어!");
				break;
			}
			CafeAlba.time1();
			System.out.println();
		}
		CafeAlba.time1();
		System.out.println("편의점에서 퇴근합니다.");
	}

	static void Mid_term_inspection() {
		System.out.println(hero_currenthp + " / " + Junbi.알바생.hero_currenthp + " vs " + monster_hp + "/"
				+ Lists.monster_list.get(monster_num).gethp());
	}
}
