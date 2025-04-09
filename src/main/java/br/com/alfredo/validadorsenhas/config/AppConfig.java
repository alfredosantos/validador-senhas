package br.com.alfredo.validadorsenhas.config;

import br.com.alfredo.validadorsenhas.validator.rules.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
public class AppConfig {

    @Bean
    public List<PasswordRuleValidator> passwordRules() {
        return Arrays.asList(
                new LengthRule(),
                new DigitRule(),
                new LowercaseRule(),
                new UppercaseRule(),
                new SpecialCharacterRule(),
                new NoRepeatedCharactersRule()
        );
    }
}