package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.ButtonsPage;

public class ButtonsElementTest extends BaseTest{
        @Test
        public void buttonClickMeTest(){
            driver.get("https://demoqa.com/elements");
            ButtonsPage button =new ButtonsPage(driver);

        button.ButtonsElement();

        button.ClickMeElement();

      String ClickMeText = button.getClickMeText();

        System.out.println("ClickMe text:" + ClickMeText );
        Assert.assertEquals(ClickMeText, "You have done a dynamic click");

        }
    }
