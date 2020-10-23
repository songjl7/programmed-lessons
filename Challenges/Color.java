import java.util.Random;

public class Color{
    Random rand = new Random();
    private int red;
    private int green;
    private int blue;

    public Color(){
        this.red = rand.nextInt(256);
        this.green = rand.nextInt(256);
        this.blue = rand.nextInt(256);
    }

    public Color(int red, int green, int blue){
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public void summarize(){
        System.out.println(toString());
    }

    public String toString(){
        return "[" + red + ", " + green + ", " + blue + "]";
    }

    public void darken(int percent){
        this.red = (int) Math.round(red * (1 - (double)percent / 100.0));
        this.green = (int) Math.round(green * (1 - (double)percent / 100.0));
        this.blue = (int) Math.round(blue * (1 - (double)percent / 100.0));
        summarize();
    }

    public void lighten(int percent){
        this.red = (int) Math.round(red * (1 + (double)percent / 100.0));
        this.green = (int) Math.round(green * (1 + (double)percent / 100.0));
        this.blue = (int) Math.round(blue * (1 + (double)percent / 100.0));
        summarize();
    }

    public void random(){
        this.red = rand.nextInt(256);
        this.green = rand.nextInt(256);
        this.blue = rand.nextInt(256);
    }

    public void setRed(int value){
        if (value > 255){
            this.red = 255;
        } else if (value < 0){
            this.red = 0;
        } else {
            this.red = value;
        }
    }

    public void setGreen(int value){
        if (value > 255){
            this.green = 255;
        } else if (value < 0){
            this.green = 0;
        } else {
            this.green = value;
        }
    }

    public void setBlue(int value){
        if (value > 255){
            this.blue = 255;
        } else if (value < 0){
            this.blue = 0;
        } else {
            this.blue = value;
        }
    }

    public int getRed(){
        return this.red;
    }

    public int getGreen(){
        return this.green;
    }

    public int getBlue(){
        return this.blue;
    }
}