package pl.final_snake.modules.accounts.controller;

import org.springframework.web.bind.annotation.*;
import pl.final_snake.modules.accounts.model.Account;
import pl.final_snake.modules.accounts.model.AccountDto;
import pl.final_snake.modules.accounts.service.AccountService;

import java.util.List;

@RestController
@CrossOrigin
public class AccountController {

    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping ("/account/add")
    public Account addAccount(@RequestBody AccountDto accountDto){
        System.out.println(accountDto.toString());
        return accountService.addAccount(accountDto);
    }

    @GetMapping("/account/{id}")
    public Account getDetails(@PathVariable Long id){
        return accountService.getAccountDetails(id);
    }

    @GetMapping("/account/{id}/edit")
    public Account editAccount(@RequestBody AccountDto accountDto, @PathVariable Long id){
        return accountService.editAccountDetails(id, accountDto);
    }

    @GetMapping("/account")
    public List<Account> getAllAccounts(){
        return accountService.getAllAccounts();
    }

    @GetMapping("/account/delete/{id}")
    public List<Account> deleteAccount(@PathVariable long id) {
        System.out.println("uderzam");
        accountService.deleteAccount(id);
        return accountService.getAllAccounts();
    }

}
