public class StringOccurences {
    public static void main(String[] args){
        System.out.println(countChar("XaaaYaaaZaaaYaaaaY", "Y")); // => 3
        System.out.println(countChar("baby", "b")); // => 2
        System.out.println(countChar("aAbBcCc", "c")); // => 2
    }

    public static int countChar(String s, String c){
        if (s.length() <= 0) return 0;

        if (s.substring(0,1).equals(c)) return 1 + countChar(s.substring(1), c);

        return countChar(s.substring(1), c);
    }
}