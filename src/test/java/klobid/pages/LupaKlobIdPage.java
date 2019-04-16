package klobid.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.concurrent.TimeUnit;

public class LupaKlobIdPage extends PageObject{
    @FindBy (xpath = "//div[@id='ForPass']")
    private WebElementFacade formLupaKlobId;

    @FindBy (xpath = "//input[@id='sendIdEmail']")
    private WebElementFacade sendEmail;

    @FindBy (xpath = "//button[@id='btnSendIdByEmail']")
    private WebElementFacade btnSendKirim;

    public Boolean formLupaKlobId(){
        return formLupaKlobId
                .withTimeoutOf(5, TimeUnit.SECONDS)
                .isCurrentlyVisible();
    }

    public void sendEmail(String sendemail){
        sendEmail.type(sendemail);
    }

    public void btnSendKirim (){
        btnSendKirim.click();
    }

}
