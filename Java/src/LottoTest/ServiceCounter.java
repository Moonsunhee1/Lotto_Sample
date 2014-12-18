package LottoTest;

import java.util.Scanner;

public class ServiceCounter {
	private int lottoselect, lottoCountSheet;
	int[][] lottosheet;

	public void buyRequest(Scanner sn) {
		// TODO Auto-generated method stub
		LottoSystem lottoSystem;
		communication(sn);
		if (isAuto()) {

			lottoSystem = new LottoSystem(lottoselect, lottoCountSheet);
			lottosheet = lottoSystem.autoLotto(lottoCountSheet);
		} else {
			lottosheet = manualLotto(sn, lottoCountSheet);
			lottoSystem = new LottoSystem(lottosheet);
		}

	}

	private int[][] manualLotto(Scanner sn, int lottoCountSheet) {
		// TODO Auto-generated method stub
		int[][] lottosheet = new int[lottoCountSheet][6];
		int[] userInput = new int[6];

		for (int i = 0; i < lottoCountSheet; i++) {
			System.out.println("1~45������ ���ڸ� ������� �Է��ϼ���");

			for (int i1 = 0; i1 < userInput.length; i1++) {
				sn = new Scanner(System.in);
				userInput[i1] = sn.nextInt();

				if (userInput[i1] > 0 && userInput[i1] < 46) {

					for (int j = 0; j < i1; j++) {
						if (userInput[i1] == userInput[j]) {
							System.out.println("�ߺ��Ǵ� �����Դϴ�. �ٽ��Է��ϼ���");
							i1--;
						}
					}
				} else {

					System.out.println("������ �ʰ� �ϴ� �����Դϴ�. �ٽ��Է��ϼ���");
					i1--;
				}
			}
			for (int i1 = 0; i1 < 6; i1++) {
				for (int j = 0; j < i1; j++) {
					if (userInput[i1] <= userInput[j]) {
						int manualSort = userInput[i1];
						userInput[i1] = userInput[j];
						userInput[j] = manualSort;
					}
				}
			}
			System.out.println("������ ���ڴ�: \n");
			for (int i1 = 0; i1 < userInput.length; i1++) {
				System.out.print("[" + userInput[i1] + "]" + " ");
			}
		}
		return lottosheet;
	}

	private boolean isAuto() {
		// TODO Auto-generated method stub
		return (lottoselect == 1);
	}

	private void communication(Scanner sn) {
		while (true) {
			System.out.println("�ڵ��Է��� 1 , �����Է��� 2�� �����ּ���");
			lottoselect = sn.nextInt();
			try {

				if (lottoselect == 1) {
					System.out.println("�ڵ��Է��� �����Ͽ����ϴ�.\n������ ��ðڽ��ϱ�?");
					lottoCountSheet = sn.nextInt();

				} else if (lottoselect == 2) {
					System.out.println("�����Է��� �����Ͽ����ϴ�.\n������ ��ðڽ��ϱ�?");
					lottoCountSheet = sn.nextInt();
				}
			} catch (Exception e) {
			}
			if (lottoselect == 1 || lottoselect == 2)
				break;
			System.out.println("�ٽ��Է��ϼ���");
		}
	}

}
