package disegnaRettangolo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int base, altezza;
		String conferma;
		do {
			System.out.println("Inserire il valore della base: ");
			base = sc.nextInt();
			sc.nextLine();

			System.out.println("Inserire il valore dell'altezza: ");
			altezza = sc.nextInt();
			sc.nextLine();

			for (int i = 1; i <= base; i++)
				System.out.print("*");
			for (int j = 1; j <= altezza - 2; j++) {
				System.out.println();
				System.out.print("*");
				for (int i = 1; i <= base - 2; i++)
					System.out.print(" ");
				System.out.print("*");
			}
			System.out.println();
			for (int i = 1; i <= base; i++)
				System.out.print("*");
			System.out.println();

			System.out.println("Continuare? S/N");
			conferma = sc.nextLine();

		} while (conferma.equalsIgnoreCase("s"));
		sc.close();
		System.out.println("Ciao!");
	}

}
