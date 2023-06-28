
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
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
public class JSoup_Example {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            Document doc = Jsoup.connect("https://ccac.edu/").get();
            //      System.out.println(doc);
            Elements divs = doc.select("div[class=event-item]");
            System.out.println(divs.text());
        } catch (IOException ex) {
            Logger.getLogger(JSoup_Example.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
