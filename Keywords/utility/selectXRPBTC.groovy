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

public class selectXRPBTC {
	@Keyword
	
	def xrpbtc() {
			
		WebDriver driver = DriverFactory.getWebDriver()
		WebElement select = driver.findElement(By.xpath('/html/body/div[1]/div[2]/header2/div[1]/div/ul/li[2]'))
		//WebUI.click(findTestObject('trade.html/XRPBTC'))
		
		select.click()
		def selected = WebUI.getText(select)
		println(selected)
		
		/*def coin = WebUI.getText(findTestObject('trade.html/XRPBTC'))
		println(coin)
		def chart = WebUI.getText(findTestObject('trade.html/Currency in chart'))
		WebUI.verifyMatch(chart, coin, true)*/
		
		
	}
}
