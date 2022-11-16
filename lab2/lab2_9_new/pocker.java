package ru.mirea.lab2_9_new;

import java.util.Scanner;

public class pocker {
    public static void main (String [] args){
        cardDeck card= new cardDeck();
        System.out.println("введите количество игроков ");
        Scanner sc = new Scanner(System.in);
        int player= sc.nextInt();
        for (int i=0; i<player;i++ ) {
            System.out.println("игрок № "+(i+1));
            for (int j=0;j<5;j++) {
                System.out.println(card.SetCard());
            }
            System.out.println(" ");
        }
    }
}
