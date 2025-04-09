package br.com.alfredo.validadorsenhas.rules;

import br.com.alfredo.validadorsenhas.validator.rules.UppercaseRule;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UppercaseRuleTest {

    private final UppercaseRule rule = new UppercaseRule();

    @Test
    void deveValidarSenhaComLetraMaiuscula() {
        assertTrue(rule.validate("SenhaComMaiuscula"));
    }

    @Test
    void deveInvalidarSenhaSemLetraMaiuscula() {
        assertFalse(rule.validate("senhasemmaiuscula123"));
    }
}