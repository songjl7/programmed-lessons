public class NewString {
    public static void main (String[] args){
        String one = new String("    I like    Cheerios     ");
        String two;
        // .trim() cuts off the tabs/spaces at the beginning and end of strings
        two = one.trim();
        System.out.println(one);
        System.out.println(two);
    }
}