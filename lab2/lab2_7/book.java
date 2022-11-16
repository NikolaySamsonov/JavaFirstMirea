package ru.mirea.lab2_7;
import java.util.Scanner;
public class book  {
    public String Book_name;
    public String Book_author;
    public int Book_year;
    public int Book_count_pages;
    Scanner sc=new Scanner(System.in);
    public book (){};
    public void Set_Book(int j){
        System.out.println("ввдедите название "+(j+1)+" книги");
        String name= sc.nextLine();
        System.out.println("ввдедите автора "+(j+1)+" книги");
        String author= sc.nextLine();
        System.out.println("ввдедите год написания "+(j+1)+" книги");
        int year= sc.nextInt();
        System.out.println("ввдедите количество страниц "+(j+1)+" книги");
        int pages=sc.nextInt();
        this.Book_name=name;
        this.Book_author=author;
        this.Book_year=year;
        this.Book_count_pages=pages;
    }
    public void Get_Book(int j){
        System.out.println ("название "+(j+1)+" книги "+Book_name+
                "\nавтор "+(j+1)+" книги "+Book_author+
                "\nгод написания "+(j+1)+" книги "+Book_year+
                "\nколичество страниц "+(j+1)+" книги "+Book_count_pages);
    }
}
