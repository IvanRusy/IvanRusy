public class Birds {
    int age;
    String name;
    double wingspan;


    public Birds(int age, String name, double wingspan){
        this.age = age;
        this.name = name;
        this.wingspan = wingspan;
    }

    public void doVoice(){
        System.out.println("Birds is screaming");
    }
}
