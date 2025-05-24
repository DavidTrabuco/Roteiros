package roteiro7.parte3;
import java.util.ArrayList;
public class Aluno {
     
     
    private int matricula;
    private String nome;
    private String curso;
    private int anoIngresso;
    private String situacao;
    private int qtdDisciplinas;
    private ArrayList<String> ListaDisciplinas;

    public Aluno(int pMatricula, String pNome, String pCurso, int pAnoIngresso, int qtdDisciplinas) {
        this.matricula = pMatricula;
        this.nome = pNome;
        this.curso = pCurso;
        this.anoIngresso = pAnoIngresso;
        this.setQtdDisciplinas(qtdDisciplinas);  
        this.ListaDisciplinas = new ArrayList<String>();
        
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int pmatricula) {
        this.matricula = pmatricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String pNome) {
        this.nome = pNome;
    }

    public String getCurso() {
        return curso;

    }

    public void setCurso(String pCurso) {
        this.curso = pCurso;
    }

    public int getAnoIngresso() {
        return anoIngresso;
    }

    public void setAnoIngresso(int pAnoIngresso) {
        this.anoIngresso = pAnoIngresso;

    }

    public int getQtdDisciplinas() {
        return qtdDisciplinas;
    }

    public void setQtdDisciplinas(int pQtdDisciplinas) {
        this.qtdDisciplinas = pQtdDisciplinas;
        if (pQtdDisciplinas == 0 ) {
            this.situacao = " Não Matriculado";
            
        }else this.situacao = " Matriculado";
     }
     public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String pSituacao) {
        this.situacao = pSituacao;
    }
    public ArrayList<String> getListaDisciplinas() {
        return ListaDisciplinas;
    }
    public void setListaDisciplinas(ArrayList<String> listaDisciplinas) {
        this.ListaDisciplinas = listaDisciplinas;
    }

}

