package interview_questions;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/*
 * Complete the function below.
 *
 * A string chain is produced by taking a given word, and seeing if by removing ONE
 * letter we can produce a smaller word within the array.
 * I think we should sort the array by length of words first. This will make it easier
 * to look back onto previous chains available.
 *
 * We can then iterate, smallest to largest. Each word would be associated with a chainValue.
 * The base case is our smallest word, which is chainLength of 1.
 * If you combo into a previously visited word, we can look up it's chainLength,
 * add it to the current combo, and update our current ChainLength in the map.
 * 
 * We will have a tracker to maintain our longestChain, and return that once we've hit the end.
 */
public class StringChain {
    
    private StringChain() {}
    
    public static int longestChain(String[] words) {

        Arrays.sort(words, new strLengthComparator());
        HashMap<String, Integer> wordChainMap = new HashMap<>(); //maps the word to it's chain length

        //iterate across all words. Update chain length in map.
        int chainLength = 0;
        for(int i = 0; i < words.length; i++) {

            chainLength = 1;
            if(!wordChainMap.containsKey(words[i]))
                wordChainMap.put(words[i], chainLength);

            //base case
            if(words[i].equals(""))
                continue;


            //iterate across each character in word, removing and seeing if word exists.
            checkForSmallerWords(words[i], chainLength, wordChainMap);
        }
        return Collections.max(wordChainMap.values());
    }

    private static void checkForSmallerWords(String word, int chainLength, Map<String, Integer> wordChainMap) {

        String frontHalf = "";
        String backHalf = "";

        for(int j = 0; j < word.length(); j++) {
            frontHalf = "";
            backHalf = "";

            if(j!=0)
                frontHalf = word.substring(0,j);

            if(j!=word.length()-1)
                backHalf = word.substring(j+1, word.length());

            String smallKey = frontHalf+backHalf;

            //If we have seen this smaller word before, then we have found a potential chain
            //We should update our greatestChain map if our currentChain plus what was found is biggest.    
            if(wordChainMap.containsKey(smallKey)){
                if((chainLength + wordChainMap.get(smallKey)) > wordChainMap.get(word)){
                    wordChainMap.put(word, chainLength + wordChainMap.get(smallKey));
                }
            }
        }
    }

    private static class strLengthComparator implements Comparator<String> {
        public int compare(String o1, String o2) {
            return Integer.compare(o1.length(), o2.length());
        }
    }
}
