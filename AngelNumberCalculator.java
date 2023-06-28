
import java.util.Scanner;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.scene.layout.*;
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
 
public class AngelNumberCalculator extends Application {

 //   private static void link(String httpsthemantracocomwpcontentuploads202201) {
  //      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   // }

    @Override
        public void start(Stage stage) throws Exception {
 //To change body of generated methods, choose Tools | Templates.
    BorderPane pane = new BorderPane();
    pane.setCenter(addGridPane());

    //Gridpane Buttons or labels...
    
    //FlowPane flow = new FlowPane();
    //Hbox hbox =addHBox();
    //pane.setTop(hbox);
   // pane.setLeft(addVBox());
   // addStackPane(hbox);//addstackHbox in top region
    
  //  pane.setCenter(addGridPane());
   // pane.setRight(addFlowPane());
    
    

 //   HBox hb = new HBox(10);//Borders for box
  
    int cardNumber = 0;
    
    //Create nodes
    Label title = new Label("Angel Number Game");
    title.setFont(Font.font("Helivetica", FontWeight.SEMI_BOLD, FontPosture.REGULAR, 25));
    //title.setAlignment(title, Pos.CENTER);
     BorderPane.setAlignment(title, Pos.CENTER);
     pane.setTop(title);
    //How do we shift label to center?
     pane.setCenter(null);
 
   // BorderPane.setAlignment(title, Pos.CENTER);
   // pane.setTop(title);

    
    TextField searchTF = new TextField();
    searchTF.setPromptText("Type your angel number here");//????BUG????
    searchTF.setFocusTraversable(false);
    searchTF.setPrefWidth(10);
    searchTF.setPrefHeight(20);
    

    
    
    //add buttons
    Button showCardButton = new Button("Show Card");
    //calls method for card
   // pane.setCenter(getImg(showCard(searchTF))); //<<< BUG
    showCardButton.setPrefWidth(200);
    showCardButton.setLayoutX(1);
    
    
    Button infoButton = new Button("Read full report");
    infoButton.setPrefWidth(200);
    infoButton.setLayoutX(2);
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
                pane.setCenter(getImg(showCard(searchTF)));
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
    
    HBox hb = new HBox(20);
        hb.setAlignment(Pos.CENTER);
        hb.getChildren().addAll(showCardButton, infoButton);
        pane.setBottom(hb);
    
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
   public GridPane addGridPane() { 
    GridPane grid = new GridPane();
    grid.setHgap(10);
    grid.setVgap(10);
    grid.setPadding(new Insets(0,10,0,10));
    //Directions in column 1, row 1
    Text directions = new Text("Enter your Birthday:");
    TextField month = new TextField();
    grid.add(directions,1,1);
    month.setPromptText("MM");
    TextField day = new TextField();
    grid.add(directions,1,2);
    day.setPromptText("DD");
    grid.add(day,1,3);
    TextField year = new TextField();
    month.setPromptText("YYYY");
    grid.add(directions,1,4);
    
    return grid;
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
      if(angelNumber == 1) {
         link = ("https://themantraco.com/wp-content/uploads/2022/01/med_res.jpg");
      } else if (angelNumber == 2){
        //2 
        link = ("https://themantraco.com/wp-content/uploads/2022/01/med_res-2.jpg");
       } else if (angelNumber ==3 ){
        //3 
        link = ("https://themantraco.com/wp-content/uploads/2022/01/med_res-3.jpg");
      } else if (angelNumber == 4){
        //4
        link = ("https://themantraco.com/wp-content/uploads/2022/01/med_res-4.jpg");
       } else if (angelNumber == 5 ){
        //5 
        link = ("https://themantraco.com/wp-content/uploads/2022/01/med_res-5.jpg");
      } else if (angelNumber == 6){
        //6 
        link = ("https://themantraco.com/wp-content/uploads/2022/01/med_res-6.jpg");
       } else if (angelNumber == 7 ){
        //7 
        link = ("https://themantraco.com/wp-content/uploads/2022/01/med_res-7.jpg");
          
      } else if (angelNumber == 8){
        //8 
        link = ("https://themantraco.com/wp-content/uploads/2022/01/med_res-8.jpg");
       } else if (angelNumber == 9 ){
        //9 
        link = ("https://themantraco.com/wp-content/uploads/2022/01/med_res-9.jpg");
       }
   
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
    
        public static ImageView getImg(String s) {
        Image img = new Image(s, 400, 400, false, false);
        ImageView imgv = new ImageView(img);
        
        return imgv;
    }

    
    
       // Color[] colors = {Color.BLUEVIOLET, Color.TOMATO, Color.MAGENTA, Color.THISTLE, Color.DARKORCHID, Color.GREEN,};
      
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
    //      cardNumber = tf.getText();
      //    cardNumber = searchTF.getText();
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

