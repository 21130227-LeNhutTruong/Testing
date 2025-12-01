package com.example;

import java.time.Duration;
import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.*;
import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class CompareProductsTest {

    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeClass(alwaysRun = true)
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Wait chung cho toàn bộ test
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    // ==============================
    // Helper hàm
    // ==============================

    private void searchProduct(String name) {
        WebElement searchBox = wait.until(ExpectedConditions.elementToBeClickable(By.id("inp$earch")));
        searchBox.clear();
        searchBox.sendKeys(name);
        searchBox.sendKeys(Keys.ENTER);
    }

    private void clickCompareButton() {
        WebElement compareBtn = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("So sánh")));
        compareBtn.click();
    }

    // ==============================
    // TEST CASE 1: Mở trang, chọn sản phẩm
    // ==============================

    @Test
    public void TC01_openProductAndCompare() {
        driver.get("https://cellphones.com.vn/");

        // Nếu có popup, đóng trước
        try {
            WebElement popupClose = driver.findElement(By.cssSelector(".popup-close"));
            if (popupClose.isDisplayed()) {
                popupClose.click();
            }
        } catch (NoSuchElementException e) {
            // popup không xuất hiện, bỏ qua
        }

        // Chờ ô tìm kiếm
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement searchInput = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//input[@type='text' and @placeholder='Bạn muốn mua gì hôm nay?']")
        ));

        // Click và nhập tìm kiếm
        searchInput.click();
        searchInput.clear();
        searchInput.sendKeys("iphone");
        searchInput.sendKeys(Keys.ENTER);

        // Chọn sản phẩm
        WebElement product = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//img[@alt='iPhone Air 256GB | Chính hãng']")
        ));
        product.click();
    }

    // ==============================
    // TEST CASE 2: So sánh sản phẩm thứ 2
    // ==============================

    @Test
    public void TC02_addSecondProductToCompare() {
        driver.get("https://cellphones.com.vn/chuot-khong-day-logitech-m221.html");

        // Mở popup so sánh
        clickCompareButton();

        // Click icon thêm sản phẩm
        WebElement addBtn = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//div[@id='productDetailV2']//div[contains(@class,'compare-btn')]//svg")));
        addBtn.click();

        // Search
        searchProduct("Chuột Logitech MX");

        // Click kết quả đầu tiên
        WebElement firstResult = wait.until(ExpectedConditions.elementToBeClickable(
                By.cssSelector("#search_autocomplete div.suggestion-item a")));
        firstResult.click();

        clickCompareButton();

        Assert.assertTrue(driver.getCurrentUrl().contains("so-sanh"),
                "Không mở trang so sánh sản phẩm thứ 2!");
    }

    // ==============================
    // TEST CASE 3: Xóa 1 sản phẩm khỏi danh sách so sánh
    // ==============================

    @Test
    public void TC03_removeOneProductFromCompare() {
        driver.get("https://cellphones.com.vn/so-sanh/"
                + "chuot-choi-game-co-day-logitech-g102-lightsync-8000dpi-vs-"
                + "chuot-khong-day-logitech-mx-master-2s-vs-"
                + "chuot-khong-day-logitech-signature-m650");

        WebElement removeBtn = wait.until(ExpectedConditions.elementToBeClickable(
                By.cssSelector("a .icon svg")));
        removeBtn.click();

        Assert.assertTrue(driver.getCurrentUrl().contains("so-sanh"),
                "Không còn ở trang so sánh sau khi xóa!");
    }


    // ==============================
    // TEST CASE 4: Xóa toàn bộ -> quay lại trang gốc so sánh
    // ==============================

    @Test
    public void TC04_clearAllComparisons() {
        driver.get("https://cellphones.com.vn/so-sanh/"
                + "chuot-khong-day-logitech-mx-master-2s-vs-"
                + "chuot-khong-day-logitech-signature-m650");

        WebElement removeBtn = wait.until(ExpectedConditions.elementToBeClickable(
                By.cssSelector("a .icon svg")));
        removeBtn.click();

        Assert.assertTrue(driver.getCurrentUrl().contains("so-sanh"),
                "Trang không trở về danh sách so sánh!");
    }


    // ==============================
    // TEST CASE 5: Thêm sản phẩm từ trang chi tiết → vào bảng so sánh
    // ==============================

    @Test
    public void TC05_compareFromProductDetail() {
        driver.get("https://cellphones.com.vn/chuot-khong-day-logitech-mx-master-2s.html");

        clickCompareButton();

        WebElement btn2 = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//div[@id='productDetailV2']//div[contains(@class,'item')][2]//a")));
        btn2.click();

        Assert.assertTrue(driver.getCurrentUrl().contains("so-sanh"),
                "Không mở trang so sánh khi thêm từ trang chi tiết!");
    }

    // ==============================
    // AFTER CLASS
    // ==============================

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
