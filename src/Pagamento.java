import java.util.Scanner;

public class Pagamento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int codigo;
        float valorProduto;

        System.out.println("Por favor, informe o valor do produto:");
        valorProduto = scanner.nextFloat();

        do {
            System.out.println("Por favor, informe o código de pagamento.");
            System.out.println("1- À vista em dinheiro ou cheque, recebe 10% de desconto \n" +
                    "2- À vista no cartão de crédito, recebe 15% de desconto \n" +
                    "3- Em duas vezes, preço normal de etiqueta sem juros \n" +
                    "4- Em três vezes, preço normal de etiqueta mais juros de 10%");
            codigo = scanner.nextInt();
        } while(codigo < 1 || codigo > 4);
        System.out.println("O código escolhido foi o :" + codigo);
        if (codigo == 1) {
            System.out.println("Você escolheu a forma de pagamento à vista em dinheiro ou em cheque \n" +
                    "recebendo 10% de desconto. O valor total a ser pago é de:  " + valorProduto*0.9);
        } else if(codigo == 2) {
            System.out.println("Você escolheu a forma de pagamento à vista no cartão de crédito \n" +
                    "recebendo 15% de desconto. O valor total a ser pago é de: " + valorProduto*0.85);
        } else if(codigo == 3) {
            System.out.println("Você escolheu a forma de pagamento em duas vezes, com o preço \n" +
                    "normal sem juros, totalizando duas parcelas de: " + valorProduto/2);
        } else {
            System.out.println("Você escolheu a forma de pagamento em três vezes. O valor \n" +
                    "total do produto é de: " + valorProduto*1.1 + " com parcelas de: \n" +
                    "" + (valorProduto*1.1)/3);
        }

    }
}
