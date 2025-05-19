package odev5;

public class TomatoPlant extends Plant {
    private int waterLevel ;

    TomatoPlant(String name, int growthTime) {
        super(name, growthTime);
        waterLevel = 1 ;
    }

    @Override
    public void grow() {
        System.out.println(getName() + " bitkisi büyüyor. Büyüme oranı " + waterLevel + "/" + getGrowthTime());
    }

    @Override
    public void water() {
        System.out.println(getName() + " bitkisi Sulanıyor.");
    }

    @Override
    public void harvest() {
        if (waterLevel++ != getGrowthTime()){
            System.out.println(getName() + " bitkisi hasatlanmak için hazır değil.");
        } else {
            waterLevel = 1 ;
            System.out.println(getName() + " bitkisi hasatlanmak için hazır .");
            System.out.println(getName() + " bitkisi hasatlanıyor.Tebrikler!");
        }
    }
    
}
