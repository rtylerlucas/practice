//Print tree given n
//
///*
// * Complete the function below.
//
// E.g: N = 6
// 
//     #
//    ##
//   ###
//  ####
// #####
//######    
//
// */
//
//    static void StairCase(int n) {
//
//        String nl = "\n";
//        String space = " ";
//        String pound = "#";
//        int spaces = 0;
//        int pounds = 0;
//        StringBuilder sb;
//        for(int i=0;i<n;i++) {
//            
//            spaces = n-(i+1);
//            pounds = n - spaces;
//            sb = new StringBuilder();;
//            
//            for(int j=0; j<spaces; j++){
//                sb.append(space);
//            }
//            for(int k=0; k<pounds; k++){
//                sb.append(pound);
//            }
//            sb.append(nl);
//            
//            System.out.println(sb.toString());
//        }
//
//    }
