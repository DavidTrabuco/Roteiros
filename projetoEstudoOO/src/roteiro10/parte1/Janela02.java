package roteiro10.parte1;

import javax.swing.JFrame;
import javax.swing.JButton;

public class Janela02 extends JFrame {
    
    
    
    private JButton btn01;
    private JButton btn02;
    private int largura = 300;
    private int altura = 300;

    public Janela02() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(largura, altura);
        this.setVisible(true);
        this.setTitle("Janela 02");
        this.setLayout(null); // Usando layout nulo para posicionar os botões manualmente


        btn01 = new JButton("Botão 01");
        btn02 = new JButton("Botão 02");


        btn01.setBounds(50, 50, 100, 30); // Posição x, y e tamanho largura, altura
        btn02.setBounds(50, 100, 100, 30); // Posição x, y e tamanho largura, altura


        this.add(btn01);
        this.add(btn02);

        // Adicionando ação aos botões
        

    }
}
