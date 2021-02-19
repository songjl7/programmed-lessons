public class RemoveVowels {
    public static void main(String[] args){
        System.out.println(removeV("AUDIOBOOK")); // DBK
        System.out.println(removeV("counterrevolutionaries")); //cntrrvltnrs

    }

    public static boolean isAVowel(String letter){
        if (letter.length() != 1) return false;

        return letter.toLowerCase().matches("[aeiou]"); 
    }

    public static String removeV(String s){
        if (s.length() == 0) return s;

        String l = s.substring(0,1);

        return isAVowel(l) ? removeV(s.substring(1)) : l + removeV(s.substring(1));
    }
}