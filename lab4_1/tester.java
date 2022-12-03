package ru.mirea.lab4_1;

import java.util.Arrays;
import java.util.Scanner;

public class tester {
    public static void main(String[] args) {
        System.out.println("любимое время года :"+seasons.Seasons.SUMMER.title);
        System.out.println(seasons.Seasons.SUMMER.getInfo(seasons.Seasons.SUMMER));
        Scanner sc = new Scanner(System.in);
        System.out.println("\nвведите название сезона из перечисленых SUMMER AUTUMN WINTER SPRING");
        String name=sc.next();
        seasons.Seasons season = seasons.Seasons.valueOf(name.toUpperCase());
        System.out.println(season.FavoriteSeason(season));
        System.out.println(season.GetDescription(season));
        System.out.println((Arrays.toString(seasons.Seasons.values())));
    }
}
