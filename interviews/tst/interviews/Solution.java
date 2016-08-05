package interviews;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * Tapad Technical Phone Screen 6/15/2016
 *
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class Solution {

  public static void main(String[] args) {
    ArrayList<String> strings = new ArrayList<String>();
    strings.add("Hello, World!");
    strings.add("Welcome to CoderPad.");
    strings.add("This pad is running Java 8.");

    int[] arrayTest = {1,2,3,4,5};

    System.out.println(Arrays.toString(arrayTest));

    for (String string : strings) {
      System.out.println(string);
    }
  }
}
