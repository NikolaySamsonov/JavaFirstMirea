package ru.mirea.lab3.lab3_1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
public class lab3_1 {
    public static void main(String[] args) {
        System.out.println("введите длину массива");
        Scanner sc= new Scanner(System.in);
        Random rand = new Random();
        ArrayList<Double> array = new ArrayList<>();
        for (int i= sc.nextInt();i>0;i--){
            array.add(rand.nextDouble());
        }
        for (int i= 0;i< array.size();i++){
            System.out.println(array.get(i));
        }
        System.out.println(" ");
        for (int left = 0; left < array.size(); left++) {
            int minInd = left;
            for (int i = left; i < array.size(); i++) {
                if (array.get(i) < array.get(minInd)) {
                    minInd = i;
                }
            }
            Collections.swap(array, left, minInd);
        }
        for (int i= 0;i< array.size();i++){
            System.out.println(array.get(i));
        }
    }
}
