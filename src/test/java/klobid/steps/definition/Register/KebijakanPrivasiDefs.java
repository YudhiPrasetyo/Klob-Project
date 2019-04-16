package klobid.steps.definition.Register;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import klobid.steps.enduserstep.KebijakanPrivasiStep;
import net.thucydides.core.annotations.Steps;

public class KebijakanPrivasiDefs {

    @Steps
    KebijakanPrivasiStep kebijakanPrivasiStep;

    @When("^user klik link kebijakan privasi$")
    public void userKlikLinkKebijakanPrivasi() {
        kebijakanPrivasiStep.linkKebijakanPrivasi();
    }

    @Then("^user menuju ke halaman kebijakan privasi$")
    public void userMenujuKeHalamanKebijakanPrivasi() {
        kebijakanPrivasiStep.contTerms();
    }
}
