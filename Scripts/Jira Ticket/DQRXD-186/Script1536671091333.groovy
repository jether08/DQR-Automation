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

//Click Limit tab
WebUI.click(findTestObject('trade.html/Limit tab'))

//Enter Buy Amount
WebUI.setText(findTestObject('trade.html/Buy Amt Field'), '0.2')

//Enter Price
WebUI.setText(findTestObject('trade.html/PricePerBox'), '0.1')

//Click Place Order
WebUI.click(findTestObject('trade.html/Place Order btn'))

//Verify the Instrument entry in the Open Orders table
WebElement instrument = driver.findElement(By.xpath('//*[@id="OrdersTable"]/tbody/tr[1]/td[1]'))
String instrument_txt = instrument.getText()
println(instrument_txt)
if(instrument_txt.contains('DQR30BTC')){
	KeywordUtil.markPassed('PASSED: Instrument is correct: '+ instrument_txt)
}
else{
	KeywordUtil.markFailed('FAILED: Instrument is wrong: '+ instrument_txt)
}

//Verify the Quantity
WebElement qty = driver.findElement(By.xpath('//*[@id="OrdersTable"]/tbody/tr[1]/td[3]'))
 String qty_txt = qty.getText()
 println(qty_txt)
 if(qty_txt.contains('0.20000000')){
	 KeywordUtil.markPassed('PASSED: Quantity is correct: '+ qty_txt)
 }
 else{
	 KeywordUtil.markFailed('FAILED: Quantity is incorrect: '+ qty_txt)
 }
 
 //Verify Price
 WebElement price = driver.findElement(By.xpath('//*[@id="OrdersTable"]/tbody/tr[1]/td[4]'))
 String price_txt = price.getText()
 println(price_txt)
  if(price_txt.contains('0.10000000')){
	  KeywordUtil.markPassed('PASSED: Price is correct: '+ price_txt)
  }
  else{
	  KeywordUtil.markFailed('FAILED: Price is incorrect: '+ price_txt)
  }
  





