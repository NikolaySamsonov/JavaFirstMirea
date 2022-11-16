package ru.mirea.lab1;
import java.util.Scanner;
public class lab1 {
    public static void main (String[] args){
        int[] arr= new int[]{1,2,3,4,5,6,7,8,9};
        double sum=0;
        for (int i=0;i<9;i++){
            sum=arr[i]+sum;
        }
        System.out.println("сумма "+sum+" среднее "+sum/9);
    }
}
