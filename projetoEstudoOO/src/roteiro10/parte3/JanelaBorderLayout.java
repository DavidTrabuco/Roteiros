package roteiro10.parte3;
import java.awt.BorderLayout;
import java.awt.Color;



import javax.swing.JFrame;

import javax.swing.JPanel;

public class JanelaBorderLayout  extends JFrame{
    private JPanel pnCabecalho;
    private JPanel pnRodape;
    private JPanel pnEsquerda;
    private JPanel pnDireita;
    private JPanel pnCentro;

    public JanelaBorderLayout(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setTitle("Janela com BorderLayout");
        this.setLayout(new BorderLayout()); // Usando BorderLayout

        this.iniciarComponentes();
        this.setVisible(true);
    }
    public void iniciarComponentes() {
        pnCabecalho = new JPanel();
        pnRodape = new JPanel();
        pnEsquerda = new JPanel();
        pnDireita = new JPanel();
        pnCentro = new JPanel();

       this.pnCabecalho.setBackground(Color.red);
        this.pnRodape.setBackground(Color.blue);
        this.pnEsquerda.setBackground(Color.yellow);
        this.pnDireita.setBackground(Color.gray);
        this.pnCentro.setBackground(Color.green);
        
        this.add(pnCabecalho, BorderLayout.PAGE_START);
        this.add(pnRodape, BorderLayout.PAGE_END);
        this.add(pnEsquerda, BorderLayout.LINE_START);
        this.add(pnDireita, BorderLayout.LINE_END);
        this.add(pnCentro, BorderLayout.CENTER);

    }
  


    
}
