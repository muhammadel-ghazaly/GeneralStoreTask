package webTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import mobilePage.TrackOrderPage;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import webPage.allOrdersPage;
import utilities.Helper;
import java.util.concurrent.TimeUnit;

public class allOrdersTest extends WebTestBase {

    allOrdersPage allOrdersPage;
    Helper helper;
    JavascriptExecutor js;




@Test
    public void openOrderDeatails () throws InterruptedException {
        allOrdersPage = new allOrdersPage(driver);
    driver.manage().timeouts().implicitlyWait(20000, TimeUnit.MILLISECONDS);
    allOrdersPage.openAdvancedSearch();
    Thread.sleep(3000);
        allOrdersPage.setOrderNumber();
        allOrdersPage.openOrderStatusSection();
        allOrdersPage.uncheckDriverAssigned();
        allOrdersPage.uncheckPickingUp();
        allOrdersPage.uncheckDelivering();
        //allOrdersPage.checkDelivered();
        allOrdersPage.clickSearch();
        helper.scrollDown();;
        allOrdersPage.openOrderDetails();
        

 //  Assert.assertTrue(allOrdersPage.orderType.getText().contains("Order Type"));

    }
}
