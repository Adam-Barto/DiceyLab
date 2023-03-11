import org.junit.Assert;
import org.junit.Test;



public class DiceTest {
    @Test
    public void testToss() {
        Dice dice = new Dice(5);
        boolean expected = true;
        dice.toss();
        boolean actual = dice.value > 4;
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testToss2() {
        Dice dice = new Dice(2);
        boolean expected = true;
        dice.toss();
        boolean actual = dice.value > 3;
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testToss3() {
        Dice dice = new Dice(1);
        boolean expected = true;
        dice.toss();
        boolean actual = dice.value > 0;
        Assert.assertEquals(expected,actual);
    }

}