package LottoTest;

import java.util.Scanner;

public class LottoNumInput {

	private int lottoselect, lottoSheet;
	private static Scanner sn;
	

	public void GetLottoNum() {

		while (true) {
			System.out.println("�ڵ��Է��� 1 , �����Է��� 2�� �����ּ���");
			sn = new Scanner(System.in);
			lottoselect = sn.nextInt();
			try {

				if (lottoselect == 1) {
					System.out.println("�ڵ��Է��� �����Ͽ����ϴ�.\n������ ��ðڽ��ϱ�?");
					lottoSheet = sn.nextInt();

				} else if (lottoselect == 2) {
					System.out.println("�����Է��� �����Ͽ����ϴ�.\n������ ��ðڽ��ϱ�?");
					lottoSheet = sn.nextInt();
				}
			} catch (Exception e) {
			}
			if (lottoselect == 1 || lottoselect == 2)
				break;
			System.out.println("�ٽ��Է��ϼ���");
		}

	}

	public int LottoSheetPass() {
		return lottoSheet;

	}

	public int LottoselectPass() {
		return lottoselect;
	}

}
