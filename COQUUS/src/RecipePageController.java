/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;



/**
 *
 * @author PC
 */
public class RecipePageController implements Initializable {

    @FXML
    private Button BackButton;

    @FXML
    private TextArea IngredientsTextArea;

    @FXML
    private TextArea InstructionTextArea;

    @FXML
    private Button StartTimerButton;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}
