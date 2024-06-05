import java.util.Scanner;

public class Tabuada {
    public static void main(String [] args) {
        int i, numero, resultado;
        String nome;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o seu nome: ");
        nome = scanner.next();

        System.out.println(nome + ", favor informe um número para cálculo da tabuada: ");
        numero = scanner.nextInt();

        System.out.println(nome + ", faremos o cálculo da tabuada do número: " + numero);

        /* i = 0 ; //1 utilizando a estrutura while
        while (i <= 10){ //2
            resultado = i * numero;//4
            System.out.println(i + " x " + numero + " = " + resultado);//5
            i = i + 1; ou i++; ou i+=1; //3
        } */

        //  primeiro resultado depois incremento
         /* for (i = 0; i <= 10; i++) {
             resultado = i * numero;
             System.out.println(i + " x " + numero + " = " + resultado);
        } */

         i = 0;
         do {
             resultado = i*numero;
             System.out.println(i + " x " + numero + " = " + resultado);
             i++;
         } while(i <= 10);
    }
}
