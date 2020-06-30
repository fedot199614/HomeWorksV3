package lesson_3;

public class Ex_2 {
    public static void main(String[] args) {
        try{
            throw new PositiveException("My custom exception");
        }catch (PositiveException ex){
            ex.printStackTrace();
            System.out.println(ex.getMessage());
        }
    }
}
