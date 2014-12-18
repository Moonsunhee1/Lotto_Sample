package LottoTest;

import java.util.Scanner;

public class LottoNumInput {

	private int lottoselect, lottoSheet;
	private static Scanner sn;
	

	public void GetLottoNum() {

		while (true) {
			System.out.println("자동입력은 1 , 직접입력은 2를 눌러주세요");
			sn = new Scanner(System.in);
			lottoselect = sn.nextInt();
			try {

				if (lottoselect == 1) {
					System.out.println("자동입력을 선택하였습니다.\n몇장을 사시겠습니까?");
					lottoSheet = sn.nextInt();

				} else if (lottoselect == 2) {
					System.out.println("직접입력을 선택하였습니다.\n몇장을 사시겠습니까?");
					lottoSheet = sn.nextInt();
				}
			} catch (Exception e) {
			}
			if (lottoselect == 1 || lottoselect == 2)
				break;
			System.out.println("다시입력하세요");
		}

	}

	public int LottoSheetPass() {
		return lottoSheet;

	}

	public int LottoselectPass() {
		return lottoselect;
	}

}
