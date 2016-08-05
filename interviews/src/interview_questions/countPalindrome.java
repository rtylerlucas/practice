package interview_questions;

public class countPalindrome {

    //Given a string, count how many palindromes

    public static int countPalindromes(String str){

        //take string, extract & sanitize words
        //for each word, check if palindrome
        //If palindrome, increment count
        //return count
        int count = 0;

        if(str==null || str.isEmpty()){
            return -1;
        }

        String[] words = getWords(str);

        for(String word : words){
            if(isPalindrome(word)){
                count++;
            }
        }
        return count;

    }

    private static boolean isPalindrome(String str){

        //iterate fwd and backwards through string
        //while fwd is less than backward
        //if all matches, return true, else return  false

        int i = 0;
        int j = str.length()-1;

        while(i<j){
            if(!(str.charAt(i)==str.charAt(j)))
                return false;
            i++;
            j--;
        }
        return true;
    }

    private static String[] getWords(String sentance){
        return sentance.split(" ");

    }
}
