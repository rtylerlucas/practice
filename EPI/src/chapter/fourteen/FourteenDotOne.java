package chapter.fourteen;

import java.util.ArrayList;
import java.util.List;
/*
 * Given two sorted arrays, find the intersections, do not include duplicates.
 */
public class FourteenDotOne {

    /*
     * Iterate across both arrays, moving the smaller one forward, adding to set if they are the
     * same value.
     */
    public static List<Integer> getIntersection(List<Integer> a1, List<Integer> a2){
        int i = 0;
        int j = 0;
        List<Integer> result = new ArrayList<Integer>();
        while(i < a1.size() && j < a2.size()){
            if(a1.get(i)==a2.get(j)){
                if(!result.contains(a1.get(i))){
                    result.add(a1.get(i));
                }
                i++;
                j++;
            } else if(a1.get(i) < a2.get(j)){
                i++;
            } else {
                j++;
            }
        }
        return result;
    }

    public static void main(String[] args){
        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(1);
        l1.add(2);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l1.add(25);

        List<Integer> l2 = new ArrayList<Integer>();
        l2.add(0);
        l2.add(2);
        l2.add(2);
        l2.add(22);
        l2.add(24);
        l2.add(25);

        for(Integer i : FourteenDotOne.getIntersection(l1, l2)){
            System.out.println(i);
        }
    }
}
