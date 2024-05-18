package stepdefinitions;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.Base;
import pages.UserHomePage;
import utils.ConfigReader;
import utils.Driver;
import utils.ReusableMethods;
import static org.junit.Assert.*;

public class UserHomePageStepDef extends Base {
        UserHomePage userHomePage =new UserHomePage();
    @Given("Go to {string}")
    public void go_to(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }
    @Given("Clicks the Login buttonLink on the home page")
    public void clicks_the_login_button_link_on_the_home_page() {
        ReusableMethods.wait(1);
        ReusableMethods.clickAndVerify(userHomePage.linkLogin);
        ReusableMethods.wait(1);
    }
    @Given("Login by entering valid {string} and {string} on the SignIn page.")
    public void login_by_entering_valid_and_on_the_sign_ın_page(String email, String password) {
        ReusableMethods.wait(1);
        ReusableMethods.loginUser(ConfigReader.getProperty(email), ConfigReader.getProperty(password));
        ReusableMethods.wait(1);
    }
    @Given("Verify that the body redirect buttons {string},{string},{string},{string},{string},{string},{string} are working.")
    public void clickButton(String Playstore, String Appstore, String Home, String NewProductDeals, String AboutUs, String Blog, String Contact) {
        String[] buttonArray = new String[]{"Playstore", "Appstore","Home", "NewProductDeals", "AboutUs", "Blog", "Contact"};
        for (String button : buttonArray) {
            switch (button) {
                case "Playstore":
                    ReusableMethods.clickAndVerify(userHomePage.linkPlaystore);
                    expectedPlaystoreUrl = "https://play.google.com/store/games?device=windows";
                    actualPlaystoreUrl = Driver.getDriver().getCurrentUrl();
                    assertEquals(expectedPlaystoreUrl, actualPlaystoreUrl);
                    Driver.getDriver().navigate().back();
                    break;
                case "Appstore":
                    ReusableMethods.clickAndVerify(userHomePage.linkAppstore);
                    expectedAppstoreUrl = "https://www.apple.com/app-store/";
                    actualAppstoreUrl = Driver.getDriver().getCurrentUrl();
                    assertEquals(expectedAppstoreUrl, actualAppstoreUrl);
                    Driver.getDriver().navigate().back();
                    break;
                case "Home":
                    ReusableMethods.clickAndVerify(userHomePage.linkHeaderHome);
                    expectedUrl = "https://qa.buysellcycle.com/";
                    actualUrl = Driver.getDriver().getCurrentUrl();
                    Assert.assertEquals(expectedUrl, actualUrl);
                    break;
                case "NewProductDeals":
                    ReusableMethods.clickAndVerify(userHomePage.linkHeaderNewProductDeals);
                    expectedUrlNp = "https://qa.buysellcycle.com/category/best_deals?item=product";
                    actualUrlNp = Driver.getDriver().getCurrentUrl();
                    assertEquals(expectedUrlNp, actualUrlNp);
                    break;
                case "AboutUs":
                    ReusableMethods.clickAndVerify(userHomePage.labelAboutUs);
                    expectedUrlAu = "https://qa.buysellcycle.com/about-us";
                    actualUrlAu = Driver.getDriver().getCurrentUrl();
                    assertEquals(expectedUrlAu, actualUrlAu);
                    break;
                case "Blog":
                    ReusableMethods.clickAndVerify(userHomePage.linkHeaderBlog);
                    expectedUrlBl = "https://qa.buysellcycle.com/blog";
                    actualUrlBl = Driver.getDriver().getCurrentUrl();
                    assertEquals(expectedUrlBl, actualUrlBl);
                    break;
                case "Contact":
                   ReusableMethods.clickAndVerify( userHomePage.linkHeaderContact);
                    expectedUrlCantact = "https://qa.buysellcycle.com/contact-us";
                    actualUrlCantact = Driver.getDriver().getCurrentUrl();
                    assertEquals(expectedUrlCantact, actualUrlCantact);
                    Driver.quitDriver();
                    break;
                default:
                    throw new IllegalArgumentException("Invalid button name");
            }
        }
    }
}












