package coffee.synyx.frontpage.plugin.marv;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.Clock;


@Configuration
class TheAgeOfMarvPluginConfiguration {

    @Bean("plugin.marv.defaultClock")
    Clock clock() {

        return Clock.systemDefaultZone();
    }
}
