package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class MediaDoAluno {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        float media = 0;

        System.out.print("Digite o nome do aluno: ");
        String nome = sc.nextLine();

        System.out.print("digite a primeira nota: ");
        float nota1 = sc.nextFloat();

        System.out.print("digite a segunda nota: ");
        float nota2 = sc.nextFloat();

        System.out.print("digite a terceira nota: ");
        float nota3 = sc.nextFloat();

        media = (nota1 + nota2 + nota3) / 3;

        if(media >= 7) {
            System.out.printf("Media: %.2f, %s esta Aprovado!", media, nome);
        } else if(media >= 5) {
            System.out.printf("Media: %.2f, %s esta em Recuperação!", media, nome);
        } else {
            System.out.printf("Media: %.2f, %s esta Reprovado!", media, nome);
        }

        sc.close();
    }
}
