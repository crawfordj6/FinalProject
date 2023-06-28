
import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alec
 */
public class angelMeaning {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        //Fetches webpage
        Document doc = Jsoup.connect("https://www.rd.com/article/angel-numbers-meaning/").get();
       
        String title = doc.title();
        String text = doc.body().text();
        //String linkInnerH = link.html(); // "<b>example</b>"
        String allInfo ;
        
            
        Elements divs = doc.select("div [class=post-body]");
       // allInfo = div.getElementsByTag("p").text();
        
       for (Element div : divs) {
         //  names.add(div.getElementsByClass("plain").text());
           
           //All Info
           allInfo = div.getElementsByTag("p").text();
           //Age
          // ages.add(allInfo.substring(0, allInfo.indexOf("|")));
           //Hair Type
          /// hairTypes.add(allInfo.substring(allInfo.indexOf("|")));
       }  
      
        //helps test pulling doc
       // System.out.println(doc);
        System.out.println(title);
        System.out.println(allInfo);
    }
    
}