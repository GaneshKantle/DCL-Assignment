package SubString;


//Write a program all the palindrome in substrings from the given string
public class PalindromeSubString {
    public static String reverse(String s){
        String res = "";
        for(int i=0; i<s.length(); i++){
            res += s.charAt(i);
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "malayalam";
        int count = 0;
        for(int i=0; i<s.length(); i++){
            String res = "";
            for(int j=i; j<s.length(); j++){
                if(res.equals(reverse(res))){
                    System.out.println(res);
                }
            }
        }
    }
}
