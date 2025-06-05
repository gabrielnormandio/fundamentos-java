package exercicios;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringJoiner;
import java.util.function.DoubleToIntFunction;

public class ListaTarefas {
    public static void main(String[] args) {

        ArrayList<String> tarefas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        String tarefa;
        while(true) {
            System.out.print("Digite uma tarefa: ");
            tarefa = sc.nextLine();
            if(tarefa.equalsIgnoreCase("sair")) {
                break;
            }
            tarefas.add(tarefa);
        }

        System.out.println(tarefas);
        tarefas.remove("lavar roupa");
        System.out.println(tarefas);

        sc.close();

    }
}
