package Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements {
    public static void main(String args[]){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/r.php");

        WebElement firstNameField = driver.findElement(By.name("firstname"));
        System.out.println("Location: " + firstNameField.getLocation());

        System.out.println("Size: " + firstNameField.getSize());

        System.out.println("Is Displayed: " + firstNameField.isDisplayed());

        System.out.println("Is Enabled: " + firstNameField.isEnabled());

        firstNameField.sendKeys("Shreya");

        firstNameField.clear();

        WebElement genderRadioButton = driver.findElement(By.xpath("//input[@value='2']"));
        System.out.println("Is Selected (Before Clicking): " + genderRadioButton.isSelected());

        genderRadioButton.click();
        System.out.println("Is Selected (After Clicking): " + genderRadioButton.isSelected());

        System.out.println("Attribute (name): " + firstNameField.getAttribute("name"));

        WebElement signupText = driver.findElement(By.tagName("h2"));
        System.out.println("Text: " + signupText.getText());

        System.out.println("Tag Name: " + firstNameField.getTagName());

        WebElement signupButton = driver.findElement(By.name("websubmit"));
        System.out.println("Is Enabled (Signup Button): " + signupButton.isEnabled());
        //signupButton.click();  // Uncomment this to actually click the sign-up button

        WebElement form = driver.findElement(By.name("reg"));
        form.submit();

        System.out.println("CSS Value (Font Color): " + firstNameField.getCssValue("color"));

        System.out.println("Rect: " + firstNameField.getRect());

        driver.quit();
    }
}


