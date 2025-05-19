public class VideoGame {
    private int gamePrice , gameStock ;
    private String gameName , gameType;

    VideoGame(String gameName , int gamePrice , int gameStock , String gameType) {
        this.gameName = gameName;
        this.gamePrice = gamePrice;
        this.gameStock = gameStock;
        this.gameType = gameType;
    }


    public int getGamePrice() {
        return this.gamePrice;
    }

    public void setGamePrice(int gamePrice) {
        this.gamePrice = gamePrice;
    }

    public int getGameStock() {
        return this.gameStock;
    }

    public void setGameStock(int gameStock) {
        this.gameStock = gameStock;
    }

    public String getGameName() {
        return this.gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public GameTypeList getGameType() {
        return GameTypeList.valueOf(this.gameType);
    }

    public void setGameType(String gameType) {
        this.gameType = gameType;
    }

}
