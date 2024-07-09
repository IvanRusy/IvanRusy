public class Busel extends  Birds implements Actions{
    int wingsNumber;

    public Busel(int age, String name, double wingspan, int wingsNumber){
        super(age, name, wingspan);
        this.wingsNumber = wingsNumber;
    }

    @Override
    public void doVoice(){
        System.out.println("Busel says BUSliK..");
    }
    @Override
    public void  breezing(){
        System.out.println("Busel is breezing...");
    }
    @Override
    public void moving(){
        System.out.println("Busel soars in the sky");
    }
    public void info(){
        System.out.printf("Lion is %d years old, has %s name, has %d wings%n", age, name, wingsNumber);
    }
}
