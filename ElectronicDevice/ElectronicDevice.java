package odev4;

public class ElectronicDevice {
    protected String make ;
    protected double price ;
    private boolean status ;

    ElectronicDevice(String make, double price) {
        this.make = make;
        this.price = price;
    }

    void setMake(String make) {
        this.make = make;
    } 

    String getMake() {
        return this.make;
    }

    void setPrice(double price) {
        this.price = price;
    } 

    double getPrice() {
        return this.price;
    }

    void open() {
        if (isOpen()) {
            System.out.println("Cihaz Zaten Açık");
        } else {
            this.status = true ;
            System.out.println("Cihaz Açıldı");
        }
    }

    boolean isOpen() {
        return this.status ;
    }

    void close() {
        if (!isOpen()) {
            System.out.println("Cihaz Zaten Kapalı");
        } else {
            this.status = false ;
            System.out.println(make + " Cihaz Kapatıldı");
        }
    }

    void setOpen(boolean open) {
        if (open) {
            open();
        } else {
            close();
        }
    }
}
