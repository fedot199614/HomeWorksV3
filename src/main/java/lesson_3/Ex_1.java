package lesson_3;

public class Ex_1 {

    private static int[] arr;
    public static void main(String[] args) {
        arr = new int[5];
        try {
            System.out.println(arr[5]);
        }catch(Exception ex) {
            System.out.println("I am in catch block!!!");
            ex.printStackTrace();
        }finally{
            System.out.println("I am in catch finally!!!");
        }
    }
}
