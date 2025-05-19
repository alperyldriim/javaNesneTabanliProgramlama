package odev4;

public class Main {
    public static void main(String[] args) {
        
        Phone samsungPhone = new Phone("Samsung" , 15000 , "506-2323") ;
        samsungPhone.open();
        samsungPhone.close();
        samsungPhone.call("520-1212");
        samsungPhone.close();
        samsungPhone.open();
        samsungPhone.call("520-1212");
        samsungPhone.open();

        System.out.println("\n");

        Computer lenovoComputer = new Computer("Lenovo", 16000 , "Windows 11") ;
        lenovoComputer.open();
        lenovoComputer.close();
        lenovoComputer.updateOperatingSystem("Windows 12");
        lenovoComputer.close();
        lenovoComputer.open();
        lenovoComputer.updateOperatingSystem("Windows 12");
        lenovoComputer.open();

    }
}
