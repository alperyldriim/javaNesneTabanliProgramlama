package OnlineFilmKiralama;

public class Main {
    public static void main(String[] args) {
        Uygulama app = new Uygulama("Blu TV");
        Kullanici alper = new Kullanici("Alper" , "alperyldriim") ;
        Film film1 = new Film("Çakallarla dans", 2016, "Murat Gün");
        Film film2 = new Film("Recep İvedik", 2009, "Şahan Gökbahar");
        Film film3 = new Film("Mandıra Filozofu", 2014, "Müfit Can Saçıntı");

        app.filmEkle(film1);
        app.filmEkle(film2);
        app.filmEkle(film3);

        alper.krediYukle(287);
        app.filmSatinAl(alper, film3);

        app.filmList();


    }
}
