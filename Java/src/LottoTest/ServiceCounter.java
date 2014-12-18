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
