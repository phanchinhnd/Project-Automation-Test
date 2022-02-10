package stepdefinition;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.*;

public class MyStepdefs {
    HomePage homePage = new HomePage();
    ThuongHieuPage thuongHieuPage = new ThuongHieuPage();
    CapNhatPage capNhatPage = new CapNhatPage();
    UuDaiPage uuDaiPage = new UuDaiPage();
    VoucherPage voucherPage = new VoucherPage();
    CaNhanPage caNhanPage = new CaNhanPage();
    NapDienThoaiPage napDienThoaiPage = new NapDienThoaiPage();
    @Given("Open Shopiness App")
    public void openTIKIApp() {
        capNhatPage.pressKhongCapNhat();
    }

    @Then("The screen display Cart icon, Search icon, Bat dau ngay button and Menu footer")
    public void theScreenDisplayCartIconSearchIconBatDauNgayButtonAndMenuFooter() {
        homePage.verìfyHomePage();

    }

    @When("Click to Thuong Hieu")
    public void clickToThuongHieu() {
        homePage.gotoThuongHieu();
    }

    @Then("The screen display {int} brand name")
    public void theScreenDisplayBrandName(int arg0) {
        arg0 = 9;
        thuongHieuPage.verifyBrand();
    }

    @When("Click to Uu Dai")
    public void clickToUuDai() {
        homePage.gotoUuDai();
    }

    @And("Click first product")
    public void clickFirstProduct() {
        uuDaiPage.gotoFProduct();
    }

    @Then("The screen display ImageDiscount, DescriptionDiscount, Button Mua ban")
    public void theScreenDisplayImageDiscountDescriptionDiscountButtonMuaBan() {
        uuDaiPage.verifyFProduct();
    }

    @When("Click to Voucher")
    public void clickToVoucher() {
        homePage.gotoVoucher();
    }

    @And("Click last voucher")
    public void clickLastVoucher() {
        voucherPage.gotoLProduct();
    }

    @Then("The screen display voucher image, voucher description, button Mua ngay, button cart icon")
    public void theScreenDisplayVoucherImageVoucherDescriptionButtonMuaNgayButtonCartIcon() {
        voucherPage.verifyLProduct();
    }

    @When("Click to Ca nhan")
    public void clickToCaNhan() {
        homePage.gotoCaNhan();
    }

    @Then("The screen display ma uu dai, uu dai, voucher, thuong hieu")
    public void theScreenDisplayMaUuDaiUuDaiVoucherThuongHieu() {
        caNhanPage.verifyUuDaiPage();
    }

    @When("Click to Nap dien thoai")
    public void clickToNapDienThoai() {
        homePage.gotoNapDienThoai();
    }

    @Then("The screen display {int} logo and {int} nominal value")
    public void theScreenDisplayLogoAndNominalValue(int arg0, int arg1, DataTable dataTable) {
        arg0 = 4;arg1 = 6;
        napDienThoaiPage.verifyNapDienThoai(dataTable);
    }
}
