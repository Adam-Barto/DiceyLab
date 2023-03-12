import java.util.EventListener;
import java.util.Random;

public class Dice {
    public int howManyDice = 0;
    public int value = 0;



    public int toss(){
        Random ranNum = new Random();
        return ranNum.nextInt(6);// + 1;
        }
//Math.floor(Math.random()*6);
    public int tossAndSum(int numberOfTosses){
        int sum = 0;
        for (int i = 0; i < numberOfTosses; i++){
            sum = sum+toss();
        }
        return sum;
    }

    public Dice(int howManyDice) {
        value = tossAndSum(howManyDice);
    }
}
