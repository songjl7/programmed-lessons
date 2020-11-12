public class TileTester {
    public static void main(String[] args){
        Tile zTile = new Tile();
        System.out.println(zTile.printTile());

        Tile myTile = new Tile('L', 1);
        System.out.println(myTile.printTile());
    }
}