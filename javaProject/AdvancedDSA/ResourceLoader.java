package  AdvancedDSA;

import java.io.File;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.util.Objects;

public class ResourceLoader {

    public String getResourcePath(String filePath) {
        try {
            // Check if the filePath is an absolute path
            if (filePath.startsWith("/") || filePath.startsWith("C:") || filePath.startsWith("D:")) {
                // Handle absolute filesystem path
                return Paths.get(filePath).toAbsolutePath().toString();
            } else {
                // Handle classpath resource
                return Objects.requireNonNull(getClass().getResource(filePath)).getPath();
            }
        } catch (InvalidPathException | NullPointerException e) {
            throw new IllegalArgumentException("Invalid path or resource not found: " + filePath, e);
        }
    }

    public static void main(String[] args) {
        ResourceLoader loader = new ResourceLoader();

        try {
            // Example for classpath resource
            String classpathResourcePath = loader.getResourcePath("/data/config.properties");
            System.out.println("Classpath resource path: " + classpathResourcePath);

            // Example for absolute filesystem path
          //  String absoluteFilePath = loader.getResourcePath("C:/Users/YourUser/Documents/config.properties");
         //   System.out.println("Absolute file path: " + absoluteFilePath);

        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}
