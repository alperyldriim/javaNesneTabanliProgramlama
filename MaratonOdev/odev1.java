public class odev1 {
    public static void main(String[] args) {
        String[] ogrList = {"Kadir" , "Gökhan" , "Hakan" , "Suzan", "Pınar" , "Mehmet" , "Ali" , "Emel" , "Fırat", "James", "Jale" , "Ersin" , "Deniz" , "Gözde" , "Anıl" , "Burak"} ;

        int[] derece = {341 , 273 , 278 , 329 , 445 , 402 , 388 , 270 , 243 , 334 , 412 , 393 , 299 , 343 , 317 , 265} ;

        Maraton sivasMaratonu = new Maraton(ogrList, derece) ;
        sivasMaratonu.ilkUcSırala();
        sivasMaratonu.siniflandirma();
    }
}

class Maraton {
    String[] ogrList ;
    int[] derece ;
    int ogrSayisi ;

    Maraton(String[] ogrList , int[] derece) {
        this.ogrList = ogrList ;
        this.derece = derece ;
        this.ogrSayisi = ogrList.length ;
    }

    void ilkUcSırala() {
        int birinci = 0 , ikinci = 0 , ucuncu = 0 ;

        for (int i = 1; i < derece.length; i++) {
            if (derece[i] < derece[birinci])
                birinci = i ;        
        }

        for (int i = 1; i < derece.length; i++) {
            if (derece[i] < derece[ikinci] && derece[i] > derece[birinci])
                ikinci = i ;
        }

        for (int i = 1; i < derece.length; i++) {
            if (derece[i] < derece[ucuncu] && derece[i] > derece[ikinci])
                ucuncu = i ;
        }

        System.out.println("\nYarışma sonucu Derece Yapanlar:\n");
        System.out.println("Birinci: " + ogrList[birinci] + " - " + derece[birinci] + "'");
        System.out.println("İkinci : " + ogrList[ikinci] + " - " + derece[ikinci] + "'");
        System.out.println("Üçüncü : " + ogrList[ucuncu] + " - " + derece[ucuncu] + "'\n");
    }

    void siniflandirma() {
        int a = 0 ,b = 0 ,c = 0 ;
        for (int i = 0; i < derece.length; i++) {
            if (derece[i] <= 299)
                a++;
            else if (derece[i] <= 399)
                b++ ;
            else 
                c++ ;
        }

        System.out.println("A -> " + a);
        System.out.println("B -> " + b);
        System.out.println("C -> " + c);
        System.out.println();
    }



}