package br.com.alfredo.validadorsenhas.validator.rules;

import java.util.regex.Pattern;

public class DigitRule implements PasswordRuleValidator {
    private static final Pattern DIGIT_PATTERN = Pattern.compile(".*\\d.*");

    @Override
    public boolean validate(String password) {
        return password != null && DIGIT_PATTERN.matcher(password).matches();
    }
}