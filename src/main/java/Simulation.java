class Simulation {
    int numberOfDie = 0;
    int numberOfToss = 0;
    Bins bin;
    Dice die;

    public Simulation(int numberOfDies,int numberOfTosses){
        die = new Dice(numberOfDies);
        bin = new Bins();
        numberOfDie = numberOfDies;
        numberOfToss = numberOfTosses;
    }
    public void runSimulation(){
        for (int i = 0; i < numberOfToss; i++) {
            bin.incrementBin(die.tossAndSum(numberOfDie));
        }
    }
    public void printResults(){
        System.out.println("***\n"+
                "Simulation of "+ numberOfDie+
                " dice tossed for "+numberOfToss+" times.\n"+
                "***\n");


        for(int i = 0;i < bin.Bin.length;i++){
            double count = Double.parseDouble(String.format("%.2f",(double)bin.getBin(i)/1000000));
            System.out.println(
                    String.format("%4s ",i+2+" :")+
                    String.format("%7d: ",bin.getBin(i))+
                    String.format("%.2f ",(double)bin.getBin(i)/1000000)+
                    "*".repeat((int)(count * 100)-1));
        }
    }
    public static void main(String[] arg) {

        Simulation sim = new Simulation(2,1000000);

        sim.runSimulation();
        sim.printResults();


    }
}
