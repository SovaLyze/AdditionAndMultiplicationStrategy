package strategy.StrategyAsseco;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import strategy.StrategyAsseco.domain.CD;

@SpringBootApplication
public class StrategyAssecoApplication implements CommandLineRunner {

	@Autowired
	CDService cdService;

	@Autowired
	CD cd;

	public static void main(String[] args) {

		SpringApplication.run(StrategyAssecoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		cdService.printCD_Result(cd);
	}

}
