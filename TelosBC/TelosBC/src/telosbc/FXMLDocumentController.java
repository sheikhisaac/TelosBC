/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telosbc;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

/**
 * FXML Controller class
 *
 * @author 12724
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private StackPane stackPane;
    @FXML
    private AnchorPane holderPane;
    @FXML
    private AnchorPane sideAnchor;
    @FXML
    private Button home_btn;
    @FXML
    private Button about_btn;
    @FXML
    private Button viewbc_btn;
    @FXML
    private Button settings_btn;
    @FXML
    private Button close_btn;
    @FXML
    private Button view_btn;
    @FXML
    private Button create_btn;
    @FXML
    private Pane home_pane;
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
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        createPages();
    }    
    private void setNode(Node node) {
     
        holderPane.getChildren().clear();
        holderPane.getChildren().add((Node) node);
    }
    
    //Load all fxml files to a cahce for swapping
    private void createPages() {
        try {
            home_pane = FXMLLoader.load(getClass().getResource("Home.fxml"));
            about_pane = FXMLLoader.load(getClass().getResource("/modules/About.fxml"));
            view_pane = FXMLLoader.load(getClass().getResource("/modules/View.fxml"));
            settings_pane = FXMLLoader.load(getClass().getResource("/modules/Settings.fxml"));
            create_pane = FXMLLoader.load(getClass().getResource("/modules/Create.fxml"));

            //set up default node on page load
            setNode(home_pane);
        } catch (IOException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    @FXML
    private void openHome(ActionEvent event) {
        setNode(home_pane);
    }

    @FXML
    private void openAbout(ActionEvent event){
        setNode(about_pane);
    }

    @FXML
    private void openView(ActionEvent event) {
        setNode(view_pane);
    }

    @FXML
    private void openSettings(ActionEvent event) {
        setNode(settings_pane);
    }

    @FXML
    private void openCreate(ActionEvent event) {
        setNode(create_pane);
    }
    
    @FXML
    private void Exit(ActionEvent event) {
        Platform.exit();
    }
    
    
}
