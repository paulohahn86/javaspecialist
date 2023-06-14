import java.io.*;
import java.nio.file.*;

public class Main1 {

    public static void main(String[] args) throws IOException {

        // ******* CREATE, COPY, MOVE AND DELETE THE FILE AND DIRETORY
/*
        Path root = Path.of("C:\\Users\\paulo\\IdeaProjects\\Algaworks\\InputOutputNIO2");
        Path file1 = Path.of("file1.txt");
        Path file2 = Path.of("file2.txt");
        Path file3 = Path.of("file3.txt");

        Path supplierFolder = root.resolve(Path.of("docs/supplier"));
        Path supplierFile1 = supplierFolder.resolve(file1);
        //Files.createDirectories(supplierFolder); // Created directory
        //Files.createFile(supplierFile1); // Created file

        Path clientFolder = root.resolve(Path.of("docs/client"));
        //Files.createDirectories(clientFolder); // Created directory
        Path clientFile = clientFolder.resolve(file1);

        //Files.copy(supplierFile, clientFile); // Copied file

        Path soldFolder = root.resolve("docs\\sold");
        //Files.createDirectories(soldFolder); // Created directory
        Path soldFile = soldFolder.resolve(file1);
        //Files.move(supplierFile,soldFile); // Moved file

        Path deleteFile = Path.of(clientFile.toUri());
        //Files.deleteIfExists(deleteFile); // Deleted file

        Path supplierFile2 = supplierFolder.resolve(file2);
        //Files.createFile(supplierFile2); // Created file

        Path clientFile3 = clientFolder.resolve(file3);
        //Files.createFile(clientFile3); // Created file

        Path docsFolder = root.resolve(Path.of("docs"));
        //Files.delete(docsFolder);

*/

/*

        // ****** DELETING FILES AND FOLDERS WITH SUB-FOLDERS


        // Deleting a directory tree
        Files.walkFileTree(docsFolder, new SimpleFileVisitor<>(){
            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                System.out.printf("Deleting the file: %s%n", file);
                Files.delete(file);
                return FileVisitResult.CONTINUE;
            }

            @Override
            public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
                System.out.printf("Deleting the folder %s%n", dir);
                Files.delete(dir);
                return super.postVisitDirectory(dir, exc);
            }
        });

*/

        Path root = Path.of("C:\\Users\\paulo\\IdeaProjects\\Algaworks\\InputOutputNIO2");
        Path docs = root.resolve(Path.of("docs"));
        Path file = Path.of("file1.txt");
        //Files.createDirectory(docs);
        //Files.createFile(docs.resolve(file));

        System.out.println("Tamanho : " + Files.size(docs.resolve(file)));

    }
}
