package LottoTest;

import java.util.Scanner;

public class Customer {

	public static void main(String[] args) {
		ServiceCounter SC = new ServiceCounter();
		Scanner sn = new Scanner(System.in);
		SC.buyRequest(sn);
	}
}
