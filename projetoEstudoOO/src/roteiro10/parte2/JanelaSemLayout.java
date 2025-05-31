package roteiro10.parte2;

import javax.swing.JButton;
import javax.swing.JFrame;
public class JanelaSemLayout extends JFrame {
    

    private int largura = 500;
    private int altura = 500;
    private JButton btn01;
    private JButton btn02;
    private JButton btn03;
    private JButton btn04;
    private JButton btn05;
    private JButton btn06;


    public JanelaSemLayout(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(largura, altura);
        this.setTitle("Janela Sem Layout");
        this.setLayout(null); // Usando layout nulo para posicionar os botões manualmente

        this.iniciarComponentes();
        this.setVisible(true);

    }
    public void iniciarComponentes(){
        btn01 = new JButton("Botão 01");
        btn02 = new JButton("Botão 02");
        btn03 = new JButton("Botão 03");
        btn04 = new JButton("Botão 04");
        btn05 = new JButton("Botão 05");
        btn06 = new JButton("Botão 06");

        // Definindo posições e tamanhos dos botões
        btn01.setBounds(50, 50, 100, 30);
        btn02.setBounds(50, 100, 100, 30);
        btn03.setBounds(50, 150, 100, 30);
        btn04.setBounds(200, 50, 100, 30);
        btn05.setBounds(200, 100, 100, 30);
        btn06.setBounds(200, 150, 100, 30);

        // Adicionando os botões à janela
        this.add(btn01);
        this.add(btn02);
        this.add(btn03);
        this.add(btn04);
        this.add(btn05);
        this.add(btn06);
    }
}
