package ru.mirea.lab4_1.extend.task2.task2;

import java.util.ArrayList;
import java.util.Scanner;

public class phone {
    public String Name;
    public String Number;
    public String Model;
    public String Weight;
    public boolean Message=false;
    public phone (String number, String model){
        this.Number = number;
        this.Model = model;
    }

    public phone (String number, String model, String weight,String name){
        this.Name = name;
        this.Number = number;
        this.Model = model;
        this.Weight = weight;
    }
    public phone (String number, String model, String weight){
        this(number,model);
        this.Number = number;
        this.Model = model;
        this.Weight = weight;
    }

    public String GetPhone(){
        return "Номер телефона:  "+Number+
                "\nМодель телефона:  "+Model+
                "\nВес телефона:  "+Weight;
    }

    public String ReceiveCall (){
        return "имя звонящего  "+Name;
    }

    public String GetNumber (){
        return "номер звонящего "+Number;
    }
    public phone (){};

    public String ReceiveCall (String name, String number){
        return "имя звонящего  "+name+"\nномер звонящего  "+number;
    }

    public void SendMessage (String numbers){
        String [] numberSplit = numbers.split(" ");
        for (int i=0;i<numberSplit.length;i++){
            if (numberSplit[i].equals(Number) ){
                Message=true;
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<phone> list = new ArrayList<>();
        list.add(new phone("+79645804673","redmi note 10 pro", "432грамма","Коля"));
        list.add(new phone("+79031800509","onePlus 7", "520грамм","Мама"));
        list.add(new phone("+79032432222","Sony vivo J780", "377грамм","Папа"));
        for (int i = 0; i<list.size(); i++){
            System.out.println(list.get(i).ReceiveCall());
            System.out.println(list.get(i).GetPhone()+"\n");
        }
        Scanner sc = new Scanner(System.in);
        String numbers = sc.nextLine();
        for (int i = 0; i<list.size(); i++){
            list.get(i).SendMessage(numbers);
            if (list.get(i).Message==true){
                System.out.println("для номера "+list.get(i).Number+" ("+list.get(i).Name+") "+" отправлено сообщение");
            }
        }
    }

}
