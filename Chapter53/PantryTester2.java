// Exercise 2
public class PantryTester2{
  public static void main (String[] args){
    Jam goose2 = new Jam( "Gooseberry", "7/4/86", 12 );
    Jam apple2 = new Jam( "Crab Apple", "9/30/99", 8 );

    Pantry hubbard2 = new Pantry(goose2, apple2);
    System.out.println(hubbard2);

    if (hubbard2.select(1)){
      hubbard2.spread(2);
    } else {
      System.out.println("Selection not available");
    }
    System.out.println(hubbard2);

    if (hubbard2.select(3)){
      hubbard2.spread(5);
    } else {
      System.out.println("Selection not available");
    }
    System.out.println(hubbard2);
  }
}