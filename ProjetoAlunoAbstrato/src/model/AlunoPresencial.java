package model;

public class AlunoPresencial extends Aluno implements  Idealizacao, Sonho {

    @Override
    public void estudar() {

        System.out.println(getNome() + " está estudando na sala de aula. ");
    }

    @Override
    public void pensarGrande(){

        System.out.println(getNome() + " está idealizando um futuro promissor. ");
    }

    @Override
    public void realizarSonho() {

        System.out.println(getNome() + " está realizando o sonho de se formar.");
    }

}
