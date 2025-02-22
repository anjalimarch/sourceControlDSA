package AdvancedDSA;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Objects;

public class ResourceLoader2 {

    public List<String> readFile(String filePath) throws IOException {
        try {
            Path path;
            // Check if the filePath is an absolute path
            if (Paths.get(filePath).isAbsolute()) {
                // Handle absolute filesystem path
                path = Paths.get(filePath);
            } else {
                // Handle classpath resource
                path = Paths.get(Objects.requireNonNull(getClass().getResource(filePath)).toURI());
            }
            return Files.readAllLines(path);

        } catch (InvalidPathException | NullPointerException | URISyntaxException e) {
            throw new IllegalArgumentException("Invalid path or resource not found: " + filePath, e);
        }
    }

    public static void main(String[] args) {
        ResourceLoader2 loader = new ResourceLoader2();

        try {
            // Example for classpath resource
            List<String> classpathLines = loader.readFile("/data/config.properties");
            System.out.println("Classpath resource content: " + classpathLines);

            // Example for absolute filesystem path
            List<String> fileLines = loader.readFile("C:/Users/YourUser/Documents/config.properties");
            System.out.println("Absolute file content: " + fileLines);

        } catch (IllegalArgumentException | IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
