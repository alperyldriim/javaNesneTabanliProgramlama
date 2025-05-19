package OnlineFilmKiralama;

public class Film {
    private String ad ;
    private int cikisYili ;
    private String yonetmen ;
    private int fiyat = (int) (Math.random() * 200 + 50);


    public Film(String ad, int cikisYili, String yonetmen) {
        this.ad = ad;
        this.cikisYili = cikisYili;
        this.yonetmen = yonetmen;
    }


    public double getFiyat() {
        return this.fiyat;
    }

    public double getKiralamaFiyat() {
        return this.fiyat/4;
    }

    public String getAd() {
        return this.ad;
    }

    public int getCikisYili() {
        return this.cikisYili;
    }

    public String getYonetmen() {
        return this.yonetmen;
    }

}
