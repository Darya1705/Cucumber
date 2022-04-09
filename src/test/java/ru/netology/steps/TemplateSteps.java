package ru.netology.steps;

import com.codeborne.selenide.Selenide;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Пусть;
import io.cucumber.java.ru.Тогда;
import ru.netology.page.DashboardPage;
import ru.netology.page.LoginPage;
import ru.netology.page.TransferPage;
import ru.netology.page.VerificationPage;

import static org.junit.Assert.assertEquals;

public class TemplateSteps {
    private static LoginPage loginPage;
    private static DashboardPage dashboardPage;
    private static VerificationPage verificationPage;
    private static TransferPage transferPage;

    @Пусть("пользователь залогинен на странице с формой авторизации {String} под именем {String}" + "и паролем {String}, введенным проверочным кодом 'из смс'")
    public void openLoginPasswodCodePage(String url, String login, String password, String verificationCode) {
        loginPage = Selenide.open(url, LoginPage.class);
        verificationPage = LoginPage.validLogin(login, password);
        dashboardPage = verificationPage.validVerify(verificationCode);
    }

    @Когда("пользователь на свою первую капту с id {String} с карты с номером {String} переведет {int} рублей")
    public void authorUserCard(String idCard, String cardInfo, int amount) {
        transferPage = dashboardPage.transfer(idCard);
        transferPage.transferMoney(amount, cardInfo);
    }

    @Тогда("баланс первой карты с id {String} должен стать {int) рублей")
    public void finishCard(String idCard, int extractBalance) {
        assertEquals(extractBalance, dashboardPage.getFirstCardBalance(idCard));
    }
}



