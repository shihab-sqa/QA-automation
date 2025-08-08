import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.PROD)

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_ADVENTURE makes booking easy/button_I Accept'))

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_ADVENTURE makes booking easy/path'))

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_ADVENTURE makes booking easy/span_LOGINSIGN UP'))

WebUI.setText(findTestObject('Object Repository/New Folder (1)/Page_Adventure/input_Enter your Email IDMobile Number_emai_a52cda'), 
    'shihabz.hasan@bd.adventurekk.com')

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_Adventure/span_Sign In'))

WebUI.setEncryptedText(findTestObject('Object Repository/New Folder (1)/Page_Adventure/input_Password_ant-input py-2 leading-22px _de26d2'), 
    'p4y+y39Ir5Pc+STqmPi2bw==')

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_Adventure/span_Sign In'))

