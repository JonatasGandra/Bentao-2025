// esta é uma classe de objeto
public class Aluno {

    int rm;
    private String nome;
    String email;

    public Aluno() {
    }

    public Aluno(int rm, String nome, String email) {

        this.rm = rm;
        this.nome = nome;
        this.email = email;
    }

    public void setNome(String nome) {
        this.nome = nome.toUpperCase();
    }

    public String getNome() {
        return nome;
    }
}
