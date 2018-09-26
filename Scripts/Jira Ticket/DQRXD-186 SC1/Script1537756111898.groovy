import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

import org.openqa.selenium.By
import org.openqa.selenium.By.ByCssSelector
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.util.KeywordUtil

//Call Login custom keyword
CustomKeywords.'utility.ValidLogin.Level4Login'()
WebDriver driver = DriverFactory.getWebDriver()

WebUI.delay(15)

//Select currency
WebUI.click(findTestObject('trade.html/Currency Selector'))
WebElement currency = driver.findElement(By.xpath('/html/body/div[1]/div[2]/header2/div[1]/div/ul/li[contains(@class,"instrument-DQR30BTC")]'))
currency.click()

/*//Click Limit tab
WebUI.click(findTestObject('trade.html/Limit tab'))

//Enter Buy Amount
WebUI.setText(findTestObject('trade.html/Buy Amt Field'), '0.2')

//Enter Price
WebUI.setText(findTestObject('trade.html/PricePerBox'), '0.1')

//Click Place Order
WebUI.click(findTestObject('trade.html/Place Order btn'))

//Verify the Instrument entry in the Open Orders table
CustomKeywords.'utility.verifyOpenOrders.verifyInstrument'()

//Verify the Quantity
CustomKeywords.'utility.verifyOpenOrders.verifyQty'()

//Verify Price
CustomKeywords.'utility.verifyOpenOrders.verifyPrice'()*/
  
//Verify Order Book
CustomKeywords.'utility.verifyOrderBook.verifyPrice'()
  
  





