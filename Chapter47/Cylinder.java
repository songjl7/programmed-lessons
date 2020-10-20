public class Cylinder {
    // Instance variables
    private double radius;
    private double height;

    // Constructor
    public Cylinder(double rad, double hei){
        radius = rad;
        height = hei;
    }

    // Methods
    public double volume(){
        return Math.PI * radius * radius * height;
    }

    public double surface(){
        return (2 * Math.PI * radius * radius) + (2 * Math.PI * radius * height);
    }
}