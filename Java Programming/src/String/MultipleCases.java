package String;

public class MultipleCases {
    public static String toUpperCasee(String s) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 97 && ch <= 122) {
                int n_asci = ch - 32;
                char n_char = (char) (n_asci);
                res += n_char;
            } else if(ch >= 65 && ch <= 90){
                int n_asci = ch + 32;
                char n_char = (char) (n_asci);
                res += n_char;
            }
            else if(Character.isDigit(ch)){
                res=res+"@";
            }

            //We have nbuilt method called isDigit which is present in Character class and return type is boolean.

            else if (ch == 32) {
                res=res;
            }else {
                res+=" ";
            }
        }


        return res;
    }

    public static void main(String[] args) {
        String s = "56gAn 89E+=s H";
        String res = toUpperCasee(s);
        System.out.println(res);

    }
}
