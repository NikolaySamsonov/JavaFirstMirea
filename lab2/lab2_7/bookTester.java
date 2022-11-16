package ru.mirea.lab2_7;
public class bookTester {
   public static void main (String [] args){
       bookShelf bookShelf = new bookShelf();
       bookShelf.setBook_shelf();
       bookShelf.getBook_shelf();
       bookShelf.oldest_book();
       bookShelf.youngest_book();
       bookShelf.sort_book();
   }
}
