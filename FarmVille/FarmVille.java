package odev5;

public class FarmVille {
    public static void main(String[] args) {
        Farm farm = new Farm();
        TomatoPlant tomatoPlant = new TomatoPlant("Domates" , 3);

        CarrotPlant carrotPlant = new CarrotPlant("Havuç", 5) ;
    
        farm.addPlant(tomatoPlant) ;
        farm.addPlant(carrotPlant);
        System.out.println();
        farm.simulateDay();
    }
}
