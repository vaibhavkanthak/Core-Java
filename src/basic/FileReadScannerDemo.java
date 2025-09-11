package basic;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Scanner;

public class FileReadScannerDemo {
        public static void main(String[] args) throws IOException {
            // On Mac/Linux use forward slashes in file paths
            Scanner sc = new Scanner(Path.of("/Users/Geeky/Documents/myfile.txt"), StandardCharsets.UTF_8);

            // Example: reading line by line
            while(sc.hasNext()){

                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        }
}
