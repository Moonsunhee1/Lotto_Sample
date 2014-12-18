package LottoTest;

public class LottoControl {

	private int LottoSheet;
	private int[] matchnum, number, UserInput, Outonumber, Winnumber;

	LottoNumInput LottoIn;
	LottoExam LottoEx;
	LottoOutput LottoOut;

	public void Controller() {

		LottoIn = new LottoNumInput();
		LottoIn.GetLottoNum();
		LottoSheet = LottoIn.LottoSheetPass();
		int Select = LottoIn.LottoselectPass();

		for (int i = 0; i < LottoSheet; i++) {

			LottoEx = new LottoExam();
			LottoEx.OutoLotto(Select);
			LottoEx.ManualLotto(Select);
		}
		LottoEx.WinLotto();
		LottoEx.BonusLotto();
	
	}

	
}
