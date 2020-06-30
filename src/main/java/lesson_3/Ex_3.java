package lesson_3;

import javafx.geometry.Pos;
class InnerTestExceptionClass{
    private int testInt;
    public InnerTestExceptionClass(int testInt) throws PositiveException {
        setTestInt(testInt);
    }

    public int getTestInt() {
        return testInt;
    }

    public void setTestInt(int testInt) throws PositiveException {
        if(testInt<=0){
            throw new PositiveException("-> Value should be positive <-");
        }else {
            this.testInt = testInt;
        }
    }

    @Override
    public String toString() {
        return "InnerTestExceptionClass{" +
                "testInt=" + testInt +
                '}';
    }
}
public class Ex_3 {
    public static void main(String[] args) {
        try {
            InnerTestExceptionClass test = new InnerTestExceptionClass(5);
            System.out.println("All looks good!!!");
        } catch (PositiveException e) {
            e.printStackTrace();
        }

        try {
            InnerTestExceptionClass test = new InnerTestExceptionClass(0);
            System.out.println("All looks good!!!");
        } catch (PositiveException e) {
            e.printStackTrace();
        }
    }
}
