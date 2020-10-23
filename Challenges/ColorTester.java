public class ColorTester {
    public static void main(String[] args){
        Color color = new Color();
        System.out.println(color);
        Color myColor = new Color(255, 102, 171);
        System.out.println(myColor);

        color.setRed(-100);
        color.setGreen(300);
        color.setBlue(100);
        System.out.println(color);

        myColor.darken(10);
        color.lighten(10);
    }
}