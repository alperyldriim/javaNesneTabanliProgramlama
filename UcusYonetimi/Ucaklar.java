package UcusYonetimi;

public class Ucaklar {
    private String ucusKimligi ;
    private String ucakTuru ;
    private boolean ucakDurumu ;


    public Ucaklar(String ucusKimligi, String ucakTuru, boolean ucakDurumu) {
        this.ucusKimligi = ucusKimligi;
        this.ucakTuru = ucakTuru;
        this.ucakDurumu = ucakDurumu;
    }


    public String getKimligi() {
        return this.ucusKimligi;
    }


    public String getUcakTuru() {
        return this.ucakTuru;
    }


    public boolean getUcakDurumu() {
        return this.ucakDurumu;
    }
    
}
