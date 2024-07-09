public class Shchupak  extends Fishes implements Actions{
    int toothNumber;

    public Shchupak(int age, String name, boolean isFreshwater, int toothNumber){
        super(age, name, isFreshwater);
        this.toothNumber = toothNumber;
    }
    @Override
    public void immersionDepth(){
        System.out.println("Shchupak can dive 30 meters");
    }

    @Override
    public void  breezing(){
        System.out.println("Shchupak breathes through gills...");
    }
    @Override
    public void moving(){
        System.out.println("Shchupak is swimming");
    }
    public void info(){
        System.out.printf("Shchupak is %d years old, has %s name, has %d tooth%n", age, name, toothNumber);
    }
}
