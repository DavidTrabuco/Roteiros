package roteiro2.parte3;

import java.util.Scanner;

public class Programa07 {

public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a sua nota1 : ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a sua nota 2: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a sua nota 3: ");
        double nota3 = scanner.nextDouble();

        double op = (((nota1 * 2) + (nota2 * 4) + (nota3 * 4) / 10));

        System.out.println("A sua média ponderada é:" + op);

        scanner.close();

    }
}
