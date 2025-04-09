package br.com.alfredo.validadorsenhas.validator.rules;

import java.util.HashSet;
import java.util.Set;

public class NoRepeatedCharactersRule implements PasswordRuleValidator {

    @Override
    public boolean validate(String password) {
        if (password == null) {
            return false;
        }
        Set<Character> seenCharacters = new HashSet<>();
        for (char c : password.toCharArray()) {
            if (!seenCharacters.add(c)) {
                return false;
            }
        }
        return true;
    }
}