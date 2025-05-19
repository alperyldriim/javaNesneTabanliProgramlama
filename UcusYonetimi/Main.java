package UcusYonetimi;

public class Main {
    public static void main(String[] args) {
        HavaYolu thy = new HavaYolu("THY" , "001");
        HavaAlanı sabiha = new HavaAlanı("Sabiha Gökçen Havalimanı" , "101") ;
        HavaAlanı hatay = new HavaAlanı("Hatay Havalimanı" , "102") ;
        Pilot pilot = new Pilot("201" , "Yusuf Alper Yıldırım" , 12);
        Pilot yrdPilot = new Pilot("202" , "Ahmet Yıldırım" , 5);
        Ucaklar airbus = new Ucaklar("301", "Airbus 350a", true) ;
        UcusYonetimi uc = new UcusYonetimi("401",sabiha , hatay ,"08:00" , "10:30" , pilot , yrdPilot , airbus,thy);

        uc.getInfo();
    }
}
