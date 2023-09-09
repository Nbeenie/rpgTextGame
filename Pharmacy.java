package gwajae_eun;

import java.util.Scanner;

public class Pharmacy {

	static int medicine_num;

	static void pharmacy() {
		System.out.println("약국에 입장하였습니다. 무엇을 강화하시겠습니까?");
		for (int i = 0; i < Lists.medicine_list.size(); i++) {
			System.out.println(i + ". " + Lists.medicine_list.get(i).getname());
		}
		System.out.println("99. 나가기.");
		Scanner sc = new Scanner(System.in);
		medicine_num = sc.nextInt();
		if (medicine_num != 99) {
			if (Junbi.알바생.hero_money >= Lists.medicine_list.get(medicine_num).getprice()) {
				Junbi.알바생.pay(Lists.medicine_list.get(medicine_num).getprice());
				Lists.medicine_list.get(medicine_num).get();
				Lists.medicine_list.get(medicine_num).up();
			} else {
				System.out.println("돈이 부족합니다.");
			}
			CafeAlba.time1();
			Junbi.알바생.stat();
			CafeAlba.time1();
			pharmacy();
		} else {
			System.out.println("약국에서 나갔습니다.");
		}
	}
}