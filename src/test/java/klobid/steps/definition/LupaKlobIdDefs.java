package klobid.steps.definition;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import klobid.steps.enduserstep.LupaKlobIdStep;
import net.thucydides.core.annotations.Steps;

public class LupaKlobIdDefs {

    @Steps
    LupaKlobIdStep lupaKlobIdStep;

    @When("^user klik lupa klob id$")
    public void userKlikLupaKlobId() {
        lupaKlobIdStep.klikLupaKlobId();
    }

    @Then("^user seharusnya menuju ke halaman lupa klob id$")
    public void userSeharusnyaMenujuKeHalamanLupaKlobId() {
        lupaKlobIdStep.formLupaKataSandi();
    }

    @When("^user input field email \"([^\"]*)\"$")
    public void userInputFieldEmail(String sendemail) {
        lupaKlobIdStep.inputSendEmail(sendemail);
    }

    @And("^user klik kirim$")
    public void userKlikKirim() {
        lupaKlobIdStep.klikBtnSendEmail();
    }

    @Then("^user seharusnya melihat pop up sukses$")
    public void userSeharusnyaMelihatPopUpSukses() {
        lupaKlobIdStep.popUpErrorLogin();
    }

}
