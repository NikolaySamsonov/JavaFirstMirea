package ru.mirea.lab1;
import java.util.Scanner;
public class lab1_5 {
    public static int Factorial(int x) {
        int f=1;
        for (int i=1;i<x+1;i++){
            f=f*i;
        }
        return f;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("введите число");
        int start_int=sc.nextInt();
        System.out.println("!= "+Factorial(start_int));
    }
}
