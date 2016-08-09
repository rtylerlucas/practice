package chapter.thirteen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * Write a program that takes in a set of words
 * and returns groups of anagrams for those words.
 *
 * Each group must contain two or more words.
 */
public class ThirteenDotOne {

    /*
     * Iterate across the words, keep a map of sorted word to words.
     */
    public static Set<Set<String>> getAnagramGroups(List<String> words){
        Set<Set<String>> results = new HashSet<Set<String>>();
        Map<String, Set<String>> sortedWords = new HashMap<String, Set<String>>();

        for(String word: words){
            char[] sortedChars = word.toCharArray();
            Arrays.sort(sortedChars);
            String key = String.valueOf(sortedChars);
            if(sortedWords.containsKey(key)){
                sortedWords.get(key).add(word);
            } else{
                HashSet<String> newSet = new HashSet<String>();
                newSet.add(word);
                sortedWords.put(key, newSet);
            }
        }

        for(Set<String> subSet : sortedWords.values()){
            if(subSet.size() > 1){
                results.add(subSet);
            }
        }
        return results;
    }

    public static void printSets(Set<Set<String>> sets){
        for(Set<String> set: sets){
            System.out.println(Arrays.toString(set.toArray()));
        }
    }

    public static void main(String[] args){

        List<String> list = new ArrayList<String>();
        list.add("debitcard");
        list.add("silent");
        list.add("elvis");
        list.add("lives");
        list.add("badcredit");
        list.add("freedom");
        list.add("listen");
        list.add("levis");
        list.add("money");
        printSets(ThirteenDotOne.getAnagramGroups(list));
    }
}
