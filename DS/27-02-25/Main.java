//esta é a classe driver
public class Main {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();
        aluno1.rm = 20240015;
        aluno1.setNome("Jota");
        aluno1.email = "jonatassgandra@gmail.com";
        Aluno aluno2 = new Aluno(20230054, "Victor", "victor.silva@etec.sp.gov.br");

        System.out.println(aluno1.rm);
        System.out.println(aluno1.getNome());
    }

}
