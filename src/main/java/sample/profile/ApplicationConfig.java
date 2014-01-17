package sample.profile;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties({MyApplicationSettings.class, ConnectionSettings.class})
public class ApplicationConfig {


}
