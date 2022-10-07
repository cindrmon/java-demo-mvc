package com.javademo.mvc.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.UUID;

public class KBInput {

    private static BufferedReader getReader() {
        return new BufferedReader(new InputStreamReader(System.in));
    }

    public static String readString(String prompt) throws IOException {
        System.out.print(prompt);
        return getReader().readLine();
    }

    public static UUID readUUID(String prompt) throws IOException {
        System.out.print(prompt);
        return UUID.fromString(getReader().readLine());
    }
}
