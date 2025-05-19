package Hayvanlar;
public class Hayvan {
    private String typeName ;
    private double agırlık ;
    private int age ;

    Hayvan(String typeName, double agırlık , int age) {
        this.typeName = typeName;
        this.agırlık = agırlık;
        this.age = age; 
    }
    
    public void getInfo() {
        
    }

    public void getDosage() {
        System.out.println("Hayvanlar için gerekli miktarda dozaj verildi.");
    }

    public void getFeedSchedule() {
        System.out.println("Hayvanlar için gerekli miktarda yem verildi.");
    }

    public String getTypeName() {
        return typeName;
    }

    public double getAgırlık() {
        return agırlık;
    }

    public int getAge() {
        return age;
    }

}



