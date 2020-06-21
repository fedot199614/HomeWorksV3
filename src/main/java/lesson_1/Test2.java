package lesson_1;

import java.util.Date;

public class Test2 {

        int f1;


        public Test2 (int f1)
        {
            this.f1 = f1;

        }
        public int getF1()
        {
            return this.f1;
        }
    @Override
    public int hashCode()
    {
        final int prime = 3;
        int result = 1;
        result = prime * result + new Date().getSeconds();
        return result;
    }

}
