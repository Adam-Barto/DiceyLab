import java.util.Arrays;

public class Bins {

    int[] Bin;


    public int[] Bins(int min, int max){
        return Arrays.copyOfRange(Bin,min, max);
    }

    public Bins(){
        Bin = new int[11];//16
    }
    public int getBin(int i){
        return Bin[i];
    }

    public void incrementBin(int i){
        //System.out.println(i);
        Bin[i] = Bin[i]+1;
    }

}
//    Bins results = new Bins(2, 12); // for bins from 2..12
//    Integer numberOfTens = results.getBin(10); // returns the number of tens in the 10 bin
//results.incrementBin(10); // should increment bin # 10
