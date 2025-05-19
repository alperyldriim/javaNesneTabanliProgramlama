package UcusYonetimi;

public class Pilot {
    private String kimlik ;
    private String ad ;
    private int deneyimSuresi ;


    public Pilot(String kimlik, String ad, int deneyimSuresi) {
        this.kimlik = kimlik;
        this.ad = ad;
        this.deneyimSuresi = deneyimSuresi;
    }


    public String getKimlik() {
        return this.kimlik;
    }


    public String getAd() {
        return this.ad;
    }


    public int getDeneyimSuresi() {
        return this.deneyimSuresi;
    }



}
