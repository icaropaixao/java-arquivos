package src.arquivos_em_java.classes.manipular_pastas;

import java.io.File;
import java.util.Scanner;

public class Manipular_Pastas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um caminho para uma pasta: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        // vetor das pastas
        File[] folders = path.listFiles(File::isDirectory);

        System.out.println("Pastas: ");

        // mostrandov as pastas
        for (File folder : folders) {
            System.out.println(folder);
        }

        File[] files = path.listFiles(File::isFile);

        System.out.println("Arquivos: ");

        for (File file : files) {
            System.out.println(files);
        }

        Boolean succes = new File(strPath + "\\subPasta").mkdir();

        System.out.println("Diretorio criado com sucesso: " + succes);
        sc.close();
    }
}
