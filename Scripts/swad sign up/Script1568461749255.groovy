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

WebUI.navigateToUrl('http://demo2.wpdance.com/oswadmarket/?page_id=263')

WebUI.setText(findTestObject('Object Repository/swad object/Page_Oswad Market  My Account/input__email'), 'lebell@esenyurt-travesti.xyz')

WebUI.setEncryptedText(findTestObject('Object Repository/swad object/Page_Oswad Market  My Account/input__password'), '/oi8xjQaoTvgiSPrrA3aGg==')

WebUI.setEncryptedText(findTestObject('Object Repository/swad object/Page_Oswad Market  My Account/input__confirm_password'), 
    '/oi8xjQaoTvgiSPrrA3aGg==')

WebUI.click(findTestObject('Object Repository/swad object/Page_Oswad Market  My Account/input_'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/swad object/Page_Oswad Market  My Account/a_Log Out'))

not_run: WebUI.closeBrowser()

