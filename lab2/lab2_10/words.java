package ru.mirea.lab2_10;

import java.util.Iterator;
import java.util.Scanner;

public class words {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String words = sc.nextLine();
        int counter=0;
        for (int i=0;i<words.length();i++){
            if (words.charAt(i)==' ')counter++;
        }
        if(counter>0) counter++;
        System.out.println(counter);
    }
}
