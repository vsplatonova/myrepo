import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static io.restassured.RestAssured.*;


public class RecipeTests extends Framework {



      @Test
      void addMealPositiveTest () {
       DTO.AddMealRequest request=new DTO.AddMealRequest();
       DTO.AddMealRequest.Value value=new DTO.AddMealRequest.Value();
       DTO.AddMealRequest.Ingredient ingredient=new DTO.AddMealRequest.Ingredient();

        ingredient.setName("1 banana");
        request.setDate(1644881179);
        request.setSlot(1);
        request.setPosition(0);
        request.setType("INGREDIENTS");
        value.setIngredients(new ArrayList<>() {
             {add(ingredient);}});
        request.setValue(value);

        get(request, "https://api.spoonacular.com/mealplanner/vplatonova/items");


      }
    @Test
    void addMealNegativeTest () {

        DTO.AddMealRequest request=new DTO.AddMealRequest();
        DTO.AddMealRequest.Value value=new DTO.AddMealRequest.Value();
        DTO.AddMealRequest.Ingredient ingredient=new DTO.AddMealRequest.Ingredient();

        ingredient.setName("1 banana");
        request.setDate(1644881179);
        request.setSlot(1);
        request.setPosition(0);
        request.setType("INGREDIENTSssssss");
        value.setIngredients(new ArrayList<>() {
            {add(ingredient);}});
        request.setValue(value);

        get(request, "https://api.spoonacular.com/mealplanner/vplatonova/items");
    }






}
