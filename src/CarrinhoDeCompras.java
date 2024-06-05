import java.util.Scanner;

public class CarrinhoDeCompras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String item;
        float limite_compras, valor;

        System.out.println("Informe o limite do cartão que será utilizado nas compras (ou 'sair' pra finalizar): ");
        limite_compras = scanner.nextFloat();
        if (limite_compras <= 0) {
            while(limite_compras <= 0) {
                System.out.println("Por favor, informe um limite válido: ");
                limite_compras = scanner.nextFloat();
            }
        }
            while (limite_compras > 0) {
                System.out.println("Informe o nome do item a ser comprado: ");
                item = scanner.next();
                System.out.println("Informe o valor do produto: " + item);
                valor = scanner.nextFloat();

                while (valor < 0) {
                    System.out.println("Por favor, informe um valor válido: ");
                    valor = scanner.nextFloat();
                }
                if (valor > limite_compras) {
                    System.out.println("O produto ultrapassa o limite disponível de: " + limite_compras);
                    break;
                }
                limite_compras = limite_compras - valor;
                System.out.println("O limite atual é de: " + limite_compras);
        }
    }
}
