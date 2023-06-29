package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.WebTablesPage;

public class AddEditElementTest extends BaseTest {

    @Test
    public void OpenWebTablePage() {
        driver.get("https://demoqa.com/webtables");
        WebTablesPage tablesPage = new WebTablesPage(driver);

        tablesPage.AddElement();
        tablesPage.FillForm("Leyla","Pirs","LPirs@gmail.com","22","1000","Legal");
        tablesPage.SubmitElement();

        String EmailText = tablesPage.getEmail("LPirs@gmail.com");
        Assert.assertEquals(EmailText, "LPirs@gmail.com");

        tablesPage.getEditElement();
        tablesPage.EditForm("Kiki");
        tablesPage.SubmitElement();

        String editedFirstName = tablesPage.getEditedFirstName("Kiki");
        Assert.assertEquals(editedFirstName, "Kiki","did not find edited FirstName");

    }
}
