package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinitions {
AmazonPage amazonPage=new AmazonPage();

    @Given("Kulanici amazon anasayfasinda")
    public void kullanici_amazon_anasayfasinda() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }
    @Then("Kullanici nutella icin arama yapar")
    public void kullanici_nutella_icin_arama_yapar() {
    amazonPage.searchBox.sendKeys("nutella", Keys.ENTER);
    }

    @And("Sonuclarin nutella icerdigini test eder")
    public void sonuclarinNutellaIcerdiginiTestEder() {

        String searchWord="nutella";
        String actualResult=amazonPage.searchResult.getText();

        Assert.assertTrue(actualResult.contains(searchWord));
    }

    @And("Sayfayi kapatir")
    public void sayfayiKapatir() {

        Driver.closeDriver();
    }

    @Then("Kullanici java icin arama yapar")
    public void kullaniciJavaIcinAramaYapar() {
        amazonPage.searchBox.sendKeys("java", Keys.ENTER);
        
    }

    @And("Sonuclarin java icerdigini test eder")
    public void sonuclarinJavaIcerdiginiTestEder() {
        String searchWord="java";
        String actualResult=amazonPage.searchResult.getText();

        Assert.assertTrue(actualResult.contains(searchWord));
    }

    @And("Kullanici iphone icin arama yapar")
    public void kullaniciIphoneIcinAramaYapar() {
        amazonPage.searchBox.sendKeys("iphone", Keys.ENTER);
    }

    @Then("Sonuclarin iphone icerdigini test eder")
    public void sonuclarinIphoneIcerdiginiTestEder() {

        String searchWord="iphone";
        String actualResult=amazonPage.searchResult.getText();

        Assert.assertTrue(actualResult.contains(searchWord));
    }
}
