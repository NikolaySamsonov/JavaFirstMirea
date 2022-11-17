package ru.mirea.lab3.lab3_3;

import java.util.Random;

public class lab3_3 {
    public static void main(String[] args) {
        int [] mass = new int[4];
        Random rand = new Random();
        for (int i=0;i< mass.length;i++){
            mass[i]=( rand.nextInt(88)+10);
            System.out.println(mass[i]);
        }
        boolean check=true;
        for (int i=0;i< mass.length-1;i++){
            if (mass[i]>mass[i+1])check=false;

        }
        if (check==true)System.out.println("строго возрастает");
        else System.out.println("не возрастающая" );
    }
}
