public class Box {
    private double length;
    private double height;
    private double width;

    public Box (double l, double h, double w){
        length = l;
        height = h;
        width = w;
    }

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
}