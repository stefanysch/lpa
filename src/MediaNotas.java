import java.util.Scanner;
public class MediaNotas {
    public static void main(String[] args) {
        float nota1, nota2, nota3, nota4, media;
        String aluno;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        aluno = scanner.next();
        System.out.println(aluno);

        System.out.println("Informe a nota 1 (Deve estar no intervalo de 0 a 10): ");
        nota1 = scanner.nextFloat();
        while (nota1 < 0 || nota1 > 10) {
            System.out.println("Informe a nota 1 (Deve estar no intervalo de 0 a 10): . Preste atenção!");
            nota1 = scanner.nextFloat();
        }
        System.out.println("A nota 1 é igual a: " + nota1);

        System.out.println("Informe a nota 2 (Deve estar no intervalo de 0 a 10): ");
        nota2 = scanner.nextFloat();
        while (nota2 < 0 || nota2 > 10) {
            System.out.println("Informe a nota 2 (Deve estar no intervalo de 0 a 10): . Preste atenção!");
            nota2 = scanner.nextFloat();
        }
        System.out.println("A nota 2 é igual a: " + nota2);

        System.out.println("Informe a nota 3 (Deve estar no intervalo de 0 a 10): ");
        nota3 = scanner.nextFloat();
        while (nota3 < 0 || nota3 > 10) {
            System.out.println("Informe a nota 3 (Deve estar no intervalo de 0 a 10): . Preste atenção!");
            nota3 = scanner.nextFloat();
        }
        System.out.println("A nota 3 é igual a: " + nota3);

        System.out.println("Informe a nota 4 (Deve estar no intervalo de 0 a 10): ");
        nota4 = scanner.nextFloat();
        while (nota4 < 0 || nota4 > 10) {
            System.out.println("Informe a nota 4 (Deve estar no intervalo de 0 a 10): . Preste atenção!");
            nota4 = scanner.nextFloat();
        }
        System.out.println("A nota 4 é igual a: " + nota4);

        media = (nota1 + nota2 + nota3 + nota4)/4;
        if(media >= 7) {
            System.out.println(aluno + " foi aprovado.");
        } else {
            System.out.println(aluno + " foi reprovado.");
        }
        System.out.println("Sua média foi: " + media);

    }
}