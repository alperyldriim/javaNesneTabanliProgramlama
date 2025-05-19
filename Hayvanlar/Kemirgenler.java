package Hayvanlar;

public class Kemirgenler extends Hayvan{

    Kemirgenler(String typeName , double agırlık , int age) {
        super(typeName, agırlık, age) ;
    }

    @Override
    public void getDosage() {
        System.out.println("Kemirgenler için gerekli miktarda dozaj verildi.");
    }

    @Override
    public void getFeedSchedule() {
        System.out.println("Kemirgenler için gerekli miktarda yem verildi.");
    }
}
