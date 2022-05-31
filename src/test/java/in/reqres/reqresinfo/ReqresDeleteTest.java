package in.reqres.reqresinfo;

import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

/*
 *  Created by Jay
 */
public class ReqresDeleteTest {
    @Test
    public void deleteAllProductInfo() {
        Response response = given()
                .pathParam("id",365)
                .when()
                .delete("/delete/{id}");
        response.prettyPrint();
        response.then().statusCode(204);

    }




}
