package lesson_2.Ex_4;

import lesson_2.Ex_1.Utils;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicReference;

public class UniversityLibrary implements Library{
    private Map<String,Book> bookList;

    public UniversityLibrary(){
        this.bookList = new TreeMap<>();
    }

    public Map<String,Book> getBookList() {
        return bookList;
    }

    @Override
    public void printWelcomeMsg(){
        System.out.println("Welcome to UniversityLibrary");
    }

    @Override
    public Book searchBook(String bookName) {
        AtomicReference<Book> myBook = new AtomicReference<>();
        bookList.forEach((k,v)->{
            if(v.getName().equals(bookName)){
                myBook.set(v);
            }
        });
        if(myBook.get()!=null){
            System.out.println("We found you book. Info printed bellow:");
            System.out.println(myBook.get());
            return myBook.get();
        }else{
            System.out.println("Sorry but we can't find your book!!!");
            return null;
        }
    }

    @Override
    public void addBook(String name,double price) {
        Book book = new Book(Utils.getUniqueId(),name,price);
        this.bookList.put(book.getId(),book);
        System.out.println(book+" Was successful added!!!");

    }

    @Override
    public void addBook(Map<String,Book> booksList) {
        this.bookList.putAll(bookList);
        System.out.println("Your book list Was successful added!!!");
    }

    @Override
    public void buyBook(String name,double price) {
        printWelcomeMsg();
        Book myBook = searchBook(name);
        if(myBook!=null){
            System.out.println("Your book price is "+myBook.getPrice());
            if(price>=myBook.getPrice()){
                System.out.println("Do you want to buy this book? "+myBook);
                String answer = new Scanner(System.in).nextLine();
                if(answer.matches("yes|Yes|YES|1")){
                    System.out.println("Ok. Thanks for the purchase!");
                    removeBook(myBook);
                }else{
                    System.out.println("Ok. Thanks for visit!");
                }
            }else{
                System.out.println("You have not enough money =(");
            }
        }
    }

    @Override
    public void removeBook(String name) {
        Book myBook = searchBook(name);
        if(myBook!=null){
            this.bookList.remove(myBook.getId());
            System.out.println(myBook+" Was successful removed!!!");
        }
    }

    public void removeBook(Book book) {
        if(book!=null){
            this.bookList.remove(book.getId());
            System.out.println(book+" Was successful removed from book list!!!");
        }
    }
}
