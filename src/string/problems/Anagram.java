package string.problems;
import java.io.*;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by mrahman on 04/22/17.
 */
public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".

        char string1[] = {'a', 'c', 't'};
        char string2[] = {'c', 'a', 't'};
        if (areAnagram(string1, string2))
            System.out.println("The two strings are anagrams");
        else
            System.out.println("The two strings are NOT anagrams");
    }
    static boolean areAnagram(char[] string1, char[] string2) {
        int n1 = string1.length;
        int n2 = string2.length;

        if (n1 != n2)
            return false;

        Arrays.sort(string1);
        Arrays.sort(string2);

        for (int i = 0; i < n1; i++)
            if (string1[i] != string2[i])
                return false;
        return true;
    }
}