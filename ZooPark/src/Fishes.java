public class Fishes {
    int age;
    String name;
    boolean isFreshwater;

    public Fishes(int age, String name, boolean isFreshwater){
        this.age = age;
        this.name = name;
        this.isFreshwater = isFreshwater;
    }

    public void immersionDepth(){
        System.out.println("I can dive underwater");
    }
}
