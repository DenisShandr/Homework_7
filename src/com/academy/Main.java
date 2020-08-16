package com.academy;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws DogIsNotReadyException {
        File example = null;
        
        try {
            SomeExceptions.checked(example);
        } catch (FileNotFoundException e) {
            System.out.println("File not exist.");
        }

        try {
            SomeExceptions.arithmeticException();
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        }

        try {
            SomeExceptions.nullPointerException();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException");
        }

        try {
            SomeExceptions.arrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        }

        try {
            SomeExceptions.indexOutOfBoundsException();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBoundsException");
        }

        Dog dog = new Dog("Бобик");
        dog.putCollar();
        dog.putMuzzle();
        try {
            dog.walk();
        } catch (DogIsNotReadyException e) {
            System.out.println(e.getMessage());
            System.out.println("Проверяем снаряжение! Ошейник надет? " + dog.isCollarPutOn + "\r\n Поводок надет? "
                    + dog.isLeashPutOn + "\r\n Намордник надет? " + dog.isMuzzlePutOn);
        }
    }
}
