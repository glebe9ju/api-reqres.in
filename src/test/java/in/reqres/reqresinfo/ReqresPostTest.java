package in.reqres.reqresinfo;

import in.reqres.model.ReqresPojo;
import in.reqres.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

/*
 *  Created by Jay
 */

        public class ReqresPostTest extends TestBase {
       @Test
        public void createUserTest() {
            ReqresPojo reqresPojo = new ReqresPojo();
            reqresPojo.setFirstName("John");
            reqresPojo.setJob("Tester");
            Response response = given()
                    .header("Content-Type", "application/json")
                    .body(reqresPojo)
                    .when()
                    .post("/users");
            response.then().statusCode(201);
            response.prettyPrint();

        }
        @Test
        public void createLoginSuccessfullyTest() {
            ReqresPojo reqersPojo = new ReqresPojo();
            reqersPojo.setEmail("prime123@gmail.com");
            reqersPojo.setPassword("Prime123");

            Response response = given()
                    .header("Content-Type", "application/json")
                    .body(reqersPojo)
                    .when()
                    .post("/login");
            response.then().statusCode(201);
            response.prettyPrint();

        }

    }
