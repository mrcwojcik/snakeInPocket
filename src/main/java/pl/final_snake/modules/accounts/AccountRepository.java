package pl.final_snake.modules.accounts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.final_snake.modules.accounts.model.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
}
