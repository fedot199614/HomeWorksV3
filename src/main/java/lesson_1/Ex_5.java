package lesson_1;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex_5 {

    private SecureRandom random;
    private List<String> colors;
    private int cash;
    private int min_bet;

    public Ex_5(int cash){
        this.cash = cash;
        this.random = new SecureRandom();
        this.colors = new ArrayList<String>(Arrays.asList("RED","BLACK"));
        this.min_bet = 1;
    }

    public void playTheGame(int how_many){
        int our_start_color_index = random.nextInt(2);
        String our_first_color_bet = colors.get(our_start_color_index);
        int bet = min_bet;
        cash-=bet;
        while(how_many>0) {

            String fell_out = colors.get(random.nextInt(2));
            System.out.println(" Fell out -> "+fell_out);
            if(our_first_color_bet.equals(fell_out)){
                cash+=bet*2;
                bet = 1;
                System.out.println("You WIN CASH =  "+cash+" Next color bet -> "+our_first_color_bet);
            }else{
                int our_color_index  = random.nextInt(2);
                while(our_color_index==our_start_color_index){
                    our_color_index=random.nextInt(2);
                }
                our_start_color_index=our_color_index;
                our_first_color_bet = colors.get(our_color_index);
                bet*=2;
                cash-=bet;
                System.out.println("You LOSE CASH =  "+cash+" Next color bet -> "+our_first_color_bet);
            }
            if(cash<=0){
                break;
            }
            how_many--;
        }
        System.out.println("Final cash -> "+cash);
    }





}
