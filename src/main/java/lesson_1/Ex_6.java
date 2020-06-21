package lesson_1;

public class Ex_6 {



    public int[] copyArrayV1(int[] array){
        int[] tempCopy = new int[array.length];
        int i = 0;
        for (int val: array) {
            tempCopy[i] = val;
            i++;
        }
        return tempCopy;
    }

    public int[] copyArrayV2(int[] array){

        int[] tempCopy = array;

        return tempCopy;
    }
    public int[] copyArrayV3(int[] array){

        int[] tempCopy = array.clone();

        return tempCopy;
    }
    public int[] copyArrayV4(int[] array){

        int[] tempCopy = new int[array.length];
        System.arraycopy(array,0,tempCopy,0,array.length);

        return tempCopy;
    }

}
