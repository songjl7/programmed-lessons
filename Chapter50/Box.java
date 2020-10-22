public class Box {
    private double length;
    private double height;
    private double width;

    public Box (double l, double h, double w){
        length = l;
        height = h;
        width = w;
    }
    // Chapter 50 exercise 2
    private double faceArea(){
        return length * height;
    }

    private double sideArea(){
        return height * width;
    }

    private double topArea(){
        return length * width;
    }

    public double area(){
        return 2 * faceArea() + 2 * sideArea()+ 2 * topArea();
    }

    // Chapter 50 exercise 1
    public double volume(){
        return length * height * width;
    }

    public double length(){
        return length;
    }
    
    public double height(){
        return height;
    }

    public double width(){
        return width;
    }

    // Chapter 50 exercise 3
    public Box(Box oldBox){
        this(oldBox.width(), oldBox.height(), oldBox.length());
    }

    // Chapter 50 exercise 4
    public static Box biggerBox(Box oldBox){
        return new Box(1.25*oldBox.width(), 1.25*oldBox.height(), 1.25*oldBox.length());
    }

    public static Box smallerBox(Box oldBox){
        return new Box(0.75*oldBox.width(), 0.75*oldBox.height(), 0.75*oldBox.length());
    }

    // Chapter 50 exercise 5
    public boolean nests(Box outsideBox){
        return (outsideBox.width() > height && outsideBox.height() > height && outsideBox.length() > length);
    }
}