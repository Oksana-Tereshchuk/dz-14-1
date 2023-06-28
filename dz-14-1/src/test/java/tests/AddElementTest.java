package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.ButtonsPage;
import pageobjects.WebTablesPage;

public class AddElementTest extends BaseTest {

    @Test
    public void testAddRowPositive() {
        driver.get("https://demoqa.com/webtables");
        WebTablesPage tablesPage = new WebTablesPage(driver);
        tablesPage.AddElement();
        tablesPage.FillForm("Leyla","Pirs","LPirs@gmail.com","22","1000","Legal");
        tablesPage.SubmitElement();

        String EmailText = tablesPage.getEmail();
        Assert.assertEquals(EmailText, "LPirs@gmail.com");

        tablesPage.getEditElement();
        tablesPage.getEditName();
        tablesPage.EditForm("Kiki");
        tablesPage.SubmitElement();

    }
}
