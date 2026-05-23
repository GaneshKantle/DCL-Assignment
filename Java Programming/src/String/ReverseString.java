package String;

//write a program to reverse the given string
public class ReverseString {
    public static void main(String[] args) {
        String s = "ganesh";
        String res = "";

        //METHOD 1:
        for (int i = 0; i < s.length(); i++) {
            res = s.charAt(i) + res;
        }
        System.out.println("Input:"+s+" Output:"+res);

        //METHOD 2:
        for (int i = s.length()-1; i <=0; i--) {
            res = res + s.charAt(i) ;
        }
        System.out.println("Input:"+s+" Output:"+res);
    }
}
