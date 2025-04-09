package br.com.alfredo.validadorsenhas;

import br.com.alfredo.validadorsenhas.validator.PasswordValidator;
import org.springframework.stereotype.Service;

@Service
public class ValidadorSenhasService {

    private final PasswordValidator validator;

    public ValidadorSenhasService(PasswordValidator validator) {
        this.validator = validator;
    }

    public boolean validaPassword(String password) {
        return validator.isValid(password);
    }
}