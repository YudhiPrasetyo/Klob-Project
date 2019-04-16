package klobid.steps.enduserstep;

import klobid.pages.HubungiKamiPage;
import klobid.pages.LandingPage;
import net.thucydides.core.annotations.Step;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class HubungiKamiStep {


    LandingPage landingpage;
    HubungiKamiPage hubungiKamiPage;

    @Step
    public void klikContactUs(){
        landingpage.clickHubungiKami();
    }

    @Step
    public void formHubungiKami(){
        Boolean actual = hubungiKamiPage.formHubungiKami();
        assertThat("form is shown", actual , equalTo(true));
    }

    @Step
    public void emailContactUs(String emailContactUs){
        hubungiKamiPage.emailContactUs(emailContactUs);
    }

    @Step
    public void buttonJenis(){
        hubungiKamiPage.buttonJenis();
    }

    @Step
    public void popUpJenis(){
        Boolean actual = hubungiKamiPage.popUpjenis();
        assertThat("pop up is shown", actual, equalTo(true));
    }

    @Step
    public void pilihSaran(){
        hubungiKamiPage.pilihSaran();
    }

    @Step
    public void detailPesan(String detailIsiPesan){
        hubungiKamiPage.detailPesan(detailIsiPesan);
    }

    @Step
    public void pilihFile(){
        hubungiKamiPage.pilihFile();
    }

    @Step
    public void btnKlikContatcUs(){
        hubungiKamiPage.btnKlikContactUs();
    }

    @Step
    public void containSukses(){
        Boolean actual = hubungiKamiPage.containsSukses();
        assertThat("text is shown", actual,equalTo(true));
    }

    @Step
    public void klikBtnLihatTiketAnda(){
        hubungiKamiPage.btnLihatTiketAnda();
    }

    @Step
    public void formLihatTiketAnda(){
        Boolean actual = hubungiKamiPage.formLihatTiket();
        assertThat("form is shown", actual, equalTo(true));
    }

    @Step
    public void inputNomorTiket(String nomorTiket){
        hubungiKamiPage.inputNomorTiket(nomorTiket);
    }

    @Step
    public void inputEmailTiket(String emailTiket){
        hubungiKamiPage.inputEmailTiket(emailTiket);
    }

    @Step
    public void klikBtnCariTiket(){
        hubungiKamiPage.btnCariTiket();
    }

    @Step
    public void formDetailTiket(){
        Boolean actual = hubungiKamiPage.detailTiket();
        assertThat("form is shown", actual, equalTo(true));
    }

    @Step
    public void txtComment(String detailPesan){
        hubungiKamiPage.txtComment(detailPesan);
    }

    @Step
    public void btnSendComment(){
        hubungiKamiPage.btnSendComment();
    }

    @Step
    public void resultPesan(){
        Boolean actual = hubungiKamiPage.resultDetailPesan();
        assertThat("comment is shown",actual, equalTo(true));
    }

    @Step
    public void btnClose(){
        hubungiKamiPage.btnClose();
    }

    @Step
    public void statusClosed(){
        hubungiKamiPage.statusClosed();
    }

    @Step
    public void errorMessage(){
        Boolean actual = hubungiKamiPage.errorMessage();
        assertThat("error message is shown",actual,equalTo(true));
    }

    @Step
    public void popUpAlert(){
        hubungiKamiPage.popUpAlert();
    }


}
