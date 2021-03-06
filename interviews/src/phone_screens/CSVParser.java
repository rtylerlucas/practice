package phone_screens;
//Pal Phone Screen


// This is the text editor interface.
// Anything you type or change here will be seen by the other person in real time.

//ARI,"Arizona, Cardinals",University of Phoenix Stadium,"Glendale,Arizona"
//ARI|Arizona Cardinals|University of Phoenix Stadium|"Glendale,Arizona"
//[["1","2","3","4"], ["1","2","3","4"], ["1","2","3"."4"],]

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.lang.StringBuilder;
//
public class CSVParser {

    private ArrayList<ArrayList<String>> set;
    private static final char COMMA = ',';
    private static final char QUOTE = '\"';
    //Read in file

    public CSVParser(){
        set = new ArrayList<ArrayList<String>>();
    }

    public void parse(){

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input;

        boolean ignore = false;
        try{
            while((input=br.readLine())!=null){
                ArrayList<String> lineSet = new ArrayList<String>();
                int indexOfPrevComma = 0;
                for(int i=0; i<input.length(); i++){

                    char c = input.charAt(i);
                   // System.out.println(c);

                    if(!ignore){

                        if(c==QUOTE){
                            ignore=true;
                        }

                        else if(c==COMMA || i == input.length()-1){
                      //      System.out.println("found a comma!");
                       //     System.out.println(indexOfPrevComma);
                            lineSet.add(input.substring(indexOfPrevComma,i));
                            indexOfPrevComma = i;
                        }

                    }

                    else if(c==QUOTE){
                        ignore = !ignore;
                        if(i == input.length()-1){
                            lineSet.add(input.substring(indexOfPrevComma,i+1));
                        }
                    }

                }
                set.add(lineSet);
             //   System.out.println(input);
               // System.out.println(Arrays.toString(lineSet));

            }
        } catch(IOException e){
                //TODO handle error
        }



    }

    public void printSet(){

        for(ArrayList<String> entry : set){

            StringBuilder res = new StringBuilder();

            for(String str : entry){
                res.append(str);

            }

            System.out.println(res.toString());
        }
    }






    public static void main(String[] args){

        CSVParser parser = new CSVParser();

        parser.parse();
        parser.printSet();
    }

//    public void print()
    //parse each line

            //iteracte across chars,
                // if you see quote, continue, ignore all commas until closing quote
                // if comma, split cell

        //add to data struct

    //execute print function for each object



}
//
//NAME,FULLNAME,HOMEFIELD,LOCATION
//ARI,Arizona Cardinals,University of Phoenix Stadium,"Glendale,Arizona"
//ATL,Atlanta Falcons,Georgia Dome,"Atlanta,Georgia"
//BAL,Baltimore Ravens,M&T Bank Stadium,"Baltimore,Maryland"
//BUF,Buffalo Bills,Ralph Wilson Stadium,"Orchard Park,New York"
//CAR,Carolina Panthers,Bank of America Stadium,"Charlotte,North Carolina"
//CHI,Chicago Bears,Soldier Field,"Chicago,Illinois"
//CIN,Cincinnati Bengals,Paul Brown Stadium,"Cincinnati,Ohio"
//CLE,Cleveland Browns,FirstEnergy Stadium,"Cleveland,Ohio"
//DAL,Dallas Cowboys,Cowboys Stadium,"Arlington,Texas"
//DEN,Denver Broncos,Sports Authority Field at Mile High,"Denver,Colorado"
//DET,Detroit Lions,Ford Field,"Detroit,Michigan"
//GB,Green Bay Packers,Lambeau Field,"Green Bay,Wisconsin"
//HOU,Houston Texans,Reliant Stadium,"Houston,Texas"
//IND,Indinapolis Colts,Lucas Oil Stadium,"Indianapolis,Indiana"
//JAC,Jacksonville Jaquars,EverBank Field,"Jacksonville,Florida"
//KC,Kansas City Chiefs,Arrowhead Stadium,"Kansas City,Missouri"
//MIA,Miami Dolphins,Sun Life Stadium,"Miami Gardens,Florida"
//MIN,Minnesota Vikings,Mall of America Field,"Minneapolis,Minnesota"
//NE,New England Patriots,Gillette Stadium,"Foxborough,Massachusetts"
//NO,New Orleans Saints,Mercedes-Benz Superdome,"New Orleans,Louisiana"
//NYG,New York Giants,MetLife Stadium,"East Rutherford,New Jersey"
//NYJ,New York Jets,MetLife Stadium,"East Rutherford,New Jersey"
//OAK,Oakland,Raiders,O.co Coliseum,"Oakland,California"
//PHI,Philladelphia Eagles,Lincoln Financial Field,"Philadelphia,Pennsylvania"
//PIT,Pittsburgh Steelers,Heinz Field,"Pittsburgh,Pennsylvania"
//SD,San Diego Chargers,Qualcomm Stadium,"San Diego,California"
//SF,San Francisco 49ers,Candlestick Park,"San Francisco,California"
//SEA,"Seattle, Seahawks, roc, ...",CenturyLink Field,"Seattle,Washington"
//STL,St. Lous Rams,Edward Jones Dome,"St. Louis,Missouri"
//TB,Tampa Bay Buccaneers,Raymond James Stadium,"Tampa,Florida"
//TEN,Tennesse Titans,LP Field,"Nashville,Tennessee"
//WAS,Washington Redskins,FedExField,"Landover,Maryland"


//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//        String input;

//output: ARI | Arizona Cardinals | University of Phoenix Stadium | "Glendale, Arizona"
//public void commaToPipe() {
//    Scanner input = new Scanner(System.in);
//    //Go through input until I reach the end
//    while (input.hasNextLine()) {
//        //For every line
//        String curLine = input.nextLine();
//        //Split by commas
//        String[] items = curLine.split(",");
//        //I will have separate items - need to fuse city and state
//        //iterate through array and format with pipes between items
//        StringBuilder output = new StringBuilder();
//        for (int i = 0; i < items.length - 1; i++) {
//            if (i != items.length - 2) {
//                output = output + items[i] + " | ";
//            //Special fusion case
//            } else {
//                output.append(output + items[i] + ", " + items[i + 1]);
//            }
//        }
//        System.out.println(output.toString());
//    }
//}




///link http://www.tutorialspoint.com/java/io/bufferedreader_readline.htm
// https://docs.oracle.com/javase/7/docs/api/java/io/BufferedReader.html
