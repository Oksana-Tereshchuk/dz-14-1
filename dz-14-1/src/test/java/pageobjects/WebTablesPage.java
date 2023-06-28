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
    private final By DeleteClick = By.xpath("//span[@id='delete-record-2']");
    private final By EmailColumn = By.xpath("//div[text()='LPirs@gmail.com']");
    private final By EditButton = By.xpath("//div[text()='LPirs@gmail.com']/..//span[@title='Edit']");
    public WebTablesPage(WebDriver driver) {
        super(driver);
    }
    public void AddElement ()
    {
        getElement(AddClick).click();
    }
    @Step("Fill fields")
    public WebTablesPage FillForm(String firstName, String lastName,String email,String age,String salary,String department){
        getElement(FirstNameField).sendKeys(firstName);
        getElement(LastNameField).sendKeys(lastName);
        getElement(EmailField).sendKeys(email);
        getElement(AgeField).sendKeys(age);
        getElement(SalaryField).sendKeys(salary);
        getElement(DepartmentField).sendKeys(department);
        return new WebTablesPage(driver);
    }
    public void SubmitElement ()
    {
        waitTillAppears(SubmitClick);
        getElement(SubmitClick).click();
    }
    public String getEmail() {
        return getElement(EmailColumn).getText();
    }
    public void getEditElement()
    {
        getElement(EditButton).click();
    }
    public void getEditName()
    {
        getElement(FirstNameField).clear();
    }
    @Step("Edit fields")
    public WebTablesPage EditForm(String firstName){
        getElement(FirstNameField).sendKeys(firstName);
        return new WebTablesPage(driver);
    }

}
