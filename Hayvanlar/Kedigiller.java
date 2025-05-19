package Hayvanlar;

public class Kedigiller extends Hayvan{
    Kedigiller(String typeName , double agırlık , int age) {
        super(typeName, agırlık, age) ;
    }

    @Override
    public void getDosage() {
        System.out.println("Kedigiller için gerekli miktarda dozaj verildi.");
    }

    @Override
    public void getFeedSchedule() {
        System.out.println("Kedigiller için gerekli miktarda yem verildi.");
    }
}
