package ru.mirea.lab23;
import java.util.Scanner;
public class ShopTester {
    public static void main(String[] args){
        shop shop=new shop();
        shop.setList();
        shop.getKomp();
        do {}while (shop.kommand()==true);
    }
}
