package ru.mirea.lab3.money_convert;
import java.util.Scanner;
public class lab3_converter_money {
    public static void main(String[] args) {
        money_convetr money = new money_convetr();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сумму");
        Double money_in = sc.nextDouble();
        System.out.println("Введите номер страны, валюту которой вы хотите поменять");
        money.SetConsole();
        int country = sc.nextInt();
        System.out.println("Введите номер страны, в валюту которой вы хотите конвертировать");
        money.SetConsole();
        money.SetMoneyDefault(money_in,country-1);
        country = sc.nextInt();
        money.SetMoneyChanged(country-1);
        money.GetCheck();
    }
}