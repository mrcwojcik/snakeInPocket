package pl.final_snake.modules.bills.controller;

import org.springframework.web.bind.annotation.*;
import pl.final_snake.modules.bills.model.Bill;
import pl.final_snake.modules.bills.service.BillService;

import java.util.List;

@RestController
public class BillController {

    private final BillService billService;

    public BillController(BillService billService) {
        this.billService = billService;
    }

    @GetMapping("/bills")
    public List<Bill> showAllBills(){
        return billService.showAllBills();
    }

    @PostMapping("/bills/add")
    public Bill addBill(@RequestBody Bill bill){
        return billService.addBill(bill);
    }
    
    @GetMapping("/bills/{id}")
    public Bill showBill(@PathVariable Long id){
        return billService.showBill(id);
    }

    @GetMapping("/bills/{id}/delete")
    public void deleteBill(@PathVariable Long id){
        billService.deleteBill(id);
    }

}
