package DS.exercicio;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);
        
        int menu;
        do {
            System.out.println("MENU: \n 1 - Cadastrar produto \n 2 - Alterar produto \n 3 - Excluir produto \n 4 - Listar todos os produtos \n 5 - sair");
            menu = scanner.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("Quantos produtos quer cadastrar?");
                    int qnt = scanner.nextInt();
                    Produtos[] produtos = new Produtos[qnt];
                    
                    for (int i = 0; i < qnt; i++) {
                        System.out.println("Digite o id do produto: ");
                        int id = scanner.nextInt();
                        scanner.nextLine(); // Consumir a quebra de linha pendente
                        System.out.println("Digite o nome do produto: ");
                        String nome = scanner.nextLine();
                        System.out.println("Digite o preço do produto: ");
                        double preco = scanner.nextDouble();
                        System.out.println("Digite a quantidade do produto: ");
                        int quantidade = scanner.nextInt();
                        scanner.nextLine(); // Consumir a quebra de linha pendente
                        System.out.println("Digite a cor do produto: ");
                        String cor = scanner.nextLine();
                        
                        produtos[i] = new Produtos();
                        produtos[i].setInfo(id, nome, preco, quantidade, cor);
                    }
                    break;
                case 2:
                    // Código para alterar produto
                    break;
                case 3:
                    // Código para excluir produto
                    break;
                case 4:
                    // Código para listar todos os produtos
                    break;
                case 5:
                    // Sair
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (menu != 5);
    }
}