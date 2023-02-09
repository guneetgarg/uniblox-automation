package com.insure.pages;

import com.google.common.util.concurrent.Uninterruptibles;
import com.insure.util.CommonUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class HomePage {

    By getStarted = By.cssSelector(".mr-1");

    By applicantType_Employee = By.xpath("//div[contains(text(),'Employee')]");

    By product_SupplementalLife = By.xpath("//div[contains(text(),'Supplemental Life')]");

    By nextButton = By.xpath("//div[text()='Next']");

    By firstName = By.cssSelector("#first_name");

    By lastName = By.cssSelector("#last_name");

    By email = By.cssSelector("input[name='answer']");

    By sliderCoverageAmount = By.cssSelector(".rc-slider.rc-slider-horizontal");

    By dob = By.cssSelector("#date");

    By maleGender = By.xpath("//div[contains(text(),'Male')]");
    By phoneNumber = By.xpath("//input[@name='answer']");

    By location = By.cssSelector("input[placeholder='Enter a location']");

    By appNo = By.cssSelector("#apt_unit");

    By isAuthReleaseAgree = By.cssSelector("input[name='isAuthReleaseAgree']");

    By isConsentBusiness = By.cssSelector("input[name='isConsentBusiness']");

    By height = By.cssSelector("#height");
    By weight = By.cssSelector("input[name='weight']");
    By noneOfTheAbove = By.xpath("//label[normalize-space()='None of the above']");

    By no = By.cssSelector("label[for='no']");


    By signYourApplication = By.xpath("//div[contains(text(),'Sign your application')]");


    public void clickGetStarted() {
        CommonUtils.click(getStarted);
    }

    public void clickApplicantTypeEmployee() {
        CommonUtils.click(applicantType_Employee);
    }

    public void clickProductSupplementalLife() {
        CommonUtils.click(product_SupplementalLife);
    }

    public void clickNextButton() {
        CommonUtils.click(nextButton);
    }


    public void typeFirstName(String str) {
        CommonUtils.type(firstName, str);
    }


    public void typeLastName(String str) {
        CommonUtils.type(lastName, str);
    }

    public void typeEmail(String str) {
        CommonUtils.type(email, str);
    }


    public void setSliderCoverageAmount() {
        WebElement slider = CommonUtils.driver.findElement(sliderCoverageAmount);

        slider.click();
        try {
            for (int i = 1; i <= 5; i++) {
                slider.sendKeys(Keys.ARROW_RIGHT);
            }
        } catch (Exception ex) {

        }
    }

    public void setDob(String str) {
        CommonUtils.type(dob, str);
    }

    public void setGenderMale() {
        CommonUtils.click(maleGender);
    }

    public void setPhoneNumber(String str) {
        CommonUtils.type(phoneNumber, str);
    }

    public void seLocation(String str) {
        CommonUtils.type(location, str);
        Uninterruptibles.sleepUninterruptibly(2, TimeUnit.SECONDS);
        CommonUtils.click(location);

        CommonUtils.type(location, Keys.ARROW_DOWN);
        CommonUtils.type(location, Keys.ENTER);

    }

    public void clickIsAuthReleaseAgree() {
        CommonUtils.click(isAuthReleaseAgree);
    }

    public void clickIsConsentBusiness() {
        CommonUtils.click(isConsentBusiness);
    }

    public void setHeight(String str) {
        Select dropdown = new Select(CommonUtils.driver.findElement(height));
        dropdown.selectByVisibleText(str);
    }

    public void setWeight(String str) {
        CommonUtils.type(weight, str);
    }

    public void clickNoneOfTheAbove() {
        Uninterruptibles.sleepUninterruptibly(10,TimeUnit.SECONDS);
        CommonUtils.click(noneOfTheAbove);
    }

    public void clickNo() {
        Uninterruptibles.sleepUninterruptibly(7,TimeUnit.SECONDS);

        CommonUtils.click(no);
    }

    public void clickSignYourApplication() {
        CommonUtils.click(signYourApplication);
    }

}