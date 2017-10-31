package bookflix;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BookflixApplication {
	
	private static final Logger log = LoggerFactory.getLogger(BookflixApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(BookflixApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(TrechosRepository repository) {
		return (args) -> {
			log.info("Antes de criar os registros");
			repository.save(new Trecho("Ao vencedor, as batatas", "Machado de Assis"));
			log.info("Depois de criar os registros");
		};
	}
}
