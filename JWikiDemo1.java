
import Jwiki.Jwiki;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alec
 */
public class JWikiDemo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Jwiki j = new Jwiki("Cat");
        System.out.println(j.getExtractText());
        System.out.println(j.getImageURL());
        
    }
    
}
