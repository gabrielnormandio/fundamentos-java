package exercicios;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);

            System.out.print("Digite um numero: ");
            int numero = sc.nextInt();

            if (numero % 2 == 0) {
                System.out.println("Numero PAR.");
            } else {
                System.out.println("Numero IMPAR.");
            }

            sc.close();
        }
        catch (Exception e) {
            System.out.println("Erro: Voce precisa digitar um numero.");
        }

    }
}
