package interview_questions;

import java.util.ArrayList;
import java.util.List;

public class MergeSortedArrays {

    private MergeSortedArrays() {}

    public static List<Integer> merge(List<Integer> one, List<Integer> two){

        if(one==null||two==null) {
            return null;
        }
        int i = 0;
        int j = 0;
        ArrayList<Integer> result = new ArrayList<>();
        while(i<one.size() && j<two.size()) {
            if(one.get(i) <= two.get(j)) {
                result.add(one.get(i));
                i++;
            }
            else {
                result.add(two.get(j));
                j++;
            }
        }
        while(i<one.size()) {
            result.add(one.get(i));
            i++;
        }
        while(j<two.size()) {
            result.add(two.get(j));
            j++;
        }
        return result;
    }
}
