public class Tile{
    private char letter;
    private int value;

    public Tile(){
        this.letter = 'Z';
        this.value = 10;
    }

    public Tile(char letter, int value){
        this.letter = letter;
        this.value = value;
    }

    public String printTile(){
        return "Letter: " + letter + "\tValue: " + value;
    }
}