package chapter.seven;

/*
 * Interconvert strings to integers
 *
 * Write a method that accepts a string, and returns
 * the integer encoded within the string.
 * "123" -> 123
 */
public class SevenDotOne {

    private SevenDotOne(){}

    public static int strToInt(String str){
        int res = 0;
        for(int i = 0; i < str.length(); i ++){
            res += Math.pow(10, i) * (str.charAt((str.length()-1)-i) - '0');
        }
        return res;
    }

    public static String intToStr(int in){
        boolean isNegative = false;
        if(in < 0){
            in = -in;
            isNegative = true;
        }
        StringBuilder res = new StringBuilder();
        while(in != 0){
            res.append((char)('0' + in % 10));
            in /= 10;
        }
        if(isNegative)
            res.append('-');
        return res.reverse().toString();
    }

    public static void main(String[] args){
        System.out.println(SevenDotOne.strToInt("123"));
        System.out.println(SevenDotOne.intToStr(123));
        System.out.println(SevenDotOne.intToStr(-123));
        char x = '0' + 422 % 10;
        System.out.println(x);
        System.out.println((char)('0' + 422 % 10));
    }


}
