import java.util.Scanner;

public class Vetores {
    public static void main(String[] args) {
        int tamanho;
        int soma = 0;
        int soma2 = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Defina o tamanho do vetor: ");
        tamanho = scanner.nextInt();

        int[] vet1 = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.println("Informe o valor da posição " + i + ":");
            vet1[i] = scanner.nextInt();
        }

        for (int i = 0; i < tamanho; i++) {
            System.out.println(vet1[i]);
            soma = soma + vet1[i];
        }
        System.out.println("O valor da soma dos elementos é igual a: " + soma);

        double media = (double) soma / tamanho;
        System.out.println("A média dos valores do vetor é: " + media);

        int maxValor = vet1[0];

        for (int i = 1; i < vet1.length; i++) {
            if (vet1[i] > maxValor) {
                maxValor = vet1[i];
            }
        }
        System.out.println("O maior valor do vetor é: " + maxValor);

        int minValor = vet1[0];

        for (int i = 1; i < vet1.length; i++) {
            if (vet1[i] < minValor) {
                minValor = vet1[i];
            }
        }
        System.out.println("O menor valor do vetor é: " + minValor);

        vet1[0] = 0;
        vet1[vet1.length - 1] = 0;

        for (int i = 0; i < tamanho; i++) {
            System.out.println(vet1[i]);
            soma2 = soma2 + vet1[i];
        }
        System.out.println("O valor da soma dos elementos é igual a: " + soma2);

        double media2 = (double) soma2 / tamanho;
        System.out.println("A média dos valores do vetor é: " + media2);
    }
}