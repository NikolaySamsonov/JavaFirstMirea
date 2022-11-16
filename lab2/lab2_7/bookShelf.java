package ru.mirea.lab2_7;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class bookShelf  {
    Scanner sc=new Scanner(System.in);
    private ArrayList<book> book_shelf  = new ArrayList<>();
    public  bookShelf(){
        System.out.println("введите количество книг на полке");
        int i= sc.nextInt();
        for (int j=0;j<i;j++){
            book_shelf.add(new book());
        }
    };
    public void setBook_shelf(){
        for (int j=0;j<book_shelf.size();j++){
            book_shelf.get(j).Set_Book(j);

       }
    }
    public void getBook_shelf(){
        for (int j=0;j<book_shelf.size();j++){
            book_shelf.get(j).Get_Book(j);
        }
    }
    public void sort_book(){
        for (int left = 0; left < book_shelf.size(); left++) {
            int minInd = left;
            for (int i = left; i < book_shelf.size(); i++) {
                if (book_shelf.get(i).Book_year < book_shelf.get(minInd).Book_year) {
                    minInd = i;
                }
            }
            Collections.swap(book_shelf, left, minInd);
        }
        System.out.println("\nкниги в порядке возросания их года\n");
        getBook_shelf();
    }
    public void oldest_book(){
        int min=3000;
        String name="null";
        for (int i=0;i<book_shelf.size();i++){
            if(book_shelf.get(i).Book_year<min){
                min=book_shelf.get(i).Book_year;
                name=book_shelf.get(i).Book_name;
            }
        }
        System.out.println("\nсамая старая книга "+ name);
    }
    public void youngest_book(){
        int max=0;
        String name="null";
        for (int i=0;i<book_shelf.size();i++){
            if(book_shelf.get(i).Book_year>max){
                max=book_shelf.get(i).Book_year;
                name=book_shelf.get(i).Book_name;
            };
        }
        System.out.println("\nсамая молодая книга "+ name);
    }
}
