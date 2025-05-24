package roteiro4.parte4;

public class Principal {
    public static void main(String[] args) {
        Aluno aluno01 = new Aluno(111, "Jose", "SI", 2019, 0); ;
        System.out.println("Matricula : " + aluno01.getMatricula());
        System.out.println("Nome : " + aluno01.getNome());
        System.out.println("Curso : " + aluno01.getCurso());
        System.out.println("Ano Ingresso : " + aluno01.getAnoIngresso());
        System.out.println("Situacao : " + aluno01.getSituacao());
        System.out.println("Quantidade de Disciplinas : " + aluno01.getQtdDisciplinas());

        aluno01.setMatricula(222);
        aluno01.setQtdDisciplinas(3);
        
        System.out.println("Matricula : " + aluno01.getMatricula());
        System.out.println("Nome : " + aluno01.getNome());
        System.out.println("Curso : " + aluno01.getCurso());
        System.out.println("Ano Ingresso : " + aluno01.getAnoIngresso());
        System.out.println("Situacao : " + aluno01.getSituacao());
        System.out.println("Quantidade de Disciplinas : " + aluno01.getQtdDisciplinas());
    }
}
