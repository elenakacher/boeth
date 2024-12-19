package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class loginTest {
    private WebDriver driver;
    private HomePage homePage;

    @BeforeEach
    public void setUp() {
        // Настройка WebDriverManager и запуск ChromeDriver
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Инициализация страницы
        homePage = new HomePage(driver);
    }

    @Test
    public void testGoogleSearch() throws InterruptedException {
        homePage.open();
        Thread.sleep(1000);
        homePage.acceptCookies();
    }

    @AfterEach
    public void tearDown() {
//        if (driver != null) {
//            driver.quit();
//       }
    }
}
