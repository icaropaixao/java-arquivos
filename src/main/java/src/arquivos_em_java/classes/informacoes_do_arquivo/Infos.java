package src.arquivos_em_java.classes.informacoes_do_arquivo;

import java.io.File;
import java.util.Scanner;

public class Infos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o caminho de uma pasta: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        System.out.println("GetName " + path.getName());

        System.out.println("GetParent " + path.getParent());

        System.out.println("GetPath " + path.getPath());
        sc.close();
    }
}
