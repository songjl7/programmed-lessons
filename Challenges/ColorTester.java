public class ColorTester {
    public static void main(String[] args){
        Color color = new Color();
        System.out.println("Color");
        color.summarize();
        Color myColor = new Color(255, 102, 171);
        System.out.println("My color");
        myColor.summarize();
        Color extremeColor = new Color(0, 0, 0);
        System.out.println("Extreme color");
        extremeColor.summarize();
        Color randomColor = new Color(1, 1, 1);
        System.out.println("Random color");
        randomColor.summarize();

        color.setRed(-100);
        color.setGreen(300);
        color.setBlue(100);
        System.out.println("After setting color values");
        color.summarize();

        randomColor.random();
        System.out.println("After randomizing randomColor");
        randomColor.summarize();

        myColor.darken(10);
        System.out.println("After darkening myColor");
        myColor.summarize();

        color.lighten(10);
        System.out.println("After lightening color");
        color.summarize();

        extremeColor.darken(10);
        System.out.println("After darkening extremeColor");
        extremeColor.summarize();
    }
}