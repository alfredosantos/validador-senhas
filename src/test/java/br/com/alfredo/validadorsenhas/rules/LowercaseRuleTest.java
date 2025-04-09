package br.com.alfredo.validadorsenhas.rules;

import br.com.alfredo.validadorsenhas.validator.rules.LowercaseRule;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LowercaseRuleTest {

    private final LowercaseRule rule = new LowercaseRule();

    @Test
    void deveValidarSenhaComLetraMinuscula() {
        assertTrue(rule.validate("SenhaComMinuscula"));
    }

    @Test
    void deveInvalidarSenhaSemLetraMinuscula() {
        assertFalse(rule.validate("SENHAEMMAIUSCULA123"));
    }
}