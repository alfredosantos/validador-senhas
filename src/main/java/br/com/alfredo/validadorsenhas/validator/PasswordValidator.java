package br.com.alfredo.validadorsenhas.validator;

import br.com.alfredo.validadorsenhas.validator.rules.PasswordRuleValidator;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PasswordValidator {

    private final List<PasswordRuleValidator> rules;

    public PasswordValidator(List<PasswordRuleValidator> rules) {
        this.rules = rules;
    }

    public boolean isValid(String password) {
        return rules.stream().allMatch(rule -> rule.validate(password));
    }
}