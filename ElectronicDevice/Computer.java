package odev4;

public class Computer extends ElectronicDevice {
    private String operatingSystem ;

    Computer(String make, double price , String operatingSystem) {
        super(make, price);
        this.operatingSystem = operatingSystem;

        System.out.println(make + " marka , " + price + " fiyatında, " + operatingSystem + " işletim sistemine sahip Bilgisayar."  );
        
    }

    void updateOperatingSystem(String operatingSystem) {
        if (isOpen()) {
            System.out.println("İşletim Sistemi Güncelleniyor...");
            setOperatingSystem(operatingSystem);
            System.out.println("İşletim Sistemi " + operatingSystem + " sistem olarak güncellendi!");
        } else {
            System.out.println("İşletim sistemi güncelleme işlemi için cihaz açık olmalı.");
        }
    }

    
    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

}
