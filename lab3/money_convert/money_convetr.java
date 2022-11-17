package ru.mirea.lab3.money_convert;

import java.text.ChoiceFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class money_convetr {
    private double input_money_rub;
    private double input_money ;
    private double output_money ;
    private int country ;
    private ArrayList<Locale> locales = new ArrayList<>();
    private NumberFormat format_in ;
    private NumberFormat format_out ;
    private ArrayList<Double> mod = new ArrayList<>();
    public money_convetr (){
        locales.add(Locale.CANADA);
        locales.add(Locale.GERMANY);
        locales.add(Locale.US);
        locales.add(Locale.FRANCE);
        locales.add(Locale.JAPAN);
        locales.add(Locale.getDefault());
        mod.add(45.37);
        mod.add(62.68);
        mod.add(60.48);
        mod.add(62.68);
        mod.add(0.43);
        mod.add(1.0);
    }
    public void SetConsole(){
        for(int i =0;i< locales.size();i++){
            System.out.println((i+1)+"   "+locales.get(i).getDisplayCountry());
        }
    }
    public void SetMoneyDefault(double money, int country){
        this.input_money = money;
        this.input_money_rub = money * mod.get(country);
        format_in = NumberFormat.getCurrencyInstance(locales.get(country));
    }
    public void SetMoneyChanged(int country){
        this.country = country;
        this.output_money = input_money_rub / mod.get(country);
        format_out = NumberFormat.getCurrencyInstance(locales.get(country));
    }
    public void GetCheck (){
        System.out.println("ваша изначальная сумма денег");
        System.out.println(format_in.format(input_money));
        System.out.println("Сумма в стране:" + locales.get(country).getDisplayCountry());
        System.out.println(format_out.format(output_money));
    }

}
