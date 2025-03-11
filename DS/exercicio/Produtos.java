package DS.exercicio;

public class Produtos {

    private int id;
    private String nome;
    private double valor;
    private int quantidade;
    private String cor;

    public Produtos() {
    }

    public Produtos(int PrimaryKey, String nome, int quantidade, double valor, String cor) {
        this.id = PrimaryKey;
        this.nome = nome;
        this.quantidade = quantidade;
        this.valor = valor;
        this.cor = cor;
    }

    public void setInfo(int id, String nome, double valor, int quantidade, String cor) {

        this.id = id;
        this.nome = nome.toUpperCase();
        this.valor = valor;
        this.quantidade = quantidade;
        this.nome = nome.toLowerCase();
        this.cor = cor.toLowerCase();
    }

    public int getId() {
        return id;
    }

    public double getValor() {
        return valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getNome() {
        return nome;
    }

    public String getCor() {
        return cor;
    }

}
