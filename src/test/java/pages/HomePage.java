package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    // Локаторы
    private By searchBox = By.name("q");
    private By searchButton = By.name("btnK");
    private By cookies = By.xpath("//button[text()='AKZEPTIEREN']");

    // Конструктор
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    // Методы для взаимодействия
    public void open() {
        driver.get("https://www.bueromarkt-ag.de/");
    }

    public void acceptCookies() {
        driver.findElement(cookies).click();
    }
}
