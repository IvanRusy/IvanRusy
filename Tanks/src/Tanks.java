public class Tanks {
    public String countryCreated;
    public int calibre;
    public int numberOfCrew;
    public boolean amfibia;

    public Tanks(String countryCreated, int calibre, int numberOfCrew, boolean amfibia){
        this.countryCreated = countryCreated;
        this.calibre = calibre;
        this.numberOfCrew = numberOfCrew;
        this.amfibia = amfibia;
    }

    public String ChangeManufacturer(String newManufacurer){
        System.out.println("Your Manufacturer was " + this.countryCreated);
        this.countryCreated = newManufacurer;
        System.out.println("Your New Manufacturer is " + this.countryCreated);
        return countryCreated;
    }

    public boolean ChangeAmfibaia(boolean isamfibia){
        System.out.println("Your tank was Amfibia?? -" + this.amfibia);
        this.amfibia = isamfibia;
        System.out.println("Your tank now is Amfibia?? -" + this.amfibia);
        return  amfibia;
    }

    public void ShowCrewNumber(){
        System.out.println("Tank's crew number is " + this.numberOfCrew);
    }

    public void Penetration(){
        if(this.calibre <= 100){
            System.out.println("Your tank armor's penetration is 220 mm, because it's calibre is "+ this.calibre + " mm");
        }
        else{
            System.out.println("Your tank armor's penetration is 280 mm, because it's calibre is "+ this.calibre + " mm");
        }
    }
}
