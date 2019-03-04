package string.problems;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */

        String wordOne = "Mom"; //is a palindrome
        String wordTwo = "Dad";    // is a palindrome
        String wordThree = "Madam";   // is a palindrome

        System.out.println(wordOne + " is a palindrome: " + isPalindrome(wordOne));
        System.out.println(wordTwo + " is a palindrome: " + isPalindrome(wordTwo));
        System.out.println(wordThree + " is a palindrome: " + isPalindrome(wordThree));
    }

    public static boolean isPalindrome(String word){
        String actualWord = word.toLowerCase();
        String reverseWord = "";

        for(int i = actualWord.length()-1; i>=0; i--){
            reverseWord = reverseWord + actualWord.charAt(i);
        }
        if (actualWord.equals(reverseWord)){
            return true;
        }else{
            return false;
        }
    }
}

