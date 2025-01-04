package com.example.stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {

    WebDriver driver;

    @Given("I open the browser")
    public void i_open_the_browser() {
        System.setProperty("webdriver.chrome.driver", "D:\\cucumber-selenium\\src\\test\\resources\\drivers\\chromedriver.exe"); // Укажите ваш путь
        driver = new ChromeDriver();
    }

    @When("I navigate to {string}")
    public void i_navigate_to(String url) {
        driver.get(url);
    }

    @Then("I search for {string}")
    public void i_search_for(String searchQuery) {
        WebElement searchBox = driver.findElement(By.name("q")); // Google search input
        searchBox.sendKeys(searchQuery);
        searchBox.submit();
    }

    @Then("the page title contains {string}")
    public void the_page_title_contains(String expectedTitlePart) {
        String title = driver.getTitle();
        if (!title.contains(expectedTitlePart)) {
            throw new AssertionError("Title does not contain expected text: " + expectedTitlePart);
        }
        driver.quit();
    }
}
