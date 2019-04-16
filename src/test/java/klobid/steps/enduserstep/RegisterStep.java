package klobid.steps.enduserstep;

import klobid.pages.LandingPage;
import klobid.pages.VerificationPage;
import klobid.pages.common.popup.Register;
import klobid.pages.homepage.UrlLandingPage;
import klobid.steps.util.RandomEmailGenerator;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class RegisterStep {

    UrlLandingPage urlLandingPage;
    LandingPage landingPage;
    Register register;
    VerificationPage verificationPage;

    @Step
    public void openHomePage(){
        urlLandingPage.open();
    }

    @Step
    public void clickBtnIkutKlob(){
        landingPage.clickIkutKlob();
    }

    @Step
    public void isPopUpRegister(){
        Boolean actual = register.isFormRegisterVisible();
        assertThat("pop up is not shown", actual, equalTo(true));
    }

    @Step
    public void inputKlobId(String klobid){
        register.inputKlobId(klobid);
    }

    @Step
    public void inputEmail(){
        register.inputEmail(RandomEmailGenerator.generate());
    }

    @Step
    public void inputEmailType(String email){
        register.inputEmail(email);
    }

    @Step
    public void inputNomorPonsel(String nomorPonsel){
        register.inputNomorPonsel(nomorPonsel);
    }

    @Step
    public void clickKebutuhanKhusus(){
        register.clickKebutuhanKhusus();
    }

    @Step
    public void isPopUpKebutuhanKhusus(){
        Boolean actual = register.isPopUpKebutuhanVisible();
        assertThat("pop up is not shown", actual, equalTo(true));
    }

    @Step
    public void clickPendengaran(){
        register.clickPendengaran();
    }

    @Step
    public void inputKataSandi(String kataSandi){
        register.inputKataSandi(kataSandi);
    }

    @Step
    public void inputUlangKataSandi(String ulangKataSandi){
        register.inputUlangKataSandi(ulangKataSandi);
    }

    @Step
    public void clickUlangKataSandi(){
        register.clickUlangKataSandi();
    }

    @Step
    public void clickBtnLanjutkan(){
        register.clickLanjutkan();
    }

    @Step
    public void isPopUpSuksesVisible(){
        register.isPopUpSuksesVisible();
    }

    @Step
    public void clickBtnOk(){
        register.clickOk();
    }

    @Step
    public void isFormVerificationVisible(){
        Boolean actual = verificationPage.isFormVerifikasiVisible();
        assertThat("pop up is not shown", actual, equalTo(true));
    }

    @Step
    public void isErrorMessageIdVisible(){
        Boolean actual = register.errorMessageID();
        assertThat("pop up is shown",actual,equalTo(true));
    }

    @Step
    public void isErrorMessageEmailVisible(){
        Boolean actual = register.errorMessageEmail();
        assertThat("pop up is shown", actual, equalTo(true));
    }

    @Step
    public void isErrorMessageNoPonsel(){
        Boolean actual = register.errorMessageNoPonsel();
        assertThat("pop up is shown",actual,equalTo(true));
    }

    @Step
    public void isErrorMessageKataSandi(){
        Boolean actual = register.errorMessageKataSandi();
        assertThat("error message is shown",actual,equalTo(true));
    }

    @Step
    public void isErrorMessageUlangKataSandi(){
        Boolean actual = register.errorMessageUlangKataSandi();
        assertThat("error message is shown",actual,equalTo(true));
    }

    @Step
    public void clickEmail(){
        register.clickEmail();
    }

    public void clickNoPonsel(){
        register.clickNomorPonsel();
    }


}
