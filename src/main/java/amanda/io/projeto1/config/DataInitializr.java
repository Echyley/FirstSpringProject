package amanda.io.projeto1.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import amanda.io.projeto1.entities.User;
import amanda.io.projeto1.repository.UserRepository;

@Component
public class DataInitializr implements ApplicationListener<ContextRefreshedEvent> {
	// Inserindo dados no banco.
	@Autowired
	UserRepository userRepository;

	@Override
	public void onApplicationEvent(ContextRefreshedEvent arg0) {

		List<User> users = userRepository.findAll();

		if (users.isEmpty()) {
			User user = new User();

			user.setEmail("amandaxars@gmail.com");
			user.setName("Echy");

			userRepository.save(user);
		}

	}
	
	public void createUser(String name, String email) {
		
	}

}