package UcusYonetimi;

public class HavaAlanı {
    private String name;
    private String kimlik ;


    public HavaAlanı(String name, String kimlik) {
        this.name = name;
        this.kimlik = kimlik;
    }


    public String getName() {
        return this.name;
    }


    public String getKimlik() {
        return this.kimlik;
    }
    
}
