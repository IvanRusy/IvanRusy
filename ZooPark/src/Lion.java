import java.text.MessageFormat;

public class Lion extends Animals implements Actions{
    int prideCapacity;

    public Lion(int age, String name, boolean isPredator, int prideCapacity){
        super(age, name, isPredator);
        this.prideCapacity = prideCapacity;
    }

    @Override
    public void doVoice(){
        System.out.println("Lion says RRRRRRR...");
    }
    @Override
    public void  breezing(){
        System.out.println("Lion is breezing...");
    }
    @Override
    public void moving(){
        System.out.println("Lion is walking");
    }
    public void info(){
        System.out.println(MessageFormat.format("Lion is{0}years old, has{1}name, has{2}prideCapacity", age, name, prideCapacity));
    }
}
