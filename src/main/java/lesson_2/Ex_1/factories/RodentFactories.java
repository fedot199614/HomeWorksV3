package lesson_2.Ex_1.factories;

import lesson_2.Ex_1.Bank;
import lesson_2.Ex_1.Utils;
import lesson_2.Ex_1.account.Account;
import lesson_2.Ex_1.account.CurrentAccount;
import lesson_2.Ex_1.account.SavingsAccount;
import lesson_2.Ex_1.enums.AccountType;
import lesson_2.Ex_1.exceptions.PositiveException;
import lesson_2.Ex_2.Gerbil;
import lesson_2.Ex_2.Hamster;
import lesson_2.Ex_2.Mouse;
import lesson_2.Ex_2.Rodent;
import lesson_2.Ex_2.enums.RodensTypes;

import java.util.Map;
import java.util.TreeMap;

public class RodentFactories {
    private static Rodent getRodent(RodensTypes rodensTypes) throws PositiveException {
        if(rodensTypes == RodensTypes.GERBIL){
            Rodent rodent = new Gerbil(Utils.getUniqueId(),"ORANGE", 100,"BLUE", "Unknown");
            return rodent;
        }else if(rodensTypes == RodensTypes.HAMSTER){
            Rodent rodent = new Hamster(Utils.getUniqueId(),"Noobe", "ORANGE",100, "BLUE");
            return rodent;
        }else if(rodensTypes == RodensTypes.MOUSE){
            Rodent rodent = new Mouse(Utils.getUniqueId(),"ORANGE", 100,"BLUE", "Revyera");
            return rodent;
        }
        return null;
    }

    public static Map<String,Rodent> generateRandomRodentList(int boundary) throws PositiveException {
        Map<String,Rodent> rodentList = new TreeMap<>();

        for(int i =0;i<boundary;i++){
            RodensTypes randomRodenType = RodensTypes.values()[(Utils.getRandomNumber(RodensTypes.values().length)-1)];
            Rodent rodent = getRodent(randomRodenType);
            assert rodent != null;
            rodentList.put(rodent.getId(),rodent);
        }
        return rodentList;
    }
}
