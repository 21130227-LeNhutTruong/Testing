import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.testobject.SelectorMethod

import com.thoughtworks.selenium.Selenium
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.WebDriver
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium
import static org.junit.Assert.*
import java.util.regex.Pattern
import static org.apache.commons.lang3.StringUtils.join
import org.testng.asserts.SoftAssert
import com.kms.katalon.core.testdata.CSVData
import org.openqa.selenium.Keys as Keys

SoftAssert softAssertion = new SoftAssert();
WebUI.openBrowser('https://www.google.com/')
def driver = DriverFactory.getWebDriver()
String baseUrl = "https://www.google.com/"
selenium = new WebDriverBackedSelenium(driver, baseUrl)
selenium.open("https://cellphones.com.vn/thiet-bi-am-thanh/tai-nghe/headphones.html")
selenium.click("xpath=//div[@id='blockFilterSort']/div[3]/div/div/div[19]/div/a/div[2]/h3")
selenium.open("https://cellphones.com.vn/tai-nghe-chup-tai-havit-h619bt.html")
selenium.click("xpath=//div[@id='productDetailV2']/section/div/div[2]/div[2]/div[2]/ul/li[2]/a")
selenium.click("xpath=//div[@id='productDetailV2']/section/div/div[2]/div[7]")
selenium.click("xpath=//div[@id='productDetailV2']/section/div/div[2]/div[9]/div/div/div/button[2]/strong")
selenium.click("link=ng nh�p")
selenium.click("xpath=//div[@id='productDetailV2']/section/div/div[2]/div[3]/div[2]/ul/li[2]/a/div/strong")
selenium.click("xpath=//div[@id='productDetailV2']/section/div/div[2]/div[9]/div/div/div/button[2]/strong")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Gi� h�ng'])[1]/following::*[name()='svg'][1]")
selenium.open("https://cellphones.com.vn/cart/")
selenium.click("xpath=//div[@id='stickyBottomBar']/button")
selenium.click("xpath=//div[@id='listItemSuperCart']/div[2]/div/div[2]/div[2]/div[2]/span")
selenium.click("xpath=//div[@id='listItemSuperCart']/div[2]/div/div[2]/div[2]/div[2]/span")
selenium.click("xpath=//div[@id='listItemSuperCart']/div[2]/div/div/div/label")
selenium.click("xpath=//div[@id='stickyBottomBar']/button")
selenium.click("xpath=//div[@id='__layout']/div/div[2]/div[2]/div/div[4]/div/div/div[2]/label")
selenium.click("xpath=//div[@id='__layout']/div/div[2]/div[2]/div/div[4]/div/div[2]/div/div/div[2]/div/div[2]/div/input")
selenium.click("xpath=//div[@id='__layout']/div/div[2]/div[2]/div/div[4]/div/div[2]/div/div/div[2]/div/div[2]/div/div[3]/div/div[22]/span")
selenium.click("xpath=//div[@id='__layout']/div/div[2]/div[2]/div/div[4]/div/div[2]/div/div/div[2]/div/div[2]/div[2]/input")
selenium.click("xpath=//div[@id='__layout']/div/div[2]/div[2]/div/div[4]/div/div[2]/div/div/div[2]/div/div[2]/div[2]/div[3]/div/div[8]/span")
selenium.click("id=VAT-No")
selenium.click("xpath=//div[@id='__layout']/div/div[2]/div[4]/div/div[2]/button")
selenium.click("xpath=//div[@id='__layout']/div/div[2]/div[2]/div/div[4]/div/div[2]/div/div/div[2]/div[2]/input")
selenium.type("xpath=//div[@id='__layout']/div/div[2]/div[2]/div/div[4]/div/div[2]/div/div/div[2]/div[2]/input", ("220 ��ng s� 8").toString())
selenium.click("xpath=//div[@id='__layout']/div/div[2]/div[2]/div/div[4]/div/div[2]/div/div/div[2]/div[2]/div[3]/div/div[2]/div[2]/i")
selenium.click("xpath=//div[@id='__layout']/div/div[2]/div[4]/div/div[2]/button")
selenium.click("xpath=//div[@id='__layout']/div/div[2]/div[2]/div/div[3]/div/div[2]/span")
selenium.click("xpath=//div[@id='__layout']/div/div[2]/div[2]/div/div[3]/div[2]/div[2]/div[2]/div/div/div[4]/div[2]/span")
selenium.click("xpath=//div[@id='__layout']/div/div[2]/div[2]/div/div[3]/div[2]/div[2]/div[3]/button")
selenium.click("xpath=//div[@id='__layout']/div/div[2]/div[3]/div/div[2]/button")
selenium.open("https://payment.momo.vn/v2/gateway/pay?t=TU9NT0pEU1EyMDIzMDgwN3wzMDM4NzYwNjM&s=7835939a37bbe86e6b3bb32aae74f51af3cfd087420ab3a36e0b2e8de3d9fca0")
selenium.open("https://cellphones.com.vn/cart/payment")
selenium.click("xpath=//div[@id='__layout']/div/div[2]/div[2]/div/div[3]/div/div[2]/p")
selenium.click("xpath=//div[@id='__layout']/div/div[2]/div[2]/div/div[3]/div[2]/div[2]/div[2]/div/div/div[3]")
selenium.click("xpath=//div[@id='__layout']/div/div[2]/div[2]/div/div[3]/div[2]/div[2]/div[3]/button")
selenium.click("xpath=//div[@id='__layout']/div/div[2]/div[3]/div/div[2]/button")
selenium.open("https://pay.vnpay.vn/Transaction/PaymentMethod.html?token=00869f4c8268403583243a75086f2648")
selenium.open("https://cellphones.com.vn/cart/payment")
selenium.click("xpath=//div[@id='__layout']/div/div[2]/div[2]/div/div[3]/div/div[2]/p")
selenium.click("xpath=//div[@id='__layout']/div/div[2]/div[2]/div/div[3]/div[2]/div[2]/div[2]/div/div/div")
selenium.click("xpath=//div[@id='__layout']/div/div[2]/div[2]/div/div[3]/div[2]/div[2]/div[3]/button")
selenium.click("xpath=//div[@id='__layout']/div/div[2]/div[2]/div/div[3]/div/div[3]/span")
selenium.click("xpath=//div[@id='__layout']/div/div[2]/div[2]/div/div[3]/div[2]/div[2]/div[2]/div/div/div[4]/div[2]/span")
selenium.click("xpath=//div[@id='__layout']/div/div[2]/div[2]/div/div[3]/div[2]/div[2]/div[3]/button")
selenium.click("xpath=//div[@id='__layout']/div/div[2]/div[3]/div/div[2]/button")
selenium.open("https://payment.momo.vn/v2/gateway/pay?t=TU9NT0pEU1EyMDIzMDgwN3wzMDM4NzYwODM&s=cc791ef926881399ccd237f9aa4b9bb6ec3a55f16a24d7adbe861040b0dc71b1")
selenium.open("https://cellphones.com.vn/cart/payment")
selenium.click("xpath=//div[@id='__layout']/div/div[2]/div[2]/div/div[3]/div/div[3]/span")
selenium.click("xpath=//div[@id='__layout']/div/div[2]/div[2]/div/div[3]/div[2]/div[2]/div[2]/div/div/div[3]/div[2]/p")
selenium.click("xpath=//div[@id='__layout']/div/div[2]/div[2]/div/div[3]/div[2]/div[2]/div[3]/button")
selenium.click("xpath=//div[@id='__layout']/div/div[2]/div[3]/div/div[2]/button")
selenium.open("https://payment.momo.vn/v2/gateway/pay?t=TU9NT0pEU1EyMDIzMDgwN3wzMDM4NzYxMDU&s=b5b434cf0aac2ed5c0a28da5b888e4e56c156bb5e3ed354853a6c58a316d6792")
selenium.open("https://cellphones.com.vn/cart/payment")
selenium.click("xpath=//div[@id='__layout']/div/div[2]/div[2]/div/div[3]/div")
selenium.click("xpath=//div[@id='__layout']/div/div[2]/div[2]/div/div[3]/div[2]/div[2]/div[2]/div/div/div[8]")
selenium.click("xpath=//div[@id='__layout']/div/div[2]/div[2]/div/div[3]/div[2]/div[2]/div[3]/button")
selenium.click("xpath=//div[@id='__layout']/div/div[2]/div[2]/div/div[2]/div[2]/div/div")
selenium.click("xpath=//div[@id='__layout']/div/div[2]/div[3]/div/div[2]/button")
selenium.open("https://gateway.zalopay.vn/pay/v2/?order=eyJ6cHRyYW5zdG9rZW4iOiJBQ3N2dVBXT2ZuMF9VQUd6YTBCX3R5a2ciLCJhcHBpZCI6NDQ2M30=")
selenium.open("https://gateway.zalopay.vn/pay/v2?order=eyJ6cHRyYW5zdG9rZW4iOiJBQ3N2dVBXT2ZuMF9VQUd6YTBCX3R5a2ciLCJhcHBpZCI6NDQ2M30=")
selenium.open("https://cellphones.com.vn/cart/payment")
selenium.click("xpath=//div[@id='__layout']/div/div[2]/div[2]/div/div[3]/div/div[2]/p")
selenium.click("xpath=//div[@id='__layout']/div/div[2]/div[2]/div/div[3]/div[2]/div[2]/div[2]/div/div/div[3]/div[2]/p")
selenium.click("xpath=//div[@id='__layout']/div/div[2]/div[2]/div/div[3]/div[2]/div[2]/div[3]/button")
selenium.click("xpath=//div[@id='__layout']/div/div[2]/div[3]/div/div[2]/button")
selenium.open("https://gateway.zalopay.vn/pay/v2/?order=eyJ6cHRyYW5zdG9rZW4iOiJBQ0Z2eTQyakN4Qklsc0VObmVaT1FiTFEiLCJhcHBpZCI6NDQ2M30=")
selenium.open("https://gateway.zalopay.vn/pay/v2?order=eyJ6cHRyYW5zdG9rZW4iOiJBQ0Z2eTQyakN4Qklsc0VObmVaT1FiTFEiLCJhcHBpZCI6NDQ2M30=")
selenium.open("https://cellphones.com.vn/cart/payment")
selenium.click("xpath=//div[@id='__layout']/div/div[2]/div[2]/div/div[3]/div/div[3]/span")
selenium.click("xpath=//div[@id='__layout']/div/div[2]/div[2]/div/div[3]/div[2]/div[2]/div[2]/div/div/div[6]")
selenium.click("xpath=//div[@id='__layout']/div/div[2]/div[2]/div/div[3]/div[2]/div[2]/div[3]/button")
selenium.click("xpath=//div[@id='__layout']/div/div[2]/div[3]/div/div[2]/button")
selenium.open("https://payment.momo.vn/v2/gateway/pay?t=TU9NT0pEU1EyMDIzMDgwN3wzMDM4NzYxMjg&s=d00bbe15932577745cb6b60867bbcc15b119198b2ce6acb1d4d340a86daac32e")
selenium.open("https://cellphones.com.vn/cart/payment")
