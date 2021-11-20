import java.util.Random;

public class Gambling_UC4 {
    public static void main (String[] args) {
        int stake_of_Gambler = 100;
        int bet_for_Game = 1;
        int count = 1;
        int win =0;
        int loss =0;
        int net_Stake_after_30_Days=0;

        for (int k = 1; k <= 20; k++)
        {
            stake_of_Gambler=100;
            while (stake_of_Gambler <= 149 && stake_of_Gambler >= 51) {
                Random ran = new Random();
                int i = ran.nextInt(2);
                if (i == 0) {
                    stake_of_Gambler = stake_of_Gambler + bet_for_Game;
                    count++;
                } else {
                    stake_of_Gambler = stake_of_Gambler - bet_for_Game;
                    count++;
                }
                if (stake_of_Gambler== 50)
                {
                    loss++;

                }
                else if (stake_of_Gambler==150)
                {
                    win++;
                }
            }
            net_Stake_after_30_Days=(win*50)-(loss*50);
        }
        System.out.println("The amount at Gamer after end of Game : " + stake_of_Gambler);
        System.out.println("The No of Games Played by Gamer : " + count);
        System.out.println("The no of days Gamer win : "+win);
        System.out.println("The no of days Gamer loss : "+loss);
        System.out.println("The amount gain(+) or loss(-) after 20 days : "+net_Stake_after_30_Days);
    }
}