package io;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamPractice {


    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\13\\Desktop\\test.txt");

        int i;

        while((i=fileInputStream.read())!= -1){

            System.out.print((char)i);
        }
    }


}


