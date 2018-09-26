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

import internal.GlobalVariable

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import com.kms.katalon.core.webui.driver.DriverFactory
import org.openqa.selenium.support.ui.WebDriverWait

public class verifyOrderBook {
	@Keyword
	def verifyPrice(){
		WebDriver driver = DriverFactory.getWebDriver()

		List <WebElement> rows = driver.findElements(By.xpath('//*[@id="OrdersTable"]/tbody/tr[@data-tip="true"]'))
		int rows_count = rows.size()
		println(rows_count)

		for(i=1;i<=rows_count;i++){
			WebElement price = driver.findElement(By.xpath('//*[@id="OrdersTable"]/tbody/tr[@data-tip="true"]/td[4]'))
			String price_val = price.getText()
			println(price_val)
		}
		/*List <WebElement> bidrows = driver.findElements(By.xpath('//div[@id="bidRows"]/span'))
		 int bidrow_count = bidrows.size()
		 println(bidrow_count)
		 for(int i=1;i<=bidrow_count;i++){
		 String cellPrice = driver.findElement(By.xpath('//div[@id="bidRows"]/span['+i+']/div[1]')).getText()
		 String cellQty = driver.findElement(By.xpath('//div[@id="bidRows"]/span['+i+']/div[2]')).getText()
		 String cellTotal = driver.findElement(By.xpath('//div[@id="bidRows"]/span['+i+']/div[3]')).getText()
		 }*/
	}
}
