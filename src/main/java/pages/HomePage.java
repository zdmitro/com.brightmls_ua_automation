package pages;

import data.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.Arrays;
import java.util.List;

public class HomePage extends BasePage {
    //Main homepage message / header
    private By homepageMessage = By.xpath("//*[@id='container-one']/div/div[2]/div/h1");

    //Main background image, texts and links
    private By mainBackgroundImg = By.id("container-one");

    //public By mainSmallText = By.xpath("//*[@id='container-one']/div/div[2]/div/p[2]"); //*[@id="container-one"]/div/div[2]/div/p[2]/text()

    private By mainSmallText = By.xpath("//*[@id='container-one']/div/div[2]/div/p[2]");

    private By supportCenterLink = By.xpath("//*[@id='container-one']/div/div[2]/div/p[2]/a");
    //External Link and text to Youtube
    private By youtubeBlueBackgroundBox = By.id("top-box");
    private By youtubeText1 = By.xpath("//*[@id='top-box']/div[1]/p/text()[1]");
    private By youtubeLink1 = By.xpath("//*[@id='top-box']/div[1]/p/a");
    private By youtubeText2 = By.xpath("//*[@id='top-box']/div[1]/p/text()[2]");
    private By youtubeSquareBox = By.xpath("//*[@id='top-box']/div[2]/a/div");
    private By youtubeRightArrow = By.xpath("//*[@id='top-box']/div[2]/a/div/i");
    private By youtubeLink2 = By.xpath("//*[@id='top-box']/div[2]/a");
    //Your Business logo
    private By yourBusinessLargeText = By.xpath("//*[@id='container-three']/div/div/h1");
    private By weEmpowerSmallText = By.xpath("//*[@id='container-three']/div/div/h2");
    //InfoTechStat: Information Technology Statistics text and logo
    private By infoTechStatLine1 = By.xpath("//*[@id='container-four']/div/div[2]/hr");
    private By infoTechStatLine2 = By.xpath("//*[@id='container-four']/div/div[4]/hr");
    //InfoTechStat: Left column
    private By infoSquare = By.xpath("//*[@id='container-five']/div/div[1]/div");
    private By infoImage = By.xpath("//*[@id='container-five']/div/div[1]/div/img");
    private By infoBigText = By.xpath("//*[@id='container-five']/div/div[1]/h1");
    private By infoSmallText = By.xpath("//*[@id='container-five']/div/div[1]/p/text()");
    //InfoTechStat: Center column
    private By techSquare = By.xpath("//*[@id='container-five']/div/div[2]/div");
    private By techImage = By.xpath("//*[@id='container-five']/div/div[2]/div/img");
    private By techBigText = By.xpath("//*[@id='container-five']/div/div[2]/h1");
    private By techSmallText = By.xpath("//*[@id='container-five']/div/div[2]/p/text()");
    //InfoTechStat: Right column
    private By statSquare = By.xpath("//*[@id='container-five']/div/div[3]/div");
    private By statImage = By.xpath("//*[@id='container-five']/div/div[3]/div/img");
    private By statBigText = By.xpath("//*[@id='container-five']/div/div[3]/h1");
    private By statSmallText = By.xpath("//*[@id='container-five']/div/div[3]/p");

    public HomePage checkHomepageElementsDisplayed() {
        List<By> byList = Arrays.asList(this.mainBackgroundImg,
        this.mainSmallText,
        this.supportCenterLink,
        this.youtubeBlueBackgroundBox,
        this.youtubeText1,
        this.youtubeLink1,
        this.youtubeText2,
        this.youtubeSquareBox,
        this.youtubeRightArrow,
        this.youtubeLink2,
        this.yourBusinessLargeText,
        this.weEmpowerSmallText,
        this.infoTechStatLine1,
        this.infoTechStatLine2,
        this.infoSquare,
        this.infoImage,
        this.infoBigText,
        this.infoSmallText,
        this.techSquare,
        this.techImage,
        this.techBigText,
        this.techSmallText,
        this.statSquare,
        this.statImage,
        this.statBigText,
        this.statSmallText
        );
        assertElementsDisplayed(byList);
        return this;
    }



    public HomePage(WebDriver driver) { super(driver); }

    public HomePage goToHomePage() {
        getDriver().get(Data.URL);
        return this;
    }

    public HomePage checkForGoToHomePage() {
        assertEquals(this.homepageMessage,"Looking for help using Bright MLS? ");
        return this;
    }

    public HomePage waitForTextToAppear() {
        waitVisibility(mainSmallText);
        return this;
    }

    public HomePage checkTextElementDisplayed() {

         assertEquals(mainSmallText, "Learn how to perform basic tasks, get definitions for fields, statuses and much more. ");

        return this;
    }

    public HomePage isElementVisible(String text) {
        assertContains(this.mainSmallText, text);
        return this;
    }

    public HomePage isInnerElementVisible(String text) {
        WebElement a = getDriver().findElement(mainSmallText).findElement(By.tagName("a"));
        String tagText = a.getText();
        Assert.assertEquals(tagText, text);
        return this;
    }

}
