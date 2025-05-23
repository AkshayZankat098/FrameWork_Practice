package RestAssured_Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import net.bytebuddy.build.Plugin;
import org.junit.Test;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class CafeApi {

    @Test()
    public void test1(){

        Response response = RestAssured.given().auth().preemptive().basic("sa", "admin").get("http://192.168.27.132/cosec/api.svc/v2/canteen-menus?action=get");

        // Assert status code
        Assert.assertEquals(response.getStatusCode(), 200, "Status code is not 200");
        System.out.println(response.getStatusCode());

        // Print response body for visibility
        System.out.println("Response Body:");
        Assert.assertEquals(response.getBody().asPrettyString(), "success: 0400100000 : No records found", "Body is not right");
    }

    @Test
    public void Search_City_API () {

        Response response = RestAssured.get("https://content-qtripdynamic-qa-backend.azurewebsites.net/api/v1/cities");

        int Code  = response.getStatusCode();
        if (Code==200){
            System.out.println("Status code is correct : Test PASS");
        }else{
            System.out.println("Status code is not match : Test FAIL");
        }

        Assert.assertEquals(response.getBody().asPrettyString(), 8, "Body is not right");

    }
}
