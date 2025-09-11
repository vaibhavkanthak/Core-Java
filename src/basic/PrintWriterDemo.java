package basic;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

public class PrintWriterDemo {
            public static void main(String[] args) throws IOException {

                // Creates or overwrites the file
                PrintWriter out = new PrintWriter("/Users/Geeky/Documents/output.txt", StandardCharsets.UTF_8);

                out.println("Hello, this is written to a file!");
                out.printf("The number is: %d%n", 42);

                out.close();
            }
}
