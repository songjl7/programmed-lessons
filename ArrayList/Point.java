import java.util.*;

public class Point {
    private double x;
    private double y;

    // constructors
    public Point(){
        this.x = 0;
        this.y = 0;
    }

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    // getters
    public double getX(){ return this.x; }
    public double getY() { return this.y; }

    // methods
    public String toString(){ return "(" + this.x + ", " + this.y + ")"; }

    public static Point midPoint(Point a, Point b){
        return new Point((a.getX()+b.getX())/2, (a.getY()+b.getY())/2);
    }
    
}