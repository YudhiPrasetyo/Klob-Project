package klobid.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.concurrent.TimeUnit;

public class LoginPage extends PageObject {

    @FindBy (xpath = "//div[@class='registration-login-form']")
    private WebElementFacade formLogin;

    @FindBy (xpath = "//input[@id='catchupIdInputSignin']")
    private WebElementFacade inputUsername;

    @FindBy (xpath = "//input[@id='passwordInputSignin']")
    private WebElementFacade inputPassword;

    @FindBy (xpath = "//button[contains(text(),'MASUK')]")
    private WebElementFacade clickMasuk;

    @FindBy (xpath = "//div[@class='col-12']//div[1]//em[1]")
    private WebElementFacade errorUsername;

    @FindBy (xpath = "//em[@id='passwordInputSignin-error']")
    private WebElementFacade errorPassword;

    @FindBy (xpath = "//a[contains(text(),'Lupa Kata Sandi?')]")
    private WebElementFacade linkLupaKataSandi;

    @FindBy (xpath = "//a[@href='/forgotklobid']")
    private WebElementFacade linkLupaKlobId;

    public Boolean isFormLoginVisible(){
        return formLogin
                .withTimeoutOf(5, TimeUnit.SECONDS)
                .isCurrentlyVisible();
    }

    public void userName(String username){
        inputUsername.type(username);
    }

    public void password(String password){
        inputPassword.type(password);
    }

    public void clickMasuk(){
        clickMasuk.click();
    }

    public Boolean isErrorUsernameVisible(){
        return errorUsername
                .withTimeoutOf(5,TimeUnit.SECONDS)
                .isCurrentlyVisible();
    }

    public Boolean isErrorPasswordVisible(){
        return errorPassword
                .withTimeoutOf(5, TimeUnit.SECONDS)
                .isCurrentlyVisible();
    }

    public void linkLupaKataSandi(){
        linkLupaKataSandi.click();
    }

    public void linkLupaKlobID(){
        linkLupaKlobId.click();
    }

}
