package lv.ks.tehasholdem;

import lombok.extern.slf4j.Slf4j;
import lv.ks.tehasholdem.app.io.entity.CommandLineInput;
import lv.ks.tehasholdem.app.io.service.CommandLineInputArgumentParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class SpringBootConsoleApplication implements CommandLineRunner {

    @Autowired
    private CommandLineInputArgumentParser inputParser;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootConsoleApplication.class, args);
    }

    @Override
    public void run(String... args) {
        CommandLineInput input = inputParser.parse(args);
        log.info(input.toString());
    }

}
