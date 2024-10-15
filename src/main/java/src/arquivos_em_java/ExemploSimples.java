package src.arquivos_em_java;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ExemploSimples {
    public static void main(String[] args) {

        // instanciando um arquivo
        File file = new File("C:\\Users\\icaro\\Documents\\in.txt");

        Scanner sc = null;
        // para não dar erro abri no bloco try
        try {
            sc = new Scanner(file);

            while (sc.hasNextLine()){ // verifica se tem outra lilha abaixo dentro do arquivo
                System.out.println(sc.nextLine());
            }
        }
        catch (IOException erro){

            System.out.println("Erro do tipo: " + erro.getMessage());
        }
        finally {
            // se o scanner for diferente de null, fechar o scanner
            if (sc != null){
                // boa prática (colocar o fechamnto do scanner no finnaly)
                sc.close();
            }
            }


    }
}
