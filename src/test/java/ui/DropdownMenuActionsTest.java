package ui;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import static steps.WebFormSteps.openDropdownMenuPage;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class DropdownMenuActionsTest {
    WebDriver driver;
    private static final String BASE_URL = "https://bonigarcia.dev/selenium-webdriver-java/index.html";

    @BeforeEach
    void start() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(BASE_URL);
        openDropdownMenuPage(driver);
    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }

    @Test
    @Order(1)
    void useLeftClickTest() throws InterruptedException {
        Actions actions = new Actions(driver);
        WebElement dropdownLeftClick = driver.findElement(By.id("my-dropdown-1"));
        actions.click(dropdownLeftClick).perform();
        Thread.sleep(2000);
    }

    @Test
    @Order(2)
    void useRightClickTest() throws InterruptedException {
        Actions actions = new Actions(driver);
        WebElement dropdown2 = driver.findElement(By.id("my-dropdown-2"));
        actions.contextClick(dropdown2).perform();
        Thread.sleep(2000);
    }

    @Test
    @Order(3)
    void useDoubleClickTest() throws InterruptedException {
        Actions actions = new Actions(driver);
        WebElement dropdown3 = driver.findElement(By.id("my-dropdown-3"));
        actions.doubleClick(dropdown3).perform();
        Thread.sleep(2000);
    }

}
