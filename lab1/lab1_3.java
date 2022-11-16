package ru.mirea.lab1;

public class lab1_3 {
    public static void main (String[] args){
        if (args.length>1) {
            for (int i = 0; i < args.length; i++) {
                System.out.println(args[i] + " ");
            }
        }
        else{
            System.out.println("no arguments");
        }
    }
}
