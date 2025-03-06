package DS.encapsulamento;

public class Professor {

    //atributos
    private int rm;
    private String nome;
    private String email;
    private String telefone;
    private String endereco;
    


    public void setInfo(int rm, String nome, String email, String telefone, String endereco ){
        
        this.rm = rm;
        this.nome = nome.toUpperCase();
        this.email = email.toLowerCase();
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public String getAll(){
        return 
        "RM: " +rm+
        "\n NOME: " +nome+ 
        "\n EMAIL: " +email+
        "\n TELEFONE: " +telefone+
        "\n ENDEREÇO: " +endereco;
    }


}
