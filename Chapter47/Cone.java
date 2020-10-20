public class Cone {
    // instance variables
    private double height;
    private double radius;

    // constructor
    public Cone(double rad, double hei){
        radius = rad;
        height = hei;
    }

    // methods
    public double volume(){
        return Math.PI*radius*radius*height / 3.0;
    }

    public double area(){
        return Math.PI*radius*(radius + Math.sqrt(height*height + radius*radius));
    }

    public double slant(){
        return Math.sqrt(radius*radius + height*height);
    }

    public double angle(){
        return Math.atan(radius/height);
    }
}