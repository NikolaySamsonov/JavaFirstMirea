package ru.mirea.lab1;
import java.util.ArrayList;
import java.util.Scanner;
public class lab1_2 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ведите длину массива\n");
        int len=0;
        if (sc.hasNextInt()){
            len = sc.nextInt();
        }
        else{
            System.out.println("not int length");
        }
        System.out.println(len+" введите элементы\n");
        int help[]=new int[len];
        for (int i=0;i<help.length;i++){
            help[i]=sc.nextInt();
        }
        //int i=help.length;
        int i=0,sum=0,max=0,min=help[0];
        while (i!=help.length) {
            sum = sum + help[i];
            if (max < help[i]) max = help[i];
            if (min > help[i]) min = help[i];
            i++;
        }
        System.out.println("сумма = "+sum+"\nмаксимальное = "+max+"\nминимальное = "+min);
    }
}
