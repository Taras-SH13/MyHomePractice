package io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamPractice {

    public static void main(String[] args) throws IOException {


        //File file = new File("C:\\Users\\13\\Desktop\\test.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\13\\Desktop\\test.txt", true);

        String greetings = "Asus 90w 19v 4.74a 5.5x2.5mm\r\n";
        for (int i = 0; i < 10; i++) {
            fileOutputStream.write(greetings.getBytes());


        }
        fileOutputStream.close();
    }
}
