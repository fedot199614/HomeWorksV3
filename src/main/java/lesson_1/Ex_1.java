package lesson_1;

public class Ex_1 {

private  void printResults(String notification,int[] array){
    System.out.print(notification);
for(int val : array) {
    System.out.print(val+" ");
}
    System.out.println("");
}

public void  bubbleSort(int[] array){
    printResults("Before sort -> ",array);
for(int i =0;i<array.length;i++){
    for(int j = 0;j<array.length;j++){
        if(array[i]<array[j]) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}
    printResults("After sort -> ",array);
}


}
