package pl.final_snake.modules.accounts.service;

import org.springframework.stereotype.Service;
import pl.final_snake.modules.accounts.AccountRepository;
import pl.final_snake.modules.accounts.model.Account;
import pl.final_snake.modules.accounts.model.AccountDto;
import pl.final_snake.modules.accounts.utils.AccountDtoMapper;
import pl.final_snake.modules.bills.model.Bill;
import pl.final_snake.modules.bills.model.additional.PaymentType;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService{

    private final AccountRepository accountRepository;
    private final AccountDtoMapper mapper;

    public AccountServiceImpl(AccountRepository accountRepository, AccountDtoMapper mapper) {
        this.accountRepository = accountRepository;
        this.mapper = mapper;
    }

    @Override
    public Account addAccount(AccountDto accountDto) {
        Account account = mapper.toModel(accountDto);
        return accountRepository.save(account);
    }

    @Override
    public Account saveAccount(Account account) {
        return accountRepository.save(account);
    }

    @Override
    public Account getAccountDetails(Long id) {
        return accountRepository.getById(id);
    }

    @Override
    public Account editAccountDetails(Long id, AccountDto accountDto) {
        Account account = accountRepository.getById(id);
        editAccountData(account, accountDto);
        return account;
    }

    private void editAccountData(Account account, AccountDto accountDto) {
        account.setAccountType(accountDto.getAccountType());
        account.setAccountName(accountDto.getAccountName());
        account.setStartBalance(accountDto.getStartBalance());
    }

    @Override
    public List<Account> getAllAccounts() {
        return accountRepository.findAll();
    }

    @Override
    public void deleteAccount(Long id) {
        accountRepository.delete(accountRepository.getById(id));
    }

    @Override
    public void changeBalance(Account account, Bill bill) {
        if (bill.getType() == PaymentType.EXPENSE){
            account.setActualBalance(account.getActualBalance().subtract(bill.getBillValue()));
        } else if (bill.getType() == PaymentType.INCOME){
            account.setActualBalance(account.getActualBalance().add(bill.getBillValue()));
        }
    }

    @Override
    public void changeBalanceAfterDeletingBill(Account account, Bill bill) {
        if (bill.getType() == PaymentType.EXPENSE){
            account.setActualBalance(account.getActualBalance().add(bill.getBillValue()));
        } else if (bill.getType() == PaymentType.INCOME){
            account.setActualBalance(account.getActualBalance().subtract(bill.getBillValue()));
        }
    }
}
