package productscraper;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class WebScraper {

    private static final String DATA = "data";
    private static final String LIST = "list";
    private static final String DEAL_TITLE = "dealTitleMain";
    private static final String DEAL_PRICE = "dealAmount";
    private static final String COMMA = ",";
    private static final String NEWLINE = "\n";

    private WebScraper(){}

    public static void getProducts(String urlString, String fileName){
        try {
            PrintWriter pw = new PrintWriter(new File(fileName));
            String json = getJsonString(urlString);
            if(json==null){
                System.out.println("no page found!");
                return;
            }
            List<Deal> deals = getDeals(json);
            StringBuilder sb = new StringBuilder();
            for(Deal deal: deals){
                sb.append(deal.name);
                sb.append(",");
                sb.append(deal.price);
                sb.append(NEWLINE);
                pw.write(Sanitizer.sanitize(sb.toString()));
                sb = new StringBuilder();
            }
            pw.close();
        } catch (Exception e) {
            System.out.println(String.format("Exception! %s", e));
        }
    }

    private static String getJsonString(String urlToRead) throws Exception {
        StringBuilder result = new StringBuilder();
        URL url = new URL(urlToRead);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String line = rd.readLine();
        System.out.println("line" + line);
        if(line == null || line.isEmpty()){
            System.out.println("null line!");
            return null;
        }
        while (line != null) {
           result.append(line);
           line = rd.readLine();
        }
        rd.close();
        return result.toString();
     }

    private static List<Deal> getDeals(String jsonString) throws JSONException{
        JSONObject obj = new JSONObject(jsonString);
        JSONArray lists = obj.getJSONObject(DATA).getJSONArray(LIST);
        List<Deal> deals = new ArrayList<>();

        for (int i = 0; i < lists.length(); i++)
        {
            String title = lists.getJSONObject(i).getString(DEAL_TITLE);
            int price = lists.getJSONObject(i).getInt(DEAL_PRICE);
            Deal currDeal = new Deal(title, String.valueOf(price));
            deals.add(currDeal);
        }
        return deals;
    }



    public static void main(String[] args){
        //product, price

        String urlToRead = "http://m.search.ticketmonster.co.kr/api/search/deals?keyword=test&page=233333&sort=popular&isDeliveryFree=N";

        try {
           getProducts(urlToRead, "myProductFile.csv");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
