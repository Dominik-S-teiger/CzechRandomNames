package Names;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j = 1, n = 0;
		Scanner sc = new Scanner(System.in);

		
			try {
				System.out.println("Kolik jmen chcete vygenerovat?");
				n = sc.nextInt();

			} catch (Exception e) {
				System.err.println("musíš zadat èíslo");
			}

		for (int i = 1; i <= n; i++) {
			String name = Names.Fullname();
			System.out.println(i + ". " + name);
		}
	}

}
