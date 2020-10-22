public class Box {
    private double length;
    private double height;
    private double width;

    public Box (double l, double h, double w){
        length = l;
        height = h;
        width = w;
    }

    public double area(){
        return 2 * (length * width + length * height + width * height);
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