package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebFormSteps {
    public static void openWebFormPage(WebDriver driver) throws InterruptedException {
        WebElement webFormButton = driver.findElement(By.xpath("//a[@href = 'web-form.html']"));
        Thread.sleep(3000);
        webFormButton.click();
    }

    public static void openNavigationPage(WebDriver driver) throws InterruptedException {
        WebElement navigationButton = driver.findElement(By.xpath("//a[@href = 'navigation1.html']"));
        Thread.sleep(3000);
        navigationButton.click();
    }
}
