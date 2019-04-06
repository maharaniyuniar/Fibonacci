package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input;
        int data = 0;
        int a = 1;
        int b = 1;
        int c;
        int i;
        System.out.print("Input:\n");
        try {
            input = reader.readLine();
            data = Integer.parseInt(input);
        } catch (NumberFormatException error) {
            System.out.println("Error!");
        }
        System.out.print("\nOutput:\n" + a + " " + b + " ");
        for (i = 0; i < data - 2; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
        System.out.println("");
    }
}
