public class PascalsTriangle {
    public static void main(String[] args){
        System.out.println(tri(1,1)); // => 1
        System.out.println(tri(3,2)); // => 3
        System.out.println(tri(5,2)); // => 10
        System.out.println(tri(4,4)); // => 1
    }

    public static int tri(int row, int col){
        if (col == 0) return 1;
        if (row == col) return 1;

        return tri(row - 1, col - 1) + tri(row - 1, col);
    }
}