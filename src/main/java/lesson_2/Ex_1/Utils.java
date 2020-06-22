package lesson_2.Ex_1;

import java.security.SecureRandom;
import java.util.UUID;

public class Utils {
    private static SecureRandom secureRandom = new SecureRandom();
    public static int getUniqueID(){
        String[] uniqueID = UUID.randomUUID().toString().split("-");
        return Integer.parseInt(uniqueID[0].replaceAll("\\D+",""));
    }
    public static String getUniqueId(){
        String[] uniqueID = UUID.randomUUID().toString().split("-");
        return uniqueID[0];
    }
    public static int getRandomNumber(int bound){
        return secureRandom.nextInt(bound)+1;
    }
}
