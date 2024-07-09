public class Karas extends Fishes implements Actions{
    int flipperNumber;

    public Karas(int age, String name, boolean isFreshwater, int flipperNumber){
        super(age, name, isFreshwater);
        this.flipperNumber = flipperNumber;
    }

    @Override
    public void immersionDepth(){
        System.out.println("Karas can dive 15 meters");
    }

    @Override
    public void  breezing(){
        System.out.println("Karas breathes through gills...");
    }
    @Override
    public void moving(){
        System.out.println("Karas is swimming");
    }
    public void info(){
        System.out.printf("Karas is %d years old, has %s name, has %d flipper%n", age, name, flipperNumber);
    }
}
