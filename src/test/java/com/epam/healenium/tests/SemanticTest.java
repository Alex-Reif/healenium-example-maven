package com.epam.healenium.tests;

import com.epam.healenium.FrameworkPage;
import com.epam.healenium.constants.LocatorType;
import com.epam.healenium.constants.PagesType;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.Test;

public class SemanticTest extends BaseTest {

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("Button click with find element by id")
    public void testButtonClickWithId() {
        FrameworkPage page = pages.get(String.valueOf(PagesType.TEST_ENV));

        page.openPage()
                .findTestElement(LocatorType.CSS, "input#newValue")
                .clickSubmitButton()
                .findTestElement(LocatorType.CSS, "input#newValue");
    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("Find element by classname")
    public void testFindElementByClassName() {
        FrameworkPage mainPage = pages.get(String.valueOf(PagesType.MARKUP));

        mainPage.openPage()
                .clickTestButton();
        mainPage.confirmAlert();

        mainPage
                .generateMarkup()
                .clickTestButton(); //should be healed
        mainPage.confirmAlert();

    }


    @Test
    @Severity(SeverityLevel.MINOR)
    @Description("Find element by linktext")
    public void testFindElementByLinkText() {
        FrameworkPage page = pages.get(String.valueOf(PagesType.TEST_ENV));

        page.openPage()
                .findTestElement(LocatorType.CSS, "a#change_links")
                .clickSubmitButton()
                .findTestElement(LocatorType.CSS, "a#change_links");
    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("Find element by name")
    public void testFindElementByName() {
        FrameworkPage page = pages.get(String.valueOf(PagesType.TEST_ENV));

        page.openPage()
                .findTestElement(LocatorType.CSS, "input#newName")
                .clickSubmitButton()
                .findTestElement(LocatorType.CSS, "input#newName");
    }

    @Test
    @Severity(SeverityLevel.MINOR)
    @Description("Find element by partialLinkText")
    public void testFindElementByPartialLinkText() {
        FrameworkPage page = pages.get(String.valueOf(PagesType.TEST_ENV));

        page.openPage()
                .findTestElement(LocatorType.CSS, "a#change_links")
                .clickSubmitButton()
                .findTestElement(LocatorType.CSS, "a#change_links");
    }

    @Test
    @Severity(SeverityLevel.MINOR)
    @Description("Find element by tagName")
    public void testFindElementByTagName() {
        FrameworkPage page = pages.get(String.valueOf(PagesType.TEST_ENV));

        page.openPage()
                .findTestElement(LocatorType.CSS, "input#change_element")
                .clickSubmitButton()
                .findTestElement(LocatorType.CSS, "input#change_element");
    }
}