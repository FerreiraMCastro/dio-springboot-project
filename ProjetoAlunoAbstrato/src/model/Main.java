package model;

public class Main {
    public static void main(String[] args){
        Aluno aluno1 = new AlunoPresencial();
        aluno1.setNome("Márcia");
        aluno1.estudar();
        ((Idealizacao) aluno1).pensarGrande();
        ((Sonho)aluno1).realizarSonho();

        System.out.println("------");

        Aluno aluno2 = new AlunoOnline();
        aluno2.setNome("Juliana");
        aluno2.estudar();
        ((Idealizacao) aluno2).pensarGrande();
        ((Sonho) aluno2).realizarSonho();
    }
};
