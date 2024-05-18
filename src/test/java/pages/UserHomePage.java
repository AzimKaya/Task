package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.ReusableMethods;
public class UserHomePage extends Base{

        public void loginUser(String email, String password){
                UserHomePage visitorHomePage=new UserHomePage();
                labelBoxLogin.sendKeys(email);
                ReusableMethods.wait(3);
                labelBoxPassword.sendKeys(password);
                ReusableMethods.clickAndVerify(visitorHomePage.buttonSignIn);
        }
        @FindBy(xpath = "(//*[text()='Login'])[1]")
        public WebElement linkLogin;//Hompage>> Email Login button

        @FindBy(xpath = "//input[@name='login']")
        public WebElement labelBoxLogin;//Signpage>> Email address or phone Text Box

        @FindBy(xpath = "//*[@name='password']")
        public WebElement labelBoxPassword;//Signpage>> Password  Text Box

        @FindBy(xpath = "//button[@id='sign_in_btn']")
        public WebElement buttonSignIn;//Signpage>> Password SignIn button

        @FindBy (xpath = "(//*[text()='Appstore'])[1]")
        public WebElement linkAppstore;//Hompageheder>> Appstore link button

        @FindBy (xpath = "(//*[text()='Playstore'])[1]")
        public WebElement linkPlaystore;//Hompageheder>> Playstore link button

        @FindBy(xpath = "(//*[text()='Home'])[1]")
        public WebElement linkHeaderHome;//Hompagebody>> Home link button

        @FindBy(xpath = "(//*[text()='New Product Deals'])[1]")
        public WebElement linkHeaderNewProductDeals;//Hompagebody>> New Product Deals link button

        @FindBy(xpath = "(//*[text()='Contact'])[1]")
        public WebElement linkHeaderContact;//Hompagebody>> Contact link button

        @FindBy(xpath = "(//*[text()='Blog'])[1]")
        public WebElement linkHeaderBlog;//Hompagebody>> Blog link button

        @FindBy (xpath = "(//*[text()='About Us'])[1]")
        public WebElement labelAboutUs;//Hompagebody>> About Us link button
    }




