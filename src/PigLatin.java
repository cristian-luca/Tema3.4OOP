
public class PigLatin {
    public static Boolean isVowel(char c) {
        if (c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' ||
                c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U') {
            return true;
        } else {
            return false;
        }
    }

    public static String findPigLatin(String inp) {
        String pigL;
        int i;

        for (i = 0; i < inp.length(); i++) {
            if (isVowel(inp.charAt(i))) {
                break;
            }
        }

        if (i == inp.length()) {
            return "";
        }

        pigL = inp.substring(i);
        pigL += inp.substring(0, i);
        pigL = pigL + "ay";

        return pigL;
    }

}
