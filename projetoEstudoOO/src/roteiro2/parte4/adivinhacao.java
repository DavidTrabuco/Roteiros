package roteiro2.parte4;

import java.util.Scanner;

public class adivinhacao {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int gerador = (int) (Math.random() * 10) + 1;
            int numeroTentativas = 0;
            int maxTentativas = 10;
            
            System.out.println("Adivinhe um número de 1 a 10!");
            
            int palpite;
            do {
                palpite = scanner.nextInt();
                numeroTentativas++;
                
                if (palpite < 1 || palpite > 10) {
                    System.out.println("Digite um valor entre 1 e 10");
                } else if (palpite < gerador) {
                    System.out.println("Esse valor está baixo.");
                } else if (palpite > gerador) {
                    System.out.println("Esse valor está alto.");
                } else if (palpite == gerador) {
                    System.out.println("Parabéns, você acertou em " + numeroTentativas + " tentativas!");
                }
                
                if (numeroTentativas == maxTentativas) {
                    System.out.println("Você esgotou suas " + maxTentativas + " tentativas. O número era " + gerador);
                    break;
                }
                
                if (palpite != gerador && numeroTentativas < maxTentativas) {
                    System.out.println("Tente novamente! Tentativa " + numeroTentativas + " de " + maxTentativas);
                }
                
            } while (palpite != gerador && numeroTentativas < maxTentativas);
        }
    }
}
