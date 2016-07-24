package com.hometask.module11.module5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadCmdUtil {
    public static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static int Read() throws IOException {
        System.out.println("Hello!Enter please quantity of numbers for array :");
        try {
            return Integer.parseInt(reader.readLine());

        } catch (NumberFormatException e) {
            System.out.println();
            throw new NumberFormatException("You enter wrong value!");
        }
    }
}

