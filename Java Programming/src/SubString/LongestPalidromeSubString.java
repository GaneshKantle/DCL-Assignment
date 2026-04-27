package SubString;

public class LongestPalidromeSubString {
    public static String reverse(String s) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            res += s.charAt(i);
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "malayalam";
        String longest = "";
        for (int i = 0; i < s.length(); i++) {
            String res = "";
            for (int j = i; j < s.length(); j++) {
                res += s.charAt(j);
                if (res.equals(reverse(res))) {
                    if (res.length() > longest.length()) {
                        longest = res;
                    }
                }
            }
        }
        System.out.println(longest);
    }
}
