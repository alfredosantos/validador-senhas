package br.com.alfredo.validadorsenhas;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/passwords")
public class ValidadorSenhasController {

    public static final String A_SENHA_NÃO_PODE_SER_NULA_OU_VAZIA = "A senha não pode ser nula ou vazia";
    private final ValidadorSenhasService service;

    public ValidadorSenhasController(ValidadorSenhasService service) {
        this.service = service;
    }

    @PostMapping("/validate")
    public boolean validaPassword(@RequestBody String password) {
        if (password == null || password.isBlank()) {
            throw new IllegalArgumentException(A_SENHA_NÃO_PODE_SER_NULA_OU_VAZIA);
        }
        return service.validaPassword(password);
    }
}