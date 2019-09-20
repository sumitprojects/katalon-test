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

WebUI.openBrowser('')

for (def index : (0..email.size()-1)) {
    WebUI.navigateToUrl('https://listify-demos.astoundify.com/rentals/')

    WebUI.click(findTestObject('Object Repository/listify object/login/a_Log In'))

    WebUI.setText(findTestObject('Object Repository/listify object/login/input__username'), email[index])

    WebUI.setText(findTestObject('Object Repository/listify object/login/input__password'), pass[index])

    WebUI.click(findTestObject('Object Repository/listify object/login/input__login'))

    WebUI.mouseOver(findTestObject('listify object/login/mouse over'))

    WebUI.click(findTestObject('Object Repository/listify object/login/a_Log Out'))

    WebUI.delay(5)
}

not_run: WebUI.click(findTestObject('Page_Account  Listify Rentals/a_Confirm and log out'))

not_run: WebUI.closeBrowser()

