/*
 * ESTE PROGRAMA CALCULA LA SUMA TOTAL DE RESISTENCIA
 */
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

		// validación primera resistencia

		do {

			try {
				System.out.println("Introduce la primera resistencia: ");
				r1 = scanner.nextDouble();
				bError = false;
				if (r1 <= 0) {
					System.out.println("ERROR. Ingresar un número positivo\n ");
					bError = true;
				}
			} catch (InputMismatchException e) {
				System.out.println("Error, debe ingresar un valor numérico\n ");
				bError = true;
				scanner.nextLine(); // limpia buffer
			}

		} while (bError);

		// validación segunda resistencia

		do {

			try {
				System.out.println("Introduce la segunda resistencia: ");
				r2 = scanner.nextDouble();
				bError = false;
				if (r2 <= 0) {
					System.out.println("ERROR. Ingresar un número positivo\n ");
					bError = true;
				}

			} catch (InputMismatchException e) {
				System.out.print("ERROR. Ingresar un valor numérico\n");
				bError = true;
				scanner.nextLine();
			}

		} while (bError);

		// validación tercera resistencia

		do {

			try {
				System.out.println("Introduce la tercera resistencia: ");
				r3 = scanner.nextDouble();
				bError = false;
				if (r3 <= 0) {
					System.out.println("ERROR. Ingresar un número positivo\n ");
					bError = true;
				}
			} catch (InputMismatchException e) {
				System.out.print("Error, debe ingresar un valor numérico \n");
				bError = true;
				scanner.nextLine();
			}

		} while (bError);

		// calculo del total de resistencia

		double rt = 1 / (1 / r1 + 1 / r2 + 1 / r3);

		// despliegue de resultado

		System.out.println("La resistencia total es: " + rt);

		scanner.close();

	}

}