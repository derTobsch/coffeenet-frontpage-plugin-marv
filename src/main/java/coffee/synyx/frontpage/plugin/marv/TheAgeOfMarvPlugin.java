package coffee.synyx.frontpage.plugin.marv;

import coffee.synyx.frontpage.plugin.api.FrontpagePluginInterface;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.stereotype.Component;

import java.time.Clock;
import java.time.LocalDate;
import java.time.Period;

import static java.time.Instant.now;


@Component
public class TheAgeOfMarvPlugin implements FrontpagePluginInterface {

    private final Clock clock;

    @Autowired
    public TheAgeOfMarvPlugin(@Qualifier("plugin.marv.defaultClock") Clock clock) {

        this.clock = clock;
    }

    @Override
    public String title() {

        return "Marvs age :-)";
    }


    @Override
    public String content() {

        LocalDate birthday = LocalDate.of(1985, 12, 05);
        LocalDate now = LocalDate.now(clock);

        Period period = Period.between(birthday, now);

        return "Hey Marv, you are " + period.getYears() + " years old. Did you know that?";
    }
}
