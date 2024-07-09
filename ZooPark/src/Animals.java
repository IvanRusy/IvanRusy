import static java.lang.System.*;

public class Animals {
    int age;
    String name;
    boolean isPredator;

    public Animals(int age, String name,boolean isPredator){
        this.age = age;
        this.name = name;
        this.isPredator = isPredator;
    }

    public void doVoice(){
        System.out.println("Animal is screaming");
    }
}
