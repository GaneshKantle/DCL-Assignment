package SubString;

import java.util.*;

//write a program to print all the substrings from the given strings where it should print the set(Non Duplicates)
public class NonDuplicatePalindromeSubstring {

    public static void main(String[] args) {
        String s = "hello";
        int max =0 ;
        Set<String> set =  new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                set.add(s.substring(i, j + 1));
                if(s.length() > max){

                }
            }
        }
        System.out.println(set);
    }
}

