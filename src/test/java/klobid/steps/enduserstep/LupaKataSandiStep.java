package klobid.steps.enduserstep;

import klobid.pages.UbahKataSandiPage;
import klobid.pages.LoginPage;
import klobid.pages.LupaKataSandiPage;
import klobid.pages.homepage.UrlLandingPage;
import net.thucydides.core.annotations.Step;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class LupaKataSandiStep {

    UrlLandingPage urlLandingPage;
    LoginPage loginPage;
    LupaKataSandiPage lupaKataSandiPage;
    UbahKataSandiPage ubahKataSandiPage;

    @Step
    public void klikLupaKataSandi(){
        loginPage.linkLupaKataSandi();
    }

    @Step
    public void isFormLupaKataSandi(){
        Boolean actual = lupaKataSandiPage.isFormLupaKataSandiVisible();
        assertThat("form is shown",actual,equalTo(true));
    }

    @Step
    public void inputUlangUsername(String lupaKataSandi){
        lupaKataSandiPage.inputLupaKataSandi(lupaKataSandi);
    }

    @Step
    public void klikBtnKirim(){
        lupaKataSandiPage.clickBtnKirim();
    }

    @Step
    public void isFormUbahKataSandi(){
        Boolean actual = ubahKataSandiPage.isFormUbahKataSandiVisible();
        assertThat("form is shown", actual, equalTo(true));
    }

    @Step
    public void inputKodeVerifikasi(String kodeverifikasi){
        ubahKataSandiPage.inputKodeVerifikasi(kodeverifikasi);
    }

    @Step
    public void inputNewPassword(String newPass){
        ubahKataSandiPage.inputNewPass(newPass);
    }

    @Step
    public void inputUlangNewPass(String ulangNewPass){
        ubahKataSandiPage.inputUlangNewPass(ulangNewPass);
    }

    @Step
    public void klikButtonKirim(){
        ubahKataSandiPage.clickBtnKirimKataSandi();
    }

    @Step
    public void emKodeVerifikasi(){
        ubahKataSandiPage.emKodeVerifikasi();
    }

    @Step
    public void emNewPass(){
        ubahKataSandiPage.emNewPass();
    }

    @Step
    public void emUlangNewPass(){
        ubahKataSandiPage.emUlangNewPass();
    }

    @Step
    public void emLupaKataSandi(){
        Boolean actual = lupaKataSandiPage.emLupaKataSandi();
        assertThat("error message is  shown", actual,equalTo(true));
    }

    @Step
    public void popUpLupaKataSandi(){
        Boolean actual = lupaKataSandiPage.popUpLupaKataSandi();
        assertThat("error message is shown", actual, equalTo(true));
    }
}
