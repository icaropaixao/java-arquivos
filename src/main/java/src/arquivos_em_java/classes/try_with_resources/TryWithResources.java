package src.arquivos_em_java.classes.try_with_resources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {

    public static void main(String[] args) {

        String path = "C:\\Users\\icaro\\Documents\\in.txt";

        // EXEMPLO BLOCO  " TRY WITH RESOURCES "
        // esse bloco possibilita usar o stream sem ter que fazer o fechamento dele em um bloco finally por exemplo
        try (BufferedReader br = new BufferedReader(new FileReader(path))){

            String line = br.readLine();

            while(line != null){
                System.out.println(line);
                line = br.readLine();
            }
        }
        catch (IOException erro){
            System.out.println("Erro na parte: " + erro.getMessage());
        }

    }
}
