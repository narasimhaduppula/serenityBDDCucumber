package utils;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.webdriver.javascript.JavascriptExecutorFacade;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptExecutorUtil {

    public static JavascriptExecutorFacade jsef;
    public static JavascriptExecutor jse;

    public static void jsClick(WebElementFacade webElementFacade, WebDriver webDriver) {
        jsef = new JavascriptExecutorFacade(webDriver);
        jsef.executeScript("arguments[0].click();", webElementFacade);
    }

    public static void jsClick(WebElement webElement, WebDriver webDriver) {
        jse = (JavascriptExecutor) webDriver;
        jse.executeScript("arguments[0].click();", webElement);
    }

    public static void jsScrollToTop(WebDriver webDriver) {
        jsef = (JavascriptExecutorFacade) webDriver;
        jsef.executeScript("window.scroll(document.body.scrollHeight,0);");
    }

    public static void jsScrollToBottom(WebDriver webDriver) {
        jse = (JavascriptExecutor) webDriver;
        jse.executeScript("window.scroll(0,document.body.scrollHeight);");
    }

    public static void jsScrollToElement(WebElementFacade webElementFacade, WebDriver webDriver) {
        jsef = new JavascriptExecutorFacade(webDriver);
        jsef.executeScript("arguments[0].scrollIntoView(true);", webElementFacade);
    }

    public static void jsScrollToElement(WebElement webElement, WebDriver webDriver) {
        jse = (JavascriptExecutor) webDriver;
        jse.executeScript("arguments[0].scrollIntoView(true);", webElement);
    }

    public static String jsGetText(WebElementFacade webElementFacade, WebDriver webDriver) {
        jsef = new JavascriptExecutorFacade(webDriver);
        return jsef.executeScript("return arguments[0].innerText", webElementFacade).toString();
    }

    public static String jsGetText(WebElement webElement, WebDriver webDriver) {
        jse = (JavascriptExecutor) webDriver;
        return jse.executeScript("return arguments[0].innerText", webElement).toString();
    }
}
