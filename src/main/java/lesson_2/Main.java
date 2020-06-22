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

import java.awt.*;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) throws PositiveException {
       Bank bank = new Bank(AccountFactories.generateRandomAccountList(10));
       //bank.printAccountList(); //Check all generated Accounts Type
       //bank.updateAccountsBalance(); //update process


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


    }
}
