package coffee.synyx.frontpage.plugin.marv;

import org.junit.Test;

import java.time.Clock;

import static org.assertj.core.api.Assertions.assertThat;


public class TheAgeOfMarvPluginConfigurationTest {

    @Test
    public void isSystemDefaultZone() {

        TheAgeOfMarvPluginConfiguration clockConf = new TheAgeOfMarvPluginConfiguration();
        assertThat(clockConf.clock().getZone()).isEqualTo(Clock.systemDefaultZone().getZone());
    }
}
