package ro.uvt.examples;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean("clientComponent1")
    public ClientComponent clientComponent1(TransientComponent transientComponent, SingletonComponent singletonComponent) {
        return new ClientComponent(transientComponent, singletonComponent);
    }

    @Bean("clientComponent2")
    public ClientComponent clientComponent2(TransientComponent transientComponent, SingletonComponent singletonComponent) {
        return new ClientComponent(transientComponent, singletonComponent);
    }
}
