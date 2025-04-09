package br.com.alfredo.validadorsenhas.validator.rules;

import java.util.regex.Pattern;

public class SpecialCharacterRule implements PasswordRuleValidator {
    private static final Pattern SPECIAL_CHAR_PATTERN = Pattern.compile(".*[!@#$%^&*()\\-+].*");

    @Override
    public boolean validate(String password) {
        return password != null && SPECIAL_CHAR_PATTERN.matcher(password).matches();
    }
}