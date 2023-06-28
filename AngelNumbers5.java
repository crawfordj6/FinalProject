
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
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
 */

public class AngelNumbers5 extends Application{
      @Override
    public void start(Stage stage) throws Exception {
        
        //pane
        BorderPane bp = new BorderPane();
        
        GridPane grid = new GridPane();
       // GridPane grid = new CreateAngelNumberGUI();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(5);
        grid.setHgap(5);
        //define input box
        final TextField number = new TextField();
        number.setPromptText("Enter a number:");
        number.setPrefColumnCount(10);
        number.getText();
        GridPane.setConstraints(number, 0, 0);
        grid.getChildren().add(number);
        Button reportButton = new Button("Get Meaning");
        GridPane.setConstraints(reportButton, 1, 0);
        
    Label title = new Label("Enter a Number:");
    title.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, FontPosture.REGULAR, 25));
    
    TextField searchTF = new TextField();
    searchTF.setPromptText("Type your angel number here");//????BUG????
    searchTF.setFocusTraversable(false);
   
    Button searchButton = new Button("Angel Number");
    searchButton.setPrefWidth(100);
    
    Button infoButton = new Button("Read full report");
    infoButton.setPrefWidth(200);
       
///last part before edit
 
    infoButton.setVisible(false);
    infoButton.setOnAction((e) -> {
    System.out.println("More Information pressed");

   
    });
    //Lambda Functionality
    //Report button functionality
    reportButton.setOnAction((e) -> {
        System.out.println("Report button pressed!");
 ///      BufferedImage img = ImageIO.read(new URL("http://stackoverflow.com/content/img/so/logo.png"));
     //   setTitle(searchTF, title);
        searchTF.clear();
        searchTF.requestFocus();
    });
    VBox topBox = new VBox(10); 
    topBox.setAlignment(Pos.CENTER_LEFT);
    topBox.getChildren().addAll(title, searchTF, searchButton, infoButton);
    //place nodes on Pane
  // grid.setTop(topBox);
    
    Scene scene = new Scene(grid, 500, 500);
    stage.setScene(scene);
    stage.setTitle("Angel Numbers");   
    stage.setResizable(false);
    stage.show();
     //   Scene scene = new Scene(bp, 300, 250);
        grid.getChildren().add(reportButton);
        stage.show();
    }
    
    public static ImageView setImage (String name){
        
        //Can either webscrape or display image ...
          DropShadow shadow = new DropShadow(500, Color.PURPLE);
        String[] links = {


                
        };
        String link = "";
        
        if(name.equalsIgnoreCase("Morgan Freeman")){
            link = links[0];
        } else if (name.equalsIgnoreCase("Spongebob")){
            link = links[1];
        }else if (name.equalsIgnoreCase("Gordan Freeman")){
            link = links[2];
        } else if (name.equalsIgnoreCase("Gordan Ramsey")){
            link = links[3];
        }
        
        Image img = new Image(link, 200, 200, false, false);
        ImageView iv = new ImageView(img);
        iv.setEffect(shadow);
        
        return iv;
    }
   


    /**
     * @param args the command line arguments
     * 1.Set GUI SCENE
     * 2. Have action button to trigger metho
     * >>> method will getText and feed into another method
     * ...program will then scrape and display image
     * and info
     * 
     * 
     * ???? DO I NEED seperate files for inner and outer events?
     * //or is it better to write entire gui withing one file
     * or multiple files within a project
     * //MULTI FILE for readability and compilation
     */
  // @Override
   
        

   // infoButton.setVisible(false);
   // infoButton.setOnAction((e) -> {
     //      System.out.println("More Information pressed");
      //   getInfo(title.getText(), stage);
      //});
        
        
            // Create a scene and place it in the stage
   // Scene scene = new Scene(GridPane);
    //primaryStage.setWidth(300);
   // primaryStage.setHeight(150);
   // primaryStage.setTitle("First GUI");
   // primaryStage.setScene(scene); // Place the scene in the stage
    //primaryStage.show(); // Display the stage (Show without this)
        //Defining clear button?? optional add in...
       // final TextField userText = new TextField();
        //somePanel.add(userText); //attach the text field to
        //the scene.
        //final Button b = new Button();
       // somePanel.add(b);//attach button to desired node
       // b.setOnAction(event-->{
        //calling method with desired logic,
        // could be txt field where user writes input
       // String text userText.getTest();
   // });
    
    
 

  //  private static class CreateAngelNumberGUI extends GridPane {

     
              public static void main(String[] args) {
        launch(args);
     }
    
}
    

