package pl.final_snake.modules.accounts.service;

import pl.final_snake.modules.accounts.model.Account;
import pl.final_snake.modules.accounts.model.AccountDto;
import pl.final_snake.modules.bills.model.Bill;

import java.util.List;

public interface AccountService {

    Account addAccount(AccountDto accountDto);
    Account saveAccount(Account account);
    Account getAccountDetails(Long id);
    Account editAccountDetails(Long id, AccountDto accountDto);
    List<Account> getAllAccounts();
    void deleteAccount(Long id);
    void changeBalance(Account account, Bill bill);
    void changeBalanceAfterDeletingBill(Account account, Bill bill);

}
