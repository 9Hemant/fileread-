import java.io.BufferedReader;

import java.io.FileReader;

import java.io.IOException;

public class FileWordPrinter {

    public static void main(String[] args) {

        String fileName = "path/to/file.txt"; // replace with your file's path

        

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {

            String line;

            while ((line = reader.readLine()) != null) {

                String[] words = line.split("\\s+"); // split line into words

                for (String word : words) {

                    System.out.println(word); // print each word on a new line

                }

            }

        } catch (IOException e) {

            e.printStackTrace();

        }

    }

}

