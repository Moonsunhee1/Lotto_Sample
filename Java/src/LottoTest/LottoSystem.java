package LottoTest;

import java.util.Random;

public class LottoSystem {
	int lottoSelect, lottoCountSheet;
	int[][] lottosheet;

	public LottoSystem(int lottoselect, int lottoCountSheet) {
		// TODO Auto-generated constructor stub
		this.lottoSelect = lottoselect;
		this.lottoCountSheet = lottoCountSheet;
	}

	public int[][] autoLotto(int lottoCountSheet2) {
		// TODO Auto-generated method stub
		lottosheet = new int[lottoCountSheet][6];
		for (int i = 0; i < lottoCountSheet; i++) {

			Random rd = new Random();

			for (int i1 = 0; i1 < 6; i1++) {
				lottosheet[i][i1] = rd.nextInt(45) + 1;
				for (int j = 0; j < i1; j++) {
					if (lottosheet[i][i1] == lottosheet[i1][j]) {
						i1 = i1 - 1;
						break;
					}
				}
			}
			for (int i1 = 0; i1 < 6; i1++) {
				for (int j = 0; j <= i1; j++) {
					if (lottosheet[i][i1] <= lottosheet[i][j]) {
						int autoSort = lottosheet[i1][i1];
						lottosheet[i][i1] = lottosheet[i][j];
						lottosheet[i][j] = autoSort;
					}
				}
			}
			System.out.println("자동추첨된 번호: \n");

			for (int i1 = 0; i1 < lottosheet[i1].length; i1++) {
				System.out.print("[" + lottosheet[i][i1] + "]" + " ");
			}
			System.out.println();

		}
		return lottosheet;
	}
}