package exercicios;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class NumerosOrdemInversa {
    public static void main(String[] args) {

        // Peça 5 números ao usuário, guarde em um array, e depois mostre os números na ordem inversa.

        int[] lista = new int[5];

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 5; i++) {
            System.out.printf("Digite o numero para posição %d: ", i);
            lista[i] = sc.nextInt();
        }

        System.out.print("Arrey Original: ");
        for(int i = 0; i < 5; i++) {
            System.out.print(lista[i] + " ");
        }
        System.out.print("\nArrey Invertido: ");
        for (int i = 4; i >= 0; i--) {
            System.out.print(lista[i] + " ");
        }


        sc.close();

    }
}