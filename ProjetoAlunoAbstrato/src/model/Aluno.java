package model;

public  abstract class Aluno {
    private String nome;

    public void setNome(String nome) {
        this.nome= nome;
    }
    public String getNome(){

        return nome;
    }
    public abstract void estudar();
}
