public class Orel extends Birds implements Actions{
    int childrenNumber;

    public Orel(int age, String name, double wingspan, int childrenNumber){
        super(age, name, wingspan);
        this.childrenNumber = childrenNumber;
    }
    @Override
    public void doVoice(){
        System.out.println("Orel says ORel..");
    }
    @Override
    public void  breezing(){
        System.out.println("Orel is breezing...");
    }
    @Override
    public void moving(){
        System.out.println("Orel soars in the sky");
    }
    public void info(){
        System.out.printf("Orel is %d years old, has %s name, has %d children%n", age, name, childrenNumber);
    }
}
