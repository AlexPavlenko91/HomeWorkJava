package Task3;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class CopyDirectoryContent {
    String sourcePath;
    String destPath;
    Path source, destination;

    public CopyDirectoryContent() {

    }

    public Path getSource() {
        return source;
    }

    public Path getDestination() {
        return destination;
    }


    public synchronized void inputPath() {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Please, enter the source path:");
            sourcePath = scan.next();
            System.out.println("Please, enter the destination path:");
            destPath = scan.next();
            source = new File(sourcePath).toPath();
            destination = new File(destPath).toPath();
        } catch (Exception e) {
            e.printStackTrace();
        }
        notify();
    }
    public  int copyFolder(Path src, Path dest)  {
        AtomicInteger counter = new AtomicInteger();

        try (Stream<Path> stream = Files.walk(src)) {
            stream.forEach(source -> {
                copy(source, dest.resolve(src.relativize(source)));
                counter.getAndIncrement();
            });
            return counter.get();
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    private void copy(Path source, Path dest) {
        try {
            Files.copy(source, dest, StandardCopyOption.REPLACE_EXISTING);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }
}
