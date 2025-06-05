package exercicios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ManipulaArquivo {
    public static void main(String[] args) {

        String nomeArquivo = "C:\\Users\\Gabriel Normandio\\Downloads\\frase\\EuTeAmo.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }

    }
}
