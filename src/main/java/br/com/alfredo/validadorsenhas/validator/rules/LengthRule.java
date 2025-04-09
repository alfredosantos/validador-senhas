package br.com.alfredo.validadorsenhas.validator.rules;

public class LengthRule implements PasswordRuleValidator {

    @Override
    public boolean validate(String password) {
        return password != null && password.length() >= 9;
    }
}