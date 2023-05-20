package tui;

import java.util.Scanner;

public class UtilTUI {

	private static final Scanner scanner = new Scanner(System.in);

	public static float obterFloat(String mensagem) {
		System.out.println(mensagem);
		float numero = scanner.nextFloat();
		scanner.nextLine();
		return numero;
	}

	public static Integer obterInteger(String mensagem) {
		System.out.println(mensagem);
		try {
			int numero = scanner.nextInt();
			return numero;
		} finally {
			scanner.nextLine();
		}
	}

	public static String obterString(String mensagem) {
		System.out.println(mensagem);
		return scanner.nextLine();
	}

}

