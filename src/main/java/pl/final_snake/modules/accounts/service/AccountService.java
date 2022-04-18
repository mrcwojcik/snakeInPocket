package pl.final_snake.modules.accounts.service;

import pl.final_snake.modules.accounts.model.Account;
import pl.final_snake.modules.accounts.model.AccountDto;

import java.util.List;

public interface AccountService {

    Account addAccount(AccountDto accountDto);
    Account getAccountDetails(Long id);
    Account editAccountDetails(Long id, AccountDto accountDto);
    List<Account> getAllAccounts();
    void deleteAccount(Long id);

}
