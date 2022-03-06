package pl.final_snake.modules.payer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.final_snake.modules.payer.model.Payer;

@Repository
public interface PayerRepository extends JpaRepository<Payer, Long> {
}
