package model;

public class AlunoOnline extends  Aluno implements  Idealizacao, Sonho {
    @Override
    public void estudar(){
        System.out.println(getNome() + " está estudando online pela plataforma.");
    }
    @Override
    public void pensarGrande(){
        System.out.println(getNome() +" está sonhando com uma carreira internacional. ");
    }
    @Override
    public void realizarSonho(){
        System.out.println(getNome() + " está conquistanto seu diploma online.");
    }
}
