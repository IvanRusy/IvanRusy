import java.text.MessageFormat;

public class Kaban extends Animals implements Actions{
    int weight;

    public Kaban(int age, String name, boolean isPredator, int weight){
        super(age, name, isPredator);
        this.weight = weight;
    }
    @Override
    public void doVoice(){
        System.out.println("Kaban says KABANAAASSSS...");
    }
    @Override
    public void  breezing(){
        System.out.println("Kaban grunts...");
    }
    @Override
    public void moving(){
        System.out.println("Kaban is sleeping");
    }
    public void info(){
        System.out.println(MessageFormat.format("Kaban is {0} years old, has {1} name, has {2} kg weight", age, name, weight));
    }
}
