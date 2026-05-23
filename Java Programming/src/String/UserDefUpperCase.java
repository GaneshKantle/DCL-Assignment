package String;

public class UserDefUpperCase {

    public static String toUpperCasee(String s) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 97 && ch <= 122) {
                int n_asci = ch - 32;
                char n_char = (char) (n_asci);
                res += n_char;
            } else {
                res += ch;
            }
        }


        return res;
    }

    public static void main(String[] args) {
        String s = "gAnEsH";
        String res = toUpperCasee(s);
        System.out.println(res);

    }
}



