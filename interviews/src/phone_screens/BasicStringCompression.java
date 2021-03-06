package phone_screens;

public class BasicStringCompression {

    /*
     *String compression - use the counts of repeated characters
     *For example, aabcccccaaa = a2b1c5a3
     *If the length of your new compressed string is longer than your original, return the original
     */
     /*
      * Iterate through the string by chars, keep track of curr char
      * when you find a new char, append previous char and count to result
      *
      * At the end, return min(original, result)
      */
     public static String compress(String str){

         if(str==null){
             return null;
         }

         int currCount = 1;
         char curr = str.charAt(0);

         StringBuilder res = new StringBuilder();

         for(int i = 1 ; i < str.length(); i ++){

             if(str.charAt(i)==curr){
                 currCount++;
             }
             else {
                 res.append(curr);
                 res.append(currCount);
                 currCount = 1;
                 curr = str.charAt(i);
             }
         }

         res.append(curr);
         res.append(currCount);

         int smallest = Math.min(str.length(), res.toString().length());

         return (str.length()==smallest) ? str : res.toString();
     }

     public static void main(String[] args){


     }
}
