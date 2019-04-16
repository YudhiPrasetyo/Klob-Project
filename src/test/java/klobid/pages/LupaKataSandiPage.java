package klobid.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.concurrent.TimeUnit;

public class LupaKataSandiPage extends PageObject {
    @FindBy (xpath = "//div[@class='center']")
    private WebElementFacade formLupakataSandi;

    @FindBy (xpath = "//input[@id='catchupIdForgotPassword']")
    private WebElementFacade inputLupaKataSandi;

    @FindBy (xpath = "//button[@type='submit']")
    private WebElementFacade btnKirim;

    @FindBy (xpath = "//em[@id='catchupIdForgotPassword-error']")
    private WebElementFacade emLupaKataSandi;

    @FindBy (xpath = "//div[@id='swal2-content']")
    private WebElementFacade popUpLupaKataSandi;

    public Boolean isFormLupaKataSandiVisible(){
        return formLupakataSandi
                .withTimeoutOf(5, TimeUnit.SECONDS)
                .isCurrentlyVisible();
    }

    public void inputLupaKataSandi(String lupaKataSandi){
        inputLupaKataSandi.type(lupaKataSandi);
    }

    public void clickBtnKirim(){
        btnKirim.click();
    }

    public Boolean emLupaKataSandi(){
        return emLupaKataSandi
                .withTimeoutOf(5, TimeUnit.SECONDS)
                .isCurrentlyVisible();
    }

    public Boolean popUpLupaKataSandi(){
        return popUpLupaKataSandi
                .withTimeoutOf(5,TimeUnit.SECONDS)
                .isCurrentlyVisible();
    }
}
