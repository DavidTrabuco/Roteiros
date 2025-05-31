package roteiro10.parte2;
import javax.swing.JFrame;
import javax.swing.JButton;
public class JanelaBorderLayout extends JFrame {

    private int largura = 500;
    private int altura = 500;
    private JButton btnNorte;
    private JButton btnSul;
    private JButton btnLeste;
    private JButton btnOeste;
    private JButton btnCentro;

    public JanelaBorderLayout() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(largura, altura);
        this.setTitle("Janela com BorderLayout");
        this.setLayout(new java.awt.BorderLayout()); // Usando BorderLayout
        this.pack();

        this.iniciarComponentes();
        this.setVisible(true);
    }

    public void iniciarComponentes() {
        btnNorte = new JButton("Botão Norte");
        btnSul = new JButton("Botão Sul");
        btnLeste = new JButton("Botão Leste");
        btnOeste = new JButton("Botão Oeste");
        btnCentro = new JButton("Botão Centro");

        // Adicionando os botões à janela
        this.add(btnNorte, java.awt.BorderLayout.NORTH);
        this.add(btnSul, java.awt.BorderLayout.SOUTH);
        this.add(btnLeste, java.awt.BorderLayout.EAST);
        this.add(btnOeste, java.awt.BorderLayout.WEST);
        this.add(btnCentro, java.awt.BorderLayout.CENTER);
    }
    
}
