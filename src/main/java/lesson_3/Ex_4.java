package lesson_3;

import lesson_1.Test2;

import java.util.List;

public class Ex_4 {

    private static List<String> test;
    public static void main(String[] args) {
        try{
            int res = test.hashCode();
        }catch (NullPointerException ex){
            ex.printStackTrace();
        }
    }
}
