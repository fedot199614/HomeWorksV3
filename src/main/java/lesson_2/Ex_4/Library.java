package lesson_2.Ex_4;

import java.util.List;
import java.util.Map;

public interface Library {
    Book searchBook(String bookName);
    void addBook(String name,double price);
    void addBook(Map<String,Book> bookList);
    void buyBook(String name,double price);
    void removeBook(String name);
    void printWelcomeMsg();



}
