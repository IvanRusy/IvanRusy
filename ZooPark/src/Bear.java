public class Bear extends Animals implements Actions{
    int distanceWalking;

    public Bear(int age, String name, boolean isPredator, int distanceWalking){
        super(age, name, isPredator);
        this.distanceWalking = distanceWalking;
    }
    @Override
    public void doVoice(){
        System.out.println("Bear says BEEEAAAAARRRR...");
    }
    @Override
    public void  breezing(){
        System.out.println("Bear sniffles...");
    }
    @Override
    public void moving(){
        System.out.println("Bear is running");
    }
    public void info(){
        System.out.printf("Bear is %d years old, has %s name, run %d km every day%n", age, name, distanceWalking);
    }
}
