package odev5;

public abstract class Plant implements IPlantActions {
    private String name ;
    private int growthTime , day = 0;
    private boolean isHarvestable ;

    Plant(String name , int growthTime) {
        this.name = name;
        this.growthTime = growthTime;
        isHarvestable = false ;
    }

    
    public String getName() {
        return name;
    }


    public int getGrowthTime() {
        return growthTime;
    }

    public abstract void grow() ;

    public boolean isIsHarvestable() {
        return isHarvestable;
    }


    public void setIsHarvestable(boolean isHarvestable) {
        this.isHarvestable = isHarvestable;
    }

}
