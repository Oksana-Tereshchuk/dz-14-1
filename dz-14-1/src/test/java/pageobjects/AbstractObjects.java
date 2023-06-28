package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AbstractObjects {
    private final static int DURATION_TO_WAIT_DEFAULT = 4;
    private final static String COLOUR_ATTRIBUTE_NAME = "color";
    protected WebDriver driver;

    public AbstractObjects(WebDriver driver) {
        this.driver = driver;
    }
    public WebElement getElement(By by, int waitForSeconds) {
        return new WebDriverWait(driver, Duration.ofSeconds(waitForSeconds))
                .until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public WebElement getElement(final By by) {
        return new WebDriverWait(driver, Duration.ofSeconds(DURATION_TO_WAIT_DEFAULT))
                .until(ExpectedConditions.presenceOfElementLocated(by));
    }
    public void waitTillAppears(By by, int waitForSeconds) {
        new WebDriverWait(driver, Duration.ofSeconds(waitForSeconds))
                .until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public void waitTillAppears(By by) {
        new WebDriverWait(driver, Duration.ofSeconds(DURATION_TO_WAIT_DEFAULT))
                .until(ExpectedConditions.presenceOfElementLocated(by));
    }
}
