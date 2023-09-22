package amanda.io.projeto1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import amanda.io.projeto1.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
