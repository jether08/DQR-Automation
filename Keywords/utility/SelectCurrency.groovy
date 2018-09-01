package utility

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

import org.openqa.selenium.By
import org.openqa.selenium.By.ByCssSelector
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import com.kms.katalon.core.webui.driver.DriverFactory

public class SelectCurrency {
	@Keyword

	def xrpbtc() {

		WebDriver driver = DriverFactory.getWebDriver()
		
		//Select XRPBTC
		WebElement select = driver.findElement(By.xpath('/html/body/div[1]/div[2]/header2/div[1]/div/ul/li[2]'))
		select.click()
		
		//Store primary and secondary currencies in variables
		String currency = "XRPBTC"
		String primary = "XRP"
		String secondary = "BTC"
		
		//Get the currencies above, below, and in the chart
		String above = WebUI.getText(findTestObject('trade.html/Currency Above'))
		String below = WebUI.getText(findTestObject('trade.html/Currency Below'))
		String chart = WebUI.getText(findTestObject('trade.html/Currency Below'))
		
		//Verify if currency above matches the secondary currency
		WebUI.verifyMatch(above, secondary, true)
		
		//Verify if currency below matches the primary currency
		WebUI.verifyMatch(below, primary, true)
		
		//Verify if currency in the chart contains the selected currency text
		if (chart.contains(currency)){
			println("Currency in the chart is correct.")
		}
		else{
			FailureHandling.STOP_ON_FAILURE
		}	


	}
}
