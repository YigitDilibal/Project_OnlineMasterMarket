package utils;

import drivers.DriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReusableMethods {

    public static String getScreenshot(String name) throws IOException {
        // naming the screenshot with the current date to avoid duplication
        String date = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        // TakesScreenshot is an interface of selenium that takes the screenshot
        TakesScreenshot ts = (TakesScreenshot) DriverManager.getDriver();
        File source = ts.getScreenshotAs(OutputType.FILE);
        // full path to the screenshot location
        String target = System.getProperty("user.dir") + "/target/Screenshots/" + name + date + ".png";
        File finalDestination = new File(target);
        // save the screenshot to the path given
        FileUtils.copyFile(source, finalDestination);
        return target;
    }

    //========Switching Window=====//
    public static void switchToWindow(String targetTitle) {
        String origin = DriverManager.getDriver().getWindowHandle();
        for (String handle : DriverManager.getDriver().getWindowHandles()) {
            DriverManager.getDriver().switchTo().window(handle);
            if (DriverManager.getDriver().getTitle().equals(targetTitle)) {
                return;
            }
        }
        DriverManager.getDriver().switchTo().window(origin);
    }

    public static void bekle(int ms){

        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            System.out.println("Bekleme yapilamadi");
        }
    }

    public static void scrollDown() {

        Actions actions = new Actions(DriverManager.getDriver());
        ReusableMethods.bekle(1);

        actions.sendKeys(Keys.PAGE_DOWN).perform();


    }
    public static void scrollUp () {

        Actions actions = new Actions(DriverManager.getDriver());
        ReusableMethods.bekle(1);
        actions.sendKeys(Keys.PAGE_UP).perform();


    }
    public static List<String> stringListeDonustur(List<WebElement> webElementList){

        List<String> stringList = new ArrayList<>();

        for (WebElement each: webElementList){

            stringList.add(each.getText());
        }

        return stringList;
    }

}
