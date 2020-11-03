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
        System.out.println("[" + red + ", " + green + ", " + blue + "]");
    }

    public void darken(int percent){
        this.red = darkenColor(red, percent);
        this.green = darkenColor(green, percent);
        this.blue = darkenColor(blue, percent);
    }

    public int darkenColor(int color, int percent){
        color = (int) Math.round(color * (1 - (double) percent / 100.0));
        return color;
    }
    
    public int lightenColor(int color, int percent){
        color = (int) Math.round(color * (1 + (double) percent / 100.0));
        return color;
    }

    public void lighten(int percent){
        this.red = lightenColor(red, percent);
        this.green = lightenColor(green, percent);
        this.blue = lightenColor(blue, percent);
    }

    public void random(){
        this.red = rand.nextInt(256);
        this.green = rand.nextInt(256);
        this.blue = rand.nextInt(256);
    }

    public int roundNum(int value){
        if (value > 255){
            return 255;
        } else if (value < 0){
            return 0;
        } else {
            return value;
        }
    }

    public void setRed(int value){
        this.red = roundNum(value);
    }

    public void setGreen(int value){
        this.green = roundNum(value);
    }

    public void setBlue(int value){
        this.blue = roundNum(value);
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