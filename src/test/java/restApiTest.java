import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class restApiTest {

    @Test
    public void RestAPI(){
        RestAssured.baseURI="https://api.coindesk.com/v1/bpi/currentprice.json";
                Response response =given()
                        .when()
                        .get(baseURI);

        int code = response.getStatusCode();
        System.out.println("statuscode: "+ response.getStatusCode());
        String rate = response.jsonPath().getString("bpi.USD.rate");
        System.out.println("USD.rate: "+ rate);

     }
}


