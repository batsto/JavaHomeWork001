package javaHomeWorks.JawaHomeWorks001;
import java.util.Scanner;

// Написать программу вычисления n-ого треугольного числа

public class task001 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Ввeдите номер треугольного числа: ");
        int a = scr.nextInt();
        int x = lib.TriangularNumber(a);
        System.out.println(a + "-тое треугольное число равно:  " + x);


        
    }
    
    
}
