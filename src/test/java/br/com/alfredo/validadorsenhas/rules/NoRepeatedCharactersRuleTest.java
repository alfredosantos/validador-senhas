package br.com.alfredo.validadorsenhas.rules;

import br.com.alfredo.validadorsenhas.validator.rules.NoRepeatedCharactersRule;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NoRepeatedCharactersRuleTest {

    private final NoRepeatedCharactersRule rule = new NoRepeatedCharactersRule();

    @Test
    void deveValidarSenhaSemCaracteresRepetidos() {
        assertTrue(rule.validate("Senha123!"));
    }

    @Test
    void deveInvalidarSenhaComCaracteresRepetidos() {
        assertFalse(rule.validate("Senha123Senha"));
    }
}