package ru.mirea.lab21;
import java.lang.*;
public class testerAuthor {
    public static void main (String [] args){
        String mail;
        Author a = new Author("df","п",'h');
        System.out.println(a.toString());
        System.out.println(a.GetEmail());
    }
}
