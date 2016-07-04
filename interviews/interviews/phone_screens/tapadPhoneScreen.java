import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class Solution {
  
  public static int compare(String s1, String s2) {
    
  List<String> cleanOne = sanitize(s1);
  List<String> cleanTwo = sanitize(s2);
  
  //iterate through lists, comparing sections, as soon as one section is > than, return!
    
  int i = 0;
  int j = 0;
    
  while(i < cleanOne.size() && j < cleanTwo.size()) {
     if (Character.isDigit(cleanOne.get(i).charAt(0)) 
         &&  Character.isDigit(cleanTwo.get(j).charAt(0))) {
      
       int res = Integer.compare(Integer.valueOf(cleanOne.get(i)), Integer.valueOf(cleanTwo.get(j)));
       if(res != 0)
          return res;
       
       i++;
       j++;
     }
    
    else {
       int res = cleanOne.get(i).compareTo(cleanTwo.get(j));
       if(res != 0)
          return res;
       
       i++;
       j++;
    }
  }
  //we have a longer list
  if(i < cleanOne.size())
    return 1;
  if(j < cleanTwo.size())
    return -1;
    
  return 0;  
  }
 

public static List<String> sanitize(String str) {
    //iterate across each character, extracting digits!
  StringBuilder sb = new StringBuilder();
  boolean digitSub = true;
  List<String> res = new ArrayList<>();
  
  for(int i = 0; i < str.length(); i++) {
    
    
    //Found a digit
    if(Character.isDigit(str.charAt(i))) {
      
        // digitSequence currently
        if (digitSub) {
          sb.append(str.charAt(i));
        } 
      //non-digitSequence, but found a digit
        else {
            if(!sb.toString().isEmpty()) {
              res.add(sb.toString());
              sb = new StringBuilder();
            }
          digitSub = !digitSub;
          sb.append(str.charAt(i));
        }
        
    } else { 
      if(!digitSub) {
        sb.append(str.charAt(i));
      }
      //digit flag on, need to cut and flip flag
      else {
        if(!sb.toString().isEmpty()) {
          res.add(sb.toString());
          sb = new StringBuilder();
        }
        digitSub = !digitSub;
        sb.append(str.charAt(i));
      }
    }
  }
  return res;
}  
  
  
  public static void main(String[] args) {
     String easyTrueCase = "12";
     String easyTrueCase2 = "2";
    
     String easyMedCase = "1.2.14";
     String easyMedCase2 = "1.2.15";
    
     String easyMedCaseFoo = "1-2-14";
     String easyMedCase2Foo = "1-2-15";
    
     String easyHardCase = "2016J3";
     String easyHardCase2 = "2016T3";
    
    System.out.println(compare(easyTrueCase, easyTrueCase2));
    System.out.println(compare(easyMedCase, easyMedCase2));
    System.out.println(compare(easyMedCaseFoo, easyMedCase2Foo));
    

  }
}

//Natural sorter, when we run into number, compare entire number
// ""
// "1.00.00" < "1.1.1" --> 10000 > 111
// - , . 
// 2016 -Jan- 3 |  2016 -Mar- 1
// "12" < "2" <--- INCORRECT
// 1.7.14 > 1.7.2 <--- CORRECT

//1-7-13 > 1-7-12 ,1713 > 1712 CORRECT

//Sanitize the number
//-------------------
//Take the string given, iterate across each character,
//extract numbers, add to result. Cast result as int,
//compare to other sanitized/casted result.

// comparator int (first, second)