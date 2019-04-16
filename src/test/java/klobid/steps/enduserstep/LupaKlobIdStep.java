package klobid.steps.enduserstep;

import klobid.pages.LoginPage;
import klobid.pages.LupaKlobIdPage;
import klobid.pages.common.popup.PopUpCommon;
import net.thucydides.core.annotations.Step;

public class LupaKlobIdStep {

    LupaKlobIdPage lupaKlobIdPage;
    LoginPage loginPage;
    PopUpCommon popUpCommon;

    @Step
    public void klikLupaKlobId(){
        loginPage.linkLupaKlobID();
    }

    @Step
    public void formLupaKataSandi(){
        lupaKlobIdPage.formLupaKlobId();
    }

    @Step
    public void inputSendEmail(String sendemail){
        lupaKlobIdPage.sendEmail(sendemail);
    }

    @Step
    public void klikBtnSendEmail(){
        lupaKlobIdPage.btnSendKirim();
    }

    @Step
    public void popUpErrorLogin(){
        popUpCommon.isPopUpCommonVisible();
    }
}
