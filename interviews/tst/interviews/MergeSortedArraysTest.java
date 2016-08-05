package interviews;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import interview_questions.MergeSortedArrays;

public class MergeSortedArraysTest {

    public static ArrayList<Integer> unsortedOne = new ArrayList<>();
    public static ArrayList<Integer> unsortedTwo = new ArrayList<>();

    @Before
    public void setUp() {
        unsortedOne.add(1);
        unsortedOne.add(2);
        unsortedOne.add(3);
        unsortedOne.add(6);
        unsortedOne.add(8);
        unsortedOne.add(10);
        unsortedOne.add(12);

        unsortedTwo.add(0);
        unsortedTwo.add(4);
        unsortedTwo.add(5);
        unsortedTwo.add(7);
        unsortedTwo.add(9);
        unsortedTwo.add(11);


    }

    @Test
    public void testMerge() {
        System.out.println(MergeSortedArrays.merge(unsortedOne, unsortedTwo));
    }
}
