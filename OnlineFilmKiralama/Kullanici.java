package OnlineFilmKiralama;

import java.util.ArrayList;

public class Kullanici {
    private String isim ;
    private String kullaniciIsmi ;
    private double kredi ;
    private boolean aboneMi ;
    private ArrayList<Film> filmList ;


    public Kullanici(String isim, String kullaniciIsmi) {
        this.isim = isim;
        this.kullaniciIsmi = kullaniciIsmi;
        this.kredi = 0;
        this.aboneMi = false;
        filmList = new ArrayList<Film>();
    }

    public void filmEkle(Film film) {
        filmList.add(film);
    }

    public void kullaniciFilmList() {
        System.out.println("Film Listesi; ");
        for (int i = 0; i < filmList.size(); i++) {
            System.out.println("\nFilm İsmi: " + filmList.get(i).getAd());
            System.out.println("Film Yönetmeni: " + filmList.get(i).getYonetmen());
            System.out.println("Film Çıkış Yılı: " + filmList.get(i).getCikisYili());
        }
    }


    public String getIsim() {
        return this.isim;
    }


    public String getKullaniciIsmi() {
        return this.kullaniciIsmi;
    }


    public double getKredi() {
        return this.kredi;
    }

    public void setKredi(double kredi) {
        this.kredi = kredi;
    }

    public void krediYukle(double kredi) {
        this.kredi += kredi ;
    }


    public boolean getAboneMi() {
        return this.aboneMi;
    }

    public void setAboneMi(boolean aboneMi) {
        this.aboneMi = aboneMi;
    }
}
