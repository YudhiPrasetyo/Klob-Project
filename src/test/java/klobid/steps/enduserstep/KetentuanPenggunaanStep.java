package klobid.steps.enduserstep;

import klobid.pages.KetentuanPenggunaanPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class KetentuanPenggunaanStep {

    KetentuanPenggunaanPage ketentuanPenggunaanPage;

    @Step
    public void ketentuanPenggunaan(){
        ketentuanPenggunaanPage.KetentuanPenggunaan();
    }

    @Step
    public void contKetentuanPenggunaan(){
        Boolean actual = ketentuanPenggunaanPage.contKetentuanPenggunaan();
        assertThat("container is shown",actual,equalTo(true));
    }


}
