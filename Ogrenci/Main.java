public class Main {
    public static void main(String[] args) {
        Ogrenci ogrenci1 = new Ogrenci("Ali", "Bilgisayar Müh", 3.48, "104", 2022) ;
        ogrenci1.ogrenciBilgi();

        Ogrenci ogrenci2 = new Ogrenci("Mehmet" , "Makine Müh") ;
        ogrenci2.ogrenciNoOlustur(1980, "107") ;
        ogrenci2.ogrenciBilgi();

        Ogrenci ogrenci3 = new Ogrenci() ;
        ogrenci3.ogrenciNoOlustur(1985, "103") ;
        ogrenci3.ogrenciBilgi();

        Ogrenci ogrenci4 = new Ogrenci("Ayşe" , "Elektrik-Elektronik Müh" , 2.71 , "105" , 1980) ;
        ogrenci4.ogrenciBilgi();

        System.out.println("3.Öğrencinin Harç Ücreti: " + ogrenci3.harcHesapla(2));
        System.out.println("4.Öğrencinin Harç Ücreti: " + ogrenci4.harcHesapla(1 , 7));
    }
}

class Ogrenci {
    private String ad , bolum ;
    private double gano ;
    int girisYili ;
    String soyad ,  bolumKodu , ogrNo;
    public static int ogrenciSayısı = 0 ;
    
    Ogrenci(String ad , String bolum) {
        this.ad = ad ;
        this.bolum = bolum ;
        ogrenciSayısı++ ;
    }

    Ogrenci(Ogrenci ogrenci) {
        ogrenciSayısı++ ;
    }

    Ogrenci(String ad  ,String bolum , double gano , String bolumKodu , int girisYili) {
        this.ad = ad ; 
        this.bolum = bolum ; 
        this.gano = gano ;
        this.bolumKodu = bolumKodu; 
        this.girisYili = girisYili ;
        ogrenciSayısı++ ;
    }

    Ogrenci() {
        ogrenciSayısı++  ;
    }

    public void ogrenciBilgi() {
        System.out.println("OGR-" + ogrenciSayısı + " " + getAd() + " " + getBolum() + " " + ogrenciNoOlustur(this.girisYili, this.bolumKodu) +  " " + getGano());
    }

    public double harcHesapla(int uzatılanYil) {
      return uzatılanYil * 100 ;
    }

    public double harcHesapla(int uzatılanYil , double dersSayısı) {
        return uzatılanYil * 100 * dersSayısı ;
    }

    public String ogrenciNoOlustur(int girisYili , String bolumKodu) {
        this.girisYili = girisYili ;
        this.bolumKodu = bolumKodu;
        String girisSirasi = "001" ;
        return girisYili + bolumKodu + girisSirasi ;
    }

    public String getAd() {
        return this.ad ;
    }

    public void setAd(String ad) {
        this.ad = ad ;
    }

    public String getBolum() {
        return this.bolum ;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum ;
    }

    public double getGano() {
        return this.gano ;
    }

    public void setGano(double gano) {
        try {
            if (gano < 0 || gano > 4) {
                throw new Exception("UYARI!: GANO 0 ile 4 arasında olmalıdır.");
            }
        } catch (Exception n) {
            System.out.println("UYARI!: GANO 0 ile 4 arasında olmalıdır.");
        }
        this.gano = gano ;
    }
}

