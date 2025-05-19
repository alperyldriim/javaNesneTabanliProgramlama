package UcusYonetimi;

import java.util.ArrayList;
import java.util.List;

public class HavaYolu {
    private String isim ;
    private String kimlik ;
    private List<Ucaklar> ucaklar ;
    private List<Pilot> pilotlar ;


    public HavaYolu(String isim, String kimlik) {
        this.isim = isim;
        this.kimlik = kimlik;
        this.ucaklar = new ArrayList<>();
        this.pilotlar = new ArrayList<>();
    }


    public String getIsim() {
        return this.isim;
    }

    public String getKimlik() {
        return this.kimlik;
    }

    public List<Ucaklar> getUcaklar() {
        return this.ucaklar;
    }

    public void ucakEkle(Ucaklar ucak) {
        this.ucaklar.add(ucak) ;
    }

    public List<Pilot> getPilotlar() {
        return this.pilotlar;
    }

    public void pilotEkle(Pilot pilot) {
        this.pilotlar.add(pilot);
    }

}