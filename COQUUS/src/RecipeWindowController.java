import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import model.Recipe;
public class RecipeWindowController implements Initializable{
    
    private List<Recipe> RecentlyAdded;
    @FXML
    private HBox Box;
    
    public void initialize(URL arg0, ResourceBundle arg1) {
        RecentlyAdded = new ArrayList<>(RecentlyAdded());
        try{
            for (int i = 0; i < RecentlyAdded.size(); i++) {
                FXMLLoader fxmlloader = new FXMLLoader();
                fxmlloader.setLocation(getClass().getResource("RecipeVerticalCard.fxml"));
                VBox cardBox = fxmlloader.load();
                RecipeVerticalCardController cardController = fxmlloader.getController();
                cardController.setData(RecentlyAdded.get(i));
                Box.getChildren().add(cardBox);
            }
            }catch(Exception e){
            System.out.println(e.getMessage());}
    }
    private List<Recipe> RecentlyAdded(){
        List<Recipe> ls = new ArrayList<>();
        Recipe recipe = new Recipe();

        recipe.setChef("UserName1");
        recipe.setDescription("Hello This is my new recipe please chack it out...");
        recipe.setName("Spicy Tomato");
        recipe.setImgscr("/img/food/SpicyTomatodip.png");

        ls.add(recipe);

        recipe = new Recipe();

        recipe.setChef("UserName1");
        recipe.setDescription("Hello This is my new recipe please chack it out...");
        recipe.setName("Spicy Tomato");
        recipe.setImgscr("/img/food/SpicyTomatodip.png");

        ls.add(recipe);

        recipe = new Recipe();

        recipe.setChef("UserName1");
        recipe.setDescription("Hello This is my new recipe please chack it out...");
        recipe.setName("Spicy Tomato");
        recipe.setImgscr("/img/food/SpicyTomatodip.png");

        ls.add(recipe);
        recipe = new Recipe();

        recipe.setChef("UserName1");
        recipe.setDescription("Hello This is my new recipe please chack it out...");
        recipe.setName("Spicy Tomato");
        recipe.setImgscr("/img/food/SpicyTomatodip.png");

        ls.add(recipe);

        recipe = new Recipe();

        recipe.setChef("UserName1");
        recipe.setDescription("Hello This is my new recipe please chack it out...");
        recipe.setName("Spicy Tomato");
        recipe.setImgscr("/img/food/SpicyTomatodip.png");

        ls.add(recipe);

        recipe = new Recipe();

        recipe.setChef("UserName1");
        recipe.setDescription("Hello This is my new recipe please chack it out...");
        recipe.setName("Spicy Tomato");
        recipe.setImgscr("/img/food/SpicyTomatodip.png");

        ls.add(recipe);

        recipe = new Recipe();

        recipe.setChef("UserName1");
        recipe.setDescription("Hello This is my new recipe please chack it out...");
        recipe.setName("Spicy Tomato");
        recipe.setImgscr("/img/food/SpicyTomatodip.png");

        ls.add(recipe);

        recipe = new Recipe();

        recipe.setChef("UserName1");
        recipe.setDescription("Hello This is my new recipe please chack it out...");
        recipe.setName("Spicy Tomato");
        recipe.setImgscr("/img/food/SpicyTomatodip.png");

        ls.add(recipe);
        return ls;
        
    }
}
