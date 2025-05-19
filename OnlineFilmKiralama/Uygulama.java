package OnlineFilmKiralama;

import java.util.ArrayList;


public class Uygulama {
    private String ismi ;
    private ArrayList<Film> filmList ;


    public Uygulama(String ismi) {
        this.ismi = ismi;
        this.filmList = new ArrayList<Film>();
    }

    

    public void filmList() {
        System.out.println("Film Listesi; ");
        for (int i = 0; i < filmList.size(); i++) {
            System.out.println("\nFilm İsmi: " + filmList.get(i).getAd());
            System.out.println("Film Yönetmeni: " + filmList.get(i).getYonetmen());
            System.out.println("Film Çıkış Yılı: " + filmList.get(i).getCikisYili());
        }
    }

    public void filmEkle(Film film) {
        filmList.add(film);
    }

    public void aboneOl(Kullanici kullanici) {
        System.out.println(kullanici.getIsim() + " (" + kullanici.getKullaniciIsmi() + ") Uygulamaya abone oldu!");
        kullanici.setAboneMi(true);
    }

    public void filmTalepEt(String ad, int cikisYili, String yonetmen) {
        Film yenifilm = new Film(ad , cikisYili, yonetmen);
        System.out.println("İstenilen film talep edildi en yakın sürede uygulamamızda olucaktır!");
        filmList.add(yenifilm) ;
    }

    public void filmKirala(Kullanici kullanici, Film film) {  
        System.out.println("Film Kiralama fiyatı   : " + film.getKiralamaFiyat());
        System.out.println("Kullanıcı Kredi Miktarı: " + kullanici.getKredi());
        if(kullanici.getAboneMi()) {
            if (film.getKiralamaFiyat() <= kullanici.getKredi()) {
                System.out.println("İstenilen Film 1 aylığına Kiralandı");
                kullanici.setKredi(kullanici.getKredi()-film.getKiralamaFiyat());
                System.out.println("Kalan Kredi Miktarı: " + kullanici.getKredi());
                kullanici.filmEkle(film);
            }else {
                System.out.println("Kredi Miktarınız Yeterli Değil!");
                System.out.println("İstenilen Film Kiralanamadı!");
            }
            
        } else {
            System.out.println("Uygulamaya Abone Değilsiniz!");
            System.out.println("İstenilen Film Kiralanamadı!");
        }
    }

    public void filmSatinAl(Kullanici kullanici, Film film) {
        System.out.println("Film fiyatı  : " + film.getFiyat());
        System.out.println("Kredi Miktarı: " + kullanici.getKredi());
        if(film.getFiyat() <= kullanici.getKredi()) {
            System.out.println("İstenilen Film Satın Alındı");
            kullanici.setKredi(kullanici.getKredi()-film.getFiyat());
            System.out.println("Kalan Kredi Miktarı: " + kullanici.getKredi());
            kullanici.filmEkle(film);
        } else {
            System.out.println("Kredi Miktarınız Yeterli Değil!");
            System.out.println("İstenilen Film Satın Alınamadı!");
        }
    }
}
