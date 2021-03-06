package chapter.five;

public class BonusBitManipulationPage25 {

    /*
     * Right propogate the rightmost set bit to 1
     * 01010000 --> 01011111
     */
    public static long rightPropagate(long x){
        //We know x &~(x-1) returns a bitmask
        //of x's lowest bit set to 1. From there, we can iterate
        //xor with a bitmask of all 1s
        System.out.println("X: "+ x + " Binary: "+ Long.toBinaryString(x));
        long lowestOne = x & ~(x-1);
        System.out.println("LowestOne: " + Long.toBinaryString(lowestOne));
        System.out.println("LowestOneShift: " + Long.toBinaryString(lowestOne>>>1));
        while(lowestOne != 0){
            x |= (lowestOne >>>= 1);
            System.out.println(Long.toBinaryString(x));
        }
        System.out.println("Done: "+ Long.toBinaryString(x));
        return x;
    }

    /*
     * Test if x is a power of two
     * 		 * 1, 2, 4, 8 ...
         * 1, 10, 100, 1000
     */
    public static boolean isPowerOfTwo(long x){
        return (x & ~(x-1)) == x;
    }

    /*
     * Compute x modulo a power of two
     * Let's assume the input is a powerOfTwo
     *
     * ~~~~~~~~~NOT COMPLETE ~~~~~~~~~~~~~
     */
    public static long computeModuloPowerTwo(long x, long powOfTwo){
        if(!isPowerOfTwo(powOfTwo))
            return -1;
//		1111 % 1000 = 0111
//		1111 % 0100 = 0011
//		1111 % 0010 = 0001
//		1111 % 0001 = 0000
//		1010 % 0100 = 0010
//		1010 % 0010 = 0000
        return x & (powOfTwo >>>= 1);

    }

    public static void main(String[] args){
        BonusBitManipulationPage25.rightPropagate(64);
        BonusBitManipulationPage25.rightPropagate(1032);


        System.out.println(BonusBitManipulationPage25.isPowerOfTwo(1));
        System.out.println(BonusBitManipulationPage25.isPowerOfTwo(3));
        System.out.println(BonusBitManipulationPage25.isPowerOfTwo(4));
        System.out.println(BonusBitManipulationPage25.isPowerOfTwo(64));
        System.out.println(BonusBitManipulationPage25.isPowerOfTwo(128));
        System.out.println(computeModuloPowerTwo(15, 8));
    }
}
