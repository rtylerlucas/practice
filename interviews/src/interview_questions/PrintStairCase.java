package interview_questions;

public class PrintStairCase {
    
    /*
     * Complete the function below.
     */

        public static void stairCase(int n) {

            String nl = "\n";
            String space = " ";
            String pound = "#";
            int spaces = 0;
            int pounds = 0;
            StringBuilder sb;
            for(int i=0;i<n;i++) {
                
                spaces = n-(i+1);
                pounds = n - spaces;
                sb = new StringBuilder();;
                
                for(int j=0; j<spaces; j++){
                    sb.append(space);
                }
                for(int k=0; k<pounds; k++){
                    sb.append(pound);
                }
                
                System.out.println(sb.toString());
            }

        }
        
        public static void main(String[] args) {
            stairCase(6);
        }


}
