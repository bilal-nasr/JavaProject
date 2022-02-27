import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import model.Recipe;

public class MainSceneController implements Initializable{

    
    @FXML
    private HBox CardLayout;
    private List<Recipe> RecentlyAdded;
    private List<Recipe> recommendRecipes;
    private GridPane RecipeContainer;

    @FXML
    private TextField SearchTxtField;
    
    
    
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        
        RecentlyAdded = new ArrayList<>(RecentlyAdded());
        recommendRecipes = new ArrayList<>(Recommended());
        int column = 0;
        int row = 1;
        try{
            for (int i = 0; i < RecentlyAdded.size(); i++) {
                FXMLLoader fxmlloader = new FXMLLoader();
                fxmlloader.setLocation(getClass().getResource("card.fxml"));
                HBox cardBox = fxmlloader.load();
                CardController cardController = fxmlloader.getController();
                cardController.setData(RecentlyAdded.get(i));
                CardLayout.getChildren().add(cardBox);
            }
            for(int j = 0; j < recommendRecipes.size(); j++){
                FXMLLoader fxmlloader = new FXMLLoader();
                fxmlloader.setLocation(getClass().getResource("RecipeVerticalCard.fxml"));
                VBox VcardBox = fxmlloader.load();
                RecipeVerticalCardController VcardController = fxmlloader.getController();
                VcardController.setData(recommendRecipes.get(j));
                System.out.println("fd");
                if(column==6){
                    column = 0;
                    ++row;
                }

                RecipeContainer.add(VcardBox, column++, row);
                GridPane.setMargin(VcardBox, new Insets(10));
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    private List<Recipe> RecentlyAdded(){
        List<Recipe> ls = new ArrayList<>();
        Recipe recipe = new Recipe();
        return ls;
        
    }
 
    private List<Recipe> Recommended(){
        List<Recipe> ls = new ArrayList<>();
        Recipe recipe = new Recipe();

        return ls;
    }
    
    @FXML
    public void GoToRecipe(MouseEvent event) throws IOException {
        SceneController toR = new SceneController();
        toR.switchToRecipeWindow(event);
    }


}