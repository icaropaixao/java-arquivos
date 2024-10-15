package src.arquivos_em_java.classes.fileWriter_bufferedWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_BufferedWriter {

    public static void main(String[] args) {

        // vetor
        String[] lines = new String[] {"Good morning", "Good afternoon", "Good night"};


        String path = "c:\\Users\\icaro\\Documents\\out.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
            for (String line : lines){
                bw.write(line);
                bw.newLine();
            }
        }
        catch (IOException erro){
            erro.printStackTrace();
        }


    }
}
