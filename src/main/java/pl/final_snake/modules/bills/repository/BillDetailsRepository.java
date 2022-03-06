package pl.final_snake.modules.bills.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.final_snake.modules.bills.model.BillDetails;

@Repository
public interface BillDetailsRepository extends JpaRepository<BillDetails, Long> {
}
