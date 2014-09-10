package sample.profile;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties({MyApplicationSettings.class})
public class ApplicationConfig {


}
