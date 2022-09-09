import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import lombok.Data;

import javax.annotation.processing.Generated;

public class DTO {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder( {
            "date",
            "slot",
            "position",
            "type",
            "value"
    })
    @Data
    public static class AddMealRequest {
        @JsonProperty("date")
        private Integer date;
        @JsonProperty("slot")
        private Integer slot;
        @JsonProperty("position")
        private Integer position;
        @JsonProperty("type")
        private String type;
        @JsonProperty("value")
        private Value value;
        @JsonInclude(JsonInclude.Include.NON_NULL)
        @JsonPropertyOrder( {
                "ingredients"
        })
        @Data
        public static class Value {
            @JsonProperty("ingredients")
            public  List<Ingredient> ingredients = new ArrayList<Ingredient>();
        }
        @JsonInclude(JsonInclude.Include.NON_NULL)
        @JsonPropertyOrder( {"name"})
        @Data
        public  static class Ingredient {
            @JsonProperty("name")
            public  String name;
        }
    }
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
            "status",
            "id"
    })
    @Generated("jsonschema2pojo")
    public class AddMealResponse {
        @JsonProperty("status")
        public String status;
        @JsonProperty("id")
        public Integer id;
    }


    }
