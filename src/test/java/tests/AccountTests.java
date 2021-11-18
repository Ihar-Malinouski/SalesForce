package tests;

import constains.IConstains;
import constans.ITestConstans;
import objects.Account;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AccountListPage;
import pages.AuthorizationPage;

public class AccountTests extends BaseTest{

    Account account = new Account("Ihar", "www.122.by", "Malinouski", "+375295319263",
            "+375295319263", "45666", "966652$", "Moskov", "4445515", "Minsk", "455",
            "123123", "Lodz", "44551234", "123",
            "Meet my family. There are five of us – my parents, my elder brother, my baby sister and me. First, meet my mum and dad, Jane and Michael. My mum enjoys reading and my dad enjoys playing chess with my brother Ken.",
            "Hello world", "Meet my family. There are five of us – my parents, my elder brother, my baby sister and me.", "Analyst", "Banking");

    @Test
    public void authorizationAccountTest() {
        AuthorizationPage.openPage();
        AuthorizationPage.autgorizationAccount(ITestConstans.LOGIN, ITestConstans.PASSWORD);
        AuthorizationPage.clickAuthorizationButton();
        newAccountModalPage.openPage();
        newAccountModalPage.createAccount(account);
        accountListPage.openPage();
        Assert.assertEquals(account.getAccountName(), AccountListPage.saveName());
    }
}
