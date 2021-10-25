package ru.dataart.academy.java;

public class Main {
    public static void main(String[] args) {
        ReverseInteger reverseInteger = new ReverseInteger();

        try {
            System.out.println("Reverse integer works: " + reverseInteger.reverse(-456));
        } catch (ReverseIntException e) {
            System.out.println(e.getMessage());
            System.out.println("Введённое число не может быть конвертировано.");
        }

        try {
            System.out.println("Reverse integer works for big negative value: " + reverseInteger.reverse(-2147483648));
        } catch (ReverseIntException e) {
            System.out.println("Введённое число не может быть конвертировано.");
        }

        try {
            System.out.println("Reverse integer works for big positive value: " + reverseInteger.reverse(-2147483647));
        } catch (ReverseIntException e) {
            System.out.println("Введённое число не может быть конвертировано.");
        }

    }
}