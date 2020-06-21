package lesson_1;

import java.security.SecureRandom;

public class Ex_2 {
    private  String[] symbolsDictionary  = {"/","\\","_"};
    private  String[] toys  = {" ","o","J","J","J","@","+"};
    private SecureRandom random = new SecureRandom();
    private String[][] defaultInit(int x,int y){
        String[][] blockArray = new String[x][y];
        for(int i = 0;i<x;i++){
            for(int j=0;j<y;j++){
                blockArray[i][j] = " ";
                }
            }
        return blockArray;
    }
    private void print(String[][] blockArray){
        for(String[] val : blockArray){
            for(String val2 : val){
                System.out.print(val2);
            }
            System.out.println();
        }
    }
    private void starBuilder(int x,int y){
        String[][] blockArray = defaultInit(x,y);
        int half = y/2;
        for(int i = 0;i<x;i++) {
            for (int j = 0; j < y; j++) {
                if((j+1)==half) {
                    blockArray[i][j]="X";
                }
            }
        }
        print(blockArray);
    }
    private void endBuilder(int x,int y){
        String[][] blockArray = defaultInit(x,y);
        int half = y/2;
        for(int i = 0;i<x;i++) {
            for (int j = 0; j < y; j++) {
                if((j+1)==half) {
                    blockArray[i][j]="U";
                }
            }
        }
        print(blockArray);
    }
    private void blockOfTreeBuilder(int x,int y){
        String[][] blockArray = defaultInit(x,y);
        int half = y/2;
        int counter = 1;
        for(int i = 0;i<x;i++){
            for(int j=0;j<y;j++){
                if((j+1)==half) {
                    blockArray[i][j] = symbolsDictionary[0];
                    blockArray[i][j+counter] = symbolsDictionary[1];
                    if(counter!=1 && j<counter){
                        blockArray[i][(j+1)+(random.nextInt(j+1))] = toys[random.nextInt(7)];
                    }
                }
                if((i+1)==x && j<y-2){
                    blockArray[i][j+1]  =symbolsDictionary[2];
                }
            }
            half--;
            counter+=2;

        }
        print(blockArray);
    }
    public void printTree(){
        starBuilder(1,13);
        blockOfTreeBuilder(6,12);
        //blockOfTreeBuilder(6,12);
        endBuilder(1,12);
    }
}
