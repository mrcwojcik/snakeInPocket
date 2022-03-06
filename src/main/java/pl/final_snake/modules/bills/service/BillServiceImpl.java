package pl.final_snake.modules.bills.service;

import org.springframework.stereotype.Service;
import pl.final_snake.modules.accounts.model.Account;
import pl.final_snake.modules.accounts.service.AccountService;
import pl.final_snake.modules.bills.model.Bill;
import pl.final_snake.modules.bills.repository.BillsRepository;

import java.util.List;

@Service
public class BillServiceImpl implements BillService {

    private final BillsRepository billsRepository;
    private final AccountService accountService;

    public BillServiceImpl(BillsRepository billsRepository, AccountService accountService) {
        this.billsRepository = billsRepository;
        this.accountService = accountService;
    }

    @Override
    public List<Bill> showAllBills() {
        return billsRepository.findAll();
    }

    @Override
    public Bill addBill(Bill bill) {
        Account account = accountService.getAccountDetails(bill.getAccount().getId());
        accountService.changeBalance(account, bill);
        accountService.saveAccount(account);
        billsRepository.save(bill);
        return bill;
    }

    @Override
    public Bill showBill(Long id){
        return billsRepository.getById(id);
    }

    @Override
    public void deleteBill(Long id) {
        Bill bill = billsRepository.getById(id);
        Account account = bill.getAccount();
        accountService.changeBalanceAfterDeletingBill(account, bill);
        accountService.saveAccount(account);
        billsRepository.delete(billsRepository.getById(id));
    }
}
