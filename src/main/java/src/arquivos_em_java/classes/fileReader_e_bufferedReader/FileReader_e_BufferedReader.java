package src.arquivos_em_java.classes.fileReader_e_bufferedReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_e_BufferedReader {

    public static void main(String[] args) {

        // Caminho do arquivo que será lido
        String path = "C:\\Users\\icaro\\Documents\\in.txt";

        FileReader fr = null;
        BufferedReader br = null;

        try {
            // Inicializa o FileReader para ler o arquivo no caminho especificado
            fr = new FileReader(path);
            // BufferedReader para melhorar a eficiência da leitura do arquivo
            br = new BufferedReader(fr);

            // Lê uma linha do arquivo, retorna null quando chegar ao fim do arquivo
            String line = br.readLine();

            // Enquanto a linha lida não for nula, continua lendo o arquivo
            while (line != null) {
                System.out.println(line); // Exibe a linha lida
                line = br.readLine(); // Lê a próxima linha
            }
        }
        // Trata possíveis exceções que podem ocorrer durante a leitura do arquivo
        catch (IOException erro) {
            System.out.println("Erro na parte: " + erro.getMessage());
        }
        finally {

            // Bloco try para garantir o fechamento dos recursos (BufferedReader e FileReader)
            try {
                if (br != null) {
                    br.close(); // Fecha o BufferedReader
                }
                if (fr != null) {
                    fr.close(); // Fecha o FileReader
                }
            }
            // Trata possíveis exceções que podem ocorrer ao fechar os recursos
            catch (IOException erro) {
                erro.printStackTrace(); // Exibe o erro que ocorreu ao tentar fechar
            }
        }
    }
}
