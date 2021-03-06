package chapter.five;

/*
 * Compute the parity of a word.
 *
 * The parity of a binary word is 1 if the number of 1s in
 * the word is odd; otherwise, it is 0.
 *
 * Usage: Parity checks are used to detect single bit errors in
 * data storage and communication.
 *
 * Compute the parity of a single 64-bit word.
 *
 * 1101  --> 1
 * 1100  --> 0
 */
public class FiveDotOne {

    private FiveDotOne() {}

    /*
     * O(n) solution: Iterate through each bit,
     * if you find a 1, flip the result short.
     */
    public static short computeParity(long x){
        short result = 0;
        while(x!=0){
            result ^= (x & 1);
            System.out.println(Long.toBinaryString(x));
            x >>>= 1;
        }
        return result;
    }

    public static void main(String[] args){
        // 11 --> 0
        System.out.println(FiveDotOne.computeParity(3));

        // 100 --> 1
        System.out.println(FiveDotOne.computeParity(4));
    }

}
