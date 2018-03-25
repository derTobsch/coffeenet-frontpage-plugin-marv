package coffee.synyx.frontpage.plugin.marv;

import org.junit.Test;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;

import static org.hamcrest.CoreMatchers.is;

import static org.hamcrest.MatcherAssert.assertThat;

import static java.time.Clock.systemDefaultZone;
import static java.time.ZoneId.systemDefault;
import static java.time.ZoneOffset.UTC;


public class TheAgeOfMarvPluginTest {

    @Test
    public void hasCorrectTitle() {

        final String title = new TheAgeOfMarvPlugin(systemDefaultZone()).title();
        assertThat(title, is("Marvs age :-)"));
    }


    @Test
    public void clockHasCorrectTime() {

        final Instant fixedInstant = LocalDate.of(2014, 11, 4).atStartOfDay().toInstant(UTC);
        final Clock clock = Clock.fixed(fixedInstant, systemDefault());
        final TheAgeOfMarvPlugin sut = new TheAgeOfMarvPlugin(clock);

        final String content = sut.content();
        assertThat(content, is("Hey Marv, you are 28 years 10 months 30 days old. Did you know that?"));
    }
}
