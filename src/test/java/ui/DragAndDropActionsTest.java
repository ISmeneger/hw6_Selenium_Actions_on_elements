package ui;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import static steps.WebFormSteps.openDragAndDropPage;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class DragAndDropActionsTest {
    WebDriver driver;
    private static final String BASE_URL = "https://bonigarcia.dev/selenium-webdriver-java/index.html";

    @BeforeEach
    void start() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(BASE_URL);
        openDragAndDropPage(driver);
    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }

    @Test
    void dragAndDropTests() throws InterruptedException {
        WebElement draggable = driver.findElement(By.id("draggable"));
        WebElement droppable = driver.findElement(By.id("target"));
        new Actions(driver)
                .dragAndDrop(draggable, droppable)
                .perform();
        Thread.sleep(2000);
    }
}
