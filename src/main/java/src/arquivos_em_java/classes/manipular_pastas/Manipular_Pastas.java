package src.arquivos_em_java.classes.manipular_pastas;

import java.io.File;
import java.util.Scanner;

public class Manipular_Pastas {
    public static void main(String[] args) {
        // Cria uma instância de Scanner para ler dados de entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira o caminho de uma pasta
        System.out.println("Digite o caminho de uma pasta: ");
        String caminho = scanner.nextLine(); // Lê o caminho fornecido pelo usuário

        // Cria uma instância da classe File que representa o diretório especificado
        File pasta = new File(caminho);

        // Lista os diretórios dentro da pasta especificada e armazena em um array
        File[] pastas = pasta.listFiles(File::isDirectory);
        System.out.println("Pastas: ");
        for (File p : pastas) {
            System.out.println(p); // Exibe os diretórios encontrados
        }

        // Lista os arquivos dentro da pasta especificada e armazena em um array
        File[] arquivos = pasta.listFiles(File::isFile);
        System.out.println("Arquivos: ");
        for (File a : arquivos) {
            System.out.println(a); // Exibe os arquivos encontrados
        }

        // Solicita ao usuário que insira o nome de uma nova pasta a ser criada
        System.out.println("Digite o nome da nova pasta a ser criada: ");
        String novaPasta = scanner.nextLine(); // Lê o nome da nova pasta

        // Cria uma nova pasta com o nome especificado pelo usuário
        boolean sucesso = new File(caminho + "\\" + novaPasta).mkdir();
        System.out.println("Diretório criado com sucesso: " + sucesso); // Exibe se a criação foi bem-sucedida

        scanner.close();
    }
}
