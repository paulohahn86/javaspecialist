import java.io.IOException;
import java.nio.file.Path;

public class Main2 {

    public static void main(String[] args) throws IOException {

        Path root = Path.of("C:\\Users\\paulo\\IdeaProjects\\Algaworks\\InputOutputNIO2");
        Path folderDocs =  root.resolve(Path.of("docs"));
        Path folderProject = folderDocs.resolve(Path.of("project"));

        //Files.createDirectory(folderDocs);
        //Files.createDirectory(folderProject);

        Path file1 = folderProject.resolve(Path.of("file1.txt"));
        Path file2 = folderProject.resolve(Path.of("file2.txt"));
        Path file3 = folderProject.resolve(Path.of("file3.txt"));
        Path instruction = folderProject.resolve(Path.of("instruction.md"));
        Path tellMe = folderProject.resolve(Path.of("tell-me.md"));

        //Files.createFile(file1);
        //Files.createFile(file2);
        //Files.createFile(file3);
        //Files.createFile(instruction);
        //Files.createFile(tellMe);


       /* // Listing folder ***********
       try(var stream = Files.list(folderDocs)) {
               stream.map(Path::getFileName)
                   .map(Path::toString)
                   .filter(path -> path.endsWith(".txt"))
                   .forEach(System.out::println);
       }*/

        /*// Listing files, folder and subfolder ***********
        try(var stream = Files.find(folderDocs, Integer.MAX_VALUE,
                (path, basicFileAttributes) -> path.getFileName().toString()
                        .matches(".*"))) {
                stream.forEach(System.out::println);
        }*/



        // READING AND WRITING -> FILE

        Path file = Path.of("C:\\Users\\paulo\\IdeaProjects\\Algaworks\\InputOutputNIO2\\docs\\project\\file2.txt");

        // Using Classic NIO and NIO.2
        /*try(BufferedReader bufferedReader = Files.newBufferedReader(file)){
            bufferedReader.lines().forEach(System.out::println);
        }*/
        // using NIO.2 and Stream
        /*try(var stream = Files.lines(file)){
            stream.forEach(System.out::println);
        }*/

        // Using classic NIO and NIO.2
       /* try(BufferedWriter bufferedWriter = Files.newBufferedWriter(file)){
            bufferedWriter.newLine();
            bufferedWriter.append("Now Writing");
        }*/
       // Files.writeString(file, "Writing");


    }

}
