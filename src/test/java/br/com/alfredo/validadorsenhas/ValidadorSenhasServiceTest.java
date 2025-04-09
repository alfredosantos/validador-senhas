package br.com.alfredo.validadorsenhas;

import br.com.alfredo.validadorsenhas.validator.PasswordValidator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

public class ValidadorSenhasServiceTest {

    private PasswordValidator validator;
    private ValidadorSenhasService service;

    @BeforeEach
    void setUp() {
        validator = mock(PasswordValidator.class);
        service = new ValidadorSenhasService(validator);
    }

    @Test
    void deveValidarSenhaComTodosOsRequisitos() {
        String senha = "Abcdef1@!";
        when(validator.isValid(senha)).thenReturn(true);

        assertTrue(service.validaPassword(senha));
        verify(validator).isValid(senha);
    }

    @Test
    void deveInvalidarSenhaComMenosDeNoveCaracteres() {
        String senha = "Abc1@!";
        when(validator.isValid(senha)).thenReturn(false);

        assertFalse(service.validaPassword(senha));
        verify(validator).isValid(senha);
    }

    @Test
    void deveInvalidarSenhaSemDigito() {
        String senha = "Abcdefg@!";
        when(validator.isValid(senha)).thenReturn(false);

        assertFalse(service.validaPassword(senha));
        verify(validator).isValid(senha);
    }

    @Test
    void deveInvalidarSenhaSemLetraMinuscula() {
        String senha = "ABCDEFG1@!";
        when(validator.isValid(senha)).thenReturn(false);

        assertFalse(service.validaPassword(senha));
        verify(validator).isValid(senha);
    }

    @Test
    void deveInvalidarSenhaSemLetraMaiuscula() {
        String senha = "abcdef1@!";
        when(validator.isValid(senha)).thenReturn(false);

        assertFalse(service.validaPassword(senha));
        verify(validator).isValid(senha);
    }

    @Test
    void deveInvalidarSenhaSemCaractereEspecial() {
        String senha = "Abcdefg12";
        when(validator.isValid(senha)).thenReturn(false);

        assertFalse(service.validaPassword(senha));
        verify(validator).isValid(senha);
    }

    @Test
    void deveInvalidarSenhaComCaracteresRepetidos() {
        String senha = "Abcdef1@A";
        when(validator.isValid(senha)).thenReturn(false);

        assertFalse(service.validaPassword(senha));
        verify(validator).isValid(senha);
    }

    @Test
    void deveRetornarBooleanParaSenhaValidaOuInvalida() {
        String senhaValida = "Abcdef1@!";
        String senhaInvalida = "abc";

        when(validator.isValid(senhaValida)).thenReturn(true);
        when(validator.isValid(senhaInvalida)).thenReturn(false);

        assertTrue(service.validaPassword(senhaValida));
        assertFalse(service.validaPassword(senhaInvalida));
        verify(validator).isValid(senhaValida);
        verify(validator).isValid(senhaInvalida);
    }

    @Test
    void deveInvalidarSenhaComEspacosEmBranco() {
        String senha = "Abc def1@!";
        when(validator.isValid(senha)).thenReturn(false);

        assertFalse(service.validaPassword(senha));
        verify(validator).isValid(senha);
    }

    @Test
    void deveInvalidarSenhaComCaracteresRepetidosDentroDoConjunto() {
        String senha = "Abcdef1@A";
        when(validator.isValid(senha)).thenReturn(false);

        assertFalse(service.validaPassword(senha));
        verify(validator).isValid(senha);
    }
}