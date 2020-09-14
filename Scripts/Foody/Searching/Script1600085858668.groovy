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

//Mobile.startApplication('D:\\Downloads\\Foody Find Reserve Delivery_v5.3.1_apkpure.com.apk', false)
Mobile.tap(findTestObject('foodySearch/txt_search'), 0)

Mobile.setText(findTestObject('foodySearch/txt_search1'), 'the jade', 0)

Mobile.tap(findTestObject('foodySearch/btn_jade'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('foodySearch/btn_review'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Foody/txt_title1'), 0)

Mobile.clearText(findTestObject('Foody/txt_title1'), 0)

def title = 'testing'

def review = 'foody'

Mobile.setText(findTestObject('Foody/txt_title1'), title, 0)

Mobile.tap(findTestObject('Foody/txt_komen2'), 0)

Mobile.setText(findTestObject('Foody/txt_komen2'), review, 0)

Mobile.tap(findTestObject('foodySearch/btn_post'), 0)

Mobile.tap(findTestObject('foodySearch/btn_rate'), 0)

Mobile.setSliderValue(findTestObject('foodySearch/slide_location'), 70, 0)

Mobile.setSliderValue(findTestObject('foodySearch/slide_price'), 80, 0)

Mobile.setSliderValue(findTestObject('foodySearch/slide_quality'), 90, 0)

Mobile.setSliderValue(findTestObject('foodySearch/slide_service'), 80, 0)

Mobile.setSliderValue(findTestObject('foodySearch/slide_decoration'), 70, 0)

Mobile.tap(findTestObject('foodySearch/btn_come back'), 0)

Mobile.tap(findTestObject('foodySearch/btn_sure'), 0)

Mobile.tap(findTestObject('foodySearch/btn_done'), 0)

Mobile.tap(findTestObject('foodySearch/btn_post (1)'), 0)

Mobile.tap(findTestObject('foodySearch/btn_view rewards'), 0)


def actualtitle = Mobile.verifyElementVisible(findTestObject('Foody/verify_title'), 0)

Mobile.verifyMatch(actualtitle, title, false)

def actualreview = Mobile.verifyElementVisible(findTestObject('Foody/verify_komen'), 0)

Mobile.verifyMatch(actualreview, review, false)

Mobile.tap(findTestObject('Foody/btn_backReview'), 0)

Mobile.tap(findTestObject('Foody/btn_backJadeBakery'), 0)

