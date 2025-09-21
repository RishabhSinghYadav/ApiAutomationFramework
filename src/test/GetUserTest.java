import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

Logger logger = LogManager.getLogger(GetUserTest.class);
logger.info("Starting GET user test");



public class GetUserTest extends BaseTest {
    @Test
    public void testGetUser() {
        given().when().get("/users/1").then().statusCode(200);
    }
    @Test
public void testCreateUser() {
    String requestBody = "{ \"name\": \"John\", \"username\": \"john123\" }";
    given()
        .header("Content-Type", "application/json")
        .body(requestBody)
    .when()
        .post("/users")
    .then()
        .statusCode(201)
        .body("name", equalTo("John"));
}

}
