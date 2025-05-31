package roteiro10.parte2;

import javax.swing.JFrame;
import javax.swing.JButton;

public class JanelaFlowLayout extends JFrame {
    private int largura = 500;
    private int altura = 500;
    private JButton btn01;
    private JButton btn02;
    private JButton btn03;
    private JButton btn04;
    private JButton btn05;
    private JButton btn06;

    public JanelaFlowLayout() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(largura, altura);
        this.setTitle("Janela com FlowLayout");
        this.setLayout(new java.awt.FlowLayout()); // Usando FlowLayout

        this.iniciarComponentes();
        this.setVisible(true);
    }

    public void iniciarComponentes() {
        btn01 = new JButton("Botão 01");
        btn02 = new JButton("Botão 02");
        btn03 = new JButton("Botão 03");
        btn04 = new JButton("Botão 04");
        btn05 = new JButton("Botão 05");
        btn06 = new JButton("Botão 06");

        // Adicionando os botões à janela
        this.add(btn01);
        this.add(btn02);
        this.add(btn03);
        this.add(btn04);
        this.add(btn05);
        this.add(btn06);
    }

    
}
