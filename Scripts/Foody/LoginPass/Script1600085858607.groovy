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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

//Mobile.startApplication('D:\\Downloads\\Foody Find Reserve Delivery_v5.3.1_apkpure.com.apk', true)

Mobile.tap(findTestObject('Object Repository/Foody/android.widget.ImageView (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Foody/android.widget.TextView - Login (1)'), 0)

Mobile.setText(findTestObject('Object Repository/Foody/android.widget.EditText - Your password'), 'neysa1', 0)

Mobile.tap(findTestObject('Object Repository/Foody/android.widget.TextView - Login (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Foody/android.widget.ImageView (2)'), 0)

//Mobile.closeApplication()
