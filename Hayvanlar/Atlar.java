package Hayvanlar;

public class Atlar  extends Hayvan{

    Atlar(String typeName , double agırlık , int age) {
        super(typeName, agırlık, age) ;
    }

    @Override
    public void getDosage() {
        System.out.println("Atlar için gerekli miktarda dozaj verildi.");
    }

    @Override
    public void getFeedSchedule() {
        System.out.println("Atlar için gerekli miktarda yem verildi.");
    }
}
