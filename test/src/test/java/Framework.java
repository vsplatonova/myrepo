import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;

import java.util.HashMap;
import java.util.Hashtable;

import static io.restassured.RestAssured.*;

public class Framework {

    @BeforeEach
    void beforeTest() {
        RestAssured.responseSpecification = new ResponseSpecBuilder()
                .log(LogDetail.STATUS)
                .expectStatusCode(200)
                .expectStatusLine("HTTP/1.1 200 OK")
                .expectContentType(ContentType.JSON)
                .expectResponseTime(Matchers.lessThan(5000L))
                .build();

        RestAssured.requestSpecification = (new RequestSpecBuilder())
                .addQueryParam("hash","bd709e5bda1165a4b65b87928dad8b58704d7601")
                .addQueryParam("apiKey","f0aff8f0262c4d24a997529555086625")
                .log(LogDetail.ALL)
                .build();
    }

    public <T> void get (T body , String url) {

       given()
                .spec(requestSpecification)
                .body(body)
                .post(url)
                .then()
                .spec(responseSpecification);

    }
}
