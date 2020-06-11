package io;

import java.io.*;

public class ConsoleReaderExample {

    public static void main(String[] args) {
        String outputFileName = "C:\\Users\\13\\Desktop\\test.txt";

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            try (BufferedWriter writter = new BufferedWriter(new FileWriter(outputFileName))) {
                String line;
                while (!(line = reader.readLine()).equals("exit")) { // Прерывание цикла при написании строки exit
                    writter.write(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}