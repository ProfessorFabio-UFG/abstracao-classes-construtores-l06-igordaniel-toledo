import java.util.Scanner;
public class Vendaproduto {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    Produto p1 = new Produto(1);
    Produto p2 = new Produto(2, "Jogo Master");
    Produto p3 = new Produto(3, "Jogo Quebra-Cabeça", 30);
    Produto p4 = new Produto(4, "Jogo Batalha Naval", 10, "jogo", 100);

    System.out.println("Digite os dados do produto p5:");
    System.out.print("Nome: ");
    String nomeP5 = scanner.nextLine();
    System.out.print("Quantidade: ");
    int quantP5 = scanner.nextInt();
    scanner.nextLine(); 
    String tipoP5;
    while (true) {
        System.out.print("Tipo (jogo, brincadeira ou ferramenta): ");
        tipoP5 = scanner.nextLine().toLowerCase();
        if (tipoP5.equals("jogo") || tipoP5.equals("brincadeira") || tipoP5.equals("ferramenta")) {
            break;
        } else {
            System.out.println("Tipo inválido! Escolha entre: jogo, brincadeira ou ferramenta.");
        }
    }

    System.out.print("Valor: ");
    int valorP5 = scanner.nextInt();

    Produto p5 = new Produto(5, nomeP5, quantP5, tipoP5, valorP5);
    
    p1.inserir("Jogo Xadrez", 15, "jogo", 80);


    System.out.println(p5);
    System.out.print("Digite a quantidade a ser vendida de p5: ");
    int vendaP5 = scanner.nextInt();
    p5.vender(vendaP5);
    System.out.println(p5);

    System.out.print("Digite a quantidade a ser comprada de p5: ");
    int compraP5 = scanner.nextInt();
    p5.comprar(compraP5);
    System.out.println(p5);

    System.out.println("Os produtos p1 e p4 são iguais? " + p1.igual(p4));
    System.out.println("Os produtos p5 e p4 são iguais? " + p5.igual(p4));

    scanner.close();
}}
