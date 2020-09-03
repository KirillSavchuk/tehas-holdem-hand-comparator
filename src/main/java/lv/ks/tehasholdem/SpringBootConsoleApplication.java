package lv.ks.tehasholdem;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import lv.ks.tehasholdem.app.core.GameProcessor;
import lv.ks.tehasholdem.app.core.entity.GameOutput;
import lv.ks.tehasholdem.app.io.service.CommandLineInputArgumentParser;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
@AllArgsConstructor
public class SpringBootConsoleApplication implements CommandLineRunner {

    private final CommandLineInputArgumentParser inputParser;
    private final GameProcessor gameProcessor;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootConsoleApplication.class, args);
    }

    @Override
    public void run(String... args) {
        GameOutput gameOutput = gameProcessor.process(inputParser.parse(args));
        log.info(gameOutput.toString());
    }

}
