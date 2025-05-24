package roteiro7.parte1;

public class Principal {
    public static void main(String[] args) {
   Aluno[] listaAlunos = new Aluno[3];
    Aluno alunos0 = new Aluno(123, "João", "Engenharia", 2020, 5);
    Aluno alunos1 = new Aluno(456, "Maria", "Medicina", 2019, 3);
    Aluno alunos2 = new Aluno(789, "Pedro", "Direito", 2021, 4);

    listaAlunos[0] = alunos0;
    listaAlunos[1] = alunos1;
    listaAlunos[2] = alunos2;

    System.out.println("Lista de Alunos:");
    System.out.println("-------------------------------------------------");
    for (int i = 0; i < 3; i++) {
        System.out.println("Matrícula: " + listaAlunos[i].getMatricula());
        System.out.println("Nome: " + listaAlunos[i].getNome());
        System.out.println("Curso: " + listaAlunos[i].getCurso());
        System.out.println("Ano de Ingresso: " + listaAlunos[i].getAnoIngresso());
        System.out.println("Quantidade de Disciplinas: " + listaAlunos[i].getQtdDisciplinas());
        System.out.println("--------------------------------------------------");
    }
}
}