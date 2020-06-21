package lesson_1;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Man {
    private static int[] arr = {1, 4, 5, 6, 2, 7, 0, 1, 7};
    private static List<String> stringList = Arrays.asList(new String[]{"Volvo", "BMW", "BMW", "Ford", "Ford", "Ford", "Mazda", "Mazda", "Mazda", "Mazda"});

    public static void main(String... args) throws IOException, ParseException {
        //test.Ex_1
        new Ex_1().bubbleSort(arr);
        //test.Ex_2
        new Ex_2().printTree();
        //test.Ex_3
        new Ex_3().getDuplicates(stringList);
        System.out.println("--------------");
        new Ex_3().getUniqueValues(stringList);
        //test.Ex_6
        System.out.println("--------------");
        Arrays.stream(new Ex_6().copyArrayV1(arr)).forEach(System.out::print);
        System.out.println();
        Arrays.stream(new Ex_6().copyArrayV2(arr)).forEach(System.out::print);
        System.out.println();
        Arrays.stream(new Ex_6().copyArrayV3(arr)).forEach(System.out::print);
        System.out.println();
        Arrays.stream(new Ex_6().copyArrayV4(arr)).forEach(System.out::print);
        System.out.println();
        System.out.println("--------------");
        //test.Ex_7
        Date date = Ex_7.parseDate(Ex_7.dateToString(Calendar.getInstance().getTime()));
        System.out.println(new SimpleDateFormat("dd-MM-yyyy").format(date));
        System.out.println("--------------");
        //Ex_8
        String[] arr = "sdfsdf 32 sdf sdf sdf sdf sddf sdf sdf s".split("");
        System.out.println(arr[1]);
        System.out.println("--------------");
        //Ex_9
        String test = String.valueOf(6);
        String test2 = String.valueOf('e');
        String test3 = String.valueOf(6.9);
        String test4 = String.valueOf(true);
        System.out.println(test + " " + test2 + " " + test3 + " " + test4);
        System.out.println("--------------");
        //Ex_10
        Test obj1 = new Test(10);
        Test obj2 = new Test(10);
        boolean result1 = obj1.getF1() == obj2.getF1();
        boolean result2 = obj1.hashCode() == obj2.hashCode();
        System.out.println("objects should be equal by values but have different hash codes;Values-> " + result1 + " hashCode-> " + result2);

        Test2 obj3 = new Test2(10);
        Test2 obj4 = new Test2(10);
        boolean result3 = obj3.getF1() == obj4.getF1();
        boolean result4 = obj3.hashCode() == obj4.hashCode();
        System.out.println("objects should be equal by values but have same hash codes;Values-> " + result3 + " hashCode-> " + result4);

        Test2 obj5 = new Test2(9);
        Test2 obj6 = new Test2(10);
        boolean result5 = obj5.getF1() == obj6.getF1();
        boolean result6 = obj5.hashCode() == obj6.hashCode();
        System.out.println("objects should not be equal by values but have same hash codes;Values-> " + result5 + " hashCode-> " + result6);

        Test obj7 = new Test(10);
        Test obj8 = new Test(10);
        boolean result7 = obj7.getF1() == obj8.getF1();
        boolean result8 = obj7.hashCode() == obj8.hashCode();
        System.out.println("objects should not be equal by values but have same hash codes;Values-> " + result7 + " hashCode-> " + result8);
        //test.Ex_5
        new Ex_5(1).playTheGame(1000000);

    }
}
