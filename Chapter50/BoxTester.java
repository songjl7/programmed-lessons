public class BoxTester {
    public static void main(String[] args){
        Box box = new Box(2.5, 5.0, 6.0);

        System.out.println("Area: " + box.area() + "\tVolume: " + box.volume() + "\nLength: " + box.length() + "\tWidth: " + box.width() + "\tHeight: " + box.height());
    }
}