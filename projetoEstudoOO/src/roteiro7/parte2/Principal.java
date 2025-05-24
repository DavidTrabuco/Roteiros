package roteiro7.parte2;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Aluno> listaAlunos = new ArrayList<Aluno>();

        Aluno alunos0 = new Aluno(123, "João", "Engenharia", 2020, 5);
        Aluno alunos1 = new Aluno(456, "Maria", "Medicina", 2019, 3);
        Aluno alunos2 = new Aluno(789, "Pedro", "Direito", 2021, 4);

        listaAlunos.add(alunos0);
        listaAlunos.add(alunos1);
        listaAlunos.add(alunos2);

    }
}
