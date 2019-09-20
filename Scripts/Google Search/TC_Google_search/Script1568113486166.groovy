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
/*
 * Add this line if the keys are not working in your katalon
 *
 * */ import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

for (def index : inputMultiple) {
    WebUI.navigateToUrl(testUrl)

    WebUI.setText(findTestObject('Object Repository/Page_Google/input_Sign in_q'), index)

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Page_Google/input_Sign in_q'), Keys.chord(Keys.ENTER))

    WebUI.delay(2)

    WebUI.click(findTestObject('Object Repository/Page_Katalon - Google Search/div_Katalon_link'))
}

not_run: WebUI.closeBrowser()

