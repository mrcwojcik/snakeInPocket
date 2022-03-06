package pl.final_snake.modules.bills.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.final_snake.modules.bills.model.Bill;

@Repository
public interface BillsRepository extends JpaRepository<Bill, Long> {
}
