package lesson_2;

import lesson_2.Ex_1.Bank;
import lesson_2.Ex_1.Utils;
import lesson_2.Ex_1.exceptions.PositiveException;
import lesson_2.Ex_1.factories.AccountFactories;
import lesson_2.Ex_1.factories.RodentFactories;
import lesson_2.Ex_2.Gerbil;
import lesson_2.Ex_2.Hamster;
import lesson_2.Ex_2.Mouse;
import lesson_2.Ex_2.Rodent;
import lesson_2.Ex_4.Library;
import lesson_2.Ex_4.OnlineLibrary;
import lesson_2.Ex_4.SchoolLibrary;
import lesson_2.Ex_4.UniversityLibrary;

import java.awt.*;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) throws PositiveException {
       Bank bank = new Bank(AccountFactories.generateRandomAccountList(10));
       //bank functionality
       //bank.printAccountList(); //Check all generated Accounts Type
       //bank.updateAccountsBalance(); //update process

        //-------------------------------------------
        //Rodent functionality also Rodent is a abstract class and solution for Ex_4
        Map<String,Rodent> rodentList = RodentFactories.generateRandomRodentList(10);
        rodentList.forEach((k,v)-> {
            System.out.println(v);
        });

//        Rodent homa = new Hamster(Utils.getUniqueId(),"Noobe", "ORANGE",100, "BLUE");
//        System.out.println(homa);
//        homa.playWithRodent();
//
//        Rodent mouse = new Mouse(Utils.getUniqueId(),"ORANGE", 100,"BLUE", "Revyera");
//        System.out.println(mouse);
//        mouse.playWithRodent();
//
//        Rodent gerbil = new Gerbil(Utils.getUniqueId(),"ORANGE", 100,"BLUE", "Unknown");
//        System.out.println(gerbil);
//        gerbil.eatSomething();

        //-------------------------------------------
        //Interface functionality example
        Library onlineLibrary = new OnlineLibrary();
        onlineLibrary.addBook("Test Book",9.99);
        //onlineLibrary.buyBook("Test BookT",9.99);
        //onlineLibrary.buyBook("Test Book",9.00);
        onlineLibrary.buyBook("Test Book",15);

        Library schoolLibrary = new SchoolLibrary();
        schoolLibrary.addBook("Test Book2",19.99);
        schoolLibrary.buyBook("Test Book2",50);

        Library universityLibrary = new UniversityLibrary();
        universityLibrary.addBook("Test Book3",29.99);
        universityLibrary.buyBook("Test Book3",100);
    }
}
