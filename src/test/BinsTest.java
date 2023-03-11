import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class BinsTest extends TestCase {
    @Test
    public void testGetBin() {
        Bins bin = new Bins();
        Dice dice = new Dice(2);
        bin.incrementBin(dice.value);
        int expected = 1;
        int actual = bin.getBin(dice.value);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetBinWithThreeRolls() {
        Bins bin = new Bins();
        Dice dice = new Dice(2);
        bin.incrementBin(dice.value);
        int expected = 2;
        bin.incrementBin(dice.value);
        int actual = bin.getBin(dice.value);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testIncrementBin(){
        Bins bin = new Bins();
        for (int i = 0; i < 5; i++){
            bin.incrementBin(5);
        }
        int expected = 5;
        int actual = bin.getBin(5);
        Assert.assertEquals(expected,actual);
    }

}