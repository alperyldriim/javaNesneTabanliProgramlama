package odev4;

public class Phone extends ElectronicDevice {
    private String number ;

    Phone(String make, double price, String number) {
        super(make, price);
        this.number = number;

        System.out.println(make + " marka , " + price + " fiyatında, " + number + " telefon numarasına sahip Telefon."  );
    }

    void call(String number) {
        if (isOpen()) {
            System.out.println(number + " numaralı kişi aranıyor");
        } else {
            System.out.println("Arama yapmak için telefonun açık olması gerekmektedir.");
        }
    }


    
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

}
