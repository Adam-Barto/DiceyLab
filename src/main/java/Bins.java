import java.util.Arrays;

public class Bins {

    int[] Bin;

    public Bins(){
        Bin = new int[12];
    }

    public int[] Bins(int min, int max){
        return Arrays.copyOfRange(Bin,min, max);
    }
    public int getBin(int i){
        return Bin[i]/i;
    }

    public void incrementBin(int i){
        Bin[i] = Bin[i]+i;
    }

}
//    Bins results = new Bins(2, 12); // for bins from 2..12
//    Integer numberOfTens = results.getBin(10); // returns the number of tens in the 10 bin
//results.incrementBin(10); // should increment bin # 10
