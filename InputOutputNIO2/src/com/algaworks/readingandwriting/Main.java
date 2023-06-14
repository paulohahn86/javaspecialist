package com.algaworks.readingandwriting;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws IOException {

        // Create folder and files, then read two files and write to a third file.
        Path root = Path.of("C:\\Users\\paulo\\IdeaProjects\\Algaworks\\InputOutputNIO2");
        Path docsFolder = root.resolve(Path.of("docs"));
        //Files.createDirectory(docsFolder);

        Path poem1 = docsFolder.resolve(Path.of("poem1.txt"));
        //Files.createFile(poem1);
        Path poem2 = docsFolder.resolve(Path.of("poem2.txt"));
        //Files.createFile(poem2);

        Path fullPoem = docsFolder.resolve(Path.of("fullPoem.txt"));
        //Files.createFile(fullPoem);

        try(BufferedReader bufferedReader1 = Files.newBufferedReader(poem1);
            BufferedReader bufferedReader2 = Files.newBufferedReader(poem2);
            BufferedWriter bufferedWriter = Files.newBufferedWriter(fullPoem)){
            String line;
            while((line = bufferedReader1.readLine()) != null){
                bufferedWriter.write(line + "\n");
            }
            while ((line = bufferedReader2.readLine()) != null){
                bufferedWriter.write(line + "\n");
            }


        }








    }
}
