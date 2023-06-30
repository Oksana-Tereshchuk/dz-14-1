package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pageobjects.WebTablesPage;

public class AddEditElementTest extends BaseTest {

    @Test
    public void editElementTest() {
        driver.get("https://demoqa.com/webtables");
        WebTablesPage tablesPage = new WebTablesPage(driver);

        tablesPage.AddElement();
        tablesPage.fillNewRecord("Leyla","Pirs","LPirs@gmail.com","22","1000","Legal");
        tablesPage.submitRecord();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(tablesPage.rowElementXpath("LPirs@gmail.com"));

        tablesPage.editButtonXpath("Leyla");
        tablesPage.EditForm("Kiki");
        tablesPage.submitRecord();

        softAssert.assertTrue(tablesPage.rowElementXpath("Kiki"));
        softAssert.assertAll();

    }
}
