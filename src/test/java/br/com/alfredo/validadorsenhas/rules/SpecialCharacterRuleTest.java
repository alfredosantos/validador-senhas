package br.com.alfredo.validadorsenhas.rules;

import br.com.alfredo.validadorsenhas.validator.rules.SpecialCharacterRule;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SpecialCharacterRuleTest {

    private final SpecialCharacterRule rule = new SpecialCharacterRule();

    @Test
    void deveValidarSenhaComCaractereEspecial() {
        assertTrue(rule.validate("Senha@123"));
    }

    @Test
    void deveInvalidarSenhaSemCaractereEspecial() {
        assertFalse(rule.validate("SenhaSemEspecial123"));
    }
}