import java.util.Random;

public class Gambling_UC3 {
    public static void main (String[] args){
        int stake_of_Gambler= 100;
        int bet_for_Game = 1;
        int count =1;
        while(stake_of_Gambler <=149 && stake_of_Gambler>=51)
        {
            Random ran = new Random();
            int i = ran.nextInt(2);
            if (i == 0) {
                stake_of_Gambler = stake_of_Gambler + bet_for_Game;
                count++;
            }
            else {
                stake_of_Gambler = stake_of_Gambler - bet_for_Game;
                count++;
            }
        }
        System.out.println("The amount at Gamer after end of Game : "+stake_of_Gambler);
        System.out.println("The No of Games Played by Gamer : " +count);
    }
}
