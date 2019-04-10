package com.company;
import java.util.Date;
import java.lang.Exception;
public class Main {

    public static void main(String[] args) {
        Exceptions.ArithmException();
        Exceptions.ArrException();
        try {
            Exceptions.Catches(10);
        } catch (Exception e) {
            System.out.println("Описание исключения: " + e);
        }
        try {
            Exceptions.my_exception(5);
        }catch (Exceptions.MyException m) {
            System.out.println("Описание исключения: " + m);
        }
    }
}
