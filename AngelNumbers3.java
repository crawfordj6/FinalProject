
import static AngelNumbers.getInfo;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
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
public class AngelNumbers3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
     public void start(Stage stage) throws Exception {
 //To change body of generated methods, choose Tools | Templates.
    BorderPane pane = new BorderPane();
    
    //Create nodes
    Label title = new Label("Angel Number:");
    title.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, FontPosture.REGULAR, 25));
    
    TextField searchTF = new TextField();
    searchTF.setPromptText("Type your angel number here");//????BUG????
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
    
     }
}
