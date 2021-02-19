public class MatchingQ {
    public static void main(String[] args){
        System.out.println(match("MOON","M??N")); // => true
        System.out.println(match("W?zar?","?izard")); // => true
        System.out.println(match("???","???")); // => true
        System.out.println(match("???","????")); // => false
        System.out.println(match("ruby???","????red")); // => true
    }
    
    public static boolean match(String a, String b){
        if (a.length() != b.length()) return false;
        if (a.length() == 0 && b.length() == 0) return true;
        if ((a.charAt(0) == b.charAt(0)) || (a.charAt(0) == '?') || ((b.charAt(0) == '?'))) return match(a.substring(1), b.substring(1));

        return false;
    }
}