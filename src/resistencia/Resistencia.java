package resistencia;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Resistencia {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// declaración e inicialización de variables
		double r1 = 0;
		double r2 = 0;
		double r3 = 0;
		boolean bError = true;
		do {

			try {
				System.out.println("Introduce la primera resistencia: ");
				r1 = scanner.nextDouble();
				bError = false;

			} catch (InputMismatchException e) {
				System.out.print("Error, debe ingresar un valor numérico");
				bError = true;
				scanner.nextLine();
			}

		} while (bError);

		do {

			try {
				System.out.println("Introduce la primera resistencia: ");
				r2 = scanner.nextDouble();
				bError = false;

			} catch (InputMismatchException e) {
				System.out.print("Error, debe ingresar un valor numérico");
				bError = true;
				scanner.nextLine();
			}

		} while (bError);

		do {

			try {
				System.out.println("Introduce la primera resistencia: ");
				r3 = scanner.nextDouble();
				bError = false;

			} catch (InputMismatchException e) {
				System.out.print("Error, debe ingresar un valor numérico");
				bError = true;
				scanner.nextLine();
			}

		} while (bError);

//	 calculo del total de resistencia
		double rt = 1 / (1 / r1 + 1 / r2 + 1 / r3);

		System.out.println("La resistencia total es: " + rt);

		scanner.close();

	}

}