
import java.io.*;
import java.net.URL;
import java.util.Scanner;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.*;
import javafx.stage.Stage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Julia Crawford
 * 
 * For the purpose of this project... we will start with only triple digit display and info.
 * single and double if there is time to do so
 * 
 * may have an explanation into or help button
 */
 
public class AngelNumbers6 extends Application {

    private static void link(String httpsthemantracocomwpcontentuploads202201) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
        public void start(Stage stage) throws Exception {
 //To change body of generated methods, choose Tools | Templates.
    BorderPane pane = new BorderPane();
    int cardNumber = 0;
    
    //Create nodes
    Label title = new Label("Angel Number Game");
    title.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, FontPosture.REGULAR, 25));
    //How do we shift label to center?
 
   // BorderPane.setAlignment(title, Pos.CENTER);
   // pane.setTop(title);

    
    TextField searchTF = new TextField();
    searchTF.setPromptText("Type your angel number here");//????BUG????
    searchTF.setFocusTraversable(false);
    
    //add buttons
    Button showCardButton = new Button("Show Card");
    showCardButton.setStyle("-fx-background-color: #ADD8E6;");
    pane.setCenter(getImg("https://themantraco.com/wp-content/uploads/2022/01/med_res.jpg"));
    //calls method for card
   // pane.setCenter(getImg(showCard(searchTF))); //<<< BUG
    showCardButton.setPrefWidth(200);
    
    Button infoButton = new Button("Read full report");
    infoButton.setPrefWidth(200);
    //infoButton.setVisible(false);
    infoButton.setOnAction((e) -> {
            System.out.println("More Information pressed");
            getInfo(title.getText(), stage);
               //borrowed from running temps
                pane.setStyle("-fx-background-color: #66ccff;");  
                pane.setCenter(getImg("https://hips.hearstapps.com/cos.h-cdn.co/assets/14/45/4000x1414/nrm_1415384630-20-24.jpg?"));
             
    });
    //Lambda Functionality
    //Serch button functionality
    showCardButton.setOnAction((ActionEvent e) -> {
        System.out.println("Show card button pressed pressed!");
        //showCard();
           //borrowed from running temps
                pane.setStyle("-fx-background-color: #66ccff;");  
                pane.setCenter(getImg("https://hips.hearstapps.com/cos.h-cdn.co/assets/14/45/4000x1414/nrm_1415384630-20-24.jpg?"));
      //  setTitle(searchTF, title);
      //  pane.setCenter(setImage(searchTF.getText(), infoButton));
 ///      BufferedImage img = ImageIO.read(new URL("http://stackoverflow.com/content/img/so/logo.png"));
           //Here is logic to call metho to setImage and display it
      //    String imageUrl = "https://themantraco.com/wp-content/uploads/2022/01/med_res.jpg";
      //    String destinationFile = "image.jpg";
      //  try {
         //   saveImage(imageUrl, destinationFile);
       // } catch (IOException ex) {
          //  Logger.getLogger(AngelNumbers.class.getName()).log(Level.SEVERE, null, ex);
        //}
         //searchTF.clear();
       // searchTF.requestFocus();
    });
    
    
    VBox topBox = new VBox(10); 
    topBox.setAlignment(Pos.CENTER_LEFT);
    topBox.getChildren().addAll(title, searchTF, showCardButton, infoButton);
    
    
    //place nodes on Pane
    pane.setTop(topBox);
    
    Scene scene = new Scene(pane, 500, 500);
    stage.setTitle("Angel Numbers");  
    stage.setScene(scene);
     
    stage.setResizable(false);
    stage.show();
    }
    public static void setTitle(TextField tf, Label title) {
        if(tf.getText().isEmpty()){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Search field cannnot be empty.");
            alert.show();
        } else{
            title.setText(tf.getText()); 
        }
       
    }
    public String showCard(TextField tf) {
        //Retrieve value from text field
        String cardNumber = (tf.getText());
        //intialize string link
        String link = null;
       //Convert to numeric value
        double angelNumber = Double.parseDouble(cardNumber);
      //  System.out.println("cardNumber");
      //case or switch??
      //Case is more appropriate since user is enter a number
      //if else is more fitting for boolean/char
    //  Switch(cardNumber){
        
  //  }
   
      if(angelNumber == 1) {
         link = ("https://themantraco.com/wp-content/uploads/2022/01/med_res.jpg");
      } else if (angelNumber == 2){
        //2 
        link = ("https://themantraco.com/wp-content/uploads/2022/01/med_res-2.jpg");
        }
          
             
              //3 ("https://themantraco.com/wp-content/uploads/2022/01/med_res-3.jpg");
              //4 (""https://themantraco.com/wp-content/uploads/2022/01/med_res.jpg"");
              //5 ("https://themantraco.com/wp-content/uploads/2022/01/med_res-5.jpg");
              //6 ("https://themantraco.com/wp-content/uploads/2022/01/med_res-6.jpg");
              //7 ("https://themantraco.com/wp-content/uploads/2022/01/med_res-7.jpg"); 
              //8 ("https://themantraco.com/wp-content/uploads/2022/01/med_res-8.jpg");
              //9 ("https://themantraco.com/wp-content/uploads/2022/01/med_res-9.jpg");
     // {
           //     bp.setStyle("-fx-background-color: #ff99ff");
             //   bp.setCenter(getImg("https://hips.hearstapps.com/cos.h-cdn.co/assets/14/45/4000x1414/nrm_1415383283-40-44-3.jpg?"));
       //     }
         //   else if(fSlider.getValue() >= 45 && fSlider.getValue() <= 49) {
           //     bp.setStyle("-fx-background-color: #ff9999");
             //   bp.setCenter(getImg("https://hips.hearstapps.com/cos.h-cdn.co/assets/14/45/4000x1414/nrm_1415381871-45-49.jpg?"));
           // }
             // pane.setCenter(getImg(linl));
             
    //  pane.setCenter(getImg(link));
      
     return link;  
    }
      public static int CalculateAngelNumber(int birthDate){
          int number;
          //each number (char) would have to be individually added
          //month+day+year = number
          //then repeat the addition of both char
          //number = angelNumber
          number = 0;
          
          return number;
      }
    
   
    public static void saveImage(String imageURL, String destinationFile) throws IOException {
      URL url = new URL(imageURL);  
      InputStream is = url.openStream();
      OutputStream os = new FileOutputStream(destinationFile);
      
      byte[] b = new byte[2048];
      int length;
      
      while((length = is.read(b)) != -1) {
        os.write(b, 0, length);
        is.close();
        os.close();
    }
    }
    
        public static ImageView getImg(String s) {
        Image img = new Image(s, 650, 200, false, false);
        ImageView imgv = new ImageView(img);
        
        return imgv;
    }

    
    public static ImageView setImage(int number, Button infoButton){   
        Color[] colors = {Color.BLUEVIOLET, Color.TOMATO, Color.MAGENTA, Color.THISTLE, Color.DARKORCHID, Color.GREEN,};
        int random = (int)(Math.random() * colors.length);
        DropShadow shadow = new DropShadow(500, colors[random]);
      
        
        
      //  try {
        //    Jwiki jwiki = new Jwiki(search);
          //  imgURL = jwiki.getImageURL();
         //   infoButton.setVisible(true);
       //  if(search.equalsIgnoreCase("cat")){
           //  Media m = new Media(Paths.get("meow.mp3").toUri().toString());
         //    new MediaPlayer(m).play();
        // }
          //  infoButton.setVisible(true);
            
       // } catch (Exception e) {
         //   infoButton.setVisible(false);
          //  System.out.println("Try again. Enter a number.");
            imgURL = "https://external-content.duckduckgo.com/iu/?u=http%3A%2F%2Fwww.cookingmamas.com%2Fwp-content%2Fuploads%2F2015%2F03%2FAlphabet-Soup.jpg&f=1&nofb=1&ipt=defd18ce3bd54180cee31695ce8998c5b60061feefc9f36d2fa3df96c17eff63&ipo=images";
     //  }
  
        
        
        
        Image image = new Image(imgURL, 250, 250, false, false);
        ImageView imgv = new ImageView(image);
        imgv.setEffect(shadow);
        return imgv;
        
    }
        public static int getSize(Scanner sc) {
       // System.out.print("(Warning: When prompted for choice of 'friend' or 'family',"
         //       + "\nanything other than friend or family will end the program)\n");
        //create int size based off of user input
        //validation loop that repeats until size > 0
       // System.out.println("");
       int cardNumber = 0;
        do {
          System.out.print("Enter a number 1-9 in the text box. ");
          //cardNumber = sc.nextInt();
          cardNumber = tf.getText();
          cardNumber = searchTF.getText();
        }while(cardNumber <= 0);
        return cardNumber;
    }
    
        public static void getInfo(String search, Stage stage) {
            Stage infoStage = new Stage ();
            infoStage.setTitle(search + " information");
            
            TextArea info = new TextArea();
         //   Jwiki jwiki  = new Jwiki(search);
         //   info.appendText(jwiki.getExtractText());
            info.setWrapText(true);
            info.setEditable(false);
            info.setFont   (Font.font("Verdana", FontWeight.BOLD, 14));
            
            Scene infoScene = new Scene(info, 550, 200);
            infoStage.setScene(infoScene);
            
            infoStage.setX(stage.getX());
            infoStage.setY(stage.getY() + 550);
            infoStage.show();
        }
    
       public static void main(String[] args) {
        launch();
    }

    
}

