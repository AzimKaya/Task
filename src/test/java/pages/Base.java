package pages;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;
public abstract class Base {
  public Base() {
    PageFactory.initElements(Driver.getDriver(), this);
  }
  public static String   actualPlaystoreUrl;
  public static String expectedPlaystoreUrl;
  public static String  expectedAppstoreUrl;
  public static String    actualAppstoreUrl;
  public static String     actualUrlCantact;
  public static String   expectedUrlCantact;
  public static String          actualUrlBl;
  public static String        expectedUrlBl;
  public static String          actualUrlAu;
  public static String        expectedUrlAu;
  public static String          actualUrlNp;
  public static String        expectedUrlNp;
  public static String            actualUrl;
  public static String          expectedUrl;
  public static UserHomePage   userHomePage;

  public static void initialize() {
          userHomePage = new UserHomePage();
  }
}
