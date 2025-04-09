package br.com.alfredo.validadorsenhas.validator.rules;

import java.util.regex.Pattern;

public class LowercaseRule implements PasswordRuleValidator {
    private static final Pattern LOWERCASE_PATTERN = Pattern.compile(".*[a-z].*");

    @Override
    public boolean validate(String password) {
        return password != null && LOWERCASE_PATTERN.matcher(password).matches();
    }
}