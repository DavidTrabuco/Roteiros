package roteiro7.parte3;

public class Principal {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(12345, "João Silva", "Engenharia", 2020, 5);
        

        System.out.println("Matrícula: " + aluno.getMatricula());
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Curso: " + aluno.getCurso());
        System.out.println("Ano de Ingresso: " + aluno.getAnoIngresso());
        System.out.println("Situação: " + aluno.getSituacao());
        System.out.println("Quantidade de Disciplinas: " + aluno.getQtdDisciplinas());

        
        
        
    }

}
