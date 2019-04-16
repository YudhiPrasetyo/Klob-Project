package klobid.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.concurrent.TimeUnit;

public class UbahKataSandiPage extends PageObject{
    @FindBy (xpath = "//div[@class='col-xl-12 col-lg-12 col-md-12']")
    private WebElementFacade formUbahKataSandi;

    @FindBy (xpath = "//input[@id='ConfVerifcode']")
    private WebElementFacade inputKodeVerifikasi;

    @FindBy (xpath = "//input[@id='NewPass']")
    private WebElementFacade inputNewPass;

    @FindBy (xpath = "//input[@id='ConfNewPass']")
    private WebElementFacade inputUlangNewPass;

    @FindBy (xpath = "//button[@id='btnSendNewPassword']")
    private WebElementFacade btnKirim;

    @FindBy (xpath = "//em[contains(text(),'Kode yang anda masukan salah')]")
    //em[@id='ConfVerifcode-error']
    private WebElementFacade emKodeVerifikasi;

    @FindBy (xpath = "//em[@id='NewPass-error']")
    //em[@id='NewPass-error']
    private WebElementFacade emNewPass;

    @FindBy (xpath = "//em[contains(text(),'Ulang Kata Sandi tidak boleh kosong')]")
    //em[@id='ConfNewPass-error']
    private WebElementFacade emUlangNewPass;

    public Boolean isFormUbahKataSandiVisible(){
        return formUbahKataSandi
                .withTimeoutOf(10, TimeUnit.SECONDS)
                .isCurrentlyEnabled();
    }

    public void inputKodeVerifikasi(String kodeverifikasi){
        inputKodeVerifikasi.type(kodeverifikasi);
    }

    public void inputNewPass(String newPass){
        inputNewPass.type(newPass);
    }

    public void inputUlangNewPass(String ulangNewPass){
        inputUlangNewPass.type(ulangNewPass);
    }

    public void clickBtnKirimKataSandi(){
        btnKirim.click();
    }

    public Boolean emKodeVerifikasi (){
        return emKodeVerifikasi
                .withTimeoutOf(5, TimeUnit.SECONDS)
                .isCurrentlyVisible();
    }

    public Boolean emNewPass(){
        return emNewPass
                .withTimeoutOf(5,TimeUnit.SECONDS)
                .isCurrentlyVisible();
    }

    public Boolean emUlangNewPass(){
        return emUlangNewPass
                .withTimeoutOf(5,TimeUnit.SECONDS)
                .isCurrentlyVisible();
    }
}
