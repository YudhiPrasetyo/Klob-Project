package klobid.steps.enduserstep;

import klobid.pages.BerandaPage;
import klobid.pages.LandingPage;
import klobid.pages.LoginPage;
import klobid.pages.common.popup.PopUpCommon;
import klobid.pages.homepage.UrlLandingPage;
import net.thucydides.core.annotations.Step;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class LoginStep {

    UrlLandingPage urlLandingPage;
    LoginPage loginPage;
    LandingPage landingPage;
    BerandaPage berandaPage;
    PopUpCommon popUpCommon;


    @Step
    public void clickMasuk(){
        landingPage.clickMasuk();
    }

    @Step
    public void isFormLoginVisible(){
        Boolean actual = loginPage.isFormLoginVisible();
        assertThat("form is shown",actual,equalTo(true));
    }

    @Step
    public void inputUsername(String username){
        loginPage.userName(username);
    }

    @Step
    public void inputPassword(String password){
        loginPage.password(password);
    }

    @Step
    public void clickBtnMasuk(){
        loginPage.clickMasuk();
    }

    @Step
    public void isBerandaVisible(){
        Boolean actual = berandaPage.isFormDashboard();
        assertThat("form is shown",actual,equalTo(true));
    }

    @Step
    public void isErrorLoginVisible(){
        Boolean actual = popUpCommon.isPopUpCommonVisible();
        assertThat("pop up is shown",actual,equalTo(true));
    }

    @Step
    public void isErrorUsernameVisible(){
        Boolean actual = loginPage.isErrorUsernameVisible();
        assertThat("error message is shown", actual,equalTo(true));
    }

    @Step
    public void isErrorPasswordVisible(){
        Boolean actual = loginPage.isErrorPasswordVisible();
        assertThat("error message is shown", actual,equalTo(true));
    }

}
