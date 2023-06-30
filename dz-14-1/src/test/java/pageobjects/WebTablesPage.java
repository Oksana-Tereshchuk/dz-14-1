package pageobjects;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebTablesPage extends AbstractObjects{
    private final By AddClick = By.xpath("//button[@id='addNewRecordButton']");
    private final By FirstNameField = By.xpath("//input[@id='firstName']");
    private final By LastNameField = By.xpath("//input[@id='lastName']");
    private final By EmailField = By.xpath("//input[@id='userEmail']");
    private final By AgeField = By.xpath("//input[@id='age']");
    private final By SalaryField = By.xpath("//input[@id='salary']");
    private final By DepartmentField = By.xpath("//input[@id='department']");
    private final By SubmitClick = By.xpath("//button[@id='submit']");

    public WebTablesPage(WebDriver driver) {
        super(driver);
    }
    public void AddElement ()
    {
        getElement(AddClick).click();
    }
    @Step("Fill fields")
    public WebTablesPage fillNewRecord(String firstName, String lastName,String email,String age,String salary,String department){
        getElement(FirstNameField).sendKeys(firstName);
        getElement(LastNameField).sendKeys(lastName);
        getElement(EmailField).sendKeys(email);
        getElement(AgeField).sendKeys(age);
        getElement(SalaryField).sendKeys(salary);
        getElement(DepartmentField).sendKeys(department);
        return new WebTablesPage(driver);
    }
    public void submitRecord()
    {
        waitTillAppears(SubmitClick);
        getElement(SubmitClick).click();
    }
    public Boolean rowElementXpath(String rowValue) {
        By EmailColumn = By.xpath("//div[text()='"+rowValue+"']");
        return getElement(EmailColumn).isDisplayed();
    }
    public void editButtonXpath(String username)
    {
        By EditButton = By.xpath("//div[text()='"+username+"']/..//span[@title='Edit']");
        getElement(EditButton).click();
    }
    @Step("Edit fields")
    public WebTablesPage EditForm(String firstName){
        getElement(FirstNameField).clear();
        getElement(FirstNameField).sendKeys(firstName);
        return new WebTablesPage(driver);
    }

}
