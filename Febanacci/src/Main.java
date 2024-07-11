public class Main {
    public static void febanacci(){
        int i0=0;
        int i1=1;
        int i2;
        System.out.print(i0+" "+i1+" ");
        for(int i = 3; i <= 10; i++){
            i2=i0+i1;
            System.out.print(i2+" ");
            i0=i1;
            i1=i2;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        febanacci();
    }
}