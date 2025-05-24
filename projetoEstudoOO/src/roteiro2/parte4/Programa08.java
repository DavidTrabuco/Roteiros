package roteiro2.parte4;

import java.util.Scanner;

public class Programa08 {
    //Questão 2 e 3 acoplados 
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double[] notas = new double[5];
            int contador = 0;
            
            
            System.out.println("Digite as notas (0 a 10):");
            while (contador < notas.length) {
                System.out.print("Nota " + (contador + 1) + ": ");
                double nota = scanner.nextDouble();
                
                
                if (nota >= 0 && nota <= 10) {
                    notas[contador] = nota;
                    contador++;
                } else {
                    System.out.println("Nota inválida! Por favor, digite uma nota entre 0 e 10.");
                }
            }
            
            System.out.println("Notas armazenadas no vetor:");
            for (int i = 0; i < notas.length; i++) {
                System.out.println("Nota " + (i + 1) + ": " + notas[i]);
            }
        }
    }
}
