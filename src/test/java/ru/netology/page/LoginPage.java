package ru.netology.page;

import com.codeborne.selenide.SelenideElement;
import ru.netology.data.DataHelper;

import static com.codeborne.selenide.Selenide.$;
import static java.awt.SystemColor.info;

public class LoginPage {
    private static final SelenideElement loginField = $("[data-test-id=login] input");
    private static final SelenideElement passwordField = $("[data-test-id=password] input");
    private static final SelenideElement loginButton = $("[data-test-id=action-login]");
    private final SelenideElement cardButton = $("[data-test-id=action-deposit]");


 //   public VerificationPage validLogin(String login, String password) {
   //     loginField.setValue(info.getLogin());
     //   passwordField.setValue(info.getPassword());
       // loginButton.click();
        //return new VerificationPage();
    //}

    public static VerificationPage validLogin(String login, String password) {
        loginField.setValue(login);
        passwordField.setValue(password);
        loginButton.click();
        return new VerificationPage();
    }
}
