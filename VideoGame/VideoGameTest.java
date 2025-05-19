public class VideoGameTest {
    public static void main(String[] args) {
        ShoppingSite shop = new ShoppingSite("Game Center" , 3) ;
        String shopName = shop.getStoreName() ;
        System.out.println("Name Of The Game Store: " + shopName);

        VideoGame game1 = new VideoGame("The Last OF Us 1" , 100 , 150 , "Adventure") ;

        VideoGame game2 = new VideoGame("PUBG Mobile" , 10 , 1500 , "Fighting") ;

        VideoGame game3 = new VideoGame("Car Drive" , 20 , 250 , "Racing") ;

        shop.addVideoGame(game1);
        shop.addVideoGame(game2);
        shop.addVideoGame(game3);

        shop.gamePrint();
    }
    
}