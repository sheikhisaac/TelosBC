/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telosbc;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author 12724
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Pane window;
    @FXML
    private Pane side_pane;
    @FXML
    private Pane title_pane;
    @FXML
    private Button home_btn;
    @FXML
    private Button about_btn;
    @FXML
    private Button viewbc_btn;
    @FXML
    private Button settings_btn;
    @FXML
    private Pane home_pane;
    @FXML
    private Button view_btn;
    @FXML
    private Button create_btn;
    @FXML
    private Pane about_pane;
    @FXML
    private Pane view_pane;
    @FXML
    private Pane settings_pane;
    @FXML
    private Pane create_pane;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void showHome(ActionEvent event) {
        home_pane.setVisible(true);
        about_pane.setVisible(false);
        view_pane.setVisible(false);
        settings_pane.setVisible(false);
        create_pane.setVisible(false);
    }

    @FXML
    private void showAbout(ActionEvent event) throws IOException{
     Stage stage; 
     Parent root;
     if(event.getSource()==home_btn){
        //get reference to the button's stage         
        stage=(Stage) home_btn.getScene().getWindow();
        //load up OTHER FXML document
  root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
      }
     else{
       stage=(Stage) about_btn.getScene().getWindow();
  root = FXMLLoader.load(getClass().getResource("About.fxml"));
      }
     //create a new scene with root and set the stage
      Scene scene = new Scene(root);
      stage.setScene(scene);
      stage.show();
    }

    @FXML
    private void showView(ActionEvent event) {
        home_pane.setVisible(false);
        about_pane.setVisible(false);
        view_pane.setVisible(true);
        settings_pane.setVisible(false);
        create_pane.setVisible(false);
    }

    @FXML
    private void showSettings(ActionEvent event) {
        home_pane.setVisible(false);
        about_pane.setVisible(false);
        view_pane.setVisible(false);
        settings_pane.setVisible(true);
        create_pane.setVisible(false);
    }

    @FXML
    private void showCreate(ActionEvent event) {
        home_pane.setVisible(false);
        about_pane.setVisible(false);
        view_pane.setVisible(false);
        settings_pane.setVisible(false);
        create_pane.setVisible(true);
    }
    
}
