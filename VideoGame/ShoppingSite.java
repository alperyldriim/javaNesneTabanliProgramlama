public class ShoppingSite {
    private String name ;
    int totalGameStock ;
    private int videoGameCount = 0 ;
    private VideoGame[] videoGameList;


    ShoppingSite(String name , int totalGameStock) {
        this.name = name;
        videoGameList = new VideoGame[totalGameStock] ;
    }

    public String getStoreName() {
        return name;
    }

    void addVideoGame(VideoGame gameName) {
        videoGameList[videoGameCount++] = gameName;
    }

    void gamePrint() {
        for (int i = 0 ; i < videoGameCount; i++) {
            System.out.println("\nName Of The Game : " + videoGameList[i].getGameName());
            System.out.println("Price Of The Game: $" + videoGameList[i].getGamePrice());
            System.out.println("Type Of The Game : " + videoGameList[i].getGameType());
            System.out.println("Total Game Stock Of The Shopping Site: " + videoGameList[i].getGameStock());
        } 
    }
}
