package com.Odoo.pages;

import com.Odoo.utilities.BrowserUtils;
import com.Odoo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    @FindBy(css = "ol[class='breadcrumb'] li[class='active']")
    public WebElement pageSubTitle;



    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

   /*
   @param
    */
    public void navigateToModule(String moduleName){
        String path = "//span[contains(text(),'"+ moduleName + "')]";

        WebDriverWait wait = new WebDriverWait(Driver.get(), 15);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(path)));

        WebElement module = Driver.get().findElement(By.xpath(path));
        wait.until(ExpectedConditions.visibilityOf(module));
        wait.until(ExpectedConditions.elementToBeClickable(module));

        waitUntilLoaderDisappear();

        module.click();

   }

   public void clickOnButton(String buttonName) {
       String path = "//button[contains(text(),'" + buttonName + "')]";

       WebDriverWait wait = new WebDriverWait(Driver.get(), 30);
       wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(path)));

       WebElement button = Driver.get().findElement(By.xpath(path));
       wait.until(ExpectedConditions.visibilityOf(button));
       wait.until(ExpectedConditions.elementToBeClickable(button));

//       waitUntilLoaderDisappear();
       //BrowserUtils.waitForStaleElement(button);


       button.click();
   }

    public void clickOnMenuButton(String buttonName) {
        String path =  "//span[contains(text(),'"+ buttonName + "')]";
        WebDriverWait wait = new WebDriverWait(Driver.get(), 20);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(path)));

        WebElement button = Driver.get().findElement(By.xpath(path));
        wait.until(ExpectedConditions.elementToBeClickable(button));

        button.click();
    }

    public String getPageSubTitle() {
        BrowserUtils.waitForStaleElement(pageSubTitle);
        return pageSubTitle.getText();
    }

    /**
     * While this loading screen present, html code is a not complete
     * Some elements can be missing
     * Also, you won't be able to interact with any elements
     * All actions will be intercepted
     * Waits until loader mask (loading bar, spinning wheel) disappears
     *
     * @return true if loader mask is gone, false if something went wrong
     */
    public boolean waitUntilLoaderDisappear() {
        WebDriverWait wait = new WebDriverWait(Driver.get(), 30);
        try {
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("[class='o_loading']")));
            return true;
        } catch (NoSuchElementException e) {
            System.out.println("Spinner not found!");
            e.printStackTrace();
            return true; // no loader mask, all good, return true
        } catch (WebDriverException e) {
            e.printStackTrace();
        }
        return false;
    }

}
