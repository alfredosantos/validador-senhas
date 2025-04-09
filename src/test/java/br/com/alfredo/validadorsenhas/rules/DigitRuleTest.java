package br.com.alfredo.validadorsenhas.rules;

import br.com.alfredo.validadorsenhas.validator.rules.DigitRule;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DigitRuleTest {

    private final DigitRule rule = new DigitRule();

    @Test
    void deveValidarSenhaComDigito() {
        assertTrue(rule.validate("Senha123"));
    }

    @Test
    void deveInvalidarSenhaSemDigito() {
        assertFalse(rule.validate("SenhaSemNumero"));
    }
}