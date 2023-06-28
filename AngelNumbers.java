
import java.io.*;

import java.net.URL;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import static javafx.scene.input.DataFormat.URL;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
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
 
public class AngelNumbers extends Application {

    @Override
        public void start(Stage stage) throws Exception {
 //To change body of generated methods, choose Tools | Templates.
    BorderPane pane = new BorderPane();
    
    //Create nodes
    Label title = new Label("");
    title.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, FontPosture.REGULAR, 25));
    
    TextField searchTF = new TextField();
    searchTF.setPromptText("Type your angel numeber here");//????BUG????
    searchTF.setFocusTraversable(false);
   
    Button searchButton = new Button("Angel Number");
    searchButton.setPrefWidth(100);
    
    Button infoButton = new Button("Read full report");
    infoButton.setPrefWidth(200);
    infoButton.setVisible(false);
    infoButton.setOnAction((e) -> {
            System.out.println("More Information pressed");
            getInfo(title.getText(), stage);
    });
    //Lambda Functionality
    //Serch button functionality
    searchButton.setOnAction((ActionEvent e) -> {
        System.out.println("Search button pressed!");
        setTitle(searchTF, title);
        pane.setCenter(setImage(searchTF.getText(), infoButton));
 ///      BufferedImage img = ImageIO.read(new URL("http://stackoverflow.com/content/img/so/logo.png"));
           //Here is logic to call metho to setImage and display it
          String imageUrl = "https://themantraco.com/wp-content/uploads/2022/01/med_res.jpg";
          String destinationFile = "image.jpg";
        try {
            saveImage(imageUrl, destinationFile);
        } catch (IOException ex) {
            Logger.getLogger(AngelNumbers.class.getName()).log(Level.SEVERE, null, ex);
        }
         searchTF.clear();
        searchTF.requestFocus();
    });
    
    
    VBox topBox = new VBox(10); 
    topBox.setAlignment(Pos.CENTER_LEFT);
    topBox.getChildren().addAll(title, searchTF, searchButton, infoButton);
    
    
    //place nodes on Pane
    pane.setTop(topBox);
    
    Scene scene = new Scene(pane, 500, 500);
    stage.setScene(scene);
    stage.setTitle("Angel Numbers");   
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
    
    
    public static ImageView setImage(String search, Button infoButton){   
        Color[] colors = {Color.BLUEVIOLET, Color.TOMATO, Color.MAGENTA, Color.THISTLE, Color.DARKORCHID, Color.GREEN,};
        int random = (int)(Math.random() * colors.length);
        DropShadow shadow = new DropShadow(500, colors[random]);
        String imgURL;  
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

