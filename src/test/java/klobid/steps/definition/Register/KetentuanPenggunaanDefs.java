package klobid.steps.definition.Register;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import klobid.steps.enduserstep.KetentuanPenggunaanStep;
import net.thucydides.core.annotations.Steps;

public class KetentuanPenggunaanDefs {

    @Steps
    KetentuanPenggunaanStep ketentuanPenggunaanStep;

    @When("^user klik link ketentuan penggunaan$")
    public void userKlikLinkKetentuanPenggunaan() {
        ketentuanPenggunaanStep.ketentuanPenggunaan();
    }

    @Then("^user menuju ke halaman ketentuan penggunaan$")
    public void userMenujuKeHalamanKetentuanPenggunaan() {
        ketentuanPenggunaanStep.contKetentuanPenggunaan();
    }
}
