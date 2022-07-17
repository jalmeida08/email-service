package br.com.jsa;

import java.util.List;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.jsa.api.dto.EmailDTO;
import br.com.jsa.api.service.MensageriaService;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class EmailServiceApplication {

	@Autowired
	private MensageriaService mensageriaService;
	
	public static void main(String[] args) {
		SpringApplication.run(EmailServiceApplication.class, args);
	}
	
	@GetMapping
	public ResponseEntity<?> enviaEmail() {
		try {
			var dto = new EmailDTO(List.of("jefferson08jsa@hotmail.com", "jefferson08jsa@gmail.com"), List.of("mirelearaujo20@gmail.com"), "Email de teste", "<html><body><strong>Tes</strong>tando</body</html>");
			this.mensageriaService.enviaEmail(dto);
			return ResponseEntity.ok("Sucesso");
		} catch (MessagingException e) {
			System.out.println("ERRO");
			e.printStackTrace();
			return ResponseEntity.badRequest().build();
		}
	}
	
	@GetMapping("/all")
	public ResponseEntity<?> enviaEmailAll() {
		try {
			var dto = new EmailDTO(List.of("jefferson08jsa@hotmail.com", "jefferson08jsa@gmail.com"), List.of("mirelearaujo20@gmail.com"), "Email de teste", "<html><body><strong>Tes</strong>tando</body</html>");
			this.mensageriaService.enviaEmail(dto);
			return ResponseEntity.ok("Sucesso");
		} catch (MessagingException e) {
			System.out.println("ERRO");
			e.printStackTrace();
			return ResponseEntity.badRequest().build();
		}
	}

}
