package pl.final_snake.modules.accounts.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.sun.istack.NotNull;

import java.math.BigDecimal;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccountDto {

    private Long id;
    @NotNull
    private String accountName;
    @NotNull
    private BigDecimal startBalance;
    @NotNull
    private AccountType accountType;
    private BigDecimal actualBalance;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public BigDecimal getStartBalance() {
        return startBalance;
    }

    public void setStartBalance(BigDecimal startBalance) {
        this.startBalance = startBalance;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public BigDecimal getActualBalance() {
        return actualBalance;
    }

    public void setActualBalance(BigDecimal actualBalance) {
        this.actualBalance = actualBalance;
    }

    @Override
    public String toString() {
        return "AccountDto{" +
                "id=" + id +
                ", accountName='" + accountName + '\'' +
                ", startBalance=" + startBalance +
                ", accountType=" + accountType +
                ", actualBalance=" + actualBalance +
                '}';
    }
}
