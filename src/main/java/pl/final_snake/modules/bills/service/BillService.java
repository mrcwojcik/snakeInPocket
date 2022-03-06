package pl.final_snake.modules.bills.service;

import pl.final_snake.modules.bills.model.Bill;

import java.util.List;

public interface BillService {

    List<Bill> showAllBills();
    Bill addBill(Bill bill);
    Bill showBill(Long id);
    void deleteBill(Long id);

}
