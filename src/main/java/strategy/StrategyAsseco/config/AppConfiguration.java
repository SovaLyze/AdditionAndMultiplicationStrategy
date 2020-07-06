package strategy.StrategyAsseco.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import strategy.StrategyAsseco.domain.CD;
import strategy.StrategyAsseco.domain.Vat;
import strategy.StrategyAsseco.domain.VatAdd;
import strategy.StrategyAsseco.domain.VatMulti;

@Configuration
public class AppConfiguration {


    @Bean
    @Profile("vatAdd")
    public Vat vatAdd() {
        return new VatAdd();
    }

    @Bean
    @Profile("vatMulti")
    public Vat vatMulti() {
        return new VatMulti();
    }

    @Bean
    public CD cd() {
        return new CD(10, 5);
    }
}
