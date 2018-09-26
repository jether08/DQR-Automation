package utility

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.util.KeywordUtil

import internal.GlobalVariable

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import com.kms.katalon.core.webui.driver.DriverFactory
import org.openqa.selenium.support.ui.WebDriverWait
import org.openqa.selenium.support.ui.ExpectedConditions

public class verifyOpenOrders {

	@Keyword
	//Verify the Instrument entry in the Open Orders table
	def verifyInstrument(){

		WebDriver driver = DriverFactory.getWebDriver()

		WebElement instrument = driver.findElement(By.xpath('//*[@id="OrdersTable"]/tbody/tr[1]/td[1]'))
		String instrument_txt = instrument.getText()
		println(instrument_txt)
		if(instrument_txt.contains('DQR30BTC')){
			KeywordUtil.markPassed('PASSED: Instrument is correct: '+ instrument_txt)
		}
		else{
			KeywordUtil.markFailed('FAILED: Instrument is wrong: '+ instrument_txt)
		}
	}

	@Keyword
	//Verify the Quantity
	def verifyQty(){
		WebDriver driver = DriverFactory.getWebDriver()
		WebElement qty = driver.findElement(By.xpath('//*[@id="OrdersTable"]/tbody/tr[1]/td[3]'))
		String qty_txt = qty.getText()
		println(qty_txt)

		if(qty_txt.contains('0.20000000')){
			KeywordUtil.markPassed('PASSED: Quantity is correct: '+ qty_txt)
		}
		else{
			KeywordUtil.markFailed('FAILED: Quantity is incorrect: '+ qty_txt)
		}
	}

	@Keyword
	//Verify Price
	def verifyPrice(){

		WebDriver driver = DriverFactory.getWebDriver()
		WebElement price = driver.findElement(By.xpath('//*[@id="OrdersTable"]/tbody/tr[1]/td[4]'))
		String price_txt = price.getText()
		println(price_txt)

		if(price_txt.contains('0.10000000')){
			KeywordUtil.markPassed('PASSED: Price is correct: '+ price_txt)
		}
		else{
			KeywordUtil.markFailed('FAILED: Price is incorrect: '+ price_txt)
		}
	}

}
