package br.com.alfredo.validadorsenhas.validator.rules;

import java.util.regex.Pattern;

public class UppercaseRule implements PasswordRuleValidator {
    private static final Pattern UPPERCASE_PATTERN = Pattern.compile(".*[A-Z].*");

    @Override
    public boolean validate(String password) {
        return password != null && UPPERCASE_PATTERN.matcher(password).matches();
    }
}