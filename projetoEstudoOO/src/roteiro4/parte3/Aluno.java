package roteiro4.parte3;

public class Aluno {
    private int matricula;
    private String nome;
    private String curso;
    private int anoIngresso;

    public Aluno(int pMatricula, String pNome, String pCurso, int pAnoIngresso) {
        this.matricula = pMatricula;
        this.nome = pNome;
        this.curso = pCurso;
        this.anoIngresso = pAnoIngresso;
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
}
    