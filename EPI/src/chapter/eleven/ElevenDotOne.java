package chapter.eleven;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
/*
 * Given a list of sorted arrays, merge those arrays into one single sorted list
 */
public class ElevenDotOne {

    private static final int INITIAL_CAPACITY = 16;
    public static List<Integer> mergeSortedArrays(List<List<Integer>> sortedArrays){
        @SuppressWarnings("unchecked")
        PriorityQueue<ArrayEntry> minHeap = new PriorityQueue<ArrayEntry>(INITIAL_CAPACITY, new Comparator<ArrayEntry>(){
            public int compare(ArrayEntry o1, ArrayEntry o2){
                return Integer.compare(o1.value,  o2.value);
            }
        });
        List<Integer> heads = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        //instantiate the heap with first element from each array
        for(int i = 0; i < sortedArrays.size(); i ++){
            minHeap.add(new ArrayEntry(sortedArrays.get(i).get(0), i));
            heads.add(0);
        }
        //While we've got something to work with,
        // take first element, increment the list that it came from,
        // add next element from that list to heap (if that list not empty).
        while(!minHeap.isEmpty()){
            System.out.println(Arrays.toString(minHeap.toArray()));
            ArrayEntry current = minHeap.poll();
            int currHeadIndex = heads.get(current.arrayId);
            if(currHeadIndex + 1 < sortedArrays.get(current.arrayId).size()){
                minHeap.add(new ArrayEntry(sortedArrays.get(current.arrayId).get(currHeadIndex + 1), current.arrayId));
                heads.set(current.arrayId, currHeadIndex+1);
            }
            result.add(current.value);
        }
        return result;
    }
    
    public static void main(String[] args){
        ArrayList<Integer> one = new ArrayList<>();
        one.add(1); one.add(3); one.add(5);
        ArrayList<Integer> two = new ArrayList<>();
        two.add(2); two.add(4); two.add(6);
        List<List<Integer>> list = new ArrayList<>();
        list.add(one); list.add(two);
        List<Integer> res = ElevenDotOne.mergeSortedArrays(list);
        for(int i = 0; i < res.size(); i++){
            System.out.println(res.get(i));
        }
    }
}
