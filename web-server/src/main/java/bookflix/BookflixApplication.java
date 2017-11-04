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
			repository.save(new Trecho("Ao vencedor, as batatas", "Machado de Assis", "Quincas Borba"));
			repository.save(new Trecho("Retórica dos namorados, dá-me uma comparação exata e poética para dizer o que foram aqueles olhos de Capitu. Não me acode imagem capaz de dizer, sem quebra da dignidade do estilo, o que eles foram e me fizeram. Olhos de ressaca? Vá, de ressaca. É o que me dá idéia daquela feição nova. Traziam não sei que fluido misterioso e enérgico, uma força que arrastava para dentro, como a vaga que se retira da praia, nos dias de ressaca. Para não ser arrastado, agarrei-me às outras partes vizinhas, às orelhas, aos braços, aos cabelos espalhados pelos ombros, mas tão depressa buscava as pupilas, a onda que saía delas vinha crescendo, cava e escura, ameaçando envolver-me, puxar-me e tragar-me. Quantos minutos gastamos naquele jogo? Só os relógios do céu terão marcado esse tempo infinito e breve. A eternidade tem as suas pêndulas; nem por não acabar nunca deixa de querer saber a duração das felicidades e dos suplícios. Há de dobrar o gozo aos bem-aventurados do céu conhecer a soma dos tormentos que já terão padecido no inferno os seus inimigos; assim também a quantidade das delícias que terão gozado no céu os seus desafetos aumentará as dores aos condenados do inferno.", "Machado de Assis", "Dom Casmurro"));
			repository.save(new Trecho("Capitu quis que lhe repetisse as respostas todas do agregado, as alterações do gesto e até a pirueta, que apenas lhe contara. Pedia o som das palavras. Era minuciosa e atenta; a narração e o diálogo, tudo parecia remoer consigo. Também se pode dizer que conferia, rotulava e pregava na memória a minha exposição. Esta imagem é porventura melhor que a outra, mas a ótima delas é nenhuma. Capitu era Capitu, isto é, uma criatura mui particular, mais mulher do que eu era homem. Se ainda o não disse, aí fica. Se disse, fica também. Há conceitos que se devem incutir na alma do leitor, à força de repetição.", "Machado de Assis", "Dom Casmurro"));
			repository.save(new Trecho("—Por que empalideces, Solfieri? a vida e assim. Tu o saber como eu o sei. O que e o homem? e a escuma que ferve hoje na torrente e amanha desmaia: alguma coisa de louco e movediço como a vaga, de fatal como o sepulcro! O que e a existência? Na mocidade e o caleidoscópio das ilusões:: vive-se então da seiva do futuro. Depois envelhecemos quando chegamos aos trinta anos e o suor das agonies nos grisalhou os cabelos antes do tempo, e murcharam como nossas faces as nossas esperanças, oscilamos entre o passado visionário, e este amanha do velho, gelado e ermo—despido como um cadáver que se banha antes de dar a sepultura! Miséria! loucura! ", "Álvares de Azevedo", "Noite na Taverna"));
			repository.save(new Trecho("Eu, filho do carbono e do amoníaco,\nMonstro de escuridão e rutilância,\nSofro, desde a epigênese da infância,\nA influência \ná dos signos do zodíaco.\nProdundissimamente hipocondríaco,\nEste ambiente me causa repugnância...\nSobe-me à boca uma ânsia análoga à ânsia\nQue se escapa da boca de um cardíaco.\nJá o verme -- este operário das ruínas --\nQue o sangue podre das carnificinas\nCome, e à vida em geral declara guerra,\nAnda a espreitar meus olhos para roê-los,\nE há de deixar-me apenas os cabelos,\nNa frialdade inorgânica da terra!", "Augusto dos Anjos", "PSICOLOGIA DE UM VENCIDO "));
			repository.save(new Trecho("Cantigas de portugueses\nSão como barcos no mar —\nVão de uma alma para outra\nCom riscos de naufragar.\nEu tenho um colar de pérolas\nEnfiado para te dar:\nAs per'las são os meus beijos,\nO fio é o meu penar.", "Fernando Pessoa", "Quadras ao Gosto Popular"));
			log.info("Depois de criar os registros");
		};
	}
}
