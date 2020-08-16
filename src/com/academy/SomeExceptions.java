package com.academy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class SomeExceptions {

    public static void arrayIndexOutOfBoundsException() {
        int[] m = new int[2];
        m[8] = 5;
    }

    public static void indexOutOfBoundsException() {
        ArrayList<String> list = new ArrayList<String>();
        String s = list.get(18);
    }

    public static void nullPointerException() {
        String s = null;
        String m = s.toLowerCase();
    }

    public static void arithmeticException() {
        int a = 42 / 0;
    }

    public static void checked(File file) throws FileNotFoundException {
        iomethod(file);
    }

    private static void iomethod(File file) throws FileNotFoundException {
        file = new File("my/file/path");
        FileInputStream fis = new FileInputStream(file);
    }

}
