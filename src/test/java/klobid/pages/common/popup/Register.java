package klobid.pages.common.popup;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.concurrent.TimeUnit;

public class Register extends PageObject {
    @FindBy(xpath = "//div[@class='modal-content']")
    private WebElementFacade formRegister;

    @FindBy (xpath = "//input[@id='catchupIdRegister']")
    private WebElementFacade inputKlobId;

    @FindBy (xpath = "//input[@id='emailInputRegister']")
    private WebElementFacade inputEmail;

    @FindBy (xpath = "//input[@id='emailInputRegister']")
    private WebElementFacade clickEmail;

    @FindBy (xpath = "//input[@id='phoneNumber']")
    private WebElementFacade inputNomorPonsel;

    @FindBy (xpath = "//input[@id='phoneNumber']")
    private WebElementFacade clickNomorPonsel;

    @FindBy (xpath = "//button[@title='Tidak Ada']")
    private WebElementFacade clickKebutuhanKhusus;

    @FindBy (xpath = "//div[@class='dropdown-menu open show']")
    private WebElementFacade popUpKebutuhanKhusus;

    @FindBy (xpath = "//li[@data-original-index='3']")
    private WebElementFacade klikPendengaran;

    @FindBy (xpath = "//input[@id='passwordInputRegister']")
    private WebElementFacade inputKataSandi;

    @FindBy (xpath = "//input[@id='password2InputRegister']")
    private WebElementFacade inputUlangKataSandi;

    @FindBy (xpath = "//input[@id='password2InputRegister']")
    private WebElementFacade clickUlangKataSandi;

    @FindBy (xpath = "//em[@id='catchupIdRegister-error']")
    private WebElementFacade errorMessageId;

    @FindBy (xpath = "//em[@id='emailInputRegister-error']")
    private WebElementFacade errorMessageEmail;

    @FindBy (xpath = "//em[@id='phoneNumber-error']")
    private WebElementFacade errorMessagePonsel;

    @FindBy (xpath = "//em[@id='passwordInputRegister-error']")
    private WebElementFacade errorMessageKataSandi;

    @FindBy (xpath = "//em[@id='password2InputRegister-error']")
    private WebElementFacade errorMessageUlangKataSandi;

    @FindBy (xpath = "//button[contains(text(),'LANJUTKAN')]")
    private WebElementFacade btnLanjutkan;

    @FindBy (xpath = "//div[@class='swal2-popup swal2-modal swal2-noanimation']")
    private WebElementFacade popUpSukses;

    @FindBy (xpath = "//button[contains(text(),'OK')]")
    private WebElementFacade btnOk;

    public Boolean isFormRegisterVisible(){
        return formRegister
                .withTimeoutOf(5, TimeUnit.SECONDS)
                .isCurrentlyVisible();
    }

    public void inputKlobId(String klobId){
        inputKlobId.type(klobId);
    }

    public void inputEmail(String email){
        inputEmail.type(email);
    }

    public void clickEmail(){
        clickEmail.click();
    }

    public void inputNomorPonsel(String nomorPonsel){
        inputNomorPonsel.type(nomorPonsel);
    }

    public void clickNomorPonsel(){
        clickNomorPonsel.click();
    }

    public void clickKebutuhanKhusus(){
        clickKebutuhanKhusus.click();
    }

    public Boolean isPopUpKebutuhanVisible(){
        return popUpKebutuhanKhusus
                .withTimeoutOf(5,TimeUnit.SECONDS)
                .isCurrentlyVisible();
    }

    public void clickPendengaran() {
        klikPendengaran.click();
    }

    public void inputKataSandi(String kataSandi){
        inputKataSandi.type(kataSandi);
    }

    public void inputUlangKataSandi(String ulangKataSandi){
        inputUlangKataSandi.type(ulangKataSandi);
    }

    public void clickUlangKataSandi(){
        clickUlangKataSandi.click();
    }

    public void clickLanjutkan(){
        btnLanjutkan.click();
    }

    public Boolean isPopUpSuksesVisible(){
        return popUpSukses
                .withTimeoutOf(5,TimeUnit.SECONDS)
                .isCurrentlyVisible();
    }

    public void clickOk(){
        btnOk.click();
    }

    public Boolean errorMessageID(){
        return errorMessageId
                .withTimeoutOf(5,TimeUnit.SECONDS)
                .isCurrentlyVisible();
    }

    public Boolean errorMessageEmail(){
        return errorMessageEmail
                .withTimeoutOf(5,TimeUnit.SECONDS)
                .isCurrentlyVisible();
    }

    public Boolean errorMessageNoPonsel(){
        return errorMessagePonsel
                .withTimeoutOf(5,TimeUnit.SECONDS)
                .isCurrentlyVisible();
    }

    public Boolean errorMessageKataSandi(){
        return errorMessageKataSandi
                .withTimeoutOf(5,TimeUnit.SECONDS)
                .isCurrentlyVisible();
    }

    public Boolean errorMessageUlangKataSandi(){
        return errorMessageUlangKataSandi
                .withTimeoutOf(5,TimeUnit.SECONDS)
                .isCurrentlyVisible();
    }

}
