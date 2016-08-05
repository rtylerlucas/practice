package bit.manipulation;

public class BitShifting {

    //We have 8 open spaces for cars in our parking lot
    //Why is it 257? I forget, need to re-learn
    public static char carSpaces = 257;

    public static boolean isCarInUse(int index){

        return 1 == ((carSpaces & (1<<index)) >> index);
    }

    public static void setCarInUse(int index){

        carSpaces = (char) (carSpaces | (1<<index));
    }

    public static int boolToInt(boolean boo){
        return boo ? 1 : 0;
    }

    public static boolean intToBoo(int input){

        if(input!=0 || input!=1){
            throw new IllegalArgumentException("input must be either 1 or 0.");
        }

        return (input==1) ?  true : false;

    }

    public static void printBitsInCarSpaces(){
        StringBuilder str = new StringBuilder();

        for(int i=7; i >=0; i --){
            str.append(boolToInt(isCarInUse(i)));
        }

        System.out.println(str.toString());
    }



    public static void main(String[] args){


        printBitsInCarSpaces();
        setCarInUse(6);
        printBitsInCarSpaces();

    }

}
