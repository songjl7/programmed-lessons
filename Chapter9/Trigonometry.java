public class Trigonometry{
    public static void main(String[] args){
        double sinx = Math.sin(0.5236);
        double cosx = Math.cos(0.5236);
        double total = sinx*sinx + cosx*cosx;
        System.out.println("sine: " + sinx + " cosine: " + cosx + " sum of squares: " + total);
    }
}