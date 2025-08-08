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

WebUI.navigateToUrl(GlobalVariable.null)

WebUI.click(findTestObject('Object Repository/New Folder/Page_ADVENTURE makes booking easy/span_I Accept'))

WebUI.setText(findTestObject('Object Repository/New Folder/Page_ADVENTURE makes booking easy/input_Vacation Rental_destination'), 
    'Dhaka')

WebUI.click(findTestObject('Object Repository/New Folder/Page_ADVENTURE makes booking easy/p_Dhaka, Dhaka Division, Bangladesh'))

WebUI.click(findTestObject('Object Repository/New Folder/Page_ADVENTURE makes booking easy/button_Search'))

WebUI.click(findTestObject('Object Repository/New Folder/Page_ADVENTURE Hotel Search Results/p_Hotel Progati Inn'))

WebUI.switchToWindowTitle('Adventure Hotel Details')

WebUI.click(findTestObject('Object Repository/New Folder/Page_Adventure Hotel Details/span_Select Room'))

WebUI.click(findTestObject('Object Repository/New Folder/Page_Adventure Hotel Details/span_Book Now'))

WebUI.setText(findTestObject('Object Repository/New Folder/Page_Adventure/input_Email ID_email'), 'shihabzzhasan@gmail.com')

WebUI.setText(findTestObject('Object Repository/New Folder/Page_Adventure/input_Phone Number_emailOrPhoneField'), '1747834813')

WebUI.click(findTestObject('Object Repository/New Folder/Page_Adventure/span_1'))

WebUI.click(findTestObject('Object Repository/New Folder/Page_Adventure/p_Bangladesh (880)'))

WebUI.click(findTestObject('Object Repository/New Folder/Page_Adventure/button_Update'))

WebUI.click(findTestObject('Object Repository/New Folder/Page_Adventure/input_concat(Who, , s Checking In)_ant-inpu_9d2702'))

WebUI.setText(findTestObject('Object Repository/New Folder/Page_Adventure/input_concat(Who, , s Checking In)_ant-inpu_9d2702_1'), 
    's')

WebUI.setText(findTestObject('Object Repository/New Folder/Page_Adventure/input_concat(Who, , s Checking In)_ant-inpu_9d2702_1_2'), 
    'sh')

WebUI.setText(findTestObject('Object Repository/New Folder/Page_Adventure/input_concat(Who, , s Checking In)_ant-inpu_9d2702_1_2_3'), 
    'shi')

WebUI.setText(findTestObject('Object Repository/New Folder/Page_Adventure/input_concat(Who, , s Checking In)_ant-inpu_9d2702_1_2_3_4'), 
    'shih')

WebUI.setText(findTestObject('Object Repository/New Folder/Page_Adventure/input_concat(Who, , s Checking In)_ant-inpu_9d2702_1_2_3_4_5'), 
    'shiha')

WebUI.setText(findTestObject('Object Repository/New Folder/Page_Adventure/input_concat(Who, , s Checking In)_ant-inpu_9d2702_1_2_3_4_5_6'), 
    'shihab')

WebUI.setText(findTestObject('Object Repository/New Folder/Page_Adventure/input_concat(Who, , s Checking In)_ant-inpu_9d2702_1_2_3_4_5_6_7'), 
    '')

WebUI.click(findTestObject('Object Repository/New Folder/Page_Adventure/input_concat(Who, , s Checking In)_ant-inpu_9d2702_1_2_3_4_5_6_7'))

WebUI.setText(findTestObject('Object Repository/New Folder/Page_Adventure/input_concat(Who, , s Checking In)_ant-inpu_9d2702_1_2_3_4_5_6_7_8'), 
    'H')

WebUI.setText(findTestObject('Object Repository/New Folder/Page_Adventure/input_concat(Who, , s Checking In)_ant-inpu_9d2702_1_2_3_4_5_6_7_8_9'), 
    'Ha')

WebUI.setText(findTestObject('Object Repository/New Folder/Page_Adventure/input_concat(Who, , s Checking In)_ant-inpu_9d2702_1_2_3_4_5_6_7_8_9_10'), 
    'Has')

WebUI.setText(findTestObject('Object Repository/New Folder/Page_Adventure/input_concat(Who, , s Checking In)_ant-inpu_9d2702_1_2_3_4_5_6_7_8_9_10_11'), 
    'Hasa')

WebUI.setText(findTestObject('Object Repository/New Folder/Page_Adventure/input_concat(Who, , s Checking In)_ant-inpu_9d2702_1_2_3_4_5_6_7_8_9_10_11_12'), 
    'Hasan')

WebUI.click(findTestObject('Object Repository/New Folder/Page_Adventure/button_Done'))

WebUI.click(findTestObject('Object Repository/New Folder/Page_Adventure/button_Make Payment'))

