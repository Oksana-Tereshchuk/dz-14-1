package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.ButtonsPage;
import pageobjects.ElementsPage;

import java.time.Duration;
public class NavigateButtonsTest extends BaseTest{
        @Test
        public void testElementsPagePositive(){
            driver.get("https://demoqa.com/elements");
            ButtonsPage button =new ButtonsPage(driver);

        button.ButtonsElement();

        button.ClickMeElement();

      String ClickMeText = button.getClickMeText();

        System.out.println("ClickMe text:" + ClickMeText );
        Assert.assertEquals(ClickMeText, "You have done a dynamic click");

        }
    }
