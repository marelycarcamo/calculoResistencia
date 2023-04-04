package resistencia;
import java.util.Scanner;

public class Resistencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double r1, r2, r3;
        System.out.println("Introduce la primera resistencia: ");
        r1 = scanner.nextDouble();
        System.out.println("Introduce la segunda resistencia: ");
        r2 = scanner.nextDouble();
        System.out.println("Introduce la tercera resistencia: ");
        r3 = scanner.nextDouble();
        double rt = 1 / (1 / r1 + 1 / r2 + 1 / r3);
        System.out.println("La resistencia total es: " + rt);
        scanner.close();
    }
}