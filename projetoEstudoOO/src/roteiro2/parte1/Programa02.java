package roteiro2.parte1;

import java.util.Scanner;

public class Programa02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu nome :");
        String nome = scanner.nextLine();
        System.out.print("Digite o seu sobrenome :");
        String sobrenome = scanner.nextLine();

        System.out.println("Seu nome completo é: " + nome + " " + sobrenome);

        scanner.close();
    }
}
