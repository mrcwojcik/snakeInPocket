package pl.final_snake.modules.transfer.model;

import pl.final_snake.modules.accounts.model.Account;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table (name = "transfers")
public class Transfer {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Account accountFrom;
    @ManyToOne
    private Account accountTo;
    private BigDecimal cashFlow;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Account getAccountFrom() {
        return accountFrom;
    }

    public void setAccountFrom(Account accountFrom) {
        this.accountFrom = accountFrom;
    }

    public Account getAccountTo() {
        return accountTo;
    }

    public void setAccountTo(Account accountTo) {
        this.accountTo = accountTo;
    }

    public BigDecimal getCashFlow() {
        return cashFlow;
    }

    public void setCashFlow(BigDecimal cashFlow) {
        this.cashFlow = cashFlow;
    }
}
