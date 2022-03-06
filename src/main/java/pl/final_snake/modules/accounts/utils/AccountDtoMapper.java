package pl.final_snake.modules.accounts.utils;

import org.springframework.stereotype.Component;
import pl.final_snake.modules.accounts.model.Account;
import pl.final_snake.modules.accounts.model.AccountDto;

@Component
public class AccountDtoMapper {

    public Account toModel(AccountDto accountDto){
        Account account = new Account();
        account.setAccountName(accountDto.getAccountName());
        account.setAccountType(accountDto.getAccountType());
        account.setStartBalance(accountDto.getStartBalance());
        if (accountDto.getActualBalance() == null){
            account.setActualBalance(accountDto.getStartBalance());
        }
        return account;
    }

}
