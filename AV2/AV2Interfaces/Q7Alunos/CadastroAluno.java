package AV2.AV2Interfaces.Q7Alunos;

import java.util.ArrayList;
import java.util.List;

public class CadastroAluno {
    private List<Aluno>alunos;

    public CadastroAluno() {
        alunos = new ArrayList<>();
    }

    public void addALunos(Aluno aluno) {
        alunos.add(aluno);
    }

    public void imprimirAlunos() {
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
    }
}
