package roteiro2.parte3;

import java.util.Scanner;

public class Programa06 {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota;

        System.out.println("Digite as notas (digite -1 para encerrar):");

        while (true) {
            System.out.print("Nota: ");
            nota = scanner.nextDouble();

            if (nota == -1) {
                break; 
            }

            if (nota >= 6) {
                System.out.println("Nota " + nota + ": Aprovado");
            } else {
                System.out.println("Nota " + nota + ": Reprovado");
            }
        }

        System.out.println("Programa encerrado.");
        scanner.close();
    }
}
