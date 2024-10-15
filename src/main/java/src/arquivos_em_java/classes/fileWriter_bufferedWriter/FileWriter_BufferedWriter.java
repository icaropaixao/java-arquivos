package src.arquivos_em_java.classes.fileWriter_bufferedWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_BufferedWriter {

    public static void main(String[] args) {

        // Vetor com as linhas que serão escritas no arquivo
        String[] lines = new String[] {"Good morning", "Good afternoon", "Good night"};

        // Caminho onde o arquivo será salvo
        String path = "c:\\Users\\icaro\\Documents\\out.txt";

        // Bloco try-with-resources para garantir que o BufferedWriter será fechado após o uso
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            // Itera sobre cada linha do vetor
            for (String line : lines) {
                bw.write(line);  // Escreve a linha no arquivo
                bw.newLine();    // Adiciona uma nova linha após cada linha escrita
            }
        }
        // Captura e trata possíveis exceções relacionadas à escrita de arquivos
        catch (IOException erro) {
            erro.printStackTrace();  // Imprime o stack trace em caso de erro
        }
    }
}

