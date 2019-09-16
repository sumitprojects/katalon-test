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

WebUI.navigateToUrl('https://enterprise.github.com/login')

WebUI.click(findTestObject('Object Repository/github login m/Page_GitHub Enterprise - The best way to build and ship software/a_Sign in via GitHub'))

WebUI.setText(findTestObject('Object Repository/github login m/Page_Sign in to GitHub  GitHub/input_Username or email address_login'), 
    'manjushagire')

WebUI.setEncryptedText(findTestObject('Object Repository/github login m/Page_Sign in to GitHub  GitHub/input_Forgot password_password'), 
    '/oi8xjQaoTtB8tET1AhsdQ==')

WebUI.click(findTestObject('Object Repository/github login m/Page_Sign in to GitHub  GitHub/input_Forgot password_commit'))

WebUI.click(findTestObject('Object Repository/github login m/Page_Authorize application/a_github'))

WebUI.click(findTestObject('Object Repository/github login m/Page_GitHub/summary_New organization_Header-link'))

WebUI.click(findTestObject('Object Repository/github login m/Page_GitHub/button_Sign out'))

WebUI.closeBrowser()

