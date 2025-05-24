package roteiro2.parte2;
import javax.swing.JOptionPane;

    
   
public class Programa03 {
    public static void main(String[] args) {
        System.out.println("Digite seu nome completo: ");

        String nome = JOptionPane.showInputDialog("Digite seu nome completo: ");
        String sobrenome = JOptionPane.showInputDialog("Digite seu sobrenome: ");
        System.out.println("Nome informado : " + nome + " " + sobrenome);


        String strIdade = JOptionPane.showInputDialog("Digite sua idade: ");
        int idade = Integer.parseInt(strIdade);
        System.out.println("Idade informada : " + idade);
    }
}



