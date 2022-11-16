package ru.mirea.lab1;

public class lab1_4 {
    public int factorial(int x) {
        int f=1;
        for (int i=1;i<x;i++){
            f=f*i;
        }
        return f;
    }

    public static void main(String[] args){
        for (double i=1;i<11;i++){
            System.out.println(1/i);
        }
    }
}
