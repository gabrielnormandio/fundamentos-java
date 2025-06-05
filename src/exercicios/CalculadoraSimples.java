package exercicios;

import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {

        // Peça dois números ao usuário.
        // Peça uma operação (+, -, *, /).
        // Mostre o resultado da operação escolhida.

        Scanner sc = new Scanner(System.in);

        int resultado = 0;

        System.out.print("Digite o primeiro valor: ");
        int numero1 = sc.nextInt();
        System.out.print("Digite o segundo valor: ");
        int numero2 = sc.nextInt();

        System.out.print("Digite a Operação (+)(-)(*)(/): ");
        char operacao = sc.next().charAt(0);

        switch (operacao) {
            case '+':
                resultado = numero1 + numero2;
                break;
            case '-':
                resultado = numero1 - numero2;
                break;
            case '*':
                resultado = numero1 * numero2;
                break;
            case '/':
                resultado = numero1 / numero2;
                break;
        }

        System.out.printf("%d %c %d = %d", numero1, operacao, numero2, resultado);

        sc.close();

    }
}
