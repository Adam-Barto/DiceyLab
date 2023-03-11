import java.util.EventListener;

public class Dice {
    public int numberOfTosses = 0;
    public int value = 0;



    public int toss(){
        return (int) Math.floor(Math.random()* 6);
    }
    public int tossAndSum(int numberOfTosses){
        int sum = 0;
        for (int i = 0; i <= numberOfTosses; i++){
             sum = sum + toss();
        }
        return sum;
    }

    public Dice(int numberOfTosses) {
        value = tossAndSum(numberOfTosses);
    }
}
