import java.util.Scanner;

public class Cardapio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome;
        int codigo;
        int quantidade;

        System.out.println("Por favor, informe seu nome:");
        nome = scanner.nextLine();

        do {
            System.out.println("Por favor, informe o código do lanche escolhido:");
            System.out.println("Especificação    |     Código         |     Preço\n" +
                    "Cachorro quente  |     100            |       15,00\n" +
                    "Bauru simples    |     101            |       10,00\n" +
                    "Bauru com ovo    |     102            |       12,00\n" +
                    "Hambúrger        |     103            |       15,00\n" +
                    "Cheeseburguer    |     104            |       16,00");
            codigo = scanner.nextInt();
        } while(codigo < 100 || codigo > 104);

        do {
            System.out.println("Por favor, informe a quantidade de lanches:");
            quantidade = scanner.nextInt();
        } while(quantidade <= 0);

        double preco = 0;

        switch(codigo) {
            case 100:
                preco = 15.00;
                break;
            case 101:
                preco = 10.00;
                break;
            case 102:
                preco = 12.00;
                break;
            case 103:
                preco = 15.00;
                break;
            case 104:
                preco = 16.00;
                break;
        }

        double total = preco * quantidade;

        System.out.println("O valor total do pedido é de: " + total);
    }
}
