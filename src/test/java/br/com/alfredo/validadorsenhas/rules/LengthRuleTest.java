package br.com.alfredo.validadorsenhas.rules;

import br.com.alfredo.validadorsenhas.validator.rules.LengthRule;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LengthRuleTest {

    private final LengthRule rule = new LengthRule();

    @Test
    void deveValidarSenhaComTamanhoMinimo() {
        assertTrue(rule.validate("SenhaValida123"));
    }

    @Test
    void deveInvalidarSenhaComTamanhoInsuficiente() {
        assertFalse(rule.validate("Curta1"));
    }
}