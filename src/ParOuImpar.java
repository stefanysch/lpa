import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero, resultado;

        System.out.println("Por favor, informe um número qualquer: ");
        numero = scanner.nextInt();

        resultado = numero % 2; //10

        if(resultado==0) {
            System.out.println("O número informado é PAR.");
        }else{
            System.out.println("O número informado é ÍMPAR.");
        }

    }
}
