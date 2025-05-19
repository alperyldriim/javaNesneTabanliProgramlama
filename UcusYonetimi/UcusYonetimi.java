package UcusYonetimi;

public class UcusYonetimi {
    private String ucusKimligi ;
    private HavaAlanı kalkısYeri ;
    private HavaAlanı inisYeri ;
    private String kalkısSaati ;
    private String inisSaati ;
    private Pilot pilot ;
    private Pilot yardımcıPilot ;
    private Ucaklar ucak ;
    private HavaYolu havaYolu ;


    public UcusYonetimi(String ucusKimligi, HavaAlanı kalkısYeri, HavaAlanı inisYeri, String kalkısSaati, String inisSaati, Pilot pilot, Pilot yardımcıPilot, Ucaklar ucak , HavaYolu havaYolu) {
        this.ucusKimligi = ucusKimligi;
        this.kalkısYeri = kalkısYeri;
        this.inisYeri = inisYeri;
        this.kalkısSaati = kalkısSaati;
        this.inisSaati = inisSaati;
        this.pilot = pilot;
        this.yardımcıPilot = yardımcıPilot;
        this.ucak = ucak;
        this.havaYolu = havaYolu ;
    }

    


    public String getUcusKimligi() {
        return this.ucusKimligi;
    }

    public HavaAlanı getKalkısYeri() {
        return this.kalkısYeri;
    }


    public HavaAlanı getInisYeri() {
        return this.inisYeri;
    }


    public String getKalkısSaati() {
        return this.kalkısSaati;
    }



    public String getInisSaati() {
        return this.inisSaati;
    }


    public Pilot getPilot() {
        return this.pilot;
    }


    public Pilot getYardımcıPilot() {
        return this.yardımcıPilot;
    }


    public Ucaklar getUcak() {
        return this.ucak;
    }

    public HavaYolu getHavaYolu() {
        return havaYolu;
    }

    public void getInfo() {
        System.out.println("HavaYolu Şirketi Bilgileri; ");
        System.out.println("HavaYolu Şirketi İsmi: " + getHavaYolu().getIsim());
        System.out.println("HavaYolu Şirketi Kimliği: " + getHavaYolu().getKimlik());
        System.out.println("Uçuş Kimliği: " + getUcusKimligi());
        System.out.println("Kalkış Yeri: " + getKalkısYeri().getName());
        System.out.println("İniş Yeri: " + getInisYeri().getName());
        System.out.println("Pilot: " + getPilot().getAd());
        System.out.println("Yardımcı Pilot: " + getYardımcıPilot().getAd());
        System.out.println("Uçak Türü: " + getUcak().getUcakTuru());
        System.out.println("Uçak Kimliği: " + getUcak().getKimligi());
    }

}
