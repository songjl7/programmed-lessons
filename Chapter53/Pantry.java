public class Pantry {
  // Instance Variables
  private Jam  jar1;
  private Jam  jar2;
  private Jam  jar3;
  private Jam  selected;

  // Constructors
  Pantry(Jam jar1, Jam jar2, Jam jar3){
    this.jar1 = jar1;
    this.jar2 = jar2;
    this.jar3 = jar3;
    selected = null;
  }
  
  // Exercise 2, add <3 jams
  Pantry(Jam jar1, Jam jar2){
    this.jar1 = jar1;
    this.jar2 = jar2;
    this.jar3 = null;
    selected = null;
  }

  Pantry(Jam jar1){
    this.jar1 = jar1;
    this.jar2 = null;
    this.jar3 = null;
    selected = null;
  }

  // Methods
  public String toString(){
    String str = "";
    if (jar1 != null) str += "1: " + jar1.toString() + "\n";
    if (jar2 != null) str += "2: " + jar2.toString() + "\n";
    if (jar3 != null) str += "3: " + jar3.toString() + "\n";     
    return str;
  }

  // assume that the user entered a correct selection, 1, 2, or 3
  public boolean select(int jarNumber){
    if (jarNumber == 1){
        if (jar1 != null){
          selected =  jar1;
          return true;
        }
      } else if (jarNumber == 2){
        if (jar2 != null){
          selected = jar2;
          return true;
        }
        return false;
      } else {
          if (jar3 != null){
            selected = jar3;
            return true;
          }
          return false;
      }
    return false;
  }

  // spread the selected jam
  public void spread(int oz){
    selected.spread(oz);
  }

  // Exercise 3, add replace() method
  public void replace(Jam j, int slot){
    if (slot == 1){
      jar1 = j;
    } else if (slot == 2){
      jar2 = j;
    } else if (slot == 3){
      jar3 = j;
    }
  }

  // Exercise 4, add mixedFruit() method
  public void mixedFruit(){
    int amtTotal = jar1.amtJam()  + jar2.amtJam() + jar3.amtJam();
    jar1 = new Jam("Mixed fruit", jar1.getDate(), amtTotal);
    jar2 = null;
    jar3 = null;
  }
}