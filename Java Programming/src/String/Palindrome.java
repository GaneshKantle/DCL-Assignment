package String;

public class Palindrome {
    public static void main(String[] args) {
        String name = "malayalam";
        String res = "";

        for (int i = 0; i < name.length(); i++) {
            res += name.charAt(i);
        }

        if (name.equals(res)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

    }
}
