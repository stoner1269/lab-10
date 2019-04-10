package com.company;
import java.lang.Exception;
import java.util.Date;

public class Exceptions {
    public static void ArithmException() {
        int d, а;
        try {
            d = 0;
            а = 42 / d;
        } catch (ArithmeticException е) {
            System.out.println("Дeлeниe на нуль. Пocлe оператора catch.");
            System.out.println("Описание исключения: " + е);
        }
    }

    public static void ArrException() {
        int[] d = new int[6];
        try {
            d[7] = 4;
        } catch (ArrayIndexOutOfBoundsException е) {
            System.out.println("Запрос элемента за пределами массива.");
            System.out.println("Описание исключения: " + е);
        }
    }

    public static void Catches(int a) throws Exception{
        if(a >= 0 && a < 10)
            throw new Exception("int " + a);
        if(a >= 10 && a < 15)
            throw new Exception("float " + a);
        if(a >= 15 && a <= 20)
            throw new Exception("String " + a);
        if(a > 20)
            throw new Exception("All " + a);
    }

    static class MyException extends Exception {
        private  int  id;
        MyException(int а) {
            id = а;
        }
        public String toString(){
            return id + " MyException ";
        }
    }

    public static void my_exception(int a) throws MyException {
        if (a > 2) {
            throw new MyException(a);
        }
    }
}
