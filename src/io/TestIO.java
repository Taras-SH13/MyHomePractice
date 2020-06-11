package io;

import java.io.IOException;
import java.io.InputStreamReader;

public class TestIO {

    public static void main(String[] args) throws IOException {

        while (true) {
            int x = System.in.read();
            System.out.println("Вот то что мы считали---");
            System.out.println(x);
        }
    }
    }


