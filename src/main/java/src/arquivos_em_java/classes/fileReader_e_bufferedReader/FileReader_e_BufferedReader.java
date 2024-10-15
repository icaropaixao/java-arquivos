package src.arquivos_em_java.classes.fileReader_e_bufferedReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_e_BufferedReader {

    public static void main(String[] args) {

        String path = "C:\\Users\\icaro\\Documents\\in.txt";

        FileReader fr = null;
        BufferedReader br = null;

        try{
            fr = new FileReader(path);
            br = new BufferedReader(fr);

            String line = br.readLine(); // le uma linha do arquivo, se estiver no final retorna nulo

            // enqunto line for diferente de null, le mais uma linha com bufferedReader
            while(line != null){
                System.out.println(line);
                line = br.readLine();
            }
        }
        catch (IOException erro){
            System.out.println("Erro na parte: " + erro.getMessage());
        }
        finally {

            // try para caso ocorra erro na hora de fechar a stream
            try {
                if (br != null){

                    br.close();
                }
                if (fr != null){
                    fr.close();
                }
            }
            catch (IOException erro){
                erro.printStackTrace(); // saber qual erro que deu
            }



        }


    }
}
