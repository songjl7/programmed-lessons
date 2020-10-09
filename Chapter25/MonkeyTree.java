public class MonkeyTree {
    public static void main(String[] args){
        for (int i = 5; i >= 0; i--){
            String num;
            if (i == 5){
                num = "Five little monkeys";
            } else if (i == 4){
                num = "Four little monkeys";
            } else if(i == 3){
                num = "Three little monkeys";
            } else if(i == 2){
                num = "Two little monkeys";
            } else if(i == 1){
                num = "One little monkey";
            } else {
                num = "No little monkeys";
            }
            System.out.println(num + " swinging in a tree\nTeasing Mr. Crocodile \"You can't catch me\"\nAlong came the corocodile as quiet as can be\nand SNAP!\n");
        }
    }
}