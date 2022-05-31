package in.reqres.reqresinfo;

import in.reqres.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

/*
 *  Created by Jay
 */
public class ReqresGetTest extends TestBase {

    @Test
    public void getAllReqresInfo() {
        Response response = given()
                .when()
                .get("/list");
        response.then().statusCode(200);
        response.prettyPrint();
    }

    @Test
    public void getSingleReqresInfo() {

            Response response = given()
                    .pathParam("id",4)
                    .when()
                    .get("/{id}");
            response.then().statusCode(200);
            response.prettyPrint();

    }


}
